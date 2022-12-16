package by.tms.model;

import by.tms.services.IReport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Employee implements IReport {
    private String fullName;
    private double salary;

    @Override
    public void generateReport() {
        System.out.printf("Employer: %-25s salary: %.2f %n", getFullName(), getSalary());
    }
}
