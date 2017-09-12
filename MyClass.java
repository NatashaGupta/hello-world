public class MyClass {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i&lt;n;i++){
            int a=arr[i];
            int j=i-1;
            while(j&gt;=0 &amp;&amp; arr[j]&gt;a){
                arr[j+1]=arr[j];
                j=j-1;
                
            }
            arr[j+1]=a;
            
        }
    }
    void print(int arr[]){
        int n=arr.length;
        for(int i=0;i&lt;n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]) {
        int arr[]={2,6,1,8,3};
        MyClass ob = new MyClass();
        ob.sort(arr);
         ob.print(arr);
        
    }
}

