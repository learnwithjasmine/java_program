// class jas {
//     public static void main(String[] args) {
//         int num1 = 1;
//         int num2 = 2;
//         int result = num1 + num2;
//         System.out.print(result);
//     }
// }

// 

// overloading

// class Adding {
//     void add(int x, int y) {
//         int sum = x + y;
//         System.out.println("sum of two nums:" + sum);
//     }

//     void add(int x, int y, int k) {
//         int sum = x + y + k;
//         System.out.println("sum of three nums:" + sum);
//     }

//     public class jas {
//         public static void main(String[] args) {
//             Adding obj = new Adding();
//             obj.add(2, 3);
//             obj.add(3, 4, 5);
//         }
//     }
// }

// method overriding

// class Parent {
// public void display() {
// System.out.println("Displaying method from Parent class");
// }
// }

// class Child extends Parent {
// public void display() {
// System.out.println("Displaying method from Child class");
// }
// }

// class grandChild extends Parent {
// public void display() {
// System.out.println("Displaying method from grandchild class");
// }
// }

// public class jas {
// public static void main(String[] args) {
// Parent parentObj = new Parent();
// parentObj.display();

// Child childObj = new Child();
// childObj.display();

// grandChild grandchildObj = new grandChild();
// grandchildObj.display();
// }
// }

// abstract class shape {
//     shape() {
//         System.out.println("shape constructor");
//     }

//     abstract void print();
// }

// class circle extends shape {
//     void print() {
//         System.out.println("circle draw");
//     }
// }

// public class Test {
//     public static void main(strings[] args) {
//         shape obj = new circle();
//         obj.print();
//     }
// }


