package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import org.springframework.beans.factory.annotation.Autowired;

public class InserirProdutoImpl implements InserirProduto {
    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public BuscaProduto inserirProduto(BuscaProduto buscaProduto) {
        return gatewayProduct.inserirProdutoGateway(buscaProduto);
    }
}
