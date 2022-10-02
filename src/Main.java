public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setSurname("Shevchenko");
        lecturer.setName("Vladimir");
        lecturer.setAge(23);
        lecturer.setGroup(234);
        lecturer.setStudentID(545454);
        lecturer.setDepartment("Department of English Philology and Translation");
        lecturer.setPayment(12000);
        lecturer.printInfo();
    }
}