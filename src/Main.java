public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.addEmployee("Иванов", "Иван", "Иванович", "1", 89765);
        methods.addEmployee("Уткина", "Елена", "Валерьевна", "3", 98648);
        methods.addEmployee("Касаткин", "Константин", "Витальевич", "5", 87564);
        methods.addEmployee("Павлов", "Павел", "Павлович", "1", 86578);
        methods.addEmployee("Каваленеко", "Максим", "Владимирович", "2", 75963);
        methods.addEmployee("Фролова", "Вера", "Анатольевна", "4", 78935);
        methods.addEmployee("Наумова", "Лера", "Павловна", "3", 68562);
        methods.addEmployee("Петров", "Петр", "Петрович", "4", 79634);
        methods.addEmployee("Иванова", "Нина", "Григорьевна", "5", 84324);
        methods.addEmployee("Куркин", "Андрей", "Сергеевич", "2", 86436);
        methods.printAllEmployee();
    }
}
