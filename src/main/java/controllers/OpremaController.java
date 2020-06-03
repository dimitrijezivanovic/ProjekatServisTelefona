package controllers;

import GrupaC.demo.models.Oprema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import services.OpremaService;

import java.util.List;

@Controller
public class OpremaController {
    @Autowired
    private OpremaService opremaService;

    @GetMapping("/opreme")
    List<Oprema> all() {
        return this.opremaService.findAll();
    }
}