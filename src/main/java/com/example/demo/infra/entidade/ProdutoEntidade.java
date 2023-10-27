package com.example.demo.infra.entidade;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table
public class ProdutoEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private Long price;
    @Column
    private Long discountPercentage;
    @Column
    private Long rating;
    @Column
    private Long stock;
    @Column
    private String brand;
    @Column
    private String category;
    @Column
    private String thumbnail;
    @Column
    private List<String> images;

}
