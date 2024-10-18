package hashim.projects.open_source.authservice.springauthorizationserver.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/")
public class AuthController {


    @GetMapping("random")
    public String login(){

        return "success";

    }

}
