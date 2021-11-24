/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeExampleDepartment;

/**
 *
 * @author mauricio.moreira
 */
public class University {
    public static void main(String[] args) {
        SalesDepartment sales = new SalesDepartment(1, "Equipe de Vendas!");
        FinancialDepartment financial = new FinancialDepartment(2, "Equipe Financeira");
        HumanResourceDepartment rh = new HumanResourceDepartment(4, "Equipe RH");
        
        HeadDepartment allDepartment = new HeadDepartment(3, "Chefia");
        
        allDepartment.addDepartment(sales);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(financial);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(rh);
        allDepartment.printDepartmentName();
    }
}
