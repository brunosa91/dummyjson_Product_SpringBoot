package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ListarProdutosImpl implements ListarProdutos {

    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public List<ProductModel> listarProdutos() {
        return gatewayProduct.listarProdutosGateway();
    }
}
