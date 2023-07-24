import kotlin.math.pow
import kotlin.math.PI

// OP = Operations exercises
// CO = Conditional Exercises
// CL = Cycles exercises

class Logic {

    fun exercise1OP(){

        println("Area of a Triangle")
        println("Enter the Base of the Triangle")
        val base = readLine()?.toDoubleOrNull() ?:0.0
        println("Enter the Height of the Triangle")
        val height = readLine()?.toDoubleOrNull() ?:0.0

        val area = (base * height) / 2

        println("The area of the triangle is: $area")
    }

    fun exercise2OP(){

        println("Add Two Numbers")
        println("Enter a number")
        val num1 = readLine()?.toDoubleOrNull() ?:0.0
        println("Enter another number")
        val num2 = readLine()?.toDoubleOrNull() ?:0.0

        val total = num1 + num2

        println("The total sum is: $total")

    }

    fun exercise3OP(){

        println("Square a Number")
        println("Enter a number")
        val num = readLine()?.toDoubleOrNull() ?:0.0


        val squared = num.pow(2)

        println("The number squared is: $squared")

    }

    fun exercise4OP(){

        println("Euro to Dollar Converter")
        println("Enter the amount of euros to convert")
        val euros = readLine()?.toDoubleOrNull() ?:0.0

        val converter = euros * 1.1128

        println("$euros in Dollars is: $converter")


    }

    fun exercise5OP(){

        println("Area and Perimeter of a Square")
        println("Enter one side of the Square")

        val side = readLine()?.toDoubleOrNull() ?:0.0

        val perimeter = side + side + side + side
        val area = side * side

        println("The perimeter of the square is $perimeter and the area is $area")

    }

    fun exercise6OP(){

        println("Area and Volume of a Cylinder")
        println("Enter the cylinder's radius")

        val radius = readLine()?.toDoubleOrNull() ?:0.0

        println("Enter the cylinder's height")
        val height = readLine()?.toDoubleOrNull() ?:0.0

        //Area

        val baseArea = PI * radius * radius
        val lateralArea = 2 * PI * radius * height
        val totalArea = 2 * baseArea + lateralArea

        //Volume

        val volume = baseArea * height

        println("The total area of the cylinder is $totalArea and the volume is $volume")

    }

    fun exercise7OP(){

        println("Length and Area of a Circle")
        println("Enter the circle's radius")

        val radius = readLine()?.toDoubleOrNull() ?:0.0

        val circumference = 2 * PI * radius

        val area = (PI * radius).pow(2)

        println("The circumference of the circle is $circumference, and the area is $area")


    }

    fun exercise8OP(){

        println("Calculate Average")
        print("Enter Grade 1: ")

        val grade1 = readLine()?.toDoubleOrNull() ?:0.0

        print("Enter Grade 2: ")

        val grade2 = readLine()?.toDoubleOrNull() ?:0.0

        print("Enter Grade 3: ")

        val grade3 = readLine()?.toDoubleOrNull() ?:0.0

        val average = (grade1 + grade2 + grade3) / 3

        println("The average of the three grades is: $average")


    }

    fun exercise1CO(){

        println("Positive or Negative Number")

        println("Enter a number")

        val num = readLine()?.toDoubleOrNull() ?:0.0

        if (num >= 0){
            println("The number entered is Positive")
        }else{
            println("The number entered is Negative")
        }

    }

    fun exercise2CO(){

        println("Greater or Lesser Number")

        println("Enter a number")
        val num1 = readLine()?.toDoubleOrNull() ?:0.0
        println("Enter another number")
        val num2 = readLine()?.toDoubleOrNull() ?:0.0

        if(num1 == num2){
            println("The numbers are equal")
        }else if (num1 > num2){
            println("$num1 is greater than $num2")
        }else{
            println("$num2 is greater than $num1")
        }

    }

