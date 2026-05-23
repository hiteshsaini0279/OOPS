


// class BankAccount{
//    public String Username;
//    private String password;
//    void SetPwd(String pwd){
//        password=pwd;
//    }
// }

// class Student {
//    String name;
//    int rollno;
//    String password;
//    int marks[];
//    /// shallow copy
// //    Student(Student s1){
// //        marks= new int[3];
// //        this.name= s1.name;
// //        this.rollno=s1.rollno;
// //     this.marks=s1.marks;
// //    }
//    /// deep copy
//        Student(Student s1){
//             marks= new int[3];
//            this.name= s1.name;
//             this.rollno=s1.rollno;
//             for(int i=0; i< marks.length; i++){
//                 this.marks[i]=s1.marks[i];
//             }
//         }
//    Student(){
//        marks= new int[3];
//        System.out.println("constructor called...");

//    }
//    Student( String name){
//        marks= new int[3];
//   this.name= name;

//    }
//    Student(int rollno){
//        marks= new int[3];
//        this.rollno=rollno;
//    }
// }

// class Pen{
//   private String color;
//  private int tip;

// String getColor(){
//    return this.color;
// }
// int getTip(){
//    return this.tip;
// }
// void SetColor(String newcolor){
//    this.color=newcolor;
// }
// }


// class Animal{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//    void breathe(){
//        System.out.println("breathe");
//    }
// }


// class fish extends Animal{
//    int fins;
//            void swim(){
//                System.out.println("swim");
//            }
// }


// class Mammels extends Animal{
// void walk(){
//    System.out.println("walks");
// }
// }
// //class Dog extends Mammels{
// //    String color;
// //}



// class Birds extends Animal{
//    void fly(){
//        System.out.println("fly");
//    }
// }

// class Peacock extends Birds{
//    void birdfly(){
//        System.out.println("peacock fly!!!");
//    }
// }
// class pigeon extends Birds{
//    void pigeonfly(){
//        System.out.println("peacock fly!!!");
//    }
// }
// public class OOPS {
//    public static void main(String[]args){
//        Calculator calc= new Calculator();
//        System.out.println(calc.sum(2.677f,3.9f));
//        System.out.println(calc.sum(2,3));
//        System.out.println(calc.sum(2,3,8));
//        Horse h= new Horse();
//        h.eats();
//        h.walk();
//        Chicken c= new Chicken();
//        c.eats();
//        c.walk();
//    }
// }

// class Calculator{
//    int sum(int a, int b){
//        return a+b;
//    }
//    float sum(float a, float b){
//        return a+b;
//    }
//    int sum(int a, int b, int c){
//        return a+b+c;
//    }
// }


// abstract class Animal{
//    void eats(){
//        System.out.println("Animal eats");
//    }
//    abstract void walk();
// }

// class Horse extends Animal{
//    void walk(){
//        System.out.println("With four legs");
//    }
// }

// class Chicken extends Animal{
//    void walk(){
//        System.out.println("With two legs");
//    }
// }



// public class OOPS {
//    public static void main(String[]args){
//  Student s1= new Student();
//  s1.schoolname="jbvp";

//        Student s2= new Student();
//        System.out.println(s2.schoolname);
//    }
// }

// interface  Chess{
//    void moves();
// }

// class  Queen implements Chess{
//    public void moves(){
//        System.out.println("All direction");
//    }
// }

// class  Rook implements Chess{
//    public void moves(){
//        System.out.println("diagonal direction");
//    }
// }

// class  Pawn implements Chess{
//    public void moves(){
//        System.out.println("1,2 steps up,back direction");
//    }
// }



// class Student {
//    String name;
//    int rollno;
//     static String schoolname;
//     void setName(String name){
//       this.name= name;
//     }
//     String getName(){
//         return this.name;
//     }
// }







// / OOPS

// import java.util.*;
// public class OOPS {
//    public static void main(String[]args){
//        Pen p1= new Pen();
//        p1.Setcolor("blue");
// //        p1.color="yellow";
//        System.out.println(p1.color);
// //        p1.tip=23;
// //        System.out.print(p1.tip);
//    }
// }
// class Pen{
//    String color;
//    int tip;
//    void Setcolor(String newcolor){
//        color=newcolor;
//    }
//    void SetTip(int newtip){
//        tip=newtip;
//    }

