package com.digitalinovation.controledeponto.controller.movimentacao;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Movimentacao;
import com.digitalinovation.controledeponto.service.movimentacao.MovimentacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController extends AbstractController<MovimentacaoService, Movimentacao> {

}
