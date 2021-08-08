package com.digitalinovation.controledeponto.controller.empresa;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.Empresa;
import com.digitalinovation.controledeponto.service.empresa.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController extends AbstractController<EmpresaService, Empresa> {

}
