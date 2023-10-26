import java.util.Scanner;
public class Person {
    private String fname; private String lname;
    private int old; private double many;

    public void Registration() {
        System.out.println("Будь ласка, зареєструйте користувача!");
        System.out.print("Ім'я: ");
        Scanner scanner = new Scanner(System.in);
        this.setFname(scanner.nextLine());

        System.out.print("Прізвище: ");
        this.setLname(scanner.nextLine());

        System.out.print("Вік: ");
        this.setOld(scanner.nextInt());

        System.out.print("Сума грошей у гаманці(в гривнях): ");
        this.setMany(scanner.nextDouble());
    }






    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setMany(double many) {
        this.many = many;
    }
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getOld() {
        return old;
    }

    public double getMany() {
        return many;
    }


}
