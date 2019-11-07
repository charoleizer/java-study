package com.service.teste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estados")
public class EstadoController {

	@Autowired
	EstadoFeignClient estadoFeignClient;
    
    @GetMapping()
    public List<EstadoModel> getEstados()
    {
        return estadoFeignClient.getEstados();
    }
	
}
