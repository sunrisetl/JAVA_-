package week1.com.javae.chaper10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
///冒泡排序法的排序及其优化
public class DemoSort {
    public static void main(String[] args) {
        System.out.print("请输入想要排序的数字：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //定义字符串数组
        String [] strArrays = str.split(",");
        //数组循环遍历
        int [] array = new int[strArrays.length];
        for (int i = 0; i <strArrays.length ; i++) {

           array[i] = Integer.parseInt(strArrays[i]);
        }
        System.out.println("排序前的数组"+ Arrays.toString(array));
        sort(array);
        System.out.println("排序后的数组"+Arrays.toString(array));
    }


    ///冒泡排序法
   private static  void sort(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0;j<array.length-1-i;j++){
                int temp = 0;
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                }
                System.out.println(""+Arrays.toString(array));
            }

        }
    }
}
