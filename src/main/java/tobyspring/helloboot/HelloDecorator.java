package tobyspring.helloboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.02.28
 * Time : 5:24 PM
 */
@Service
@Primary
public class HelloDecorator implements HelloService {
    private final HelloService helloService;

    public HelloDecorator(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        return "*" + helloService.sayHello(name) + "*";
    }
}
