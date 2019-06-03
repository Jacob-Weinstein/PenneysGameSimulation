public class PenneysGame { 

    public static void main(String[] args){ 

        simulation(200, "HHH", "THH"); 

    } 

    public static void simulation(int trials, String combo1, String combo2){ 

         int headCount = 0;  

         int tailCount = 0;  

         int p1Wins = 0;  

         int p2Wins = 0;          

         String sequence = "";  

         for(int y=0; y<trials; y++){ 

             for(int x =0; x<10000; x++){ 

             int randomNum = 1 + (int) (Math.random() * 2);  

             if(randomNum == 1){  

                 sequence += "H";  

                 headCount++;  

             } 

             else{  

                 sequence += "T";  

                 tailCount++;  

             }  

             if(sequence.contains(combo1)){  

                 p1Wins++;  

                 System.out.println(sequence + "...P1 wins");
                 sequence = new String("");  

                 x=10000; 

             }  

             if(sequence.contains(combo2)){  

                 p2Wins++; 

                 System.out.println(sequence + "...P2 wins");
                 sequence = new String("");  

                 x=10000; 

             } 

             }         

             } 

        System.out.println("Head: " + headCount + " Tails: " + tailCount);  

        // System.out.println("Head:Tail ratio " + headCount/tailCount);  

         System.out.println("P1 wins: " + p1Wins + " P2Wins: " + p2Wins); 

         System.out.println("P1 winning chance: " + (double) p1Wins / (p1Wins + p2Wins) * 100 + "%"); 

         // System.out.println("P1:P2 Ratio:" + p1Wins/p2Wins);  

} 

} 