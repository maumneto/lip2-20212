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
public class FinancialDepartment implements Department {
    public int id;
    public String name;

    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
