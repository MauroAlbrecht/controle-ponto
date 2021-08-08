package com.digitalinovation.controledeponto.controller.calendario;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Calendario;
import com.digitalinovation.controledeponto.service.calendario.CalendarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendario")
public class CalendarioController extends AbstractController<CalendarioService, Calendario> {

}
