import java.util.Scanner;
public class Exam1 {
    public double  test(int i) {
        double x=0;
        if (i <= 1500) {
            x = i * 0.03;
        }
        if (i >1500 && i <= 4500) {
            x = i * 0.1;

        }
        if (i > 4500 && i <= 9000) {
            x = i * 0.2;
        }
        if (i > 9000 && i <= 35000) {
            x = i * 0.25;
        }
        if (i > 35000 && i <= 55000) {
            x = i * 0.3;
        }
        if (i > 55000 && i <= 80000) {
            x = i * 0.35;
        }
        if (i > 80000) {
            x = i * 0.45;
        }
        return x;
    }

    public static void main(String[] args) {
        double num=0;
        System.out.print("请输入资金：");
         Scanner sc = new Scanner(System.in);
         Exam1 e1=new Exam1();
         int maney=sc.nextInt();
         if(maney>3500){
             num =e1.test(maney-3500);
         }
        System.out.println("所需要缴纳的税费为："+num);
    }

}
