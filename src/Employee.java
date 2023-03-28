public class Employee {
    private String lastName;
    private String name;
    private String surName;
    private String department;
    private int payEmployee;

    public Employee(String lastName, String name, String surName, String department, int payEmployee) {
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.payEmployee = payEmployee;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(){
        this.department = department;
    }
    public void setPayEmployee(){
        this.payEmployee = payEmployee;
    }

    public int getPayEmployee() {
        return payEmployee;
    }

}
