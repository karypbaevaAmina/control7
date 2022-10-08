package com.example.control7.service;

import com.example.control7.dao.ClientDao;
import com.example.control7.dto.ClientDto;
import com.example.control7.entity.Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientDao clientDao;



    public String createNewClient(ClientDto clientDto){
        return clientDao.create(
                Client.builder()
                        .id(clientDto.getId())
                        .name(clientDto.getName())
                        .email(clientDto.getEmail())
                        .password(clientDto.getPassword())
                        .build()
        );
    }
}

