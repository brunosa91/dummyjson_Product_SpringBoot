package com.example.demo.infra.entidade;

import jakarta.persistence.Entity;

import java.util.List;


@Entity
public class ProdutoEntidade {

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
