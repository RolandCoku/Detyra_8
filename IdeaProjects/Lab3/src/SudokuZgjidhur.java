public class SudokuZgjidhur {
    private int[][] numrat = new int[9][9];
    public SudokuZgjidhur(){

    }

    public SudokuZgjidhur(int[][] numrat){
        this.numrat = numrat;
    }

    public boolean checkSolution(){
        int sum;
        for (int i = 0; i<9; i++){
            sum = 0;
            for (int j=0; j<9; j++){
                sum+=numrat[i][j];
            }
            if(sum != 45){
                return false;
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                sum = 0;
                for (int i = 3 * k; i < 3 * (k + 1); i++) {
                    for (int j = 3 * l; j < 3 * (l + 1); j++) {
                        sum += numrat[i][j];
                    }
                }
                if (sum != 45) {
                    return false;
                }
            }
        }
        return true;
    }
    public int[][] getNumrat() {
        return numrat;
    }

    public void setNumrat(int[][] numrat) {
        this.numrat = numrat;
    }
}
