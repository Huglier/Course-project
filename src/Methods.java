public class Methods {
    private Employee[] employees;
    private int size;

    public Methods() {
        this.employees = new Employee[10];
    }


    public void addEmployee(String employeeLastName, String employeeName, String employeeSurName, String employeeDepartment, int employeePay) {
        if (size >= employees.length) {
            System.out.println("Мест нет");
        }
        Employee newEmployee = new Employee(employeeLastName, employeeName, employeeSurName, employeeDepartment, employeePay);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String employeeLastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(employeeLastName)) {
                System.out.println(employees[i].getLastName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findEmployee(String employeeLastName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getLastName().equals(employeeLastName)) {
                System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getSurName()
                        + " " + employee.getDepartment() + " " + employee.getPayEmployee());
                return;
            }
        }
        System.out.println(employeeLastName + " не найден");
    }
    public static void counter(){
        int id = 0;
        for (int i = 0; i <10; i=i+1){
            id = id+1;
    }
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getSurName()
                    + ", номер отдела : " + employee.getDepartment() + ", зароботная плата : " + employee.getPayEmployee() + " рублей");
        }
    }

    public void paySum() {
        int sum = 0;
        Employee employee;
        int payEmployee = employee.getPayEmployee();
    }

    public int getCurrentSize() {
        return size;
    }
}
