package configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SymConfig {

    private String sessionAuthHost;
    private int sessionAuthPort;
    private String keyAuthHost;
    private int keyAuthPort;
    private String podHost;
    private int podPort;
    private String agentHost;
    private int agentPort;
    private String botCertPath;
    private String botCertName;
    private String botCertPassword;
    private String botEmailAddress;
    private String appCertPath;
    private String appCertName;
    private String appCertPassword;
    private String proxyURL;
    private String proxyUsername;
    private String proxyPassword;
    private int authTokenRefreshPeriod;
    private String truststorePath;
    private String truststorePassword;
    private String botUsername;
    private String botPrivateKeyPath;
    private String botPrivateKeyName;


    public String getBotPrivateKeyPath() {
        return botPrivateKeyPath;
    }

    public void setBotPrivateKeyPath(String botPrivateKeyPath) {
        this.botPrivateKeyPath = botPrivateKeyPath;
    }

    public String getBotPrivateKeyName() {
        return botPrivateKeyName;
    }

    public void setBotPrivateKeyName(String botPrivateKeyName) {
        this.botPrivateKeyName = botPrivateKeyName;
    }

    public String getBotUsername() {
        return botUsername;
    }

    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    public String getSessionAuthHost() {
        return sessionAuthHost;
    }

    public void setSessionAuthHost(String sessionAuthHost) {
        this.sessionAuthHost = sessionAuthHost;
    }

    public int getSessionAuthPort() {
        return sessionAuthPort;
    }

    public void setSessionAuthPort(int sessionAuthPort) {
        this.sessionAuthPort = sessionAuthPort;
    }

    public String getKeyAuthHost() {
        return keyAuthHost;
    }

    public void setKeyAuthHost(String keyAuthHost) {
        this.keyAuthHost = keyAuthHost;
    }

    public int getKeyAuthPort() {
        return keyAuthPort;
    }

    public void setKeyAuthPort(int keyAuthPort) {
        this.keyAuthPort = keyAuthPort;
    }

    public String getPodHost() {
        return podHost;
    }

    public void setPodHost(String podHost) {
        this.podHost = podHost;
    }

    public int getPodPort() {
        return podPort;
    }

    public void setPodPort(int podPort) {
        this.podPort = podPort;
    }

    public String getAgentHost() {
        return agentHost;
    }

    public void setAgentHost(String agentHost) {
        this.agentHost = agentHost;
    }

    public int getAgentPort() {
        return agentPort;
    }

    public void setAgentPort(int agentPort) {
        this.agentPort = agentPort;
    }

    public String getBotCertPath() {
        return botCertPath;
    }

    public void setBotCertPath(String botCertPath) {
        this.botCertPath = botCertPath;
    }

    public String getBotCertName() {
        return botCertName;
    }

    public void setBotCertName(String botCertName) {
        this.botCertName = botCertName;
    }

    public String getBotCertPassword() {
        return botCertPassword;
    }

    public void setBotCertPassword(String botCertPassword) {
        this.botCertPassword = botCertPassword;
    }

    public String getBotEmailAddress() {
        return botEmailAddress;
    }

    public void setBotEmailAddress(String botEmailAddress) {
        this.botEmailAddress = botEmailAddress;
    }

    public String getAppCertPath() {
        return appCertPath;
    }

    public void setAppCertPath(String appCertPath) {
        this.appCertPath = appCertPath;
    }

    public String getAppCertName() {
        return appCertName;
    }

    public void setAppCertName(String appCertName) {
        this.appCertName = appCertName;
    }

    public String getAppCertPassword() {
        return appCertPassword;
    }

    public void setAppCertPassword(String appCertPassword) {
        this.appCertPassword = appCertPassword;
    }

    public String getProxyURL() {
        return proxyURL;
    }

    public void setProxyURL(String proxyURL) {
        this.proxyURL = proxyURL;
    }

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public int getAuthTokenRefreshPeriod() {
        return authTokenRefreshPeriod;
    }

    public void setAuthTokenRefreshPeriod(int authTokenRefreshPeriod) {
        this.authTokenRefreshPeriod = authTokenRefreshPeriod;
    }

    public String getTruststorePath() {
        return truststorePath;
    }

    public void setTruststorePath(String truststorePath) {
        this.truststorePath = truststorePath;
    }

    public String getTruststorePassword() {
        return truststorePassword;
    }

    public void setTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
    }
}
