
package casino;


public class BlackJack extends GeneralUser{
    
    private String[] suites = {"Diamonds","Hearts","Clubs","Spades"};
    private String[] cards = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    private int bet;
    
    public BlackJack(String name, int income, int age, double balance, double weight, double height, boolean male, String user, String pass, int bet){
          super(name,income,age,balance,weight,height,male,user,pass);
          this.bet = bet;
          suites = new String[4];
          cards = new String[13];
    }
    
    public int hit(String[] suites, String[] cards){
        int total = 0;
        int pickSuite = (int) (Math.random() * 4);
        int pickcard = (int) (Math.random() * 13);
          
    }
}
