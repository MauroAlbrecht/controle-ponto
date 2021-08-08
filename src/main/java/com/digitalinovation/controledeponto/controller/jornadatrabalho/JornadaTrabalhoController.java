package com.digitalinovation.controledeponto.controller.jornadatrabalho;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.JornadaTrabalho;
import com.digitalinovation.controledeponto.service.jornadatrabalho.JornadaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController extends AbstractController<JornadaTrabalho, JornadaService> {

}
