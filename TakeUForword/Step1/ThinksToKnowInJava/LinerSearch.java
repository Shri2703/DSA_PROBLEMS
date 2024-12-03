public class LinerSearch{

    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8};

        int search = 5;
        int i = 0;
        for( i = 0 ; i< arr.length;i++){
            if(arr[i]==search){
                System.out.println("element found:"+i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println("Element not fount");
        }
    }
}