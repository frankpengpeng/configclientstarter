package com.frank.configclient.listener;

import com.frank.configclient.event.ConfigChangeRemoteApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentManager;
import org.springframework.context.ApplicationListener;

public class ConfigChangeRemoteApplicationEventListner implements ApplicationListener<ConfigChangeRemoteApplicationEvent> {
    @Autowired
    private EnvironmentManager environmentManager;

    public void onApplicationEvent(ConfigChangeRemoteApplicationEvent configChangeRemoteApplicationEvent) {
        System.out.printf("removed message:", configChangeRemoteApplicationEvent.getChangedConfig());
        environmentManager.setProperty("name", configChangeRemoteApplicationEvent.getChangedConfig());
    }
}
