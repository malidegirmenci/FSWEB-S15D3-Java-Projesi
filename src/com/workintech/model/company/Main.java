package com.workintech.model.company;

import com.workintech.model.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee orhan = new Employee(1,"Orhan", "Veli");
        Employee ayse = new Employee(2,"Ayşe","Oktay");
        Employee mehmet = new Employee(3,"Mehmet Ali", "Değirmenci");
        Employee orcun = new Employee(4,"Orçun","Değirmenci");
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(orhan);
        employeeList.add(ayse);
        employeeList.add(mehmet);
        employeeList.add(orhan);
        employeeList.add(orcun);
        employeeList.add(ayse);


        System.out.println("UnModifiedList:\n"+employeeList);
        System.out.println("***************************");

        List<Employee> duplicatedElementInList = new LinkedList<>();
        Map<Integer,Employee> uniqueEmployees = new HashMap<>();

        for(int i=0; i < employeeList.size(); i++){
            for (int j = i+1; j < employeeList.size(); j++){
                if(employeeList.get(i) == employeeList.get(j)){
                    duplicatedElementInList.add(employeeList.get(i));
                }else{
                    uniqueEmployees.put(employeeList.get(i).getId(),employeeList.get(i));
                }
            }
        }
        System.out.println("Duplicated Values:\n"+duplicatedElementInList);
        System.out.println("***************************");
        System.out.println("Unique Values:\n"+uniqueEmployees);
        System.out.println("***************************");
        System.out.println("Deleted duplicated Values:");
        duplicatedElementInList.clear();
        System.out.println("Duplicated Values:"+duplicatedElementInList);
    }
}