public class Final {
    private final int var1;
    private final String var2;
    private final double var3;

    public Final(int var1, String var2, double var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public void method1(){
        System.out.println("Змінна 1: " + var1);
        System.out.println("Змінна 2: " + var2);
        System.out.println("Змінна 3: " + var3);
    }
    public  void method2(){
        final int localVar1 = 18;
        final String localVar2 = "Я файнал змінна";
        final double localVar3 = Math.round(57.9);

        System.out.println("Локал1 : " + localVar1);
        System.out.println("Локал2 : " + localVar2);
        System.out.println("Локал3 : " + localVar3);

    }
}
