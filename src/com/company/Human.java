package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Salleable;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Human implements Salleable {
    private String firstName;
    private String lastName;
    private Phone mobile;
    private Animal pet;
    private Double salary = 1000.0;
    private Double cash;
    private Car[] garage;



    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage=new Car[5];
    }

    public Double getSalary() {
        System.out.println("Last salary was checked " + LocalDateTime.now());
        System.out.println("Salary was " + salary);
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("I think it's impossible");
        } else {
            System.out.println("New data sent to the system");
            System.out.println("You need to pick up annex from  Hanna.");
            System.out.println("Don't try to hide income.ZUS & US know about all of changes");
        }
        this.salary=salary;
    }

    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar(int garageSlot){
        return garage[garageSlot];
    }
    public void setCar(int garageSlot,Car car){
        garage[garageSlot]=car;
    }
    public Double sumCarValue(){
        Double sum = 0.0;

        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                sum += garage[i].getValue();
            }
        }

        return sum;
    }

//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        if (car.getValue()<salary) {
//            System.out.println("You bought a car");
//            this.car=car;
//        } else if (salary>car.getValue()/12) {
//            System.out.println("You bought a car on loan");
//            this.car=car;
//        } else {
//            System.out.println("You have to get some money");
//        }
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }



    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("You can't trade people");
    }

    public Human() {
        this.garage=new Car[5];
    }
    public Human(int garageSize){
        this.garage=new Car[garageSize];
    }
}

