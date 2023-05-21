package mypackage.application;

import mypackage.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Jhon Corp");

        Company.Employee employee = company.new Employee();
        employee.setName("Jaka");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Nothing");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Joko");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
