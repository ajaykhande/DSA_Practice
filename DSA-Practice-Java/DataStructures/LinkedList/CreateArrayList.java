import java.util.Arrays;
public class CreateArrayList{
    public static class arraylist{
        int [] arr = new int [2];
        int idx = 0;
        int size = 0;
        public void add(int ele){
            if(size==arr.length){
           int [] brr = Arrays.copyOf(arr, arr.length*2);
           arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
      public void set(int idxx ,int ele){
            arr[idxx] = ele;
          }
    }
public static void main(String[] args) {
    arraylist arr = new arraylist();
    arr.add(0);
    arr.add(1);
    arr.add(2);
    arr.set(0, 3);
    System.out.println(arr.size);
    System.out.println(arr.size);
    System.out.println(arr.arr[0]);
}
}
    