// }

// public class OOPS {
//    public static void main(String[]args){
//  pen p1=new pen();
// //  p1.color="yellow";
//        p1.Setcolor("blue");
//  System.out.print(p1.color);
//    }
// }
// class pen {
//    int tip;
//    String color;
//    void Setcolor(String newcolor){
//        color=newcolor;
//    }
//    void SetTip(int newTip){
//        tip=newTip;
//    }
//        }
// public class OOPS {
//    public static void main(String[]args){

//    }
// }
// class pen{
//    int tip; String color;
//    int GetTip(){
//        return this.tip;
//    }
//    String GetColor(){
//        return this.color;
//    }
//    void SetColor(String newColor){
//        color=newColor;
//    }
//    void SetTip(int newTip){
//        tip=newTip;
//    }
// }

// /// basic oops concept

// class Pen{
//    int tip;
//    String color;
//    void setnewColor(String newColor){
//        color=newColor;
//    }
//    void setnewTip(int newTip){
//        tip=newTip;
//    }
// }

// public class OOPS {
//    public static void main(String[]args){
//        Pen p1=new Pen();
// //        p1.color="yellow";
// //        p1.tip=8;
//        p1.setnewColor("pink");
//        p1.setnewTip(7);
//        System.out.println(p1.color);
//        System.out.println(p1.tip);
//    }
// }
// ////// Getters and Setters
// class Pen{
//     int tip;
//     String color;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setnewColor(String newColor){
//         color=newColor;
//     }
//     void setnewTip(int newTip){
//         tip=newTip;
//     }
// }

// public class OOPS {
//    public static void main(String[] args){
//        Pen p1=new Pen();
//       p1.setnewTip(9);
//       System.out.println(p1.getTip());
//    }
// }

// /// creating constructor and encapsulation

// class Student{
//    int roll;
//    String name;

//    Student (String name){
//        this.name=name;
//    }
// }


// public class OOPS {
//    public static void main(String[]args){
//        Student s1= new Student("Hitesh");
//        System.out.println(s1.name);

//    }
// }


// // copy constructor

// class student{
//    String name;
//    int rollNo;
//    String password;
//    int marks[];
//    student (student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.rollNo=s1.rollNo;
//        this.password=s1.password;
//        this.marks=s1.marks;
//    }
//    student(String name){
//        marks=new int[3];
//        this.name=name;
//    }
//    student(){
//        marks=new int[3];
//        System.out.println(" constructor is called");
//    }
//    student (int rollNo){
//        marks=new int[3];
//        this.rollNo=rollNo;
//    }
// }

// public class OOPS {
//    public static  void main(String[] args){
//  student s1= new student();
//  s1.name= "Hitesh saini";
//  s1.rollNo=123;
//  s1.password="277092006";
//  s1.marks[0]=90;
//  s1.marks[1]=100;
//  s1.marks[2]=99;
//  student s2=new student(s1);

//  for(int i=0; i<3; i++) {
//      System.out.println(s2.marks[i]);
//  }
//    }
// }

// /// Inharitance


// class Animal{
//    String color;
//    void Swim(){
//        System.out.println(" Swimming ");
//    }
//    void Eat(){
//        System.out.println(" FOOD is good ");
//    }
// }

// class Fish extends Animal{
//    int fins;
//    void Setfins(int newfins){
//        fins=newfins;
//    }
// }

// public class OOPS {
//    public static void main(String[] args){
// Fish shark =new Fish();
// shark.Eat();
// shark.fins=3;
// System.out.println(shark.fins);
//    }
// }


// //multi level inharitance;

// public class OOPS {
//    public  static void main(String[]args){
// dog dobby= new dog();
// dobby.eat();
//    }
// }


// class animal{
// void eat(){
//     System.out.println("khana kha rha hu");
// }
// void breathe(){
//     System.out.println("saans le rha hu");
// }
// }
// class mammels extends animal{
//    int legs;
// }
// class dog extends mammels{
//    String bread;
// }

