package com.digitalinovation.controledeponto.controller.localidade;

import com.digitalinovation.controledeponto.controller.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Localidade;
import com.digitalinovation.controledeponto.service.localidade.LocalidadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController extends AbstractController<Localidade, LocalidadeService> {

}
