package learnTheory

  open class Animal(val name:String, var weight:Float, var habitat:String) {
     open fun eat(){
        println("I'm eating")

    }
   open fun run (){
        println("I'm running")
    }
}