package com.pittfield.archetype.restservice.beans;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class AppInfo implements Serializable
{
    private String appName;
    private String appVersion;
    private String appEnvironment;

    public AppInfo()
    {

    }

    public AppInfo(String appName, String appVersion, String appEnvironment)
    {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appEnvironment = appEnvironment;
    }

    public String getAppName()
    {
        return appName;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }

    public String getAppVersion()
    {
        return appVersion;
    }

    public void setAppVersion(String appVersion)
    {
        this.appVersion = appVersion;
    }

    public String getAppEnvironment()
    {
        return appEnvironment;
    }

    public void setAppEnvironment(String appEnvironment)
    {
        this.appEnvironment = appEnvironment;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}