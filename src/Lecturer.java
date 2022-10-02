public class Lecturer extends Person {
    private String department;
    private int payment;

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setPayment(int payment){
        this.payment = payment;
    }

    public int getPayment(){
        return payment;
    }

    public void printInfo(){
        System.out.println("Department Lecturer: " + getDepartment() + ", " + getSurname() + " " + getName() + ". Age: " + getAge() + ". Payment: " + getPayment());
    }
}