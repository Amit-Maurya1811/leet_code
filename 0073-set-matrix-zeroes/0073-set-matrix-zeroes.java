class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<String> cell=new HashSet<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                String key=i+","+j+" is changed to zero";
                if(matrix[i][j]==0&&!(cell.contains(key)))
                {
                    for(int k=0;k<m;k++)
                    {
                        if(matrix[k][j]==0)
                        continue;
                        else
                        {
                            matrix[k][j]=0;
                            cell.add(k+","+j+" is changed to zero");
                        }
                    }
                    for(int k=0;k<n;k++)
                    {
                        if(matrix[i][k]==0)
                        continue;
                        else
                        {
                            matrix[i][k]=0;
                            cell.add(i+","+k+" is changed to zero");
                        }
                    }
                }
            }        
        }
        System.out.println(matrix);
    }
}