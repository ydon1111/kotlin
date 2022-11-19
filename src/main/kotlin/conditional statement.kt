fun main() {
//    val trafficLightColor = "Yellow"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> print("Invalid traffic-light color")

    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)


//    val trafficLightColor = "Amber"
//
//    val message = when (trafficLightColor) {
//        "Red" -> "Stop"
//        "Yellow", "Amber" -> "Proceed with caution."
//        "Green" -> "Go"
//        else -> "Invalid traffic-light color"
//    }
//    println(message)
}



