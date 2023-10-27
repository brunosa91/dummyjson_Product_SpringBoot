package com.example.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

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


    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", images=" + images +
                '}';
    }
}
