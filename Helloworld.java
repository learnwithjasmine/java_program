// class Helloworld {
//     public static void main(String[] args) {
//        int day=4;
//        switch(day){
//            case 1:
//                System.out.println("monday");
//                break;
//                 case 2:
//                System.out.println("tuesday");
//                break;
//                 case 3:
//                System.out.println("wednesday");
//                break;
//                 default:
//                System.out.println("invalid day");
//                break;
//        }  
//     }
// }

// class Helloworld{
//     public static void main(String[] args){
//         int i=1;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// import java.util.Scanner;
// class Helloworld{
//         public static void main(String[] args){
//             Scanner jasmine=new Scanner(System.in);
//             System.out.print("enter your name:");
//             String name=jasmine.nextLine();
//             System.out.println("Hello," + name);
//               jasmine.close();
//         }
// }

// import java.util.Scanner;
// class Helloworld {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);     
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("Hello, " + name);

//         System.out.print("Enter first number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = scanner.nextDouble();

//         double sum = num1 + num2;
//         double difference = num1 - num2;
//         double product = num1 * num2;

//         System.out.println("Sum: " + sum);
//         System.out.println("Difference: " + difference);
//         System.out.println("Product: " + product);

//         try{
//         double quotient = num1 / num2;
//          System.out.println("quotient: " + quotient);
//         }
//         catch(Exception e){
//             System.out.println("e.getMessage()");
//         }

//         scanner.close();
//     }
// }

// class Helloworld{
//     public static void main(String[] args){
//     int c=0;
//     for(int i=0;i<=10;i++){
//         System.out.println(c);
//         c+=1;
//     }
//    }
// }

// Hello World

// class Helloworld{
//     public static void main(String[] args)
//     {
//         System.out.println("Hello world!");
//     }
// }

// class Helloworld {
//     public static void main(String[] args) {
//         int row=2,col=2;
//         int k=0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                  System.out.println(k + " ");
//                  k++;
//             }
//         }

//     }
// }

// class Helloworld {
//     public static void main(String[] args) {
//         int row=2,col=2;
//         int [][] arr={{0,1},{2,3}};
//         for(int i=0;i < row;i++){
//             for(int j=0;j < col;j++){
//                 System.out.print(arr[i][j] + " ");

//             }
//         }

//     }
// }

// class Helloworld
// {
//     //Function to sort the array using bubble sort algorithm.
// 	public static void bubbleSort(int arr[], int n)
//     {
//         for(int i=0;i<n-1; i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
// }

// class Helloworld{
//     static void printfibonacci(int n){
//         int num1=0,num2=1,num3,i;
//         System.out.println("fibonacci series:");
//         for(i=0;i<n;i++){
//             System.out.print(num1 +" ");
//             int next=num1+num2;
//             num1=num2;
//             num2=next;3

//           } 
//         }
//     public static void main(String[] args){
//         printfibonacci(10);
//         }
//     }

// inertion sort

// class Helloworld {
//     public static void main(String[] args) {
//         int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int key = arr[i];
//             int j = i - 1;
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = key;
//         }
//         for (int j = 0; j < arr.length; j++) {
//             System.out.print(arr[j] + " ");
//         }
//     }
// }

// inbuilt methods

import java.util.Arrays;

class Helloworld {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Length of the array: " + array.length);
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Index of 3: " + index);
        int[] clonedArray = array.clone();
        System.out.println("Cloned array: " + Arrays.toString(clonedArray));
        Arrays.parallelSort(array);
        // System.out.println(Arrays.parallelSort(array));
    }
}

// sorted

// import java.util.Arrays;

// class Helloworld {
// public static void main(String[] args) {
// int[] array = { 4, 2, 9, 6, 5 };
// Arrays.sort(array);
// System.out.println(Arrays.toString(array));
// }
// }
