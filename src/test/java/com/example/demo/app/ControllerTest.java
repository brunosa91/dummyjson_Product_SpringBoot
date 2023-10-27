package com.example.demo.app;

import com.example.demo.app.controller.ControllerProduto;
import com.example.demo.app.mapper.MapperServiceImpl;
import com.example.demo.app.service.ServiceProduct;
import com.example.demo.app.service.ServiceProductImpl;
import com.example.demo.constants.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.demo.constants.Constants.*;

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
    //when(serviceProduct.findById(1L)).thenReturn(PRODUCT_MODEL);
    }

}
