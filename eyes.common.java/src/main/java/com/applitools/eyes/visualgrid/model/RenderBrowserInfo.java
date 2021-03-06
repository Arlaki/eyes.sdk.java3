package com.applitools.eyes.visualgrid.model;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.BrowserType;

public class RenderBrowserInfo {

    private RectangleSize viewportSize;
    private BrowserType browserType;
    private final String platform = "linux";
    private EmulationBaseInfo emulationInfo;
    private final String sizeMode = "full-page";
    private String baselineEnvName;


    public RenderBrowserInfo(RectangleSize viewportSize, BrowserType browserType, String baselineEnvName) {
        this.viewportSize = viewportSize;
        this.browserType = browserType;
        this.baselineEnvName = baselineEnvName;
    }

    public RenderBrowserInfo(RectangleSize viewportSize, BrowserType browserType) {
        this.viewportSize = viewportSize;
        this.browserType = browserType;
    }

    public RenderBrowserInfo(EmulationBaseInfo emulationInfo, String baselineEnvName) {
        this.emulationInfo = emulationInfo;
        this.baselineEnvName = baselineEnvName;
    }

    public RenderBrowserInfo(int width, int height) {
        this(new RectangleSize(width, height), BrowserType.CHROME, null);
    }

    public RenderBrowserInfo(EmulationBaseInfo emulationInfo) {
        this.emulationInfo = emulationInfo;
    }

    public RenderBrowserInfo(int width, int height, BrowserType browserType, String baselineEnvName) {
        this(new RectangleSize(width, height), browserType, baselineEnvName);
    }

    public RenderBrowserInfo(int width, int height, BrowserType browserType) {
        this(new RectangleSize(width, height), browserType, null);
    }

    public int getWidth() {
        if (viewportSize != null) {
            return viewportSize.getWidth();
        }
        return 0;
    }

    public int getHeight() {
        if (viewportSize != null) {
            return viewportSize.getHeight();
        }
        return 0;
    }

    public RectangleSize getViewportSize() {
        return viewportSize;
    }

    public String getBrowserType() {
        if (browserType != null) {
            switch (this.browserType) {
                case CHROME:
                    return "chrome-0";
                case CHROME_ONE_VERSION_BACK:
                    return "chrome-1";
                case CHROME_TWO_VERSIONS_BACK:
                    return "chrome-2";
                case FIREFOX:
                    return "firefox-0";
                case FIREFOX_ONE_VERSION_BACK:
                    return "firefox-1";
                case FIREFOX_TWO_VERSIONS_BACK:
                    return "firefox-2";
                case SAFARI:
                    return "safari-0";
                case SAFARI_ONE_VERSION_BACK:
                    return "safari-1";
                case SAFARI_TWO_VERSIONS_BACK:
                    return "safari-2";
                case IE_10:
                    return "ie10";
                case IE_11:
                    return "ie";
                case EDGE:
                    return "edge";
            }
        }
        return "chrome";
    }

    public String getPlatform() {
        if (browserType != null) {
            switch (this.browserType) {
                case CHROME:
                case CHROME_ONE_VERSION_BACK:
                case CHROME_TWO_VERSIONS_BACK:
                case FIREFOX:
                case FIREFOX_ONE_VERSION_BACK:
                case FIREFOX_TWO_VERSIONS_BACK:
                    return "linux";
                case SAFARI:
                case SAFARI_ONE_VERSION_BACK:
                case SAFARI_TWO_VERSIONS_BACK:
                    return "mac os x";
                case IE_10:
                case IE_11:
                case EDGE:
                    return "windows";
            }
        }
        return "linux";
    }

    public EmulationBaseInfo getEmulationInfo() {
        return emulationInfo;
    }

    public String getSizeMode() {
        return this.sizeMode;
    }

    @Override
    public String toString() {
        return "RenderBrowserInfo{" +
                "viewportSize=" + viewportSize +
                ", browserType=" + browserType +
                ", platform='" + platform + '\'' +
                ", emulationInfo=" + emulationInfo +
                ", sizeMode='" + sizeMode + '\'' +
                '}';
    }

    public String getBaselineEnvName() {
        return baselineEnvName;
    }
}
