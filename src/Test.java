//public class Test {
//    public static void main(String[] args){
//        int [] array={1,2,3,4,1,3,4};
//        Index(array);
//    }
//    public static void Index(int [] array){
//        int temp=0;
//        int i=0;
//        int j=0;
//        int count=0;
//        for(i=0;i<array.length;i++){
//           temp=array[i];
//           count=0;
//             for(j=0;j<array.length;j++){
//                 if (temp==array[j]){
//                     count++;
//                   }
//                }
//             if(count==1){
//                 System.out.println(temp);
//                 }
//         }
//
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextByte();
//        System.out.println(fibona(n));
//    }
//    public static int  fibona(int n){
//        if(n<=2){
//            return 1;
//        }
//        else{
//            return fibona(n-1)+fibona(n-2);
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int i = 0;
//        int sum = 0;
//        int ret = 1;
//        for (i = 1; i <= n; i++) {
//            ret = ret * i;
//            sum = sum + ret;
//        }
//        System.out.println(sum);
//    }
//}
import java.util.*;
//public class Test{
//    public static void main(String[] args) {
//        int [] array={1,2,3,4,5,6,7};
//        int i=0;
//        changeNum(array);
//        for (int x:array) {
//            System.out.print(x+" ");
//        }
//    }
//    public static void changeNum(int [] array){
//
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        int [] array={1,2,3,4,5,6,7};
//         int [] arr= copArray(array);
//
//    }
//    public static void copArray(int [] arr){
//        int ret [arr.length];
//        int i=0;
//        for(i=0;i<arr.length;i++){
//            ret[i]=arr[i];
//
//        }
//        return ret;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        int[] array = {55,64,46468,48,4899,478};
//        findMax(array);
//    }
//
//
//    public static void findMax(int[] array) {
//        int temp = 0;
//        int i = 0;
//        temp=array[0];
//        while (i<array.length) {
//            if (temp >= array[i]) {
//            } else {
//                temp = array[i];
//            }
//            i++;
//        }
//        System.out.println(temp);
//    }
//}

