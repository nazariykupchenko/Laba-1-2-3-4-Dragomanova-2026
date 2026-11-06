package lab4;

public class Lab4Drills {

    public static void main() {

        printName();
    }


    // Drill1. The Forbidden Access
    String name = "Lab4 instance";

    static void printName() {

        // System.out.println(name); //non-static variable name cannot be referenced from a static context
    }


    // Drill2. Varargs Math
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // Drill3. Varargs Rule-breaker
    // static void test(int... nums, String s) { } // error: varargs parameter must be the last parameter


    // Drill4. The Default Ghost
    static void drill4() {
//         MyClass ghost = new MyClass();
    }

    // Drill5. Constructor Chain
    static void drill5() {
        Pizza defaultPizza = new Pizza();                 // calls Pizza() -> this("Margherita", 30)
        Pizza custom = new Pizza("Pepperoni", 40);
        defaultPizza.describe();
        custom.describe();
        System.out.println();
    }


    // Drill6. Static Call Practice
    static void drill6() {
        double root = Math.sqrt(144);
        int number = Integer.parseInt("100");
        System.out.println("Math.sqrt(144) = " + root);
        System.out.println("Integer.parseInt(\"100\") = " + number);
        // Both are CLASS (static) methods: we call them through the class name (Math., Integer.) and never write new Math() or new Integer().
    }

    // Drill7.
    static void change(final int x) {
        // x = 10;
        // error: final parameter x may not be assigned
    }

    // Drill8. The Identity Crisis
    static void drill8() {
        System.out.println("--- Drill8: The Identity Crisis ---");
        Identity first = new Identity();
        Identity second = new Identity();
        first.whoAmI();
        second.whoAmI();
        // Output looks like Identity@1b6d3586: ClassName@hashCode in hex.
        // Every object has its own hash, so 'this' is the current object itself.
        System.out.println();
    }

    // Drill10.
    static void drill10() {
        Player p = new Player();
        p.setNameBroken("Neo");
        System.out.println("Without this: name = " + p.name);
        p.setName("Neo");
        System.out.println("With this.name: name = " + p.name);
    }


}

    // Drill4. The Default Ghost
    class MyClass {
        String label;

        MyClass(String label) {
            this.label = label;
        }
    }

    // Drill5. Constructor Chain
    class Pizza {
        String type;
        int sizeCm;

        Pizza(String type, int sizeCm) {
            this.type = type;
            this.sizeCm = sizeCm;
        }

        Pizza() {
            this("Margherita", 30);
            System.out.println("  (default constructor delegated to Pizza(String, int))");
        }

        void describe() {
            System.out.println(type + ", " + sizeCm + " cm");
        }
    }

    // Drill8. The Identity Crisis
    class Identity {
        void whoAmI() {
            System.out.println("this = " + this);
        }
    }


    // Drill10.
    class Player {
        String name;

        void setNameBroken(String name) {
            name = name;
        }

        void setName(String name) {
            this.name = name;               // this.name = field, name = parameter
        }
    }






