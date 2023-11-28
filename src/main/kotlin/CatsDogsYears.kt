class CatsDogsYears {


    // 10
    // 2
    fun calculateYears(humanYears: Int): List<Int> {
        var arrayOfYears = arrayOf(humanYears, 15, 15)
        var countOfPeriod = 0
        while (countOfPeriod != humanYears) {
            countOfPeriod++
            if (countOfPeriod == 2) {
                arrayOfYears[1] += 9
                arrayOfYears[2] += 9
            }
            if (countOfPeriod >= 3) {
                arrayOfYears[1] += 4
                arrayOfYears[2] += 5
            }
        }
        return arrayOfYears.toList()
    }

}