package com.example.interntask;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.javatuples.*;



@RestController
@RequestMapping("/api/socks")
public class RequestController {


    @RequestMapping
    public ResponseEntity<String> getSocks(){

        return ResponseEntity.status(HttpStatus.OK).body("HTTP GET request was sent");
    }

    @NotNull
    private ResponseEntity<String> getStringResponseEntity(@RequestBody String body) {
        try{
            Triplet<String, Integer, Integer> parseRes = ParsingService.JSONParse(body);
            return ResponseEntity.status(HttpStatus.OK).body("");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
        }
    }

    @PostMapping("/income")
    public ResponseEntity<String> incomeSocks(@RequestBody String body){
        return getStringResponseEntity(body);
    }

    @PostMapping("/outcome")
    public  ResponseEntity<String> outcomeSocks(@RequestBody String body){
        return getStringResponseEntity(body);
    }
}