    fun exercise3CO(){

        println("Greater or Lesser Number among three numbers")

        println("Enter the following positive integers")

        println("Enter a number")
        val num1 = readLine()?.toIntOrNull() ?:0
        println("Enter a second number")
        val num2 = readLine()?.toIntOrNull() ?:0
        println("Enter a third number")
        val num3 = readLine()?.toIntOrNull() ?:0

        var lesser = 0
        var greater = 0

        if(num1 > 0 && num2 > 0 && num3 > 0){
            if (num1 > num2 && num1 > num3){

                if (num2 > greater) {
                    greater = num2
                }
                if (num3 > greater) {
                    greater = num3
                }
                var lesser = num1

                if (num2 < lesser) {
                    lesser = num2
                }
                if (num3 < lesser) {
                    lesser = num3
                }
            }

            println("The greater number is $greater, and the lesser number is $lesser")

        }else{
            println("Error when entering data")
        }
    }

    fun exercise4CO(){

        println("Add or Subtract Two Numbers")

        println("Enter a number")
        val numA = readLine()?.toIntOrNull() ?:0
        println("Enter a second number")
        val numB = readLine()?.toIntOrNull() ?:0

        var total = 0


        if (numA < numB){
            total = numA - numB
            println("The total of the operation is $total")
        }else{
            total = numA + numB
            println("The total of the operation is $total")
        }

    }

    fun exercise5CO(){

        println("Find Quotient of Two Numbers")

        println("Enter a number")
        val numA = readLine()?.toIntOrNull() ?:0
        println("Enter a second number")
        val numB = readLine()?.toIntOrNull() ?:0

        var total = 0

        if (numA == 0 || numB == 0){
            println("Error, the operation cannot be performed")
        }else{
            total = numA / numB
        }

        println("The quotient of the division between $numA and $numB is $total")


    }

    fun exercise6CO(){

        println("Find Quotient of Two Numbers")

        println("Enter a number")
        val numA = readLine()?.toIntOrNull() ?:0
        println("Enter a second number")
        val numB = readLine()?.toIntOrNull() ?:0

        var total = 0

        if(numA < 0 || numB < 0){

            total = numA + numB

            println("The total of the operation is $total")

        }else{
            total = numA * numB

            println("The total of the operation is $total")
        }


    }

    fun exercise7CO(){

        println("Find Leap Year")

        println("Enter a Year")
        val year = readLine()?.toIntOrNull() ?:0

        var total = 0

        if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0){
            println("The entered year is a leap year")
        }else{
            println("The entered year is not a leap year")
        }

    }

    fun exercise1CL(){

        println("Print Multiples of 3")

        val num = 0

        for (num in 1..100){
            if((num % 3) == 0){
                println("$num is a multiple of 3")
            }
        }

    }

    fun exercise2CL(){

        println("Print Odd Numbers")

        val num = 0

        for (num in 1..100){
            if((num % 2) != 0){
                println("$num is odd")
            }
        }

    }

    fun exercise3CL(){

        println("Print Even Numbers")

        val num = 0

        for (num in 1..100){
            if((num % 2) == 0){
                println("$num is even")
            }
        }

    }

    fun exercise4CL(){

        println("Print Squares from 1 to 30")

        val num = 0

        for (num in 1..30){

            val square = num * num
            println("The square of $num is $square")
        }

    }

    fun exercise5CL(){

        println("Sum of Squares of Natural Numbers")

        val num = 0
        var total = 0

        for (num in 1..100){

            total += num * num
        }

        println("The total sum of the squares of the first 100 natural numbers is $total")

    }

    fun exercise6CL(){

        println("Numbers between Two Numbers")

        val num = 0

        println("Enter a number")
        val num1 = readLine()?.toIntOrNull() ?:0
        println("Enter a number greater than the previous one")
        val num2 = readLine()?.toIntOrNull() ?:0

        for (num in num1..num2){

            println("$num")
        }


    }

    fun exercise7CL(){

        println("Sum Multiple Numbers")

        var sum = 0
        var option = 0

        do {

            println("Enter a number")
            val num = readLine()?.toIntOrNull() ?:0

            sum += num

            println("Do you want to enter another number \n Yes: 1 \n No: 0")
            val option = readLine()?.toIntOrNull() ?:0

        }while (option != 0)

        println("The sum of all the entered numbers is: $sum")


    }
}
