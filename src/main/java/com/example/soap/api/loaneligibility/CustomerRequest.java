package com.example.soap.api.loaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerName",
        "age",
        "yearlyIncome",
        "cibilScore",
        "employmentMode"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected int cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public long getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    public String getEmploymentMode() {
        return employmentMode;
    }

    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}