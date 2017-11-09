package com.kahfi.arief.springbootwebsocket.com.arief.restcontrollers;

import com.kahfi.arief.springbootwebsocket.com.arief.entity.Text;
import com.kahfi.arief.springbootwebsocket.com.arief.repositories.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestAPI {

    @Autowired
    private TextRepo textRepo;

    @PostMapping(value = "/text",produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity postText(@RequestBody Text text){
        textRepo.save(text);
        return new ResponseEntity<String>("Response OK",HttpStatus.OK);
    }

    @GetMapping(value = "/text",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Text> getTexts(){
        return (List<Text>) textRepo.findAll();
    }

}
