// function is return count of days for growth one plant
class GrowingPlant {

    fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
        var daysCount = 0
        var growingSpeed = 0
        do {
            growingSpeed += upSpeed
            daysCount++
            println("After day ${daysCount - 1} --> $growingSpeed")
            if (growingSpeed != desiredHeight) {
                growingSpeed -= downSpeed
                println("After night ${daysCount - 1} --> $growingSpeed")
            }

        }
        while (growingSpeed != desiredHeight)
        return daysCount
    }

}