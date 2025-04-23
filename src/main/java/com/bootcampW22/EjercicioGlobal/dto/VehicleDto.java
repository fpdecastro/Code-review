package com.bootcampW22.EjercicioGlobal.dto;

import com.bootcampW22.EjercicioGlobal.entity.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDto {
    private Long id;
    private String brand;
    private String model;
    private String registration;
    private String color;
    private int year;
    private String max_speed;
    private int passengers;
    private String fuel_type;
    private String transmission;
    private double height;
    private double width;
    private double weight;

    public Vehicle getEntity(){
        return new Vehicle(
            this.getId(),
            this.getBrand(),
            this.getModel(),
            this.getRegistration(),
            this.getColor(),
            this.getYear(),
            this.getMax_speed(),
            this.getPassengers(),
            this.getFuel_type(),
            this.getTransmission(),
            this.getHeight(),
            this.getWidth(),
            this.getWeight()
        );
    }
}
