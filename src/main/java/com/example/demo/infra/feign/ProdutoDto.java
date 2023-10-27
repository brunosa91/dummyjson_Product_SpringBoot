package com.example.demo.infra.feign;

import com.example.demo.domain.model.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {

    private List<ProductModel> products;
    private Long total;
    private Long skip;
    private Long limit;


}
