package com.accesadades.botiga.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategoriaDTO {
    private Long id;
    private String descCategoria;
    private String statusCategoria;
}
