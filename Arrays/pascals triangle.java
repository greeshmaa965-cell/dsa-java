class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>>listf=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer>list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++)
            {
                List<Integer>prev=listf.get(i-1);
                int val=prev.get(j-1)+prev.get(j);
                list.add(val);
            }
            if(i>0)
            {
                list.add(1);
            }
         listf.add(list);
        }
        return listf;
    }
}
