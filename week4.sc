
//Create values
val x : Double = 42.354562
val y : Int = 3

//Round x
println(f"$x%1.2f")
 
//Left padding y
 println(f"$y%04.0f")
 
 //Factorial function
def fact(n:Int):Int = if(n<2) 1 else n*fact(n-1)
fact(5.2.toInt)