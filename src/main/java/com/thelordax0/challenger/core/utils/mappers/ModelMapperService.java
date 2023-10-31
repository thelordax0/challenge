package com.thelordax0.challenger.core.utils.mappers;


import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}