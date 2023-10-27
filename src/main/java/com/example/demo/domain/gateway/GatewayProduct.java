package com.example.demo.domain.gateway;

import com.example.demo.domain.model.ProductModel;

import java.util.List;

public interface GatewayProduct {
    ProductModel buscarPorIdGateway(Long id);

    List<ProductModel >BuscarPorProdutoGateway(String product);

    List<ProductModel> listarProdutosGateway();


}
