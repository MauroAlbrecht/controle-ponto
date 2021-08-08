package com.digitalinovation.controledeponto.controller.categoriausuario;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.CategoriaUsuario;
import com.digitalinovation.controledeponto.service.categoriausuario.CategoriaUsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoriausuario")
public class CategoriaUsuarioController extends AbstractController<CategoriaUsuario, CategoriaUsuarioService> {

}
