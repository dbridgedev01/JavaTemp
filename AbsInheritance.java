abstract class FirstClass{
    int number = 11;
    String myName = "Random Person";
    abstract void printMethod();
}

class SecondClass extends FirstClass {
    int number = 33;
    String myName = "Different Person";
    void printMethod(){
        System.out.println("BASE CLASS");
        System.out.println(super.number + " " + super.myName + "\n\n");
        System.out.println("Inherited Class");
        System.out.println(number + " " +  myName + "\n\n");
    }
}

class AbsInheritance{
    public static void main(String[] args) {
        final int myNumber = 11;
        System.out.println("Final Number: " + myNumber);
        SecondClass s1 = new SecondClass();
        s1.printMethod();
    }
}