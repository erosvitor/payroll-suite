package com.ctseducare.impostos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.impostos.dto.ImpostosDTO;
import com.ctseducare.impostos.feignclient.FgtsFeignClient;
import com.ctseducare.impostos.feignclient.InssFeignClient;

@Service
public class ImpostosService {
    
    @Autowired FgtsFeignClient fgtsClient;
    @Autowired InssFeignClient inssClient;
    
    public ImpostosDTO calcularImpostos(Integer employeeId) {
        double fgts = fgtsClient.calcularFgts(employeeId);
        double inss = inssClient.calcularInss(employeeId);
        
        return new ImpostosDTO(employeeId, fgts, inss);
    }

}
