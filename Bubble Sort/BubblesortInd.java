public class BubblesortInd{
   
    public static int help;
    public static int feld[];

    public static void main(String [] args){
        feld = new int [10];
        //here is the array filled with random numbers between 0 and 9
        for (int n = 0; n < feld.length; n++){
            feld[n] = (int)(Math.random() * 10); 
            System.out.print("\n" + n + "." + feld[n]);
        }
        //here the bubble sort is implemented(multiple times, to have precise results)
        for (int i = 0; i < feld.length - 1; i++){
            for(int j = 0; j < feld.length - 1; j++){
                //the logic of the bubble sort
                //if the current element is bigger than the next one,they are swapped
                if (feld[j] > feld[j+1]){
                    //"Swapp" logic uses temporary variable "help"
                    help = feld[j+1];
                    feld[j+1] = feld[j];
                    feld[j] = help;
                }
                System.out.print("\n" + i + "." + j);
                output();
            }
        }
    }
    //Methode prints the current state of the array after each step, to see the process
    public static void output(){
        for(int i = 0; i < feld.length; i++){
            System.out.print(" " + feld[i]);
        }
    }
}