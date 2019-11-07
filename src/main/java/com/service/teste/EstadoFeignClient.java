package com.service.teste;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "EstadoFeignClient", url="https://servicodados.ibge.gov.br/api/v1/localidades")
public interface EstadoFeignClient {
    @GetMapping(value="/estados",consumes=MediaType.APPLICATION_JSON_VALUE)
    List<EstadoModel> getEstados();
}
