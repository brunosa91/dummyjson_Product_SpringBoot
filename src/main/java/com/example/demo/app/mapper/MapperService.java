package com.example.demo.app.mapper;

import com.example.demo.app.dto.Response;
import com.example.demo.domain.model.ProductModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")

public interface MapperService {




    Response ProductModeltoResponseDto(ProductModel productModel);
}
