public class First1 {
    int M,D,A;
    First1(int Month,int date,int age){
        M=Month;
        D=date;
        A=age;

    }
    public static void main(String[] args){
        First1 f = new First1(3,2,1);
        System.out.println(f.M);
        System.out.println(f.D);
        System.out.println(f.A);


    }

}
