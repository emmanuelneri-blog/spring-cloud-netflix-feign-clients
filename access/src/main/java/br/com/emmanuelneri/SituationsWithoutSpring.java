package br.com.emmanuelneri;

import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;

public class SituationsWithoutSpring {

    public static boolean check(final String login) {
        final SituationClient client = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(SituationClient.class, "http://localhost:8070/situations");

        return client.check(login);
    }
}

interface SituationClient {

    @RequestLine("GET /check/{login}")
    boolean check(@Param("login") String login);

}
