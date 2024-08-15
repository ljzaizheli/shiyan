import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个0到1000的整数");
        int a= input.nextInt();
        if(!(a>=0&a<=1000)){
            System.out.println("输入错误");
        }
        else{
           int b=0;
           for(int i=0;i<4;i++){
               b=b+a%10;
               a=a/10;
           }
            System.out.println(b);
        }
    }
}