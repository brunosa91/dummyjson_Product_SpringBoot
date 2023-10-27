package com.example.demo.infra.dataprovider;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.feign.FeingClient;
import com.example.demo.infra.feign.ProdutoDto;
import com.example.demo.infra.mapper.MapperDataProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@Slf4j

public class DataProviderProduto implements GatewayProduct {

    @Autowired
    MapperDataProvider mapperDataProvider;



    @Autowired
    FeingClient feingClient;






    @Override
    public ProductModel buscarProdutoGateway(Long id) {

        ProductModel productModel = feingClient.findById(id);

        log.info("DATAAAA PROVIDER -----" +productModel);

        return productModel;
    }

    @Override
    public ProductModel inserirProdutoGateway(ProductModel productModel) {
        return null;
    }

    @Override
    public List<ProductModel> listarProdutosGateway() {

        ProdutoDto produtoDtoList = feingClient.getAllProducts();

        List<ProductModel> productModelsList = produtoDtoList.getProducts();

        log.info("DATAAAA PROVIDER  allll-----" +productModelsList);

        return productModelsList;
    }
}
