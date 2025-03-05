public class MazeSolver {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1}
        };
        
        printMaze(maze);
    }

    public static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "█" : " ");
            }
            System.out.println();
        }
    }
}
