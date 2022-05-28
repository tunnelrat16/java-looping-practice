class App {
  public static void main(String args[]){
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop(){
    for(int i=0; i<5; i++)
    System.out.println("I love Java");
  }
  private static void whileLoop() {
    int count = 0;
    while (count < 5) { 
    System.out.println("I love Jawas");
    count++;
    }
  }
  private static void doWhileLoop() {
    int count = 10;
    do {
      System.out.println(count);
      count--;
    } while (count > 0);
    System.out.println("Launch!");
  }
}
