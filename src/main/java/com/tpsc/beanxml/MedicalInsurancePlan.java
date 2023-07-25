package com.tpsc.beanxml;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "MedicalInsurance_planNo")
@Table(name = "MedicalInsurancePlan")
public class MedicalInsurancePlan extends InsurancePlan{
    @Column(name = "copay")
    private int copay;
    @Column(name ="coverage_type")
    private String coverageType;
    public int getCopay() {
        return copay;
    }
    public void setCopay(int copay) {
        this.copay = copay;
    }
    public String getCoverageType() {
        return coverageType;
    }
    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    @Override
    public String toString() {
        return "MedicalInsurancePlan{" +
                "copay=" + copay +
                ", coverageType='" + coverageType + '\'' +
                ", planNo=" + planNo +
                ", planName='" + planName + '\'' +
                ", tenure=" + tenure +
                ", premiumAmout=" + premiumAmout +
                ", insurredAmount=" + insurredAmount +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}
