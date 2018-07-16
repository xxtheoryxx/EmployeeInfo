package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployee;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployee = new ArrayList<>();

        alEmployee.add(new EmployeeItem("John", "Software Technical Leader", 3400.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("Sean", "Programmer", 2000.00));
        alEmployee.add(new EmployeeItem("Eng Hui", "Programmer", 1800.00));
        alEmployee.add(new EmployeeItem("Robinson", "Programmer", 3200.00));
        alEmployee.add(new EmployeeItem("Elton", "Software Technical Supervisor", 3300.00));
        alEmployee.add(new EmployeeItem("Doe", "Programmer", 1950.00));
        alEmployee.add(new EmployeeItem("Sues", "Programmer", 1820.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));
        alEmployee.add(new EmployeeItem("May", "Programmer", 2200.00));

        caEmployee = new CustomAdapter(this,R.layout.employeeinfo_row, alEmployee);

        lvEmployee.setAdapter(caEmployee);
    }
}
