package tobyspring.config.autoconfig;

import org.springframework.stereotype.Component;
import tobyspring.config.MyConfigurationProperties;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.27
 * Time : 4:31 PM
 */
@Component
@MyConfigurationProperties(prefix = "server")
public class ServerProperties {

    private String contextPath;


    private int port;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
