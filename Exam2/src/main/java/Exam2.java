import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exam2 {
    public String  nextDay(String str){
         String[] sArray=str.split("-");
        int year=Integer.parseInt(sArray[0]);
        int  month=Integer.parseInt(sArray[1]);
        int day=Integer.parseInt(sArray[2]);
        if(month>12){
            System.out.println("您输入的日期不存在");
        }
        if(month==2){
            if(year%4==0&&year%100!=0||year%400==0){
              if(day>29){
                  System.out.println("您输入的日期不存在");
              }else if(day==29){
                  sArray[2]="1";
                  sArray[1]=month+1+"";
              } else {
                  sArray[2]=day+1+"";
              }
            }else {
                if(day>28){
                    System.out.println("您输入的日期不存在");
                }
                else{
                    if(day==28){
                        sArray[2]="1";
                        sArray[1]=month+1+"";
                    } else {
                        sArray[2]=day+1+"";
                    }
                }
            }
        }
        if(month==1 || month==3||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
            if(day>31){
                System.out.println("您输入的日期不存在");
            }else {
                if(day==31){
                    sArray[2]="1";
                    int month2=month+1;
                    sArray[1]=month2+"";
                    if(month==12){
                        sArray[1]="1";
                        sArray[0]=year+1+"";
                    }
                } else {
                    sArray[2]=day+1+"";
                }
            }
        }
        if(month==4 || month==6||month==9 ||month==11){
            if(day>30){
                System.out.println("您输入的日期不存在");
            }else {
                if(day==30){
                    sArray[2]="1";
                    sArray[1]=month+1+"";
                } else {
                    int day2=day+1;
                    sArray[2]=day2+"";
                }
            }
        }
        str=sArray[0]+"-"+sArray[1]+"-"+sArray[2];
        return str;
    }
    public static void main(String[] args) {
        System.out.print("请输入年月日:");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Exam2 e2=new Exam2();
        String day=e2.nextDay(str);
        System.out.println("下一天为："+day);
    }
}


