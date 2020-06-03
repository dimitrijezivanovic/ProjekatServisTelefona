package controllers;

import GrupaC.demo.models.TipArtikla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import services.TipArtiklaService;

import java.util.List;

@Controller
public class TipArtiklaController {
    @Autowired
    private TipArtiklaService tipArtiklaService;

    @GetMapping("/tipoviartikala")
    List<TipArtikla> all() {
        return this.tipArtiklaService.findAll();
    }
}
