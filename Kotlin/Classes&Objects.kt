
//Nested inner class
class Outer2 {
   private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
   inner class Nested2 {
      fun foo() = welcomeMessage
   }
}

/*
 * We can write a Nested class this way too
class Outer {
   class Nested {
      fun foo() = "Welcome to The TutorialsPoint.com"
   }
}*/

class Outer1 {
   class Nested1 {
      fun foo() : String {
          return "Welcome to The TutorialsPoint.com"
      }
   }
}

class Kotlin {
    
 private val id: Int = 10;
 private val name: String = "sham";
 private val marks: Float = 0F;
    
    
 //constructor
 fun Kotlin() {
     //id = 10;
     //name = "dheemz"
     //marks = 100.0;
     
 }
 
 //member function
 fun printMe(){
     println("the student details are ")
     println(id)
     println(name)
     println(marks)
 }
}

interface Switcher {
    fun on(): String
}

interface Human {
   fun think()
}

//Constructor in a class depicted here
class Person(val firstName: String, var age: Int) {
}

//Secondary Constructor in a class depicted here
class PersonSecondaryConstructor(val firstName: String, var age: Int) {
    val message : String = "Hey!!"
    //secondary constructor
    constructor(firstName: String,age: Int , message : String) : this(firstName, age){
        println(" the message is " + message)
    }
}

   //typeAlias
	typealias NodeSet = Set<Outer2>
	typealias FileTable<K> = MutableMap<K, MutableList<Outer2>>


fun main() {
   val kotlin = 5.0
   println(kotlin)
   val obj = Kotlin()
   obj.printMe()
   //Calling Nested Class
   val demo = Outer1.Nested1().foo() // calling nested class method
   println(demo)
   //calling Nested inner class
   val demotry = Outer2().Nested2().foo() // calling inner nested class method
   println(demotry)

   //Anonymous Object Example 1
    val powerSwitch = object : Switcher {
        override fun on(): String {
            return "hi how are"
        }
    }
    println(" calling the interface overriden method " + powerSwitch.on())
   
   //Anonymous Object Example 2
     val programmer = object: Human {  // creating an instance of the interface 
      override fun think() { // overriding the think method
         println("I am an example of Anonymous Inner Class ")
      }
   }
   println(" calling the interface overriden method " + programmer.think())
   


    
   //Creating an object and calling the constructor
   val person1 = Person("TutorialsPoint.com", 15)
   println("person1 -> First Name = ${person1.firstName}")
   println("person1 -> Age = ${person1.age}") 
   
   //creating an object and calling the primary constructor , prints the default message
   val person2 = PersonSecondaryConstructor("dheemanth" , 99 )
   println("person2 -> ${person2.message}")
   println("person2 -> ${person2.firstName}")
   println("person2 -> ${person2.age}")
   
   //Any number of secondary constructors can be created, 
   //however, all of those constructors should call the primary constructor directly or indirectly.
   //creating an object and calling the secondary constructor , prints the passed message
   val person3 = PersonSecondaryConstructor("dheemanth" , 99 , "whatsup") //this will invovke secondary constructor
   println("person3 -> ${person3.message}") // this will print Hey !! 
   println("person3 -> ${person3.firstName}")
   println("person3 -> ${person3.age}")
   

}
