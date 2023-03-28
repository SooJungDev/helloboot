package tobyspring.helloboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.27
 * Time : 6:52 PM
 */
@HellobootTest
public class HelloRepositoryTest {
    @Autowired
    HelloRepository helloRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;



    @Test
    void findHelloFailed() {
        assertThat(helloRepository.findHello("toby")).isNull();
    }

    @Test
    void increaseCount(){
        assertThat(helloRepository.countOf("toby")).isEqualTo(0);

        helloRepository.increaseCount("toby");
        assertThat(helloRepository.countOf("toby")).isEqualTo(1);

        helloRepository.increaseCount("toby");
        assertThat(helloRepository.countOf("toby")).isEqualTo(2);
    }

}
