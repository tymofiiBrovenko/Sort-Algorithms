public class BubblesortInd2{
  public static void main(String[] args) {
        int[] feld = new int[10];

        for (int n = 0; n < feld.length; n++) {
            feld[n] = (int) (Math.random() * 10);
            System.out.println(n + ". original: " + feld[n]);
        }

        for (int i = 0; i < feld.length - 1; i++) {
            //last i elements are already in place, so they dont need to be checked
            for (int j = 0; j < feld.length - 1 - i; j++) {
                if (feld[j] > feld[j + 1]) {
                    int help = feld[j];//now local instead of global variable
                    feld[j] = feld[j + 1];
                    feld[j + 1] = help;
                }
                System.out.print("\n" + i + "." + j + ":");
                output(feld);
            }
        }
    }

    public static void output(int[] feld){
        for(int i = 0; i < feld.length; i++){
            System.out.print(" " + feld[i]);
        }
    }
}