package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.02.20
 * Time : 12:46 PM
 */


@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name) {
        if (name == null || name.trim().length() == 0) throw new IllegalArgumentException();

        return helloService.sayHello(name);
    }

    @GetMapping("/count")
    public String count(String name) {
        return name + ": "+helloService.countOf(name);
    }
}