// / single level inharitance
// public class OOPS {
//     public static void main(String[]args){
//         Fish shark= new Fish();
//         shark.eats();
//     }
// }
// class animal{
//     void eats(){
//         System.out.println(" khana kha rha hu");
//     }
//     void Breath(){
//         System.out.println("sans le rha hu");
//     }
// }
// class Fish extends animal{
//     int fins;

// }





// / hirarchical inharitance
// public class OOPS {
//    public static void main(String[]args){
//        birds pigeon =new birds();
//        pigeon.eat();
//        pigeon.fly();
//        pigeon.breathe();
//        mammels dog=new mammels();
//        dog.howMuch(3);
//        dog.walk();

//    }
// }
// class Animals{
//    void eat(){
//        System.out.println("har animal khata h yarr");
//    }
//    void breathe(){
//        System.out.println("sans to lege hi na ladle ");
//    }
// }
// class mammels extends Animals{
//    int legs;
//    void howMuch( int leg){
//        this.legs=leg;
//    }
//    void walk(){
//        System.out.println(" chalta hu be chutiye");
//    }
// }
// class birds extends Animals{
//    int fins;
//    void fly(){
//        System.out.println("udta hi firu en hawao me kahi ");
//    }
// }


// public class OOPS {
//    public static  void  main (String[]args){
//        Pen p1= new Pen();
//        p1.color="yellow";
//        System.out.println(p1.color);
// p1.setColor("blue");
//        System.out.println(p1.color);


//    }
//   static  class Pen {
//        int tip;
//        String color;
//        void setColor(String mewColor){
//            color = mewColor;
//        }
//        void setTip(int newTip ){
//            tip= newTip;
//        }
//    }

// }


// / Getters and setters
// public class OOPS {
//    public static void main(String[] args){
//        Pen p1= new Pen();
//        p1.color="yellow";
// //        System.out.println(p1.getColor());
//        p1.setColor("blue");
//        System.out.println(p1.getColor());
//    }
//   static class Pen{
//        String color;
//        int tip;
//        void setColor(String color){
//            this.color=color;
//        }
//        void  setTip(int  tip){
//            this.tip=tip;
//        }
//        String getColor(){
//            return this.color;
//        }
//        int getTip(){
//            return this.tip;
//        }
//    }
// }


/// CONTRUCOTOR
// public class OOPS {
//     static class Pen{
//         int tip;
//         String color;
//         Pen(String color,int tip){
//             this.color=color;
//             this.tip=tip;
//         }
//     }
//     public static void main(String[]args){
//         Pen p1= new Pen("yellow",6);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);
//     }
// }

// copy constructor

// public class OOPS{
//    static  class Student {
//         String name;
//         int roll_no;
//         String password;
//         int marks[];
//         Student(){
//             this.marks= new int[3];
//             System.out.println("constructor is called");
//         }
//        Student (String name){
//              this.marks= new int[3];
//    this.name=name;
//         }
//          Student(int roll_no){
//             this.roll_no=roll_no;
//             this.marks= new int[3];
//         }
//          Student (Student s1){
//             this.name=s1.name;
//             this.roll_no=s1.roll_no;
//             this.password=s1.password;
//            this.marks= s1.marks;
//         }
//      }
//      public static void main(String[]args){
//         Student s1= new Student();
//         s1.name="hitesh";
//   s1.roll_no=23;
//   s1.password="hit";
//   s1.marks[0]=90;
//   s1.marks[1]=100;
//   s1.marks[2]=99;
//   Student s2= new Student(s1);
// for(int i=0; i<3; i++){
//     System.out.println(s2.marks[i]);
// }


//      }
// }

/// Inheritance
//     class Animal {
//          String color;
//           int legs;
//              void  eats(){
//             System.out.println("Animal can eat ");
//            }
//             void  breathe(){
//             System.out.println("it can breathe ");
//            }

//      }
//       class Fish extends Animal{
//          String type;
//            void IsSwim(){
//             System.out.println(" tair skti h ladle ");
//          }
//       }
// public class OOPS{
//       public static  void main(String[]args){
//         Fish shark= new Fish();
//         shark.color="yellow";
//         System.out.println(shark.color);
//       }
// }

/// single level inharitance


// class  Animal{
//         String color;
//          void eat(){
//             System.out.println(" this animal can eat ");
//          }
//          void breathe(){
//             System.out.println(" this can breathe");
//          }
// }


