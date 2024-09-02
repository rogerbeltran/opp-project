package com.ups.oop.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class ProductoDTO {
    private String nombre_producto;
    private String Id;
    private double precio;
    private String proveedor;
}