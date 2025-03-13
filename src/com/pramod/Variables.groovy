package com.pramod

/**
 * @author pramodkumar
 */

class Variables {

    static void main(String[] args) {

        // Method 1 (With keyword def)
        def name = "pramod"
        print("My name is ${name}")

        // Method 2 - (With data type)
        String profession = "Engineer"
        print("\nMy profession is ${profession}")
        int age = 32
        print("\nMy age is ${age}")
    }
}

/*
// Method 3: (Dynamically typed)
age = 33
print("Age is : ${age}")
*/
