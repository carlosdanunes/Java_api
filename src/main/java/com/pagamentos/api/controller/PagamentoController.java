package com.pagamentos.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pagamentos.api.entity.Pagamento;
import com.pagamentos.api.service.PagamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pagamentos")
@RequiredArgsConstructor
public class PagamentoController {

    private final PagamentoService service;

    @GetMapping
    public List<Pagamento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pagamento buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Pagamento criar(@RequestBody Pagamento pagamento) {
        return service.criar(pagamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
