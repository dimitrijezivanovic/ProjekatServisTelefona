package controllers;

import GrupaC.demo.models.Korpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import services.KorpaService;

import java.util.List;

@Controller
public class KorpaController {
    @Autowired
    private KorpaService korpaService;

    @GetMapping("/korpe")
    List<Korpa> all() {
        return this.korpaService.findAll();
    }
}