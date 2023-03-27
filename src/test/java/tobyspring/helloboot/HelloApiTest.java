package tobyspring.helloboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.02.28
 * Time : 4:52 PM
 */
public class HelloApiTest {

    @Test
    void helloApi(){
        // http localhost:8080/hello?name=Spring
        TestRestTemplate rest = new TestRestTemplate();
        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:9090/app/hello?name={name}", String.class, "Spring");


        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);
        assertThat(res.getBody()).isEqualTo("*Hello Spring*");

    }

    @Test
    void failHelloApi(){
        // http localhost:8080/hello?name=Spring
        TestRestTemplate rest = new TestRestTemplate();
        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:9090/app/hello?name=", String.class);


        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);

    }
}