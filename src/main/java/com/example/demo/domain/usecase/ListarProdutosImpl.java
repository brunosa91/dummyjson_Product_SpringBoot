package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ListarProdutosImpl implements ListarProdutos {

    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public List<BuscaProduto> listarProdutos() {
        return gatewayProduct.listarProdutosGateway();
    }
}
