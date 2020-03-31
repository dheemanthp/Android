/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun dummyfunction() {
    println("dheemanth here jumped to func")
}

//Live Demo
fun main(args: Array<String>) {
   //various data types
   val a: Int = 10000
   val d: Double = 100.00
   val f: Float = 100.00f
   val l: Long = 1000000004
   val s: Short = 10
   val b: Byte = 1
    
   println("Your Int Value is "+a)
   println("Your Double  Value is "+d)
   println("Your Float Value is "+f)
   println("Your Long Value is "+l)
   println("Your Short Value is "+s)
   println("Your Byte Value is "+b)
   
   //calling a dummy function
   dummyfunction()

   //character
   var c: Char = 'a'
   println("$c") 
   //string
   var str: String = " dheemanth is great"
   println("$str")
   //Integer Array
   var numbersArray: IntArray = intArrayOf(1,12,3,4,5);
   println("The second member if Integer array is " + numbersArray[1])

   //Collections
   //immutable collection (which means lists, maps and sets that cannot be editable)
   val list: MutableList<Int> = mutableListOf(4,5,6);
   list.add(7);
   println(" the list is " + list);
   
   //mutable collection (this type of collection is editable)
   val immlist: List<Int> = list;
   println("the immutable list is " + immlist);
   println("the count is " + immlist.count())
   
   //Collection Methods
   val listtemp = listOf(1,2,3,4)
   print("list temp is " + listtemp + " the first element is " + listtemp.first())
   println (" the last element is " + listtemp.last())
   val hashmaptemp = hashMapOf("one" to 1,"two" to 2)
   println("hashmap temp is " + hashmaptemp)
   val hashsettemp = hashSetOf("one", "two", "three")
   println("hashset temp is " + hashsettemp)
   
   //print all the elements in the Range
   for(j in 1..4) {
       println(j);
   }
   //check if a value falls in a given Range
   val check: Int = 2;
   if(check in 1..10) {
       println(" yes the value " + check + " falls in range ")
   }
   
   //Control Flow
    
    
}
