package com.google.roomdatebasepoc.room_database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.roomdatebasepoc.helper.AppConstant;

import java.io.Serializable;
@Entity
public class UserDetailModel implements Serializable {
    @PrimaryKey(autoGenerate = true)

    @SerializedName(AppConstant.USER_ID)
    @Expose
    private int userId;

    @SerializedName(AppConstant.EMAIL)
    @Expose
    String email;

    @SerializedName(AppConstant.FIRST_NAME)
    @Expose
    private String firstName;
    @SerializedName(AppConstant.LAST_NAME)
    @Expose
    private String lastName;
    @SerializedName(AppConstant.MOBILE_NUMBER)
    @Expose
    private String mobileNumber;
    @SerializedName(AppConstant.DATE_OF_BIRTH)
    @Expose
    private String dateOfBirth;

    @SerializedName(AppConstant.PASSWORD)
    @Expose
    private String password;

    @SerializedName(AppConstant.CITY_VILLAGE)
    @Expose
    private String cityVillage;

    @SerializedName(AppConstant.GENDER)
    @Expose
    private String gender;

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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
