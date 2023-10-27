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

        dataProviderProduto.buscarPorIdGateway(1L);

        Assertions.assertThatExceptionOfType(EntityNotFoundException.class).isThrownBy(()->dataProviderProduto.buscarPorIdGateway(1L));

    }



}
