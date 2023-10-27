package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BuscaPorProdutoImpl implements BuscaPorProduto {
    @Autowired
    GatewayProduct gatewayProduct;

    @Override
    public List<ProductModel> buscaPorProduto(String product) {
        return gatewayProduct.BuscarPorProdutoGateway(product);
    }
}
