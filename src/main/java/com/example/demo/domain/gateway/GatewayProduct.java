package com.example.demo.domain.gateway;

import com.example.demo.domain.usecase.BuscaProduto;

import java.util.List;

public interface GatewayProduct {
    BuscaProduto buscarProdutoGateway(Long id);

    BuscaProduto inserirProdutoGateway(BuscaProduto buscaProduto);

    List<BuscaProduto> listarProdutosGateway();


}
