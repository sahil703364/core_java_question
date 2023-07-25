package com.tpsc.beanxml;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "AccidentalInsurance_PlanNo")
@Table(name = "AccidentalInsurancePlan")
public class AccidentalInsurancePlan extends  InsurancePlan {
    @Column(name = "disability_coverage_percentage")
    private int disabilityCoveragePercentage;
    @Column(name = "internation_coverage")
    private boolean internationalCoverage;
    public int getDisabilityCoveragePercentage() {
        return disabilityCoveragePercentage;
    }
    public void setDisabilityCoveragePercentage(int disabilityCoveragePercentage) {
        this.disabilityCoveragePercentage = disabilityCoveragePercentage;
    }
    public boolean isInternationalCoverage() {
        return internationalCoverage;
    }
    public void setInternationalCoverage(boolean internationalCoverage) {
        this.internationalCoverage = internationalCoverage;
    }

    @Override
    public String toString() {
        return "AccidentalInsurancePlan{" +
                "disabilityCoveragePercentage=" + disabilityCoveragePercentage +
                ", internationalCoverage=" + internationalCoverage +
                ", planNo=" + planNo +
                ", planName='" + planName + '\'' +
                ", tenure=" + tenure +
                ", premiumAmout=" + premiumAmout +
                ", insurredAmount=" + insurredAmount +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}
