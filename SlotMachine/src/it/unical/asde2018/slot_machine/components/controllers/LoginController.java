package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.unical.asde2018.slot_machine.components.services.LoginService;

@Controller
public class LoginController{
    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String begin(Model model,HttpSession session){
        if (session.getAttribute("inputName") != null) {
//            model.addAttribute("posts", blogService.getAllPosts());
            return "slot-machine";
        } else
            return "login";
    }
    @GetMapping("/login")
    public String loginAttempt(@RequestParam String inputName,@RequestParam String inputPassword,HttpSession session,Model model){
        if (loginService.checkLogin(inputName, inputPassword)) {
            session.setAttribute("inputName", inputName);
            session.setAttribute("inputPassword", inputPassword);
            return "redirect:/";
        }
        model.addAttribute("wrong", "Wrong Credentials");
        return "login";
    }
}
