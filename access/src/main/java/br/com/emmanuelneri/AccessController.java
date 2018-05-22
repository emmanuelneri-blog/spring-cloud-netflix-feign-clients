package br.com.emmanuelneri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class AccessController {

    @Autowired
    private Situations situations;

    @GetMapping("/{login}")
    public String access(@PathVariable("login") final String login) {
        return situations.check(login) ? "Valid!" : "Invalid!";
    }

}
