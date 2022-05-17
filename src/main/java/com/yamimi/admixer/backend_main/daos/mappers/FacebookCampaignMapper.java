package com.yamimi.admixer.backend_main.daos.mappers;

import com.facebook.ads.sdk.Campaign;
import com.yamimi.admixer.backend_main.models.AdMixerCampaign;
import org.springframework.stereotype.Component;

@Component
public class FacebookCampaignMapper implements CampaignMapper<Campaign> {

    @Override
    public AdMixerCampaign map(Campaign source) {
        return null;
    }
}
