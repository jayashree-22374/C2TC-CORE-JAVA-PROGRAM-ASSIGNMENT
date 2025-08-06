package com.jayashree.assignment4;

public class Indigo implements Airfare{
	private Integer hours;
    private Double costPerHour;

    public Indigo() {
    }

    public Indigo(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour * 8;
    }

    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }


}
