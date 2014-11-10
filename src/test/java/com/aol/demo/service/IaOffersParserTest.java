package com.aol.demo.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IaOffersParserTest {
	
	private Logger logger = LoggerFactory.getLogger(IaOffersParserTest.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	// "Id|Name|15|webmail_lb_careOfferDisplayType|4|HeroAolOfferId|6|IA_662ContentId|15|webmail_lb_care"
	public void testParseIAResponse() {
//		IaParser parser = new IaParser();
//		List<String> contentIds = parser.parseToContentIds("Id|Name|15|webmail_lb_careOfferDisplayType|4|HeroAolOfferId|6|IA_662ContentId|15|webmail_lb_care");
//		logger.debug("ContentIds = {}", contentIds);
//		assertNotNull(contentIds);
//		assertFalse(contentIds.isEmpty());
//		assertEquals("webmail_lb_care", contentIds.get(0));
	}

	
	@Test
	// "Id|Name|27|gandalf_adoption_afterstepsLikelihood|1|0AolOfferId|6|IA_490ServerId|12|%%SERVERID%%ContentId|25|infor-cc-adopt-afterstepsScaledScore|2|48Benefit|2|23Id|Name|29|gandalf_adoption_aol_onepointLikelihood|1|0AolOfferId|6|IA_491ServerId|12|%%SERVERID%%ContentId|23|infor-cc-adopt-onepointScaledScore|2|39Benefit|2|21Id|Name|22|gandalf_ls_safecentralLikelihood|1|0AolOfferId|6|IA_483ServerId|12|%%SERVERID%%ContentId|23|infor-cc-ls-safecentralScaledScore|1|1Benefit|2|11DestinationPI|7|1003185"
	public void testParseIAResponseMulti() {
//		IaParser parser = new IaParser();
//		List<String> contentIds = parser.parseToContentIds("Id|Name|27|gandalf_adoption_afterstepsLikelihood|1|0AolOfferId|6|IA_490ServerId|12|%%SERVERID%%ContentId|25|infor-cc-adopt-afterstepsScaledScore|2|48Benefit|2|23Id|Name|29|gandalf_adoption_aol_onepointLikelihood|1|0AolOfferId|6|IA_491ServerId|12|%%SERVERID%%ContentId|23|infor-cc-adopt-onepointScaledScore|2|39Benefit|2|21Id|Name|22|gandalf_ls_safecentralLikelihood|1|0AolOfferId|6|IA_483ServerId|12|%%SERVERID%%ContentId|23|infor-cc-ls-safecentralScaledScore|1|1Benefit|2|11DestinationPI|7|1003185");
//		logger.debug("ContentIds = {}", contentIds);
//		assertNotNull(contentIds);
//		assertSame(3, contentIds.size());
//		assertEquals("infor-cc-adopt-aftersteps", contentIds.get(0));
	}

	@Test
	// "Command error: [01003] Command=CDmProcessEventCommand(Event=GetOffers,SessionId=subpsw174)  caused by Campaign error: [10413] Channel Webmai received from GetOffers is not valid"
	public void testParseIAResponseError() {
	}

	@Test
	// "Command error: [01003] Command=CDmProcessEventCommand(Event=GetOffers,SessionId=subpsw174)  caused by Campaign error: [10413] Channel Webmai received from GetOffers is not valid"
	public void testParseIAResponseErrorAndCause() {
	}
}
