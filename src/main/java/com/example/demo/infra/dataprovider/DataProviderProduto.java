package com.example.demo.infra.dataprovider;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.feign.FeingClient;
import com.example.demo.infra.feign.ProdutoDto;
import feign.FeignException;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@Slf4j

public class DataProviderProduto implements GatewayProduct {





    @Autowired
    FeingClient feingClient;



    @Override
    public ProductModel buscarPorIdGateway(Long id) {

        try {
            ProductModel productModel = feingClient.findById(id);
            log.info("DATA PROVIDER -----" +productModel);

            return productModel;
        }catch (FeignException.NotFound Ex) {

            throw new EntityNotFoundException("ID NÃO ENCONTRADO");
        }





    }

    @Override
    public List<ProductModel> BuscarPorProdutoGateway(String product) {
        ProdutoDto produtoDtoList = feingClient.searchProducts(product);

        List<ProductModel> productModelsList = produtoDtoList.getProducts();




        return productModelsList;
    }


    @Override
    public List<ProductModel> listarProdutosGateway() {

        ProdutoDto produtoDtoList = feingClient.getAllProducts();

        List<ProductModel> productModelsList = produtoDtoList.getProducts();

        log.info("DATAAAA PROVIDER  allll-----" +productModelsList);

        return productModelsList;
    }
}
