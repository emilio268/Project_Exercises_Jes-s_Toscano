import Logic

class menu(){

    val exc = Logic()
    var opt = 0

    fun OP(){

        do {


            println("1. Calculate the area of a triangle.\n" +
                    "2. Enter two numbers by keyboard and add them.\n" +
                    "3. Enter a number and display the number squared.\n" +
                    "4. Write an algorithm that converts from euros to dollars.\n" +
                    "5. Write an algorithm that asks for the side of a square and returns the value of the area and the\n" +
                    "perimeter.\n" +
                    "6. Write an algorithm that determines the area and volume of a cylinder.\n" +
                    "7. Make an algorithm that reads the radius of a circle and writes its length and\n" +
                    "the area (pi*r)^2 of the inscribed circle.\n" +
                    "8. Calculate the average of three (3) numbers entered by keyboard.\n" +
                    "99. Exit")

            println("Enter your option")
            opt = readLine()?.toIntOrNull() ?:0

            when (opt){
                1-> exc.exercise1OP()
                2-> exc.exercise2OP()
                3-> exc.exercise3OP()
                4-> exc.exercise4OP()
                5-> exc.exercise5OP()
                6-> exc.exercise6OP()
                7-> exc.exercise7OP()
                8-> exc.exercise8OP()
                else -> println("error try again")
            }

        }while (opt != 99)
    }

    fun CO(){

        do {

            println("1. Write an algorithm to find out if the number entered on the keyboard is positive or negative.\n" +
                    "2. Write an algorithm that receives two numbers by keyboard and says which is the largest and which is the\n" +
                    "minor.\n" +
                    "3. Write a program that reads three positive integers and calculates and prints in\n" +
                    "display the smallest and largest of them.\n" +
                    "4. Given two numbers A and B, add them if A is less than B or else subtract them.\n" +
                    "5. Given two numbers A and B, find the quotient between A and B. Remember that division by zero\n" +
                    "is not defined, in this case a legend should appear announcing that the division is not\n" +
                    "possible.\n" +
                    "6. Given two numbers A and B, add them if at least one of them is negative, otherwise\n" +
                    "multiply them.\n" +
                    "7. Write an algorithm that determines if a year is a leap year or not. \n" +
                    "99. Exit")

            println("Enter your option")
            opt = readLine()?.toIntOrNull() ?:0

            when (opt){
                1-> exc.exercise1CO()
                2-> exc.exercise2CO()
                3-> exc.exercise3CO()
                4-> exc.exercise4CO()
                5-> exc.exercise5CO()
                6-> exc.exercise6CO()
                7-> exc.exercise7CO()
                else -> println("error try again")
            }

        }while (opt != 99)
    }

    fun CL(){

        do {

            println("1. Print all the multiples of 3 that are between 1 and 100.\n" +
                    "2. Print the odd numbers between 0 and 100.\n" +
                    "3. Print the even numbers from 1 to 100.\n" +
                    "4. Write a program that prints on the screen the squares of the numbers from 1 to 30.\n" +
                    "5. Write a program that adds the squares of the first hundred natural numbers,\n" +
                    "displaying the result on the screen.\n" +
                    "6. Given two natural numbers, the first less than the second, generate and display all the\n" +
                    "numbers between them in ascending sequence.\n" +
                    "7. Add all the numbers that are typed on the keyboard as long as it is not zero.\n" +
                    "99. Exit")

            println("Enter your option")
            opt = readLine()?.toIntOrNull() ?:0

            when (opt){
                1-> exc.exercise1CL()
                2-> exc.exercise2CL()
                3-> exc.exercise3CL()
                4-> exc.exercise4CL()
                5-> exc.exercise5CL()
                6-> exc.exercise6CL()
                7-> exc.exercise7CL()
                else -> println("error try again")
            }
        }while (opt != 99)
    }

}

fun main(){println("Welcome to the system menu")

    val exc = Logic()
    val men = menu()
    var opt = 0

    do {

        println("Option menu \n 1. Operation exercises \n 2. Conditional Exercises \n 3. Cycles exercises \n 99.Exit")

        println("Enter your option")
        opt = readLine()?.toIntOrNull() ?:0

        when (opt){
            1-> men.OP()
            2-> men.CO()
            3-> men.CL()
            99 -> println("Thanks for using the system.")
            else -> println("error try again")
        }

    }while (opt != 99)}




