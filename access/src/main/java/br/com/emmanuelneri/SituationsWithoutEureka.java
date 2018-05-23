package br.com.emmanuelneri;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "http://localhost:8070", path = "/situations", name = "situations")
public interface SituationsWithoutEureka {

    @RequestMapping(value = "/check/{login}", method = RequestMethod.GET)
    boolean check(@PathVariable("login") String login);

}
