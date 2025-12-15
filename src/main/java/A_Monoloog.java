public class A_Monoloog {

    public static void main(String[] args) {
        // Groepeer de statement in hun eigen method, en roep de method aan vanuit main. De code blijft functioneel hetzelfde doen.
        // Een conversatie bestaat uit een `greeting`, wat `smallTalk` en een `goodbye`
        sayHello();
        Welcome();
        About();
        Program();
        Thankyou();
        sayGoodbye();
    }

    // nieuwe methods komen hier

    public static void sayHello() {
        System.out.println("Hey");
    }

    public static void Welcome() {
        System.out.println("Welcome to this wonderful conversation");
    }

    public static void About() {
        System.out.println("How about this weather?");
    }

    public static void Program() {
        System.out.println("And did you see that random program on that random channel?");
    }

    public static void Thankyou() {
        System.out.println("Thank you for a wonderful conversation!");
    }

    public static void sayGoodbye() {
        System.out.println("Cya");
    }

}
