public class Main {
    public static void main(String[] args){
        CustomStringMethods methods = new CustomStringMethods();

//        //test code for foundIn method
//        boolean bool = methods.foundIn("pl", "apple");
//        System.out.println(bool);
//        bool = methods.foundIn("m", "apple");
//        System.out.println(bool);
//        bool = methods.foundIn("a g", "have a great weekend!");
//        System.out.println(bool);
//        bool = methods.foundIn("end!", "have a great weekend!");
//        System.out.println(bool);
//        bool = methods.foundIn("Great", "have a great weekend!");
//        System.out.println(bool + "\n");
//
//        //test code for longerThan method
//        bool = methods.longerThan("apple", 4);
//        System.out.println(bool);
//        bool = methods.longerThan("apple", 5);
//        System.out.println(bool);
//        bool = methods.longerThan("apple", 2);
//        System.out.println(bool);
//        bool = methods.longerThan("apple", 7);
//        System.out.println(bool + "\n");
//
//        //test code for funnyString method
//        String str = methods.funnyString("computer", 3);
//        System.out.println(str);
//        str = methods.funnyString("computer", 0);
//        System.out.println(str);
//        str = methods.funnyString("computer", 7);
//        System.out.println(str);
//        str = methods.funnyString("apples", 1);
//        System.out.println(str + "\n");
//
//        str = methods.pigLatin("computer");
//        System.out.println(str);
//        str = methods.pigLatin("sky");
//        System.out.println(str);
//        str = methods.pigLatin("Brooklyn");
//        System.out.println(str);
//        str = methods.pigLatin("weekend");
//        System.out.println(str);
//
//
//        String outPut = methods.starBetween("apple)");
//        System.out.println(outPut);
//        outPut = methods.starBetween("banana)");
//        System.out.println(outPut);
//        outPut = methods.starBetween("at)");
//        System.out.println(outPut);

//        String str = methods.endUp("It's Thursday", 3);
//        System.out.println(str);
//        str = methods.endUp("hello friend", 3);
//        System.out.println(str);
//        str = methods.endUp("hello friend!", 3);
//        System.out.println(str);
//        str = methods.endUp("Shhhh! Be quiet", 3);
//        System.out.println(str);
//        str = methods.endUp("Yes", 3);
//        System.out.println(str);
//        str = methods.endUp("Yess", 3);
//        System.out.println(str);
//        str = methods.endUp("Yesss", 3);
//        System.out.println(str);
//        str = methods.endUp("no", 3);
//        System.out.println(str);
//        str = methods.endUp("no!", 3);
//        System.out.println(str);
//        str = methods.endUp("noo!", 3);
//        System.out.println(str);
//        str = methods.endUp("noo!!", 3);
//        System.out.println(str);
//        str = methods.endUp("ALREADY UPPERCASE", 3);
//        System.out.println(str);
//        str = methods.endUp("hello friend", 1);
//        System.out.println(str);
//        str = methods.endUp("hello friend", 6);
//        System.out.println(str);
//        str = methods.endUp("hello friend", 20);
//        System.out.println(str);

//        String str = methods.removeCharacter("Halloween", 5);
//        System.out.println(str);
//        str = methods.removeCharacter("Halloween", 0);
//        System.out.println(str);
//        str = methods.removeCharacter("Halloween", 8);
//        System.out.println(str);
//        str = methods.removeCharacter("Halloween", 9);
//        System.out.println(str);
//        str = methods.removeCharacter("Halloween", 20);
//        System.out.println(str);
//        str = methods.removeCharacter("Hi friend", 0);
//        System.out.println(str);
//        str = methods.removeCharacter("Hi friend", 1);
//        System.out.println(str);
//        str = methods.removeCharacter("Hi friend", 2);
//        System.out.println(str);
//        str = methods.removeCharacter(" Hi friend", 0);
//        System.out.println(str);
//        str = methods.removeCharacter("A", 0);
//        System.out.println(str);
//        str = methods.removeCharacter("A ", 0);
//        System.out.println(str);
//        str = methods.removeCharacter("A", 1);
//        System.out.println(str);
//        str = methods.removeCharacter("A ", 1);
//        System.out.println(str);

        String str = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "st");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "m");
        System.out.println(str);
        str = methods.insertAt("spooooky!", "YIKES", "o");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "y");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "birthday");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", " 18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th ", "bir");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "!");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "z");
        System.out.println(str);
        str = methods.insertAt("a", "m", "a");
        System.out.println(str);
        str = methods.insertAt("a", "m", "p");
        System.out.println(str);

    }
}
