public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e); 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
