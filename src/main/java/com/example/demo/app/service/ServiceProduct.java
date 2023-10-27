package com.example.demo.app.service;

import com.example.demo.app.dto.Response;
import com.example.demo.domain.model.ProductModel;

import java.util.List;

public interface ServiceProduct {
      Response findCupomById (Long id);

      List<Response> findAll();

      List<Response> findAllByProducts(String product);
}
