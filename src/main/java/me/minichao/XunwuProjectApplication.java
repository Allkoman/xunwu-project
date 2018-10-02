package me.minichao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchao
 */
@SpringBootApplication
@RestController
public class XunwuProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunwuProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }
}
