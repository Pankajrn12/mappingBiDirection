package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

@Data
public class UserModel {
    private Long userId;
    private String userName;
    private String userMobileNumber;
    private String userAddress;
    private LaptopModel laptopModel;
}
