package controllers;

import GrupaC.demo.models.Korisnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import services.KorisnikService;

import java.util.List;

@Controller
public class KorisnikController {
    @Autowired
    private KorisnikService korisnikService;

    @GetMapping("/korisnici")
    List<Korisnik> all() {
        return this.korisnikService.findAll();
    }
}