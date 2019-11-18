package com.example.testcounter;

public class Meal {
    private String Name;
    private Integer protein;
    private Integer carb;
    private Integer fat;
    private Integer cal;

    public Meal() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getCarb() {
        return carb;
    }

    public void setCarb(Integer carb) {
        this.carb = carb;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getCal() {
        return cal;
    }

    public void setCal(Integer cal) {
        this.cal = cal;
    }
}
