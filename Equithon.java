/* 
 * Name: Pola Arkhangorodsky
 * Event: Equithon - LGBTQ+ 
 * Date: 04/05/18 - 06/05/18
 * Description: A game designed to educate and test people on their knowledge related to the LGBTQ+ community, this program also provides more information after each question
 *              to teach users why they're answer was incorrect, as opposed to just the correct answer. At the end of the game, the user will be provided with a list of 
 *              topics that they did not know enough about so they know what to search online to learn more.
 */
import java.util.*;

class Equithon {
  public static void main(String[] args) {
    String playAgain = "yes";
    do {
      Scanner input = new Scanner(System.in);
      int prize = 0;
      int randomizer = 0;
      //40 POINT SNAPSTART
      String[] snapstartQuestion = {"The alternative school in Toronto for gay youth who have experienced harassment in their own high school is called what?",
        "What does the abbreviation 'LGBT' stand for?",
        "When did 'homosexual' become the term to describe gay men?",
        "What name did/do First Nations use to identify Transgender/Intersex people as?",
        "What do the colours of the LGBT Pride flag represent?",
        "In how many US states can LGBT people be legally fired or evicted because of their sexual orientation?",
        "What percentage of LGBT people are reported to be 'in the closet' at work?",
        "What should you do to find out someones pronouns?"};
      String[] snapstartAnswer = {"C",
        "C",
        "A",
        "B",
        "C",
        "A",
        "B",
        "C"};
      String[] snapstartOptionA = {"The Rainbow Program",
        "Lesbian, Gay, Bigender, Transsexual",
        "1868",
        "Hermaphrodite",
        "Love, power, light, superiority, difference, sex",
        "29",
        "12%",
        "Ask them nicely"};
      String[] snapstartOptionB = {"The Pride Program",
        "Lesbian, Gay, Bisexual, Transsexual",
        "1924",
        "Two-Spirit",
        "Life, healing, sunlight, nature, serenity, spirit",
        "17",
        "48%",
        "Wait for a cue from someone else on what pronouns to use, then use those pronouns"};
      String[] snapstartOptionC = {"The Triangle Program",
        "Lesbian, Gay, Bisexual, Transgender",
        "1959",
        "Transsexual",
        "Love, generosity, bright, thoughtful, questioning, intelligence",
        "None- federal law protects all people from discrimination",
        "26%",
        "both B and C"};
      String[] snapstartFacts = {"This school is Canada's only LGBTQ High School!",
        "The first addition to the accronym was the G, later the L was added, and the rest goes in order of time added, from first added to most recently added.",
        "Homosexual was coined in 1869. Academia continues to coin related terms, including androphilia and gynephilia!",
        "Hermaphrodite is actually a derogitory word for trans folk, when you hear this about people who should correct the person saying it. In science, hermaphrodie is very commonly used for animals and organisms.",
        "Gilbert Baker is the person who designed the flag, he lived from June 2, 1951 to March 31, 2017. He was also known by Busty Ross.",
        "No federal law in the US prevents employment or housing discrimination based on sexual orientation, and state laes only protect them in 21 states.",
        "A 2011 survey by the Venter for Work-Life Policy revealed that almost half of LGBT people don't feel comfortable enough to be open about their sexual orientation or gender identity at work.",
        "Asking people what their pronouns are is a good way to learn because it comes straight from them and not from someone that they might not be out to yet, the idea that queer folk get angry when asked is completely innacurate and is only used to further dehumanize the LGBTQ+ community"};
      
      //40 POINT TEAM QUESTION - STONEWALL
      String[] StonewallQuestion = {"The Stonewall riots against a police raid is the spark that ignoted the gay liberation movement. Where is the Stonewall Inn?",
        "In what year did the Stonewall Riots take place?",
        "What year was the U.K. based LGBT charity Stonewall founded?",
        "What was the main reason the charity Stonewall was founded?"};
      String[] StonewallOptionA = {"San Francisco",
        "1969",
        "1999",
        "To give LGBT people somewhere to go and chillout"};
      String[] StonewallOptionB = {"New York",
        "1959",
        "1969",
        "To fight Section 28"};
      String[] StonewallOptionC = {"Los Angeles",
        "1979",
        "1989",
        "To provide food to homeless LGBT people"};
      String[] StonewallAnswer = {"B",
        "A",
        "C",
        "A"};
      String[] StonewallFacts = {"Although the Stonewall charity was founded in the UK, the riots themselves took place in New York! The Stonewall Inn is located in Greenwich Village, Manhattan.",
        "1969 is the year in which LGBT people had grown sick of the oppression and decided to make a stand against the narrow-minded bigotry!",
        "1989 was the year Stonewall was founded and they are still going strong today!",
        "Section 28 was an anti-gay legislation"};
      //WHO AM I - CHANNING TATUM
      String[] channingQuestion = {"I was born April 26, 1980 in Cullman, Alabama, U.S.",
                                   "I am an actor and have 1 child with my wife, Jenna Dewan",
                                   "I appear in many dance movies, most famously for Magic Mike XXL",
                                   "I am responsible for the line 'my name's jeff' from the 21 Jump Street movie series"};
      //START GAME
      System.out.println("Welcome to the Equithon LGBTQ+ Trivia Game created by Pola Arkhangorodsky! This game is designed to educate you and teach you when you're wrong. enjoy!");
      System.out.println("40 POINT SNAPSTART TO ROUND ONE");
      Snapstart(snapstartQuestion, snapstartOptionA, snapstartOptionB, snapstartOptionC, snapstartAnswer, snapstartFacts, prize, randomizer, input);
      System.out.println("40 POINT OPEN QUESTION - STONEWALL RIOTS");
      Stonewall(StonewallQuestion, StonewallOptionA, StonewallOptionB, StonewallOptionC, StonewallAnswer, StonewallFacts, prize, randomizer, input);
      System.out.println("40 POINT OPEN QUESTION - RANDOM");
      Snapstart(snapstartQuestion, snapstartOptionA, snapstartOptionB, snapstartOptionC, snapstartAnswer, snapstartFacts, prize, randomizer, input);
      System.out.println("40 POINT WHO AM I QUESTION - this question is worth 40 points if you guess the answer on the first clue and 10 points less with each succeeding clue, until the answer is answered correctly");
      Channing(channingQuestion, prize, input);
      System.out.println("40 POINT SNAPOUT TO ROUND ONE");
      Snapstart(snapstartQuestion, snapstartOptionA, snapstartOptionB, snapstartOptionC, snapstartAnswer, snapstartFacts, prize, randomizer, input);
      System.out.print("Would you like to play again? (yes or y)");
      playAgain = input.nextLine();
    } while (playAgain.equalsIgnoreCase("YES") || playAgain.equalsIgnoreCase("Y"));
    System.out.println("Would you like a voabulary sheet to learn more? Too bad! You're getting one anyway!");
    System.out.println("Please copy and paste this link into a browser, you can make as many copies as you'd like! :D \nhttps://docs.google.com/document/d/1bQUVVRX7Ol9VhhiPSPWgFHPX-nRyjv1lhZ_hjeYitYs/edit?usp=sharing");
    System.out.println("Thank you for playing!");
  }
    public static void Snapstart(String[] snapstartQuestion, String[] snapstartOptionA, String[] snapstartOptionB, String[] snapstartOptionC, String[] snapstartAnswer, String[] snapstartFacts, int prize, int randomizer, Scanner input) {
      for (int i = 0; i < 4; i++) {
        do{
          randomizer = 1 + (int)(Math.random() * (5));
        } while (snapstartQuestion[randomizer].equals("X"));
        System.out.println("Question: " + snapstartQuestion[randomizer-1]);
        System.out.println("A: " + snapstartOptionA[randomizer] + "\nB: " + snapstartOptionB[randomizer] + "\nC: " + snapstartOptionC[randomizer]);
        snapstartQuestion[randomizer] = "X";
        System.out.print("Your answer: ");
        String response = input.nextLine();
        if (response.equalsIgnoreCase(snapstartAnswer[randomizer])) {
          System.out.println("Congratulations! That was the correct answer");
          prize+=10;
        }
        else {
          System.out.println("Sorry, but that was the incorrect answer :(");
        }
        System.out.println("Here's a fact on that topic: \n" + snapstartFacts[randomizer]);
        System.out.println("You currently have " + prize + " points");
      }
    }
    public static void Stonewall(String[] StonewallQuestion, String[] StonewallOptionA, String[] StonewallOptionB, String[] StonewallOptionC, String[] StonewallAnswer, String[] StonewallFacts, int prize, int randomizer, Scanner input) {
      for (int i = 0; i < 4; i++) {
        do{
          randomizer = 1 + (int)(Math.random() * (5));
        } while (StonewallQuestion[randomizer].equals("X"));
        System.out.println("Question: " + StonewallQuestion[randomizer]);
        System.out.println("A: " + StonewallOptionA[randomizer] + "\nB: " + StonewallOptionB[randomizer] + "\nC: " + StonewallOptionC[randomizer]);
        StonewallQuestion[randomizer] = "X";
        System.out.print("Your answer: ");
        String response = input.nextLine();
        if (response.equalsIgnoreCase(StonewallAnswer[randomizer])) {
          System.out.println("Congratulations! That was the correct answer");
          prize+=10;
        }
        else {
          System.out.println("Sorry, but that was the incorrect answer :(");
        }
        System.out.println("Here's a fact on that topic: \n" + StonewallFacts[randomizer]);
        System.out.println("You currently have " + prize + "points");
      }
    }
    public static void Channing(String[] channingQuestion, int prize, Scanner input) {
      for (int i = 0; i < 4; i++) {
        System.out.println("Clue #" + (i + 1) + ": " + channingQuestion[i] + "\nWHO AM I for " + (i + 1) + "0 points");
        System.out.print("Your answer: ");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("channing tatum")) {
          System.out.println("Congratulations! That was the correct answer");
          prize+=10;
          break;
        }
        else {
          System.out.println("Sorry, but that was the incorrect answer :(");
        }
        System.out.println("You currently have " + prize + "points");
      }
      System.out.println("The correct answer was Channing Tatum! \nHere's a fact on that topic: \nThroughout his career, Tatum has talked about being bisexual on many occasions yet he is very often forgotten about. This is a prime example of bisexual erasure.");
    }
}