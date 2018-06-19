package com.kevmc.kcalcount;

import com.google.gson.annotations.SerializedName;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kevmc on 18/06/2018.
 */

public class User {

    @SerializedName("name")
    private String firstName;

    private String surname;

    private int age;

    private float height;
    private float weight;

    private float basalMetabolicRate;
    private float bodyMassIndex;

    private int activityLevel;
    private int dayStartTime;

    private ArrayList<UserDay> days;

    public User(String firstName, String surname, int age, float height, float weight, int activityLevel, int dayStartTime){
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.activityLevel = activityLevel;
        this.dayStartTime = dayStartTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }

    public int getDayStartTime() {
        return dayStartTime;
    }

    public void setDayStartTime(int dayStartTime) {
        this.dayStartTime = dayStartTime;
    }

    public void addDay(UserDay userDay){
        days.add(userDay);
    }

    public void calculateBMR(){
        basalMetabolicRate = 500;
    }

    public float getBasalMetabolicRate(){
        return basalMetabolicRate;
    }

    public void calculateBMI(){
        bodyMassIndex = 20;
    }

    public float getBodyMassIndex(){
        return bodyMassIndex;
    }


}
