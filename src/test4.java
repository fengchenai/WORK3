//class Persion{
//    private String Myname;
//    private  int age;
//
//    public String getMyname() {
//        return this.Myname;
//    }
//
//    public void setMyname(String myname) {
//        this.Myname = myname;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int n) {
//        this.age = n;
//    }
//    public void Print(){
//        System.out.println("姓名："+this.getMyname()+" "+"年龄:"+this.getAge());
//    }
//}
//public class test4{
//    public static void main(String[] args) {
//        Persion peopel=new Persion();
//        peopel.setMyname("陈祥");
//        peopel.setAge(20);
//        peopel.Print();
//    }
//}
//import java.util.Arrays;
//import java.util.Scanner;
//public class test4{
//    public static void main(String[] args) {
//        int[] array=new int[10];
//        int i=0;
//        Scanner scan=new Scanner(System.in);
//        for(i=0;i<array.length;i++){
//            array[i]=scan.nextInt();
//        }
//        oddUp(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void oddUp(int[] array){
//        int left=0;
//        int right=array.length-1;
////        int temp=0;
//        while (left<right) {
//            while (array[left] % 2 != 1) {
//                left = left + 1;
//            }
//            while (array[right] % 2 != 0) {
//                right = right - 1;
//            }
//            if (left < right) {
//                temp = array[left];
//                array[left] = array[right];
//                array[right] = temp;
//            }
//        }
//    }
//}
//import java.util.Scanner;
//import java.util.Arrays;
//public class test4{
//    public static void main(String[] args) {
//        int[] array1=new int[10];
//        int[] array2=new int[10];
//        int i=0;
//        Scanner scan=new Scanner(System.in);
//        for(i=0; i<array1.length;i++){
//            array1[i]=scan.nextInt();
//        }
//        for(i=0;i<array2.length;i++){
//            array2[i]=scan.nextInt();
//        }
//        swapTwoArray(array1,array2);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//    }
//    public static void swapTwoArray(int[] array1,int[] array2){
//        int i=0;
//        int temp=0;
//        for(i=0;i<array1.length;i++){
//            temp=array1[i];
//            array1[i]=array2[i];
//            array2[i]=temp;
//        }
//    }
//}
//class Node {
//    public int data;
//    public Node next;
//    public Node head;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    public void display() {
//        Node cur = this.head;
//        if (cur != null) {
//
//        }
//    }
//    public void addfrist(int data){
//        Node node=new Node(data);
//        Node cur=this.head;
//        cur.next=node;
//        head=node.next;
//    }
//    public void addLast(int data) {
//        Node node = new Node(data);
//        Node cur = this.head;
//        while (cur != null) {
//            cur = cur.next;
//        }
//        cur.next =node;
//    }
//
//    public boolean contains(int key) {
//        Node cur = this.head;
//        while (cur != null) {
//            if (cur.data!= key) {
//                cur = cur.next;
//            }
//            return true;
//        }
//        return false;
//    }
//
//    public int size() {
//       Node cur=this.head;
//       int count=0;
//       while(cur!=null){
//           count++;
//           cur=cur.next;
//       }
//       return count;
//    }
//    public void addlndex(int index,int data){
//        Node noda=new Node(data);
//        if(index==0){
//            addfrist(data);
//            return;
//        }
//        if(index==this.size()){
//            addLast(data);
//            return;
//        }
//        Node cur=searchindex(index);
//        cur.next=noda;
//        noda.next=cur.next;
//
//    }
//    private Node searchindex(int index){
//        if(index<0 || index>size()){
//            throw new RuntimeException("index位置不合法!");
//        }
//        Node cur=this.head;
//        int i=0;
//        while (i!=index){
//            cur=cur.next;
//                                 }
//    }
//}
//public class test4{
//    public static void main(String[] args) {
//    }
//}