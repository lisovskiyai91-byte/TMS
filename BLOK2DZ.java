package TMS;
public class BLOK2DZ {
    public static void main(String[] args) {
        calculator();
        calculator2();
        calculator3();
        calculator4();
        calculator5();
        calculatorX();
    }

    public static void calculator() {
        int b = 3;
        int c = 5;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("1. a = " + a);
        System.out.println("------------------");
    }

    public static void calculator2() {
        int n = 26;
        int sum = (n / 10) + (n % 10);
        System.out.println("2. Сумма цифр n = " + n + " равна " + sum);
        System.out.println("------------------");
    }
    public static void calculator3() {
        int n = 126;
        int sum = ((n/100) + ((n/10)%10) + (n%10));
        System.out.println("3. Сумма цифр n = " + n + " равна " + sum);
        System.out.println("------------------");
    }
    public static void calculator4() {
        double n = 16.6;
        long r = Math.round(n);
        System.out.println("4. n = " + n + " округлено до = " + r);
        System.out.println("------------------");
    }
    public static void calculator5(){
        int q = 21;
        int w = 8;
        int n = q/w;
        int r = q % w;
        System.out.println("5.  " + n);
        System.out.println("    " + r);
        System.out.println("------------------");
    }
    public static void calculatorX(){
        int a = 1;
        int b = 2;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("6.  " + a);
        System.out.println("    " + b);
    }
    }

