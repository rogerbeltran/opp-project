package com.ups.oop.dto;


import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class FacturaDTO {
    private String id;
    private String serial;
    private String cliente;
    private Date fecha;
    private Double preciototal;
    private String empleado;
    private String metodo;
}
