package com.example.fastcampus.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiConmtroller {

    @GetMapping(path="/hello")
    public String getHello(){
        return "get Hello";


    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET )
    public String hi(){
        return "hi";

    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName){
        return pathName;
    }

    @GetMapping( path="query-param")
    public String queryParam(@RequestParam Map<String, String > queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(  entry ->{
            sb.append(entry.getKey()+ entry.getValue() );

        });
        return sb.toString();

    }
}
