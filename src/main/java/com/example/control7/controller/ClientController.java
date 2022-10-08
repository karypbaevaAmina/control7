package com.example.control7.controller;

import com.example.control7.dto.ClientDto;
import com.example.control7.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ClientController {

    private  final ClientService clientService;


    @PostMapping("/register")
    /* Регистрация отправляется в таком виде
        {
            "name": "Kate",
            "email": "ket@ket.ket.",
            "password": "12345678"
        }
     */
    public ResponseEntity<String> createNewUser(@RequestBody ClientDto clientDto) {
        return new ResponseEntity<>(clientService.createNewClient(clientDto), HttpStatus.OK);
    }
}
