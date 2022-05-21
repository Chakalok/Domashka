package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class SixthHomework {
    @GetMapping("/myRequest")
    public ResponseEntity<Response> myRequest(@RequestBody Response response){
        return ResponseEntity.ok(response);
    }
    public String headers(@RequestHeader Map<String, String> headers, Model model) {
        model.addAttribute("headers", headers);
        return "good";
    }

}
