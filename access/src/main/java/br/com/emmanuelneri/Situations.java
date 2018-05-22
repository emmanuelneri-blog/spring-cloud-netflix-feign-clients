package br.com.emmanuelneri;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "situations", path = "/situations")
public interface Situations {

    @RequestMapping(value = "/check/{login}", method = RequestMethod.GET)
    boolean check(@PathVariable("login") String login);

}
