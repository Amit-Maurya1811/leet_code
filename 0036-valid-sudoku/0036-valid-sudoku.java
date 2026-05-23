class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> rows=new HashSet<>();
        HashSet<String> cols=new HashSet<>();
        HashSet<String> boxes=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num=board[i][j];
                if(num=='.')
                continue;
                else
                {
                    String row= num+ " in row "+ i;
                    String col= num+ " in row "+ j;
                    String box= num+ " in row "+ i/3+" "+j/3;

                    if(rows.contains(row)||cols.contains(col)||boxes.contains(box))
                    {
                        return false;
                    }

                    rows.add(row);
                    cols.add(col);
                    boxes.add(box);
                }
            }
        }
        return true;
    }
}