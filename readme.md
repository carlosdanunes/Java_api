Request 1 — Listar (GET)
Método:  GET
URL:     http://localhost:8080/pagamentos
Retorno esperado: [] (lista vazia)


Request 2 — Criar (POST)
Método:  POST
URL:     http://localhost:8080/pagamentos
Headers: Content-Type: application/json
Body → raw → JSON:
json{
  "descricao": "Pagamento PIX",
  "valor": 150.00
}
Retorno esperado:
json{
  "id": 1,
  "descricao": "Pagamento PIX",
  "valor": 150.00,
  "status": "PENDENTE",
  "criadoEm": "2025-..."
}




Request 3 — Buscar por ID (GET)
Método:  GET
URL:     http://localhost:8080/pagamentos/1


Request 4 — Deletar (DELETE)
Método:  DELETE
URL:     http://localhost:8080/pagamentos/1
