import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
public class Exam3 {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> v0=new ArrayList<Integer>();
        List<Integer> v1=new ArrayList<Integer>();
        List<Integer> v2=new ArrayList<Integer>();
        List<Integer> v3=new ArrayList<Integer>();
        List<Integer> v4=new ArrayList<Integer>();
        List<Integer> v5=new ArrayList<Integer>();
        List<Integer> v6=new ArrayList<Integer>();
        List<Integer> v7=new ArrayList<Integer>();
        List<Integer> v8=new ArrayList<Integer>();
        List<Integer> v9=new ArrayList<Integer>();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < 50; i++) {
            int temp = (int) (Math.random() * 100);
            list.add(temp);
        }
        System.out.println("随机生成50个小于100的数，分别为："+list);
      for(int j=0;j<list.size();j++){
          if(list.get(j)<10){
              v0.add(list.get(j));
          }else if(list.get(j)>=10 && list.get(j)<20){
              v1.add(list.get(j));
          }else if(list.get(j)>=20 && list.get(j)<30){
              v2.add(list.get(j));
          }else if(list.get(j)>=30 && list.get(j)<40){
              v3.add(list.get(j));
          }else if(list.get(j)>=40 && list.get(j)<50){
              v4.add(list.get(j));
          }else if(list.get(j)>=50 && list.get(j)<60){
              v5.add(list.get(j));
          }else if(list.get(j)>=60 && list.get(j)<70){
              v6.add(list.get(j));
          }else if(list.get(j)>=70 && list.get(j)<80){
              v7.add(list.get(j));
          }else if(list.get(j)>=80 && list.get(j)<90){
              v8.add(list.get(j));
          }else {
              v9.add(list.get(j));
          }
      }
    map.put(0,v0);
    map.put(1,v1);
    map.put(2,v2);
    map.put(3,v3);
    map.put(4,v4);
    map.put(5,v5);
    map.put(6,v6);
    map.put(7,v7);
    map.put(8,v8);
    map.put(9,v9);
    System.out.println("Map中的数据为：");
    for(int i=0;i<map.size();i++) {
        System.out.println(i+"=>"+map.get(i));
    }
    System.out.println("排序后的Map为：");
        Collections.sort(v0);
        Collections.sort(v1);
        Collections.sort(v2);
        Collections.sort(v3);
        Collections.sort(v4);
        Collections.sort(v5);
        Collections.sort(v6);
        Collections.sort(v7);
        Collections.sort(v8);
        Collections.sort(v9);
        map.put(0,v0);
        map.put(1,v1);
        map.put(2,v2);
        map.put(3,v3);
        map.put(4,v4);
        map.put(5,v5);
        map.put(6,v6);
        map.put(7,v7);
        map.put(8,v8);
        map.put(9,v9);
        for(int i=0;i<map.size();i++) {
            System.out.println(i+"=>"+map.get(i));
        }
    }

}