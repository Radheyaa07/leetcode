class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<Integer>curr=new ArrayList<>();
          solve(0,candidates,curr,target);
          return ans;

            }
            private void solve(int index,int[]nums,List<Integer>curr,int target){
                
                
               if(target==0){
                ans.add(new ArrayList<>(curr));
                return;
               }
               if(index==nums.length||target<0){
                return;
               }
                curr.add(nums[index]);
                solve(index,nums,curr,target-nums[index]);
                    curr.remove(curr.size()-1);

                    solve(index+1,nums,curr,target);
            }
        }

    
