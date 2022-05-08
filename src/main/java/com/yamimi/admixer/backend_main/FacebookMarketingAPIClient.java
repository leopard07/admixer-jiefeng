package com.yamimi.admixer.backend_main;

import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APINodeList;
import com.facebook.ads.sdk.AdAccount;
import com.facebook.ads.sdk.Campaign;

public class FacebookMarketingAPIClient
{
    public static final APIContext context = new APIContext(
            "EAAE6N6w4T4IBACRmvbRZCwub0ePQYeY3AIHpBaIDwBP30HmP6f2k8lyEQi95VdhQx0N5PwIfyb6y5Vi8Ps9bHoZAbuljhCxTtiTMb3hXZCqZAsUrZAFZAmc1RfvsWa10Dhnu408ZAD3ASzeOLppbPoZBul1dfrXvBVXfBUrFv8k3w2utnV5S5qyyDFiXzkzWndFja5aZAPTG7uAZDZD",
            "e49d0cbe8470adffb4a3d0b9c6287ebb"
    );
    public static void getCampaigns()
    {
        AdAccount account = new AdAccount("act_518929228574096", context);
        try {
            APINodeList<Campaign> campaigns = account.getCampaigns().requestAllFields().execute();
            for(Campaign campaign : campaigns) {
                System.out.println(campaign.getFieldName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}