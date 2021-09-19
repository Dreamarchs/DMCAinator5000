package com.dreamarchs.common;

public interface StatusService {
    void setServiceStatus(Class<?> clazz, ServiceStatus status);
    ServiceStatus getServiceStatus(Class<?> clazz);
}
