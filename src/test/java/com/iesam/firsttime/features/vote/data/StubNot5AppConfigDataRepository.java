package com.iesam.firsttime.features.vote.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class StubNot5AppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(2);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
