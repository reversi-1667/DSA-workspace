public class Trainer {

    String dept;
    String institute;
    private int salary;


    public Trainer() {
        this.dept = "Java";
        this.institute = "Payilagam";
        this.salary = 10000;
    }


    public Trainer(String dept, String institute) {
        this.dept = dept;
        this.institute = institute;
        this.salary = 10000;
    }


    public int getSalary() {
        return salary;
    }


    public void training() {
        System.out.println("Trainer is conducting a training session.");
    }


    public static void main(String[] args) {
        Trainer trainerKumar = new Trainer("CSE", "payilagam");
        System.out.println("Department: " + trainerKumar.dept);
        System.out.println("Institute: " + trainerKumar.institute);
        System.out.println("Salary: " + trainerKumar.getSalary());
        trainerKumar.training();
    }
}

