import foo.bar.util.readInt
import kotlin.random.*

fun main() {
    val num = Random.nextInt(1, 101)

    while (true) {
        print("Guess number(1..101) : ")
        val guess = readInt()!!.toInt()

        val message =
            if (guess < num) println("Too small")
            else if (guess > num) println("Too big")
            else break
        println(message)
    }
}


