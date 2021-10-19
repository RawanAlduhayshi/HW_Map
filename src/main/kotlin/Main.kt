fun main(args: Array<String>) {
    var todoMap = mutableMapOf("key1" to "Drinking","key2" to "Eating","key3" to "Working")
    todoMap["key4"]="Waking"
    todoMap["key1"]="Workout"
    todoMap.remove("key2")
    println(todoMap)
}