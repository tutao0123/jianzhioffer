public class searchInArray {
    public static boolean Find(int target, int[][] array) {

        int rowcount = array.length;
        int colcount = array[0].length;
        if (colcount == 0 || target < array[0][0] || target > array[rowcount - 1][colcount - 1]) {
            return false;
        }
        for (int row = rowcount - 1, col = 0; row >= 0 && col < colcount; ) {
            if (target == array[row][col]) {
                return true;
            } else if (target < array[row][col]) {
                row--;
            } else if (target > array[row][col]) {
                col++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //int[][] array = new int[3][5];
        int[][] array = new int[][]{{1, 5, 10, 15, 20}, {2, 6, 11, 16, 21}, {3, 8, 13, 17, 25}};
        System.out.println(Find(5, array));
    }
}
