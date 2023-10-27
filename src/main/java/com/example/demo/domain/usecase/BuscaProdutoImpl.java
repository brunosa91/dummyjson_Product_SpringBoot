package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscaProdutoImpl  implements BuscaProduto{
    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public ProductModel buscarProduto(Long id) {
        return gatewayProduct.buscarProdutoGateway(id);
    }
}
