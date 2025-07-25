package com.dyashin.crud;

import com.dyashin.dto.Student;
import jakarta.persistence.*;

import java.util.List;
import java.util.Scanner;

public class SearchByName {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        TypedQuery<Student> query = em.createNamedQuery("StudentInfo.findByName", Student.class);
        query.setParameter("name", name);

        List<Student> resultList = query.getResultList();

        if (resultList.isEmpty()) {
            System.out.println("No student found with name: " + name);
        } else {
            for (Student s : resultList) {
                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getName());
                System.out.println("Age: " + s.getAge());
                System.out.println("---------------");
            }
        }

        em.close();
        emf.close();
        scanner.close();
    }
}

