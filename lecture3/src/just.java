public class just {
    static void positive(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={67,-4,3,-5,44};
        positive(arr);

    }
}
