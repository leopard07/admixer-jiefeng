package com.yamimi.admixer.backend_main.daos.mappers;

import com.yamimi.admixer.backend_main.models.AdMixerCampaign;

public interface CampaignMapper<T> {

    AdMixerCampaign map(T source);
}
