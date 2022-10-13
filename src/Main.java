public class Main {
    public static void main(String[] args){
        CustomStringMethods methods = new CustomStringMethods();

        //test code for foundIn method
        boolean bool = methods.foundIn("pl", "apple");
        System.out.println(bool);
        bool = methods.foundIn("m", "apple");
        System.out.println(bool);
        bool = methods.foundIn("a g", "have a great weekend!");
        System.out.println(bool);
        bool = methods.foundIn("end!", "have a great weekend!");
        System.out.println(bool);
        bool = methods.foundIn("Great", "have a great weekend!");
        System.out.println(bool + "\n");

        //test code for longerThan method
        bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool + "\n");

        //test code for funnyString method
        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.funnyString("computer", 0);
        System.out.println(str);
        str = methods.funnyString("computer", 7);
        System.out.println(str);
        str = methods.funnyString("apples", 1);
        System.out.println(str + "\n");

        str = methods.pigLatin("computer");
        System.out.println(str);
        str = methods.pigLatin("sky");
        System.out.println(str);
        str = methods.pigLatin("Brooklyn");
        System.out.println(str);
        str = methods.pigLatin("weekend");
        System.out.println(str);


        String outPut = methods.starBetween("apple)");
        System.out.println(outPut);
        outPut = methods.starBetween("banana)");
        System.out.println(outPut);
        outPut = methods.starBetween("at)");
        System.out.println(outPut);
    }
}
