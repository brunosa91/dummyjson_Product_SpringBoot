package com.example.demo.infra;

import com.example.demo.constants.Constants;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.dataprovider.DataProviderProduto;
import com.example.demo.infra.feign.FeingClient;
import feign.FeignException;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static com.example.demo.constants.Constants.*;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DataProviderTest {

    @Mock
    private FeingClient  feingClient;

    @InjectMocks
    private DataProviderProduto dataProviderProduto;

    @Test
    public void findById(){

        when(feingClient.findById(1L)).thenReturn((PRODUCT_MODEL));

        ProductModel sut = dataProviderProduto.buscarPorIdGateway(1l);

        Assertions.assertThat(sut).isNotNull();
        Assertions.assertThat(sut).isEqualTo(PRODUCT_MODEL);

    }

    @Test
    public void findById_NotFound(){

        when(feingClient.findById(anyLong())).thenThrow(FeignException.NotFound.class);


        Assertions.assertThatExceptionOfType(EntityNotFoundException.class).isThrownBy(()->dataProviderProduto.buscarPorIdGateway(1L));

    }

    @Test
    public void findAll(){

        List<ProductModel> productModelList = new ArrayList<>();
        productModelList.add(PRODUCT_MODEL);


        PRODUTO_DTO.setProducts(productModelList);

        when(feingClient.getAllProducts()).thenReturn((PRODUTO_DTO));


       List<ProductModel>  sut = dataProviderProduto.listarProdutosGateway();



        Assertions.assertThat(sut).isNotEmpty();
        Assertions.assertThat(sut).isEqualTo(PRODUTO_DTO.getProducts());

    }



    @Test
    public void findByProduct(){

        List<ProductModel> productModelList = new ArrayList<>();
        productModelList.add(PRODUCT_MODEL);


        PRODUTO_DTO.setProducts(productModelList);

        when(feingClient.searchProducts("iphone")).thenReturn((PRODUTO_DTO));


        List<ProductModel>  sut = dataProviderProduto.BuscarPorProdutoGateway("iphone");



        Assertions.assertThat(sut).isNotEmpty();
        Assertions.assertThat(sut).isEqualTo(PRODUTO_DTO.getProducts());

    }



}
