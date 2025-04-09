public class Calculator {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = 200;
        cloj obj = new cloj();
        obj.add(num1, num2);
    }

    static class cloj {
        public int add(int n1, int n2){
            System.out.println(n1 + n2);
            return 0;
        }
    }
}