//public static void binarySearch(int[] array){
//    int left=0;
//    int right=array.length-1;
//
//    while(left<=right-1){
//        int mid=(left+right)
//        if(array[mid]<array[left]){
//            right=mid-i;
//        }
//        else(array[mid]>array[right]){
//            left=mid+1;
//        }
//        }
////        }
//public class Test{
//    public static void main(String[] args) {
//        int[] array={21,54,58857,98};
//        System.out.print(isUp(array));
//    }
//    public static int isUp(int[] array){
//        int i=0;
//        int temp=array[0];
//        while(i<array.length){
//            if(temp<=array[i]){
//                temp=array[i];
//                i++;
//                if(i==array.length-1){
//                    return 1;
//                }
//                e
//
//public static void bubbleSort(int[] array) {
//   int count=0;
//        for (int i = 0; i < array.length-1; i++) {
//        count=0;
//        for (int j = 0; j < array.length-1-i; j++) {
//      if(array[j] > array[j+1]) {
//        int tmp = array[j];
//        array[j] = array[j+1];
//        array[j+1] = tmp;
//        count++;
//        }
//        }
//        if(count==0){
//            braek;}
//        }
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        System.out.print(fibona(n));
//    }
//    public static int fibona(int n){
//        if(n<=2){
//            return 1;
//        }
//        else {
//            return fibona(n-1)+fibona(n-2);
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int i=0;
//        int temp=1;
//        int sum=0;
//        for(i=1;i<=n;i++){
//            temp=temp*i;
//            sum=sum+temp;
//        }
//        System.out.print(sum);
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int i=0;
//        int temp=1;
//        for(i=1;i<=n;i++){
//            temp=temp*i;
//        }
//        System.out.print(temp);
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        int[] array={0,0,0,0,0,0,0,0,0,0};
//        int i=0;
//        Scanner scan=new Scanner(System.in);
//        for(i=0;i<array.length;i++){
//            array[i]=scan.nextInt();
//        }
//        evenUp(array);
//        System.out.print(Arrays.toString(array));
//    }
//    public static void evenUp(int[] array){
//        int left=0;
//        int temp=0;
//        int right=array.length-1;
//        while(left<right){
//            while(array[left]%2==0){
//               left=left+1;
//            }
//            while(array[right]%2==1){
//                right=right-1;
//            }
//            temp=array[right];
//            array[right]=array[left];
//            array[left]=temp;
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        int c=scan.nextInt();
//        System.out.print(max3(a,b,c));
//    }
//    public static int max2(int m,int n){
//        if(m>=n){
//            return m;
//        }
//        else {
//            return n;
//        }
//    }
//    public static int max3(int x,int y,int z){
//        int temp=max2(x,y);
//        return max2(temp,z);
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        double c=scan.nextDouble();
//        double d=scan.nextDouble();
//        System.out.print(max(a,b)+" ");
//        System.out.print(max(c,d)+" ");
//        System.out.print(max(b,c,d));
//    }
//    public static int max(int x,int y){
//        if(x>y){
//            return x;
//        }
//        else {
//            return y;
//        }
//    }
//    public static double max(double x,double y){
//        if(x>y){
//            return x;
//        }
//        else {
//            return y;
//        }
//    }
//    public static double max(int x,double y,double z){
//         double temp=max(x,y);
//         return max(temp,z);
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        double c=scan.nextDouble();
//        double d=scan.nextDouble();
//        double e=scan.nextDouble();
//        System.out.print(sum(a,b)+" ");
//        System.out.print(sum(c,d,e));
//    }
//    public static int sum(int x,int y){
//        int ret=0;
//        ret=x+y;
//        return ret;
//    }
//    public static double sum(double x,double y,double z){
//        double ret=0;
//        ret=x+y+z;
//        return ret;
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        System.out.print(frogJumpingStep(n));
//    }
//    public static int frogJumpingStep(int n){
//        if(n==1){
//            return 1;
//        }
//        else if(n==2){
//            return 2;
//        }
//        else {
//            return frogJumpingStep(n-1)+frogJumpingStep(n-2);
//        }
//    }
//}
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        hanoi(n,'A','B','C');
//    }
//
//    public static void move(char posl1, char posl2) {
//        System.out.print(posl1 + "->" + posl2+" ");
//    }
//
//    public static void hanoi(int n, char posl1, char posl2, char posl3) {
//        if (n == 1) {
//            move(posl1, posl3);
//        } else {
//            hanoi(n - 1, posl1, posl3, posl2);
//            move(posl1, posl3);
//            hanoi(n - 1, posl2, posl1, posl3);
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//     Scanner scan=new Scanner(System.in);
//     int n=scan.nextInt();
//     System.out.print(fibonaci(n));
//    }
//    public static int fibonaci(int n) {
//        int x=1;
//        int y=1;
//        int z=0;
//        for(int i=3;i<=n;i++){
//            z=x+y;
//            x=y;
//            y=z;
//        }
//        return z;
//    }
//}
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        System.out.print(addEverynumber(n));
//    }
//
//    public static int addEverynumber(int n) {
//        if (n > 9) {
//            return n % 10+addEverynumber(n / 10);
//        } else {
//            return n;
//        }
//    }
//}

//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        showEveryNumber(n);
//    }
//
//    public static void showEveryNumber(int n) {
//        if (n !=0) {
//            showEveryNumber(n / 10);
//            System.out.print(n % 10+" ");
//        }
//    }
//}
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        System.out.print(sum(n));
//    }
//
//    public static int sum(int n) {
//        if (n > 0) {
//            return n + sum(n - 1);
//        } else {
//            return 0;
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        System.out.print(complex(n));
//    }
//    public static int complex(int n){
//        if(n>0){
//            return n*complex(n-1);
//        }else {
//            return 1;
//        }
//    }
//}
//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int[] array= new int [10];
//        int i=0;
//        for (i=0;i<array.length;i++){
//            array[i]=scan.nextInt();
//        }
//        System.out.print(avg(array));
//    }
//    public static double avg(int[] array){
//        int i=0;
//        double sum=0;
//        while (i<array.length){
//            sum=sum+array[i];
//            i++;
//        }
//        return sum/array.length;
