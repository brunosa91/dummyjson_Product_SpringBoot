package com.example.demo.app;

import com.example.demo.app.controller.ControllerProduto;
import com.example.demo.app.dto.Response;
import com.example.demo.app.mapper.MapperServiceImpl;
import com.example.demo.app.service.ServiceProduct;
import com.example.demo.app.service.ServiceProductImpl;
import com.example.demo.constants.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.demo.constants.Constants.*;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ControllerProduto.class)
public class ControllerTest {

    @MockBean
    private ServiceProductImpl serviceProduct;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    MapperServiceImpl mapperService;


    @Test
    public void findProductById_ReturnProduct() throws Exception{
    when(serviceProduct.findById(1L)).thenReturn(RESPONSE);


    mockMvc.perform(get("/produto/1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id").value(RESPONSE.getId()));
    }

    @Test
    public void findProductByUnexistingId_ReturnNotFound() throws Exception{
        when(serviceProduct.findById(1L)).thenThrow(EntityNotFoundException.class);


        mockMvc.perform(get("/produto/1"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void findAll_ReturnProductList() throws Exception{

        List<Response> responseList = new ArrayList<>();
        responseList.add(RESPONSE);
        when(serviceProduct.findAll()).thenReturn(responseList);


        mockMvc.perform(get("/produto"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].id").value(RESPONSE.getId()));
    }

    @Test
    public void findAll_ReturnEmptyList() throws Exception{
        when(serviceProduct.findAll()).thenReturn(Collections.emptyList());


        mockMvc.perform(get("/produto"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(0)));
    }

    @Test
    public void findByProduct_ReturnProductList() throws Exception{

        List<Response> responseList = new ArrayList<>();
        responseList.add(RESPONSE);
        when(serviceProduct.findAllByProducts("iphone")).thenReturn(responseList);


        mockMvc.perform(get("/produto/products?product=iphone"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].id").value(RESPONSE.getId()));
    }

    @Test
    public void findByProduct_ReturnEmptyList() throws Exception{
        when(serviceProduct.findAllByProducts("teste")).thenReturn(Collections.emptyList());


        mockMvc.perform(get("/produto/products?product=teste"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(0)));
    }



}
