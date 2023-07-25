package com.tpsc.beanxml;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
    @Entity
    @Table(name = "InsurancePlan")
    @Inheritance(strategy = InheritanceType.JOINED)
    public class InsurancePlan implements Serializable {
        @Id
        @Column(	name = "plan_no")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        protected int planNo;
        @Column(	name = "plan_name")
        protected String planName;
        @Column(	name = "tenure")
        protected int tenure;
        @Column(	name = "premium_amount")
        protected double premiumAmout;
        @Column(	name = "insurred_amount")
        protected double insurredAmount;
        protected String status;
        public int getPlanNo() {
            return planNo;
        }
        public void setPlanNo(int planNo) {
            this.planNo = planNo;
        }
        public String getPlanName() {
            return planName;
        }
        public void setPlanName(String planName) {
            this.planName = planName;
        }
        public int getTenure() {
            return tenure;
        }
        public void setTenure(int tenure) {
            this.tenure = tenure;
        }
        public double getPremiumAmout() {
            return premiumAmout;
        }
        public void setPremiumAmout(double premiumAmout) {
            this.premiumAmout = premiumAmout;
        }
        public double getInsurredAmount() {
            return insurredAmount;
        }
        public void setInsurredAmount(double insurredAmount) {
            this.insurredAmount = insurredAmount;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        @Override
        public int hashCode() {
            return Objects.hash(insurredAmount, planName, planNo, premiumAmout, status, tenure);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            InsurancePlan other = (InsurancePlan) obj;
            return Double.doubleToLongBits(insurredAmount) == Double.doubleToLongBits(other.insurredAmount)
                    && Objects.equals(planName, other.planName) && planNo == other.planNo
                    && Double.doubleToLongBits(premiumAmout) == Double.doubleToLongBits(other.premiumAmout)
                    && Objects.equals(status, other.status) && tenure == other.tenure;
        }
        @Override
        public String toString() {
            return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", tenure=" + tenure
                    + ", premiumAmout=" + premiumAmout + ", insurredAmount=" + insurredAmount + ", status=" + status
                    + "]";
        }

    }

