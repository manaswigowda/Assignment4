public class methodoverloading {
    int a,b;

    public int method1(int a) {
        System.out.println("a:" +a);
        return 0;
    }

    public float method2(int b) {
        System.out.println("b:" +b);
        return 0;
    }

    public double method3(int a, int b){
        double sum =  a+b;
        double square = (a+b) * (a+b);
        System.out.println("Sum of two numbers is:"+sum);
        System.out.println("Square of sum of two numbers is:"+square);
        return 0;
    }

    public static void main(String[] args){
        methodoverloading methods = new methodoverloading();
        methods.method1( 12);
        methods.method2(  12);
        methods.method3(12, 12);


    }
}
