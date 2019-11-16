package List.sec04;

public class Demo9 {
    public static void main(String[] args) {

///去除数组中重复的元素
        int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

        int len = 0;
        System.out.println("老数组");//打印出老数组
        for (int i = 0; i < oldArr.length; i++) {
            System.out.print(oldArr[i]+"  ");
            if(oldArr[i] != 0){
                len ++;
            }
        }
        //将得到的新数组传入到定义有长度的数组中

        int[] newArr = new int[len];

        int a = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] != 0){
                newArr[a] = oldArr[i];
                a++;
            }
        }

        System.out.println("\n新数组");
        //循环遍历
        for (int i = 0; i < newArr.length; i++) {
/*
        for (int i:a){
*/
            System.out.print(newArr[i]+"  ");
        }


    }


}

        /*int arr[] = {0, 0, 2, 3, 6, 0, 9, 1, 4, 7};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 0) {
                j++;
            }
        }
        int b[] = new int[ j ];
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 0) {
                arr[ i ] = b[ d];
                d++;
            }
        }
        for (int c : b) {
            System.out.print ( "" + c );
        }
        System.out.println ();

        }
    }*/
     /*  if (n<=1){
           return  1;
       }else {
           return sum (n-1)+n;

       }
    }
*//*
        if (n == 1) {
            return 2;
        } else {
            return Math.pow ( 2, n );
        }
        }*//*

    public static void main(String[] args) {
        System.out.println (sum(78));
    }
    }
*/
