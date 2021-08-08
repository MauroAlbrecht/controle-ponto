package com.digitalinovation.controledeponto.controller.ocorrencia;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Ocorrencia;
import com.digitalinovation.controledeponto.service.ocorrencia.OcorrenciaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController extends AbstractController<OcorrenciaService, Ocorrencia> {

}
