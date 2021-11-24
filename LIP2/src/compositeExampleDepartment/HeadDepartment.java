/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeExampleDepartment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class HeadDepartment implements Department {
    public int id;
    public String name;
    public List<Department> departments;
    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department d) {
        departments.add(d);
    }
    public void removeDepartment(Department d) {
        departments.remove(d);
    }
    @Override
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }
}
