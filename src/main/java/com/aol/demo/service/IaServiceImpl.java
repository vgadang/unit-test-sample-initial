package com.aol.demo.service;

import java.util.ArrayList;
import java.util.Collections;
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
		List<String> offerIds;
		String error = "";
		String cause = "";
		
		String offers = iaDao.getOffers(request);
		if(offers!=null && offers.length()>0) {
			offerIds = new ArrayList<String>();
			Matcher matcher = ERROR_PATTERN.matcher(offers);
			if(matcher.find()) {
				error = matcher.group();
				matcher = CAUSE_PATTERN.matcher(offers);
				if(matcher.find()) {
					cause = matcher.group();
				} else {
					cause = "";
				}
				throw new IaException(error, cause);
				
			} else {
	
				String[] recs = offers.substring(7).split("Id\\|Name");
				if(recs!=null && recs.length>0) {
					for(String rec : recs) {
				    	// Id|Name|15|webmail_lb_careOfferDisplayType|4|HeroAolOfferId|6|IA_662ContentId|15|webmail_lb_care	
						String[] tokens = rec.substring(rec.indexOf("ContentId|")).split("\\|");
						int length = Integer.parseInt(tokens[1]);
						offerIds.add(tokens[2].substring(0, length));
					}
				} else {
					return null;
				}
			    
			}
		} else {
			offerIds = Collections.emptyList();
		}
		return offerIds;
	}

}
