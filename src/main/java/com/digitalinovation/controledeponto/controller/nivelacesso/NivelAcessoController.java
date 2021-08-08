package com.digitalinovation.controledeponto.controller.nivelacesso;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.NivelAcesso;
import com.digitalinovation.controledeponto.service.nivelacesso.NivelAcessoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController extends AbstractController<NivelAcesso, NivelAcessoService> {

}
