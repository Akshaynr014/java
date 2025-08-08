package com.dyashin.sprest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dyashin.sprest.dto.Employee;
import com.dyashin.sprest.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

@Repository
public class DaoImpl implements Dao {

    @Override
    public void addEmployee(Employee emp) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Employee emp = null;

        try {
            emp = em.find(Employee.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

        return emp;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        boolean deleted = false;

        try {
            tx.begin();
            Employee emp = em.find(Employee.class, id);
            if (emp != null) {
                em.remove(emp);
                deleted = true;
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        return deleted;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        boolean updated = false;

        try {
            tx.begin();
            em.merge(emp); // merge updates the existing entity
            tx.commit();
            updated = true;
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        return updated;
    }

    @Override
    public List<Employee> getAllEmployees() {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        List<Employee> list = null;

        try {
            TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

        return list;
    }
}
