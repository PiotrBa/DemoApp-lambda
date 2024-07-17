package org.piotrBa.entity;

public class Car {

    private Long id;
    private String brand;
    private String model;
    private String gearbox;
    private String color;
    private String year;

    public Car(Long id, String name, String brand, String gearbox, String color, String age) {
        this.id = id;
        this.brand = brand;
        this.model = name;
        this.gearbox = gearbox;
        this.color = color;
        this.year = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return year;
    }

    public void setAge(String age) {
        this.year = age;
    }
}
