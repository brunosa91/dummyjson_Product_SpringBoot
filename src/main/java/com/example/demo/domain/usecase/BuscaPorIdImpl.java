package com.example.demo.domain.usecase;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BuscaPorIdImpl implements BuscaPorId {
    @Autowired
    GatewayProduct gatewayProduct;
    @Override
    public ProductModel buscarProdutoPorId(Long id) {

        ProductModel productModel =gatewayProduct.buscarPorIdGateway(id);
        log.info("USECASEE ------" + productModel);
        return productModel;
    }
}
