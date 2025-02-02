# Array_and_ArrayList

## 📖 Project Description
This Java project covers three tasks related to arrays and ArrayLists:
1. **Separating Even and Odd Numbers** - Accept numbers from the user and store them in separate even and odd arrays.
2. **Finding Neighboring Numbers with the Smallest Distance** - Identify two adjacent numbers in an array with the smallest absolute difference and return the index of the first number.
3. **Converting Between Arrays and ArrayLists** - Convert an array to an ArrayList and vice versa.

## 📂 Project Structure
Array_and_ArrayList/:
- │── Main.java
- │── EvenOddArray.java
- │── SmallestDistance.java
- │── ArrayConversion.java
- │── README.md

##📌 File Descriptions
DESCRIPTION:
1️⃣ Main.java (Main Program Entry)
This file contains the main method, which serves as the entry point of the program.
It calls functions from other Java files based on user input.
Ensures modular execution of each feature.
✅ Functions:

public static void main(String[] args): Calls respective methods based on user choice.
2️⃣ EvenOddArray.java (Even & Odd Number Separation)
Accepts numbers from the user and separates them into even and odd arrays.
Uses loops and conditional checks to classify numbers.
✅ Functions:

public static void separateEvenOdd():
Accepts numbers from the user.
Stores even numbers in an even[] array.
Stores odd numbers in an odd[] array.
Displays the contents of both arrays.
3️⃣ SmallestDistance.java (Finds the Closest Neighbors)
Finds two neighboring numbers in an array that have the smallest absolute difference.
Returns the index of the first number.
✅ Functions:

public static void findSmallestDistance():
Accepts an array from the user.
Calculates the absolute difference between adjacent elements.
Identifies the smallest difference and returns the index.
4️⃣ ArrayConversion.java (Array ⇄ ArrayList Conversion)
Converts a standard Java array into an ArrayList and vice versa.
Demonstrates how to use ArrayList in Java.
✅ Functions:

public static void arrayToArrayList(int[] arr): Converts an array to an ArrayList<Integer>.
public static void arrayListToArray(ArrayList<Integer> list): Converts an ArrayList<Integer> back to an array.
---

## 🛠️ **How to Run**:
- Go to Command Prompt then navigate to your project folder using cd "path_to_your_folder"
- then to complie the Main.java file  use command -> javac Main.java
- Then run the code using -> java Main
- Enjoy coding...



