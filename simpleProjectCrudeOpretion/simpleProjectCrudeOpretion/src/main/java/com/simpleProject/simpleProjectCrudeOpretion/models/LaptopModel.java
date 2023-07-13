package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

@Data
public class LaptopModel {
    private Long laptopId;
    private String laptopModel;
    private String laptopRam;
    private String laptopRom;

    private UserModel userModel;
}
