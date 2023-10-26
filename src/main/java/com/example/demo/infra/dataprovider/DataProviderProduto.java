package com.example.demo.infra.dataprovider;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.usecase.BuscaProduto;

import java.util.List;

public class DataProviderProduto implements GatewayProduct {
    @Override
    public BuscaProduto buscarProdutoGateway(Long id) {
        return null;
    }

    @Override
    public BuscaProduto inserirProdutoGateway(BuscaProduto buscaProduto) {
        return null;
    }

    @Override
    public List<BuscaProduto> listarProdutosGateway() {
        return null;
    }
}
