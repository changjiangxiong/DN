package com.students.management.dao.entity;

import java.math.BigDecimal;

public class Grade {
    private Long id;

    private Long sId;

    private BigDecimal regularGrade;

    private BigDecimal majorGrade;

    private BigDecimal finalGrade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public BigDecimal getRegularGrade() {
        return regularGrade;
    }

    public void setRegularGrade(BigDecimal regularGrade) {
        this.regularGrade = regularGrade;
    }

    public BigDecimal getMajorGrade() {
        return majorGrade;
    }

    public void setMajorGrade(BigDecimal majorGrade) {
        this.majorGrade = majorGrade;
    }

    public BigDecimal getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(BigDecimal finalGrade) {
        this.finalGrade = finalGrade;
    }
}