// class Fish extends Animal{   // here  fish  extends- properties , methods  -> Animal
//       String type;
//       int  fins;

// void   isSwim(){
//       System.out.println(" this can swim");
// }
// }


// public class OOPS{ 
//       public static void main(String[]args){
//             Fish  shark= new  Fish();
//             shark.color="navy blue";
//              shark.eat();
//              shark.isSwim();
//              System.out.println(shark.color);
//       }

// }




///multi level inheritance


// class  Animal{
//       String color;
//        void  eats(){
//                System.out.println("  kha skte h ladle ");
//        }
//         void breathe(){
//             System.out.println("  sans to lege hi ladle ");
//         }
// }
//  class Mammel  extends  Animal{
//         int  height;
//             void  fly(){
//                   System.out.println(" ud nhi skte  laadle ");
//             }
//              void isSwim(){
//                    System.out.println("  naa hi ter skte ladle ");
//              }
//  }
   
//  class  Dog extends  Mammel{
//          void  bark(){
//               System.out.println(" kutta to bhokega hi laadle !! ");
//          }
//  }



// public class    OOPS{
//        public static  void main(String[] args){
//              Dog  germanDog = new Dog();
//              germanDog.fly();
//              germanDog.color= "yellow";
//              germanDog.bark();
//              germanDog.eats();
//               System.out.println(germanDog.color);
//        }
// }



/// Hierarchical inheritance



// class Animal{
//       String color;
//       void eat(){
//             System.out.println("kha skte h ");
//       }
//       void breathe(){
//             System.out.println("sans to lege hi  na ladle ");
//       }
// }

// class Mammel extends Animal{
//        String type;
//         void  walk(){
//             System.out.println("  chal to skte h hi ladle");
//         }
//          void run(){
//             System.out.println("bhag skte h ladle ");
//          }
// }
//  class Fish extends Animal{
//        String typeOfFish;
//         void  isSwim(){
//             System.out.println("ter skte h ladle ");
//         }
//  }
//   class Bird  extends  Animal{
//          String typeOfBird;
//           void fly(){
//             System.out.println("  ud skte h ladle ");
//           }

//   }
//  public class OOPS{
//       public  static void main(String[]args){
//             Bird pigeon = new Bird();
//             pigeon.eat();
//        pigeon.fly();
//        Fish  shark = new Fish();
//        shark.isSwim();
//        shark.eat();
//        shark.breathe();
//        Mammel  dog= new Mammel();
//         dog.run();
//         dog.eat();
//         dog.breathe();
//       }

//  }



//// hybrid level intheritance 
//  class Animal{
//       String color;
//        void  eat(){
//             System.out.println("kah skte h ladle ");
//        }
//         void breathe(){
//             System.out.println("sans to lege hi");
//         }
//  }

//  class Fish extends Animal{
//       String typeOfFish;
//        void  isSwim(){
//             System.out.println(" ter skte h");
//        }
//  }
//  class  Mammel extends Animal{
//        String typeOfMammel;
//         void walk(){
//   System.out.println("  this can walk");

//         }
//          void  run(){
//              System.out.println(" bhag to skte h ladle ");
//          }
//  }
//    class  Dog extends Mammel{
//        String breed;
//          void  bark(){
//             System.out.println(" bhnkh  skta h ");
//          }
//    }

//     public class OOPS{
//       public static void main(String[]args){
//               Dog german= new Dog();
//                german.bark();
//                german.breathe();
//                german.eat();
//              Mammel  cow = new Mammel();
//               cow.run();
//                cow.eat();
//                 Fish tuna = new Fish();
//                  tuna.eat();
//                  tuna.breathe();
//                  tuna.isSwim();
      
//       }
//     }




/// compile time polymorphism / method overloading /  state:-static 






class Calculator{
      public int  sum(int a, int b){
   return a+b;
      }
      public float sum( float a, float b){
          return a+b;
      }
      public  long sum(long a, long b){
          return a+b;
      }
}

public class OOPS{
      public static void main(String[]args){
  Calculator calc= new Calculator();
  System.out.println(calc.sum(9.2f, 6.90f));
  System.out.println(calc.sum(2, 3));
  System.out.println(calc.sum(20383833,89238433 ));

      }
}








































































































































