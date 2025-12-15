public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.

        bertSays();
        hello();
        ernieSays();
        hello();
        bertSays();
        welcome();
        ernieSays();
        thankYou();
        bertSays();
        weather();
        ernieSays();
        coldDays();
        bertSays();
        channel();
        ernieSays();
        program();
        bertSays();
        bye();
        ernieSays();
        sayBye();
    }

    // nieuwe methods komen hier

    public static void bertSays() {
        System.out.println("Bert says: ");
    }

    public static void ernieSays() {
        System.out.println("Ernie says: ");
    }

    public static void hello() {
        System.out.println("Hey");
    }

    public static void welcome() {
        System.out.println("Welcome to this wonderful conversation");
    }

    public static void thankYou() {
        System.out.println("Thnx, I'm looking forward to it");
    }

    public static void weather() {
        System.out.println("How about this weather?");
    }

    public static void coldDays() {
        System.out.println("I really don't mind the cold....");
    }

    public static void channel() {
        System.out.println("And did you see that random program on that random channel?");
    }

    public static void program() {
        System.out.println("Well... I did watch a random program on a random channel...");
    }

    public static void bye() {
        System.out.println("Thank you for a wonderful conversation!");
    }

    public static void sayBye() {
        System.out.println("Cya");
    }


}
