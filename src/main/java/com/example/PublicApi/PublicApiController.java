package com.example.PublicApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
public class PublicApiController {

    @GetMapping("/api")
    public PublicApi getapi (){
        String email = "noxxspring@gmail.com";
        String currentDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(
                ZoneOffset.UTC).format(Instant.now());
        String githubUrl = "https://github.com/noxxspring/PublicApi-Hng0";
        return new PublicApi(email,currentDateTime,githubUrl);
    }
}
