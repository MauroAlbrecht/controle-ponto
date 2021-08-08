package com.digitalinovation.controledeponto.controller.empresa;

import com.digitalinovation.controledeponto.model.Empresa;
import com.digitalinovation.controledeponto.model.JornadaTrabalho;
import com.digitalinovation.controledeponto.service.empresa.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getList() {
        return empresaService.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(empresaService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa) {
        return empresaService.update(empresa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByID(@PathVariable("id") Long id) {
        try {
            empresaService.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }
}
