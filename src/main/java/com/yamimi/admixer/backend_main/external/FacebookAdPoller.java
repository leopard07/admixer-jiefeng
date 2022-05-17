package com.yamimi.admixer.backend_main.external;

import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APIException;
import com.facebook.ads.sdk.AdAccount;
import com.facebook.ads.sdk.Campaign;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacebookAdPoller implements AdPoller<Campaign> {

    private static final APIContext context = new APIContext(
            "EAAE6N6w4T4IBACRmvbRZCwub0ePQYeY3AIHpBaIDwBP30HmP6f2k8lyEQi95VdhQx0N5PwIfyb6y5Vi8Ps9bHoZAbuljhCxTtiTMb3hXZCqZAsUrZAFZAmc1RfvsWa10Dhnu408ZAD3ASzeOLppbPoZBul1dfrXvBVXfBUrFv8k3w2utnV5S5qyyDFiXzkzWndFja5aZAPTG7uAZDZD",
            "e49d0cbe8470adffb4a3d0b9c6287ebb"
    );

    @Override
    public List<Campaign> pollAds() {
        try {
            AdAccount account = new AdAccount("act_518929228574096", context);
            return account.getCampaigns().requestAllFields().execute();
        } catch (APIException e) {
            throw new AdPollingFailedException(e.getRawResponse());
        }
    }

    public static class AdPollingFailedException extends RuntimeException {

        public AdPollingFailedException(String message) {
            super(message);
        }
    }
}
