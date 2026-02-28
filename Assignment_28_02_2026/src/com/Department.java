package com;

public class Department {

    private int deptId;
    private String deptName;
    private int mgrId;

    public Department(int deptId, String deptName, int mgrId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.mgrId = mgrId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getMgrId() {
        return mgrId;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    @Override
    public String toString() {
        return deptName;
    }
}