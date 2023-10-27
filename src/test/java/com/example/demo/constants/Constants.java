package com.example.demo.constants;

import com.example.demo.app.dto.Response;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.feign.ProdutoDto;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final List<String> image = new ArrayList<>();
    public static final Response RESPONSE = new Response(1L,"Gulab Powder 50 Gram","Dry Rose Flower Powder Gulab Powder 50 Gram • Treats Wounds", 70L,13L,4L,47L,"Dry Rose","groceries", "https://i.dummyjson.com/data/products/25/thumbnail.jpg",image );

    public static final List<ProductModel> PRODUCT_MODEL_LIST = new ArrayList<>();
    public static final ProductModel PRODUCT_MODEL = new ProductModel(1L,"Gulab Powder 50 Gram","Dry Rose Flower Powder Gulab Powder 50 Gram • Treats Wounds", 70L,13L,4L,47L,"Dry Rose","groceries", "https://i.dummyjson.com/data/products/25/thumbnail.jpg",image);


    public static final ProdutoDto PRODUTO_DTO = new ProdutoDto(PRODUCT_MODEL_LIST,10L,5L,5L);
}
