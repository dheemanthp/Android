/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun dummyfunction() {
    println("dheemanth here jumped to func")
}

fun doubleMe(x: Int):Int {
   return 2*x;
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
   //If-else
   val aa: Int = 2;
   val bb: Int = 5;
   val max: Int;
   if(aa > bb) {
       max = aa;
   } else{
       max = bb;
   }
   println(" the value of max is " + max);
   //use of when
  val value: Int = 1;
  when(value) {
      1 -> println(" value is 1");
      2 -> println(" value is 2");
      else -> {
          println(" value is neither 1 or 2");
      }
  }//close when
  // use of for loop
  val listchecker: MutableList<Int> = mutableListOf(11,22,33,44)
  for(i in listchecker) {
      println(i);
  }
  //print the index and value in a given list
  val items = listOf(1, 22, 83, 4)
  for ((indexes, v) in items.withIndex()) {
      println("the element at $indexes is $v")
  }  
  //While Loop and Do-While Loop
  var x: Int = 0;
  while(x <=10) {
      println("the loop values are " + x)
      x++;
  }
  //calling a function that returns a value in kotlin
  println(" calling a function that returns a value in kotlin " + doubleMe(10))
  
   
   //Create a data object
   class student {
       
       
   }
   
   
   //Exception Handling try, catch , finally
    try{
        var num: Int = 2;
        var str: String = "hi how are you"
        //try to create an exception here
        //In the above piece of code, we have declared a String and 
        //later tied that string into the integer, which is actually a runtime exception.
        str.toInt();
    } catch (e:Exception) {
        e.printStackTrace();
    } finally{
        println("Exception handling in finally");
    }
    
}
