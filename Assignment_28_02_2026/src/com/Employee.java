package com;

import java.time.LocalDate;

public class Employee {

    private Integer empId;
    private String fName;
    private String lName;
    private String mail;
    private String phone;
    private LocalDate joinDate;
    private String role;
    private double pay;
    private Integer mgrId;
    private Department dept;

    public Employee(Integer empId, String fName, String lName,
                    String mail, String phone, LocalDate joinDate,
                    String role, double pay, Integer mgrId,
                    Department dept) {

        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.mail = mail;
        this.phone = phone;
        this.joinDate = joinDate;
        this.role = role;
        this.pay = pay;
        this.mgrId = mgrId;
        this.dept = dept;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Integer getMgrId() {
        return mgrId;
    }

    public void setMgrId(Integer mgrId) {
        this.mgrId = mgrId;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return fName + " " + lName + " - " + pay;
    }
}