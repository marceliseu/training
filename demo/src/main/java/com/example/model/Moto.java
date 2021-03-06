package com.example.model;

import java.util.Objects;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Motos")
public class Moto {

    @Id
    @EqualsAndHashCode.Include
    private  String motoId;

    private  String modelo;

    private  Integer motor;

}
