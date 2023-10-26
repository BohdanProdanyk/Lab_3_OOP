public class Kasa {
    void method(Person person, Movie movie){
        if(person.getMany() < movie.getCost()){
            System.out.println("У вас не достатньо коштів");
        }
        else{
            System.out.println("Приємного перегляду");
        }
    }

}
