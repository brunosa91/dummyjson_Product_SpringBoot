package com.example.demo.domain;

import com.example.demo.domain.gateway.GatewayProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaPorProdutoImpl;
import com.example.demo.domain.usecase.ListarProdutos;
import com.example.demo.domain.usecase.ListarProdutosImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.example.demo.constants.Constants.PRODUCT_MODEL_LIST;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class UsecaseListarProdutos {
    @Mock
    GatewayProduct gatewayProduct;


    @InjectMocks
    ListarProdutosImpl listarProdutos;

    @Test
    public void findAll(){

        when(gatewayProduct.listarProdutosGateway()).thenReturn((PRODUCT_MODEL_LIST));

        List<ProductModel> sut = listarProdutos.listarProdutos();

        Assertions.assertThat(sut).isNotNull();
        Assertions.assertThat(sut).isEqualTo(PRODUCT_MODEL_LIST);

    }

}
