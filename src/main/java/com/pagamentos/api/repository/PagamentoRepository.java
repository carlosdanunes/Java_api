package com.pagamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pagamentos.api.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
