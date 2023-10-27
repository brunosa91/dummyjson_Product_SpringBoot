package com.example.demo.domain;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaPorIdImpl;
import com.example.demo.domain.usecase.BuscaPorProdutoImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.example.demo.constants.Constants.PRODUCT_MODEL;
import static com.example.demo.constants.Constants.PRODUCT_MODEL_LIST;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class UsecaseBuscaPorProduto {
    @Mock
    GatewayProduct gatewayProduct;


    @InjectMocks
    BuscaPorProdutoImpl buscaPorProduto;
    @Test
    public void findByProduto(){

        when(gatewayProduct.BuscarPorProdutoGateway("IPHONE")).thenReturn((PRODUCT_MODEL_LIST));

        List<ProductModel> sut = buscaPorProduto.buscaPorProduto("IPHONE");

        Assertions.assertThat(sut).isNotNull();
        Assertions.assertThat(sut).isEqualTo(PRODUCT_MODEL_LIST);

    }


}
