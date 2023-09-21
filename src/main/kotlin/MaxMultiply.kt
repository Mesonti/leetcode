class MaxMultiply {

    fun maxMultiple(firstInt: Int, secondInt: Int): Int {
        var newInt = secondInt // 0 = 4
        var count = 0
        do {
            newInt -= firstInt // 4 - 2 = 2
            count++ // 1
            if (newInt == 1 || (count * firstInt) <= secondInt) count *= firstInt //
        } while (newInt != 1 || count <= newInt)
        return count
    }

}