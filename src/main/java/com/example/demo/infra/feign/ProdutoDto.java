package com.example.demo.infra.feign;

import com.example.demo.infra.entidade.ProdutoEntidade;

import java.util.List;

public class ProdutoDto {
    private Long id;
    private String title;

    private String description;

    private Long price;

    private Long discountPercentage;
    private Long rating;

    private Long stock;

    private String brand;
    private String category;

    private String thumbnail;

    private List<String> images;

}
