package com.aol.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aol.demo.dao.IaDao;
import com.aol.demo.exceptions.IaException;
import com.aol.demo.model.OfferRequest;

@Service
public class IaServiceImpl implements IaService {

	private static final Pattern ERROR_PATTERN = Pattern.compile("Command\\s*error:[^(]*", Pattern.DOTALL);
	private static final Pattern CAUSE_PATTERN = Pattern.compile("caused\\s*by[^\\n]*", Pattern.DOTALL);
	
	@Autowired
	private IaDao iaDao;
	
	@Override
	public List<String> getOffers(OfferRequest request) {
		String offers = iaDao.getOffers(request);
		
		Matcher errorMatcher = ERROR_PATTERN.matcher(offers);
		if(errorMatcher.find()) {
			String error = errorMatcher.group();
			Matcher causeMatcher = CAUSE_PATTERN.matcher(offers);
			
			String causeMessage = "";
			if(causeMatcher.find()) {
				causeMessage = errorMatcher.group();
			}
			throw new IaException(error, causeMessage);
			
		} else {

			List<String> offerIds = new ArrayList<String>();
		    String substring = offers.substring(7);
			String[] recs = substring.split("Id\\|Name");
			for(String rec : recs) {
		    	// Id|Name|15|webmail_lb_careOfferDisplayType|4|HeroAolOfferId|6|IA_662ContentId|15|webmail_lb_care	
				String subStr = rec.substring(rec.indexOf("ContentId|"));
				String[] tokens = subStr.split("\\|");
				int length = Integer.parseInt(tokens[1]);
				offerIds.add(tokens[2].substring(0, length));
			}
		    
		    return offerIds;
		}
	}

}
