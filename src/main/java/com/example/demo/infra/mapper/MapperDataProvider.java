package com.example.demo.infra.mapper;

import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.entidade.ProdutoEntidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface MapperDataProvider {

ProductModel produtoEntidadeParaProdutoModel(ProductModel produtoEntidade);
ProdutoEntidade produtoModelParaProdutoEntidade(ProductModel productModel);


}
