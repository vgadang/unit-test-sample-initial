package com.aol.demo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IaOffersResponseTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	// "Id|Name|15|webmail_lb_careOfferDisplayType|4|HeroAolOfferId|6|IA_662ContentId|15|webmail_lb_care"
	public void testParseIAResponse() {
	}

	
	@Test
	// "Id|Name|27|gandalf_adoption_afterstepsLikelihood|1|0AolOfferId|6|IA_490ServerId|12|%%SERVERID%%ContentId|25|infor-cc-adopt-afterstepsScaledScore|2|48Benefit|2|23Id|Name|29|gandalf_adoption_aol_onepointLikelihood|1|0AolOfferId|6|IA_491ServerId|12|%%SERVERID%%ContentId|23|infor-cc-adopt-onepointScaledScore|2|39Benefit|2|21Id|Name|22|gandalf_ls_safecentralLikelihood|1|0AolOfferId|6|IA_483ServerId|12|%%SERVERID%%ContentId|23|infor-cc-ls-safecentralScaledScore|1|1Benefit|2|11DestinationPI|7|1003185"
	public void testParseIAResponseMulti() {
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
