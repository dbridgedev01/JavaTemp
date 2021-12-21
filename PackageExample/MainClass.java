import myPackage.CustomPackage;

interface customInterface{
    void myMethod();
}

class MyClass implements customInterface{
    public void myMethod(){
        System.out.println("Interface Method Is Implemeted.");
    }
}


class MainClass {
    public static void main(String[] args) {
        CustomPackage C1 = new CustomPackage();
        C1.display();
        MyClass M1 = new MyClass();
        M1.myMethod();
    }
}