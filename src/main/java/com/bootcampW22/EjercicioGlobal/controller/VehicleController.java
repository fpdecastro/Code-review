package com.bootcampW22.EjercicioGlobal.controller;

import com.bootcampW22.EjercicioGlobal.dto.ResponseDto;
import com.bootcampW22.EjercicioGlobal.dto.VehicleDto;
import com.bootcampW22.EjercicioGlobal.service.IVehicleService;
import com.bootcampW22.EjercicioGlobal.service.VehicleServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    IVehicleService vehicleService;

    public VehicleController(VehicleServiceImpl vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("")
    public ResponseEntity<?> getVehicles(){
        return new ResponseEntity<>(vehicleService.searchAllVehicles(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto> addVehicle(
        @RequestBody VehicleDto vehicle
    ){
        return new ResponseEntity<>(vehicleService.addVehicle(vehicle), HttpStatus.OK);
    }
}
