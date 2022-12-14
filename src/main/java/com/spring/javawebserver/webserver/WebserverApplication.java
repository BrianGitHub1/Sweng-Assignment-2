package com.spring.javawebserver.webserver;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swengCalc2.Calculator;

@SpringBootApplication
public class WebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserverApplication.class, args);
	}

}








@Controller
class NoteController {

    @PostMapping("/calc")
    public String calculate(@RequestParam String sum, @RequestParam String add, Model model) {
        Calculator Calc = new Calculator();
        String result = Calc.equate(sum);
        model.addAttribute("result",result);
        return "index";
    }

}

