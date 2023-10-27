package com.example.demo.domain;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaPorIdImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.demo.constants.Constants.PRODUCT_MODEL;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class UsecaseBuscaPorId {

    @Mock
    GatewayProduct gatewayProduct;


    @InjectMocks
    BuscaPorIdImpl buscaPorId;


    @Test
    public void findById(){

        when(gatewayProduct.buscarPorIdGateway(1L)).thenReturn((PRODUCT_MODEL));

        ProductModel sut = buscaPorId.buscarProdutoPorId(1L);

        Assertions.assertThat(sut).isNotNull();
        Assertions.assertThat(sut).isEqualTo(PRODUCT_MODEL);

    }



}
