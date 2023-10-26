public class Static {
    static  int ryad;
    static  int misce;

    static {
        ryad = 2 + 2 * 2;
    }
    static {
        misce = 3 + 2 * 2;
    }
    static  void lucky(){
        if(ryad == 6 | misce == 7){
            System.out.println("Вітаю ви виграли щастливий білет(вигравши щастливий білет ви повертаєте всьо суму грошей потрачені на перегляд фільму)");
        }
    }
}

