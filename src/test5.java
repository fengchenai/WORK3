//import java.util.Arrays;
//import java.util.Scanner;
//class Link{
//    private int[] array;
//    private int useSize;
//    private int capacity;
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public int[] getArray() {
//        return array;
//    }
//
//    public void setArray(int[] array) {
//        this.array = Arrays.copyOf(array, this.capacity);
//    }
//
//    public int getUseSize() {
//        return useSize;
//    }
//
//    public void setUseSize(int useSize) {
//        this.useSize = useSize;
//    }
//    public Link(){
//        this.array=new int[this.capacity];
//    }
//    public void isFull() {
//        if (this.useSize >= this.capacity) {
//            this.array=Arrays.copyOf(this.array,2*this.array.length);
//        }
//    }
//    public void add(int pos,int n) {
//        isFull();
//        int i = 0;
//        if (pos > 0 && pos <= this.useSize) {
//            for (i=this.useSize-1;i>=pos;i--){
//                this.array[i+1] = this.array[i];
//            }
//            this.array[pos]=n;
//            this.useSize=this.useSize+1;
//        }
//    }
//    public void sub(int pos){
//        int i=0;
//        int temp=0;
//        for(i=pos;i<this.useSize-1;i++){
//            this.array[i]=this.array[i+1];
//        }
//        this.array[this.useSize-1]=0;
//        this.useSize=this.useSize-1;
//    }
//    public void show(){
//        isFull();
//        int i=0;
//        for(i=0;i<this.useSize;i++){
//            System.out.print(this.array[i]+" ");
//        }
//    }
//
//}
//public class test5 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Link array1 = new Link();
//        int i = 0;
//        array1.setUseSize(10);
//        array1.setCapacity(10);
//        int[]array2=new int[array1.getCapacity()];
//        for (i = 0; i < array2.length; i++) {
//            array2[i]=scan.nextInt();
//        }
//        array1.setArray(array2);
//        array1.show();
//        System.out.println();
//        array1.add(2,6);
//        array1.show();
//        System.out.println();
//        array1.sub(6);
//        array1.show();
//    }
//}
