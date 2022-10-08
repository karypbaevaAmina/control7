package com.example.control7.utils;
import com.example.control7.dao.ClientDao;
import com.example.control7.dao.OrderDao;
import com.example.control7.entity.Client;
import com.example.control7.entity.Dishes;
import com.example.control7.entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@AllArgsConstructor
@Configuration
public class InitDatabase {

        private final ClientDao clientDao;
        private final PasswordEncoder encoder;
        private final OrderDao orderDao;


    @Bean
    public CommandLineRunner fillData() {
        return (args) -> {

//            orderDao.saveOrder(Order.builder().id(1L).dish(1L).planedDate(LocalDateTime.now());
//            orderDao.saveOrder(Order.builder().id(2L).dish(2L).planedDate(LocalDateTime.now());


            Client client1 = new Client();
            client1.setId(1L);
            client1.setEmail("test@test");
            client1. setName("test");
            client1.setPassword(encoder.encode("test"));
            clientDao.create(client1);

            Client client2 = new Client();
            client2.setId(2L);
            client2.setEmail("admin@test");
            client2. setName("test");
            client2.setPassword(encoder.encode("test"));
            clientDao.create(client2);



        };
    }
}
