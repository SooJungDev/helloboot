package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.28
 * Time : 9:09 AM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
public class HelloServiceCountTest {
    @Autowired HelloService helloService;
    @Autowired HelloRepository helloRepository;

    @Test
    void sayHelloIncreaseCount(){
        IntStream.range(1,10).forEach(count ->{
            helloService.sayHello("toby");
            Assertions.assertThat(helloRepository.countOf("toby")).isEqualTo(count);
        });

    }
}
