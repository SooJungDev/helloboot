package tobyspring.helloboot;

import org.springframework.stereotype.Service;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.02.28
 * Time : 1:27 PM
 */
@Service
public class SimpleHelloService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
