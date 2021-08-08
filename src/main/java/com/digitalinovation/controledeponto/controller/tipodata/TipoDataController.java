package com.digitalinovation.controledeponto.controller.tipodata;

import com.digitalinovation.controledeponto.abstracts.AbstractController;
import com.digitalinovation.controledeponto.model.TipoData;
import com.digitalinovation.controledeponto.service.tipodata.TipoDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController extends AbstractController<TipoDataService, TipoData> {

}
