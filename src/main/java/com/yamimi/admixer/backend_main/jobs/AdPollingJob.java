package com.yamimi.admixer.backend_main.jobs;

import com.yamimi.admixer.backend_main.daos.CampaignDAO;
import com.yamimi.admixer.backend_main.external.AdPoller;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

import static java.util.concurrent.TimeUnit.MINUTES;

// T is the external ad model from different platforms
// P is the adPoller corresponding to the required external model
// D is the DAO that can save/retrieve T from corresponding table
public abstract class AdPollingJob<T, P extends AdPoller<T>, D extends CampaignDAO<T>> {

    protected final P adPoller;
    protected final D campaignDao;

    public AdPollingJob(D campaignDAO, P adPoller) {
        this.adPoller = adPoller;
        this.campaignDao = campaignDAO;
    }

    @Scheduled(fixedDelay = 30L, timeUnit = MINUTES)
    public void run() {
        List<T> ads = adPoller.pollAds();
        ads.forEach(campaignDao::persist);
    }
}
