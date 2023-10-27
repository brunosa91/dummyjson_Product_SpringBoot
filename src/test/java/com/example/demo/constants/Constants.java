package com.example.demo.constants;

import com.example.demo.app.dto.Response;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.feign.ProdutoDto;

public class Constants {
    private static final Response RESPONSE = new Response();

    private static final ProductModel PRODUCT_MODEL = new ProductModel();

    private static final ProdutoDto PRODUTO_DTO = new ProdutoDto();
}
