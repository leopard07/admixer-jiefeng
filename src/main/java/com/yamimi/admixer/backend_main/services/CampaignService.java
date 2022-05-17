package com.yamimi.admixer.backend_main.services;

import com.yamimi.admixer.backend_main.models.AdMixerCampaign;

public interface CampaignService {

    AdMixerCampaign getCampaign(String id);
}
