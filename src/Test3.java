import java.util.Arrays;

//import java.util.Arrays;
//import java.util.Scanner;
//public class Test3 {
//    public static void main(String[] args) {
//        int[] array=new int[10];
//        Scanner scan=new Scanner(System.in);
//        int i=0;
//        for(i=0;i<array.length;i++) {
//            array[i] = scan.nextInt();
//        }
//            transform(array);
//            System.out.println(Arrays.toString(array));
//
//}
//    public static void transform(int[] array){
//        int i=0;
//       for(i=0;i<array.length;i++){
//       array[i]=array[i]*2;
//       }
//    }
//}
//import java.util.Scanner;
//public class Test3{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int i=0;
//        int[] array=new int[10];
//        for (i=0;i<array.length;i++){
//            array[i]=scan.nextInt();
//        }
//        printArray(array);
//    }
//    public static void printArray(int[] array){
//        int i=0;
//        for(i=0;i<array.length;i++){
//            System.out.println(array[i]+" ");
//        }
//    }
//}
//public class Test3{
//    public static void main(String[] args) {
//        int[] array=new int[100];
//        int i=0;
//        for(i=0;i<array.length;i++){
//            array[i]=i+1;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
//import java.util.Scanner;
//public class Test3{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int[] array=new int[10];
//        int i=0;
//        for (i=0;i<array.length;i++){
//             array[i] = scan.nextInt();
//        }
//        bubbleSort(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void bubbleSort(int[] array){
//        int i=0;
//        int j=0;
//        boolean flg=false;
//        int temp=0;
//        for (i=0;i<array.length;i++){
//            flg=false;
//            for(j=0; j<array.length-i-1;j++){
//                if(array[j]>array[j+1]){
//                    temp=array[j+1];
//                    array[j+1]=array[j];
//                    array[j]=temp;
//                    flg=true;
//                }
//            }
//            if(flg==false){
//                break;
//            }
//        }
//    }
//}
//import java.util.Scanner;
//public class Test3{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int[] array=new int[10];
//        for(int i=0;i<array.length;i++){
//            array[i]=scan.nextInt();
//        }
//        oderiyArray(array);
//    }
//    public static void oderiyArray(int[] array){
//        boolean flg=false;
//        int i=0;
//        for (i=0;i<array.length-1;i++){
//            if(array[i]>array[i+1]){
//                flg=true;
//            }
//        }
//        if(flg){
//            System.out.print("不是升序");
//        }else{
//            System.out.println("是升序");
//        }
//    }
//}

//public class Test3{
//    public static void main(String[] args) {
//        int[] array={1,2,4,6,8,9,10,12,15,17};
//        twoGroup(array,8);
//        }
//    public static void twoGroup(int[] array,int a){
//        int left=0;
//        int right=array.length-1;
//        int mid=(left+right)/2;
//        while(left<right){
//            mid=(left+right)/2;
//            if(a>array[mid]){
//                left=mid+1;
//            } else if(a==array[mid]) {
//                System.out.print(mid);
//                break;
//            } else
//            {
//                right=mid-1;
//            }
//        }
//        if(left>=right){
//            System.out.print("找不到");
//        }
//    }
//}
//public class Test3{
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5,6,7,8};
//        int[] array1=Arrays.copyOf(array,array.length);
//        System.out.print(Arrays.toString(array1));
//    }
//}
//public class Test3{
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5,6,7,8};
//        toString(array);
//    }
//    public static void toString(int[] array){
//        int i=0;
//        System.out.print("["+" ");
//        for(i=0;i<array.length;i++){
//            System.out.print(array[i]+","+" ");
//            if(i==array.length-1){
//                System.out.print(array[i]+"]");
//
//public void remove(int toRemove){
//    int i=0;
//    int j=0;
//    for(i=0;i<this.useSize;i++){
//        if(this.elem[i]==toRemove){
//        for(j=i;i<this.Size-1;i++)
//        this.elem[j]=this.elem[j+1];
//        }
//        }
//            this.useSize-=1;
//            break;
//        }

