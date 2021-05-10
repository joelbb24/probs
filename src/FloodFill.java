public class FloodFill {
    public static void main(String[] args) {
        char[][] mat = {{'X', 'O', 'X', 'O', 'X', 'X'},
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'}};

        replaceSurrounded(mat);
        int M = mat.length;
        int N = mat[0].length;

        for (int i = 0; i < M; i++) {
            for( int j = 0; j<N; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void replaceSurrounded(char[][] mat)
    {
        int M = mat.length;
        int N = mat[0].length;
        //Replace all O with '_'
        for (int i = 0; i<M; i++)
        {
            for(int j = 0; j<N; j++)
            {
                if(mat[i][j] == 'O')
                    mat[i][j] = '_';
            }
        }

        //All edges to be filled with O
        //Left Side
        for (int i = 0; i < M; i++) {
            if(mat[i][0]=='_')
                floodFill(mat, i, 0, '_','O');
        }

        //Right side
        for (int i = 0; i<M ;i++) {
            if(mat[i][N-1]=='_')
                floodFill(mat, i, N-1, '_','O');
        }

        //Top side
        for (int i = 0; i < N; i++) {
            if(mat[0][i]=='_')
                floodFill(mat, 0, i, '_','O');
        }

        //Bottom side
        for (int i = 0; i < N; i++) {
            if(mat[M-1][i]=='_')
                floodFill(mat, M-1, i, '_','O');
        }

        for (int i = 0; i<M; i++)
        {
            for(int j = 0; j<N; j++)
            {
                if(mat[i][j] == '_')
                    mat[i][j] = 'X';
            }
        }

    }

    static void floodFill(char[][] mat, int x, int y, char prevV, char newV)
    {
        int M = mat.length;
        int N = mat[0].length;
        //Base case
        if(x < 0 || x >= M || y < 0 || y >= N)
        {
            return;
        }

        if(mat[x][y] != prevV)
            return;

        mat[x][y] = newV;

        floodFill(mat, x+1, y, prevV, newV);
        floodFill(mat, x-1, y,prevV, newV);
        floodFill(mat, x, y-1, prevV, newV);
        floodFill(mat, x, y+1, prevV, newV);
    }
}
