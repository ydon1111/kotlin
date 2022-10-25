import java.lang.IllegalArgumentException

fun aggregate(numbers:IntArray, op:(Int, Int)-> Int):Int{
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")


    for (i in 1..numbers.lastIndex) result = op(result,numbers[i])

    return result
}

fun sum(numbers: IntArray) =
    aggregate(numbers,{result, op-> result + op})

fun max(numbers: IntArray) =
    aggregate(numbers,{result,op->if(op > result) op else result})


fun main(){
    println(sum(intArrayOf(1,2,3)))
    println(max(intArrayOf(1,2,3)))
}

