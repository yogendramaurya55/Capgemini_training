package org.example.CriteriaAPI;

import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.example.JPQL.Product;

import java.util.List;

public class CriteriaDemo {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> r = cq.from(Product.class);

//        cq.select(r);     // select * from Product
 //       cq.select(r).where(cb.gt(r.get("price"),500));
//        cq.select(r).where(cb.like(r.get("name"),"G%"));
        cq.select(r).where(cb.and((cb.gt(r.get("price"),500)),cb.lt(r.get("price"),800)));

        List<Product> li = em.createQuery(cq).getResultList();

        for(Product p : li){
//            System.out.println(p.getName()+" "+p.getPrice());
            System.out.println(p);
        }

    }
}