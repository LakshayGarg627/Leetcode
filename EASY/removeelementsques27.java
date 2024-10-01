public class removeelementsques27{
    public static int removeElement(int nums[],int val ){
        int n=nums.length;
        int count=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[j]=val;
                count++;
                j++;
            }
        }
       
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        return count;
    }
    public static void main(String args[]){
        int nums[]={3,2,2,3};
        int key=3;
        System.out.println(removeElement(nums,key));
    }
}