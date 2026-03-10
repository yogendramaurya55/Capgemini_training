package org.example.CriteriaAPI_Own;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EmpCriteriaDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<Employee> r = cq.from(Employee.class);
        cq.multiselect(r.get("dept"), cb.count(r)).groupBy(r.get("dept"));
        List<Object[]> objects = em.createQuery(cq).getResultList();

        //  CriteriaQuery<Long> cq=cb.createQuery(Long.class);
        // List<Long> list = em.createQuery(cq).getResultList();
        //        for(Long c : list){
//            System.out.println(c);
//        }




        for (Object[] obj : objects) {
            System.out.println(obj[0] + " --> " + obj[1]);
//        }

        }
    }
}