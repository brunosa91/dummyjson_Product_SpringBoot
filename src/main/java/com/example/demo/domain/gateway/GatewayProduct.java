package com.example.demo.domain.gateway;

import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaProduto;

import java.util.List;

public interface GatewayProduct {
    ProductModel buscarProdutoGateway(Long id);

    ProductModel inserirProdutoGateway(ProductModel productModel);

    List<ProductModel> listarProdutosGateway();


}
