//https://www.tutorialspoint.com/kotlin/kotlin_inheritance.htm
//https://kotlinlang.org/docs/reference/classes.html

//primary constructor
open class Professor(var id:Int,var name:String) {
    
    init {
        println("Professor initializer block that prints ${name}")
 }
	
 open fun think() {
     print("Hey!! i am parent ")
   }
     
 }
    


class Student : Professor {
    
    //secondary constructor
    constructor(id:Int,name:String):super(id,name) 
    var Smarks:Int = 50;
   
 init {
        println("Student initializer block that prints ${name}  ${Smarks}")
 }
 //private val id: Int = 10;
 //private val name: String = "sham";
 override fun think() {
     print("Hey!! i am child ")
   }
 }
    


fun main() {
   //val prof = Professor(10,"dheemz")
   val stud = Student(20,"seetharam")
   
   //println("${prof.name}")
   println("${stud.name}")
   stud.think()
}
