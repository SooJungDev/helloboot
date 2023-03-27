package tobyspring.config.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import tobyspring.config.MyAutoConfiguration;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.06
 * Time : 10:37 AM
 */
@MyAutoConfiguration
public class DispatcherServletConfig {
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }
}
