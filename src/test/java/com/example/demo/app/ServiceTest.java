package com.example.demo.app;

import com.example.demo.app.dto.Response;
import com.example.demo.app.mapper.MapperServiceImpl;
import com.example.demo.app.service.ServiceProductImpl;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaPorIdImpl;
import com.example.demo.domain.usecase.BuscaPorProdutoImpl;
import com.example.demo.domain.usecase.ListarProdutosImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.constants.Constants.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ServiceTest {

    @Mock
    MapperServiceImpl mapperService;

    @Mock
    BuscaPorIdImpl buscaPorId;

    @Mock
    ListarProdutosImpl listarProdutos;

    @Mock
    BuscaPorProdutoImpl buscaPorProduto;

    @InjectMocks
    private ServiceProductImpl serviceProduct;

    @Test
    public void testFindById() {

        when(mapperService.ProductModeltoResponseDto(buscaPorId.buscarProdutoPorId(1L))).thenReturn(RESPONSE);

        Response result = serviceProduct.findById(1L);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result).isEqualTo(RESPONSE);


    }

    @Test
    public void testFindAll() {

        List<Response> responseList = new ArrayList<>();

        responseList.add(RESPONSE);


        when(mapperService.ProductModeltoResponseDtoList(listarProdutos.listarProdutos())).thenReturn(responseList);

        List< Response> result = serviceProduct.findAll();

        Assertions.assertThat(result).isNotEmpty();
        Assertions.assertThat(result).isEqualTo(responseList);


    }

    @Test
    public void testByProduct() {

        List<Response> responseList = new ArrayList<>();

        responseList.add(RESPONSE);

        when(mapperService.ProductModeltoResponseDtoList(buscaPorProduto.buscaPorProduto("IPHONE"))).thenReturn(responseList);

       List< Response> result = serviceProduct.findAllByProducts("IPHONE");

        Assertions.assertThat(result).isNotEmpty();
        Assertions.assertThat(result).isEqualTo(responseList);


    }


}
