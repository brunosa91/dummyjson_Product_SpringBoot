package com.example.demo.app.service;

import com.example.demo.app.dto.Response;
import com.example.demo.app.mapper.MapperService;
import com.example.demo.domain.usecase.BuscaProduto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceProductImpl  implements ServiceProduct{
    @Autowired
    MapperService mapperService;

    @Autowired
    BuscaProduto buscaProduto;
    @Override
    public Response findCupomById(Long id) {

        Response response = mapperService.ProductModeltoResponseDto(buscaProduto.buscarProduto(id));

        return response;
    }
}
