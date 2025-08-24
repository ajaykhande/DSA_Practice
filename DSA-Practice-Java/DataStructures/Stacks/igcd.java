
public class igcd {
    
    // static int gcd(int x, int y){
    //     if(y == 0)return x;
     //     return gcd(y,x % y);
    //     }int
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.next,Int();
    //     int y = sc.nex,tInt();
    //    System .out.println(gcd(x, y));
    // }
    // static int ge(int arr[] ,int idx){
    //     if ( idx == arr.length-1){
    //         return arr[idx];
    //     }
    //    int samallest = ge(arr, idx+1);
    //     return  samallest + arr[idx];
        
    // } 
    // static void  reves( int [] rev, int i , int j){
         
    //     //  i = rev[0] ;
    //     //  j = rev[rev.length-1];
    //      while (i<j) { 
    //         int t = rev[i];
    //         rev[i] = rev[j];
    //         rev[j]  = t;
    //         i++;
    //         j--;
    //      }
    //      }
    //      static void roted(int [] arr , int k){
    //         int n = arr.length;
    //          reves(arr, 0, n-k-1 );
    //          reves(arr, n-k, n-1);
    //          reves(arr, 0, n-1);
        static void printar(int [][] arr ){
              int r = arr.length;
           //   int d =0;
           for(int i = 0 ; i<r; i++){
         for(int j = 0 ;j<arr[i].length ; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
      }
    }
   
        static void  prifixx( int[] []arr ){
         
          int r = arr.length;
         // int c = arr.length;
           for (int i = 0; i<r; i++ ) {
            for (int j = 1; j<arr[i].length; j++ ) {
                arr[i][j]=arr[i][j]+arr[i][j-1];
           }
          }
          for (int i = 0; i<r; i++ ) {
            for (int j = 1; j<arr[i].length; j++ ) {
                arr[j][i]=arr[j][i]+arr[j-1][i];
           }
          }
          
           
        } 
          static int   prifix( int[] []arr , int l1,int r1,int l2,int r2 ){
            prifixx(arr);
       int ans =0,sum =0,up =0, le = 5, rl=0;
              sum = arr[l2][r2];
              if(r1>=1){ 
              le = arr[l2][r1-1];
              }  if(l1>=1){ 
              up = arr[l1-1][r2];}
                if(r1>=1&&l1>=1){ 
              rl = arr[l1-1][r1-1];}
              ans = sum - le - up +rl;
     
     return ans;
    }
      public static void main(String[] args) {
       int [][] arr = {{1,2,3}
                      ,{2,1,1},
                       {3,2,1}};
     //  int [] arr = { 0,1,2,3,4,5,6,7,8,9,10,11,12};
      // prifix(arr, 1, 1, 2, 2);
    //   prifixx(arr);
    System.out.println(prifix(arr, 0, 0, 2, 2));
     printar(arr);
       // System.out.println(prifix(arr, 1, 1, 2, 3))
               //printarr(r1, c1);
      // printar(arrr);
      // System.out.println("your adding 1 matrix array");
      // printar(arr);
      // System.out.println("your adding 2 matrix array");
      // printar(arrr);
      // System.out.println("your adding matrix array");
      // addmatrix(arr, r, c, arrr, r1, c1);
    
         
             
    }

    }


   
            
                





