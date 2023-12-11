class hw_3 {
  public static void main(String[] args) {
   
    String [][] rug = new String [10][10];
   
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        rug[i][j] = "#";
      }
    }
    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        rug[i][j] = " ";
      }
      }
    for (int i = 3; i < 7; i++) {
      for (int j = 3; j < 7; j++) {
        rug[i][j] = "Z";
      }
    }
    for (int i = 1; i < 5; i++){
      for (int j = 1; j < 5-i; j++) {
        rug[i][j] = "O";
      }
    }
    for (int i = 6; i < 9; i++){
      for (int j = 1; j <= i-5; j++) {
        rug[i][j] = "O";
      }
    }
    int k = 9;
    for (int i = 6; i <9; i++){
      k--;
      for (int j = 8; j >= k; j--) {
        rug[i][j] = "O";
      }
    }
    k = 5;
    for (int i = 1; i <5; i++){
      k++;
      for (int j = 8; j >= k; j--) {
        rug[i][j] = "O";
      }
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(rug[i][j]);
      }
      System.out.println();
    }
   }
<<<<<<< Updated upstream
  }



=======
  }
>>>>>>> Stashed changes
