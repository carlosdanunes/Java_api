package com.pagamentos.api.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.pagamentos.api.entity.Pagamento;
import com.pagamentos.api.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class PagamentoService {

    public final PagamentoRepository repository;

    public List<Pagamento> listar() {
        return repository.findAll();
    }

    public Pagamento criar(Pagamento pagamento) {
        pagamento.setStatus("PENDENTE");
        pagamento.setCriadoEm(LocalDateTime.now());
        return repository.save(pagamento);
    }

    public Pagamento buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
