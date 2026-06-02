class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rowchecker[][]=new boolean[9][9];
        boolean colchecker[][]=new boolean[9][9];
        boolean subboxchecker[][]=new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];

                if(ch=='.') continue;

                int ind=ch-'0'-1;
                int subind=(i/3)*3+(j/3);

                if(rowchecker[i][ind]||colchecker[j][ind]||subboxchecker[subind][ind]){
                    return false;
                }
                rowchecker[i][ind]=true;
                colchecker[j][ind]=true;
                subboxchecker[subind][ind]=true;
            }
        }
        return true;
    }
}
