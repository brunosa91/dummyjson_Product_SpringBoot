package com.example.demo.app.service;

import com.example.demo.app.dto.Response;
import com.example.demo.app.mapper.MapperService;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaPorProduto;
import com.example.demo.domain.usecase.BuscaPorId;
import com.example.demo.domain.usecase.ListarProdutos;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Log4j2
public class ServiceProductImpl  implements ServiceProduct{
    @Autowired
    MapperService mapperService;

    @Autowired
    BuscaPorId buscaPorId;

    @Autowired
    ListarProdutos listarProdutos;

    @Autowired
    BuscaPorProduto buscaPorProduto;
    @Override
    public Response findById(Long id) {

        Response response = mapperService.ProductModeltoResponseDto(buscaPorId.buscarProdutoPorId(id));

        log.info("SERVICE -----" + response);

        return response;
    }

    @Override
    public List<Response> findAll() {

        List<ProductModel> productModelsList = listarProdutos.listarProdutos();
        List<Response> responsesList = mapperService.ProductModeltoResponseDtoList(productModelsList);
        log.info("SERVICE TODOS -----" + responsesList);

        return responsesList;


    }

    @Override
    public List<Response> findAllByProducts(String product) {

        List<ProductModel> productModelsList = buscaPorProduto.buscaPorProduto(product);
        List<Response> responsesList = mapperService.ProductModeltoResponseDtoList(productModelsList);


        return responsesList;
    }
}
