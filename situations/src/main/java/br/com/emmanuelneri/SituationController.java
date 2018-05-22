package br.com.emmanuelneri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/situations")
public class SituationController {

    @GetMapping(path = "/check/{login}")
    public boolean check(@PathVariable("login") String login) {
        return new Random().nextBoolean();
    }

}
