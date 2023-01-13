package com.practice

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Input1:"
def userInput1 = br.readLine().toInteger()
print "Input2:"
def userInput2 = br.readLine().toInteger()

println "\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit \n"
println "Enter your choice : "
def Choice = br.readLine().toInteger()

while(Choice>0)
{
    switch (Choice)
{
    case 1:
        def add = userInput1 + userInput2
        println "Addition: $add"
        break

    case 3:
        def mul = userInput1 * userInput2
        println "Multiplication: $mul"
        break

    case 2:

        def sub = userInput1 - userInput2
        println "Substraction: $sub"
        break

    case 4:

        if(userInput2!=0)
        {
            def div = userInput1/userInput2
            println "Division: $div"
        }
        else
        {
            println "both numbers should be non zero "
        }
        break

    case 5:
            return

}
    println "\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit \n"
    println "Enter your choice : "
     Choice = br.readLine().toInteger()

}



