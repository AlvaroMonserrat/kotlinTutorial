
//Kotlin
import kotlin.collections.*



 fun main(args: Array<String>){
	 
	 var a = 1
	 var b = 1
	 
	 var max = if (a > b) a else b
	 
	 println(max)

	 when (max){
		 1 -> print("Maximo igual a 1")
		 2,3 -> print("Maximo 2 o 3")
		 else ->{
			 println("Error")
		}
	}
	 
	 for (i in "Hola"){
		println(i)   
	}
	 
	var i: Int = 10
	var s: String = "\nHola"
	print(i) 
	print(s + " World\n")
	println(sum(6,6))
	println("END")
	println(double(10))
	
	var nums = listOf(1, 2, 3, 4)
	for(j in nums)
	{
		println(j)
	}
	 
}

fun sum(a: Int, b: Int): Int{
	return a+b
}
	
fun double(x: Int) = 2*x

