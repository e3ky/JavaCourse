import java.util.Arrays;


public class MaxScalar {
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub

        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i =0;i < a.length;i++){
            result+=a[i]*b[i];
        }
        return result;
    }
    
    public int getNumberOfDigits(int number){
        int result=0;
        while (number > 0){
            result++;
            number=number/10;
            
            
        }
        return result;
    }
    
    public String glueObjects(String glue,Object ...objArray){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < objArray.length;i++){
            sb.append(String.valueOf(objArray[i]));
            if(i < objArray.length-1){
                sb.append(glue);
            }
        }
        return sb.toString();
    }

}
