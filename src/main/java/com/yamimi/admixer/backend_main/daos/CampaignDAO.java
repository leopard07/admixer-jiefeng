package com.yamimi.admixer.backend_main.daos;

import com.facebook.ads.sdk.Campaign;

public interface CampaignDAO<T> { // T is the external ad campaign type

    Campaign getCampaign(String id);

    void persist(T record);
}
