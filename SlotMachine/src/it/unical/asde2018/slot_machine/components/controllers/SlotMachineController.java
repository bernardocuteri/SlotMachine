package it.unical.asde2018.slot_machine.components.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.unical.asde2018.slot_machine.components.services.SlotMachinesService;

@Controller
public class SlotMachineController{
    @Autowired
    SlotMachinesService slotMachinesService;

    @PostMapping(params = "logout",path = "/doBet")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @PostMapping(params = "bet",path = "/doBet")
    public String logout(Model model,@RequestParam String optradio){
        int a = slotMachinesService.generateRandomNumber();
        int b = slotMachinesService.generateRandomNumber();
        int c = slotMachinesService.generateRandomNumber();
        model.addAttribute("value1", a);
        model.addAttribute("value2", b);
        model.addAttribute("value3", c);
        model.addAttribute("result", slotMachinesService.checkWin(a, b, c, Integer.parseInt(optradio)));
        return "slot-machine";
    }
}
