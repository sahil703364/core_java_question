package com.tpsc.Test;

import com.tpsc.beanxml.InsurancePlan;
import com.tpsc.helper.SFRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPSCTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        boolean flag = false;
        try {
            sessionFactory = SFRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction= session.beginTransaction();

            InsurancePlan insurancePlan = new InsurancePlan();
            insurancePlan.setPlanName("sahar india");
            insurancePlan.setPremiumAmout(300000);
            insurancePlan.setInsurredAmount(23000);
            insurancePlan.setTenure(90);
            insurancePlan.setStatus("A");
            flag = true;
            session.persist(insurancePlan);
            System.out.println("Insurence plan no: "+insurancePlan.getPlanNo());


        }finally {
            if (transaction != null)
            {
                if (flag)
                {
                    transaction.commit();
                }
            }
            if (session != null)
            {
                session.close();
            }
            SFRegistry.closeSessionFactory();
        }
    }
}
