package com.example.demo.app.service;

import com.example.demo.app.dto.Response;
import com.example.demo.app.mapper.MapperService;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.domain.usecase.BuscaProduto;
import com.example.demo.domain.usecase.ListarProdutos;
import jakarta.transaction.Transactional;
import lombok.extern.java.Log;
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
    BuscaProduto buscaProduto;

    @Autowired
    ListarProdutos listarProdutos;
    @Override
    public Response findCupomById(Long id) {

        Response response = mapperService.ProductModeltoResponseDto(buscaProduto.buscarProduto(id));

        log.info("SERVICE -----" + response);

        return response;
    }

    @Override
    public List<Response> RESPONSE_LIST() {

        List<ProductModel> productModelsList = listarProdutos.listarProdutos();
        List<Response> responsesList = mapperService.ProductModeltoResponseDtoList(productModelsList);
        log.info("SERVICE TODOSSS -----" + responsesList);

        return responsesList;


    }
}
