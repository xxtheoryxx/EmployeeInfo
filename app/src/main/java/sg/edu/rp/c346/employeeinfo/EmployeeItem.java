package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 15055494 on 16/7/2018.
 */

public class EmployeeItem {
    private String name;
    private String title;
    private double salary;


    public EmployeeItem(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public String getTitle(){
        return title;
    }
    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee Info{" + "employeeName='"+name+"\'"+", employeeTitle='"+title+"\'"+", employeeSalary="+salary+"}";
    }
}
