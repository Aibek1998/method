public class Main {
    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method1()+method2()+method3());
    }
    public static int method1() {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum+=i;
            }
        }
        return sum;
    }
    public static int method2 (){
        int sum = 0;
        for (int i = 1; i < 100 ; i++) {
            if (i % 4 == 0) {
                sum += i;
            }
        }
            return sum;
    }
    public static int method3(){
        int sum = 0 ;
        for (int i = 1; i <100 ; i++) {
            if (i%5==0){
                sum+=i;
            }
        }
        return sum;
    }

}