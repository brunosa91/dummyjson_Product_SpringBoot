package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import org.springframework.beans.factory.annotation.Autowired;

public class BuscaProdutoImpl  implements BuscaProduto{
    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public BuscaProduto buscarProduto(Long id) {
        return gatewayProduct.buscarProdutoGateway(id);
    }
}
