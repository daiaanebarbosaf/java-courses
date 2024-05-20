package br.com.daianefarias.java_cources.modules.cources;

import java.util.UUID;

import lombok.Data;

@Data //criar os gets e setters para todos os atributos
public class CourceEntity {
    private UUID id; 
    private String name;
    private String category;
    private String active;
    private String description;

    private Integer created_at; 
    private Integer updated_at;

}
