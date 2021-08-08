package com.digitalinovation.controledeponto.controller.usuario;

import com.digitalinovation.controledeponto.controller.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Usuario;
import com.digitalinovation.controledeponto.service.usuario.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends AbstractController<Usuario, UsuarioService> {

}
