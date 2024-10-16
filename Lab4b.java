public class Lab4b{
    public static void main(String[] args){
	
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
             arr[i] = i + 1; 
    }
        System.out.println("Elements from 1 to 100 in array are: ");
        try{
            for(int i = 0 ; i<=arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
