package com.example.demo.infra.feign;

import com.example.demo.domain.model.ProductModel;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "dummy-json-client", url = "https://dummyjson.com")
public interface FeingClient {

   @GetMapping("/products/{id}")
   @Headers("Accept: application/json")
   ProductModel findById(@PathVariable Long id);

   @GetMapping("/products")
   ProdutoDto   getAllProducts();

}
