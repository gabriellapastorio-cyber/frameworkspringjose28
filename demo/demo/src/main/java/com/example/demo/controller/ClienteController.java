package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Cliente;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

        @PostMapping("/cadastrar")
        public static Cliente cadastrar(@Deprecated Cliente cliente){
            Cliente cliente1 = new Cliente();
            cliente1.setNome(cliente.getNome());
            cliente1.setCpf(cliente.getCpf());
            cliente1.setEmail(cliente.getEmail());
            cliente1.setSaldo(cliente.getSaldo());
            return cliente1;    
        }
        
        

        
    
}
