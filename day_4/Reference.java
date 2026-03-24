public class Reference {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr.hashCode());
        int[] arr2=arr;
        System.out.println(arr2.toString());
        arr[0]=10;
        arr2[1]=20;
        System.out.println(arr[1]+" "+arr2[0]);
         
        String[] str={"hello","world"};
        System.out.println(str[0].hashCode());
        Integer[] nums={1,2,3,4,5};
        System.out.println(nums[0].hashCode());
        System.out.println(nums[4].hashCode()==5);
       Boolean[] bool={true,false,true};
       System.out.println(bool);
       System.out.println(Integer.toHexString(bool.hashCode()));
    }     
}
