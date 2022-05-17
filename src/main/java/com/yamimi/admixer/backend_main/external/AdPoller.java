package com.yamimi.admixer.backend_main.external;

import java.util.List;

public interface AdPoller<T> {

    List<T> pollAds();
}
