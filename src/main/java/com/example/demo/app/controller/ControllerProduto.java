package com.example.demo.app.controller;

import com.example.demo.app.dto.Response;
import com.example.demo.app.service.ServiceProduct;
import com.example.demo.domain.model.ProductModel;
import com.example.demo.infra.feign.FeingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        log.info("CONTROLER ID-----" +response);

return ResponseEntity.ok(response);

    }

    @GetMapping
    public ResponseEntity<List<Response>> buscaPorTodos(){

        List<Response> responsesList = serviceProduct.findAll();
        log.info("CONTROLER TODOS PRODUTOS -----" +responsesList);

        return ResponseEntity.ok(responsesList);

    }

    @GetMapping(value = "/products")
    public ResponseEntity<List<Response>> buscaPorProdutos( @RequestParam String product){

        List<Response> responsesList = serviceProduct.findAllByProducts(product);
        log.info("CONTROLER PRODUTO-----" +responsesList);

        return ResponseEntity.ok(responsesList);

    }



}
