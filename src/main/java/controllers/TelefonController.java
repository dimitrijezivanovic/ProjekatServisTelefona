package controllers;

import GrupaC.demo.models.Telefon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import services.TelefonService;

import java.util.List;

@Controller
public class TelefonController {
    @Autowired
    private TelefonService telefonService;

    @GetMapping("/telefoni")
    List<Telefon> all() {
        return this.telefonService.findAll();
    }
}
