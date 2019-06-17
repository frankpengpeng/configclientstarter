package com.frank.configclient.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class ConfigChangeRemoteApplicationEvent extends RemoteApplicationEvent {

    private String changedConfig;

    public ConfigChangeRemoteApplicationEvent() {
    }

    public ConfigChangeRemoteApplicationEvent(Object source, String originService, String destinationService, String changedConfig) {
        super(source, originService, destinationService);
        this.changedConfig = changedConfig;
    }

    public String getChangedConfig() {
        return changedConfig;
    }

    public void setChangedConfig(String changedConfig) {
        this.changedConfig = changedConfig;
    }
}
