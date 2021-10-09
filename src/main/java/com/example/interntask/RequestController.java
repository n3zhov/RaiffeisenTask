package com.example.interntask;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.javatuples.*;

import java.util.List;


@RestController
@RequestMapping("/api/socks")
public class RequestController {


    @RequestMapping
    public ResponseEntity<Integer> getSocks(@RequestParam String color,
                                           @RequestParam String operation,
                                           @RequestParam Integer cottonPart){



        return ResponseEntity.status(HttpStatus.OK).body(0);
    }

    @NotNull
    private ResponseEntity<String> getStringResponseEntity(@RequestBody String body, boolean isIncome) {
        try{
            Triplet<String, Integer, Integer> parseRes = ParsingService.JSONParse(body);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
        }
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @PostMapping("/income")
    public ResponseEntity<String> incomeSocks(@RequestBody String body){
        return getStringResponseEntity(body, true);
    }

    @PostMapping("/outcome")
    public  ResponseEntity<String> outcomeSocks(@RequestBody String body){
        return getStringResponseEntity(body, false);
    }
}
