package com.digitalinovation.controledeponto.controller.bancohoras;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.BancoHoras;
import com.digitalinovation.controledeponto.service.bancohoras.BancoHorasService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController extends AbstractController<BancoHoras, BancoHorasService> {

}
