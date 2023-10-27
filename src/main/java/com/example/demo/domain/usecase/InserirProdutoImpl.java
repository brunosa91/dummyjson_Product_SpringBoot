package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class InserirProdutoImpl implements InserirProduto {
    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public ProductModel inserirProduto(ProductModel productModel) {
        return gatewayProduct.inserirProdutoGateway(productModel);
    }
}
