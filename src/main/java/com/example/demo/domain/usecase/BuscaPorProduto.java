package com.example.demo.domain.usecase;

import com.example.demo.domain.model.ProductModel;

import java.util.List;

public interface BuscaPorProduto {
    List< ProductModel> buscaPorProduto(String product);

}
