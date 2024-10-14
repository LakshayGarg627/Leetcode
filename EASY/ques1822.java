public class ques1822{
    public static int arraySign(int nums[]){
        int n=nums.length;
        int countneg=0;
        int countzero=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                countneg++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countzero++;
            }
        }
        if(countzero>0){
            return 0;
        }
        else if((countneg==0 || countneg%2==0) && (countzero==0) ){
            return 1;
        }
        else{
            return -1;
        }

    }
    public static void main(String args[]){
        int nums[]={-1,1,-1,1,-1};
        System.out.println(arraySign(nums));
    }
}