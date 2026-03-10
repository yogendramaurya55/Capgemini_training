package org.example.JPQL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

public class ProductMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();

        // ************--------------- Normal fetching  all Details----------------*************

//        TypedQuery<Product> q=em.createQuery("select p from Product p", Product.class);
//        List<Product> li=q.getResultList();
//        li.forEach(p-> System.out.println(p));


        // **************------Fetching Some Particular Details----------------***********


//        Query q = em.createQuery("select p.name,p.price,p.mfd from Product p");
//        List<Object[]> li = q.getResultList();
//        for(Object[] obj : li)
//        {
//            System.out.println(obj[0] + " " + obj[1] + " " + obj[2]);
//        }


        // **********------------Fetching With Condition--------------------**************

//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.price<600", Product.class);
//        List<Product> li=q.getResultList();
//        li.forEach(p-> System.out.println(p));

        // *********------------Fetching With Condition and Named Parameter------------************

//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.price<:P", Product.class);
//        q.setParameter("P",800);
//        List<Product> li=q.getResultList();
//        li.forEach(p-> System.out.println(p));


        // *********------------Fetching With Condition and Named Parameter------------************

//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.name like :P", Product.class);
//        q.setParameter("P","L%");
//        List<Product> li=q.getResultList();
//        li.forEach(p-> System.out.println(p));





        // ******************-----------Product Dto-----------------*****************


//        TypedQuery<ProductDto> q = em.createQuery("select new org.example.JPQL.ProductMain.ProductDto(p.name,p.price,p.mfd) from Product p", ProductDto.class);
//        List<ProductDto> li = q.getResultList();
//        for(ProductDto p : li)
//        {
//            System.out.println(p);
//        }


        // ************------------ DML Operations in JPQL --------------***************

        //   ********------------ Insertion ----------------****************

        em.getTransaction().begin();
        Product p = new Product();
        p.setPid(7);
        p.setName("Window");
        p.setQty(13);
        p.setPrice(300);
        p.setMfd(LocalDate.of(2021,12,10));
        em.persist(p);
        em.getTransaction().commit();
        System.out.println("Inserted Successfully...........");



        // --------- Update Price ------------

//        em.getTransaction().begin();
//        Query q=em.createQuery("update Product p set p.price=500 where p.pid=1");
//        int rows=q.executeUpdate();
//        em.getTransaction().commit();
//        System.out.println(rows+" Row Updated.....");

        // ------- Delete Product --------

//        em.getTransaction().begin();
//        Query q=em.createQuery("delete Product p where p.pid=4");
//        int rows=q.executeUpdate();
//        em.getTransaction().commit();
//        System.out.println(rows+" Rows Deleted.....");



    }


}
