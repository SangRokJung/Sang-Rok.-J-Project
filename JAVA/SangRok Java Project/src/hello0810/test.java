package hello0810;

public class test {
    public static int solution(int[] nums) {
        int answer = 0;
        int plusNum = 0;

        for(int i = 0; i < nums.length - 2; i++){
            
            for(int j = i+1; j < nums.length - 1; j++){
                
                for(int z = j+1; z < nums.length; z++){
                    
                    plusNum = nums[i] + nums[j] + nums[z];
                    int temp = 0;

                    for(int s = 1; s < plusNum+1; s++){
                        
                        
                        if(plusNum % s == 0){
                            temp ++;
                        }
                        
                        
                    }

                    if(temp == 2){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,7,6,4};

        System.out.println(solution(nums));
    }
}
