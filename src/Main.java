import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Кінотеатр
        Movie film1 = new Movie("Фільм","Останній самурай", 18, 9.3, 19.30, 21, 10);
        Movie film2 = new Movie("Фільм","Монахиння", 18,6.2, 22.00, 21, 10);
        Movie film3 = new Movie("Фільм","Форсаж 5",16, 7.0, 17.30, 21, 10);
        Movie film4 = new Movie("Мультфільм","Немо",6, 9.3, 16.10, 21, 10);

        film1.setCost(250);
        film2.setCost(300);
        film2.setCost(100);
        film2.setCost(150);

        Person person = new Person();
        person.Registration();
        System.out.println("Касир: Який фільм бажаєте відвідати?");
        System.out.println("1." + film1.getName());
        System.out.println("2." + film2.getName());
        System.out.println("3." + film3.getName());
        System.out.println("4." + film4.getName());

        int action = scanner.nextInt();
        switch (action) {
            case 1:
                if(person.getOld() < film1.getOldM()){
                    System.out.println("Ви ще занадто малі для цього фільму");
                }else{
                    System.out.println("Вам дозволений перегляд цього фільму");
                }
                System.out.println("Вартість цього фільму: 250грн, але сьогдні акція тому він коштує: " + film1.getCost());
                break;
            case 2:
                if(person.getOld() < film2.getOldM()){
                    System.out.println("Ви ще занадто малі для цього фільму");
                }else{
                    System.out.println("Вам дозволений перегляд цього фільму");
                }
                System.out.println("Вартість цього фільму: 300грн, але сьогдні акція тому він коштує: " + film2.getCost());
                break;
            case 3:
                if(person.getOld() < film3.getOldM()){
                    System.out.println("Ви ще занадто малі для цього фільму");
                }else{
                    System.out.println("Вам дозволений перегляд цього фільму");
                }
                System.out.println("Вартість цього фільму: 100грн, але сьогдні акція тому він коштує: " + film3.getCost());
                break;
            case 4:
                if(person.getOld() < film4.getOldM()){
                    System.out.println("Ви ще занадто малі для цього фільму");
                }else{
                    System.out.println("Вам дозволений перегляд цього фільму");
                }
                System.out.println("Вартість цього фільму: 150грн, але сьогдні акція тому він коштує: " + film4.getCost());
                break;
            default:
                System.out.println("Неправильна команда.");
                break;
        }
        System.out.println("Продавець: Бажаєте оформити замовлення?");
        System.out.println("1. Так;");
        System.out.println("2. Ні;");
        Kasa kasa = new Kasa();
        int action1 = scanner.nextInt();
        switch (action1){
            case 1:
                kasa.method(person,film1);
                break;
            case 2:
                System.out.println("До наступної зустрічі");
                break;
            default:
                System.out.println("Неправильна команда.");
                break;
        }
        System.out.println("Ось ваш квиток: ");
        System.out.println("Ряд: " + Static.ryad + " Місце: " + Static.misce);
        Static.lucky();
        System.out.println(" ");

        Final fin = new Final(18,"Бодя",9.27);
//        fin.method1();
//        fin.method2();


    }
}