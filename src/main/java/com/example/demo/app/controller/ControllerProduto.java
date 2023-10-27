package com.example.demo.app.controller;

import com.example.demo.app.dto.Response;
import com.example.demo.app.service.ServiceProduct;
import com.example.demo.infra.feign.FeingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
@Slf4j
public class ControllerProduto {

    @Autowired
    ServiceProduct serviceProduct;

    @Autowired
    FeingClient  feingClient;

    @GetMapping(value = "/{id}")
public ResponseEntity<Response> buscaPorId(@PathVariable Long id){
Response response = serviceProduct.findCupomById(id);

        log.info("CONTROLERRR -----" +response);

return ResponseEntity.ok(response);

    }
}
