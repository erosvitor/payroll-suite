package com.ctseducare.impostos.dto;

public class ImpostosDTO {

    private Integer employeeId;
    private Double fgts;
    private Double inss;

    public ImpostosDTO() {

    }

    public ImpostosDTO(Integer employeeId, Double fgts, Double inss) {
        this.employeeId = employeeId;
        this.fgts = fgts;
        this.inss = inss;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Double getFgts() {
        return fgts;
    }

    public void setFgts(Double fgts) {
        this.fgts = fgts;
    }

    public Double getInss() {
        return inss;
    }

    public void setInss(Double inss) {
        this.inss = inss;
    }

}
