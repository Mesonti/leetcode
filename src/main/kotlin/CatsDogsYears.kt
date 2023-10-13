class CatsDogsYears {

    fun calculateYears(years: Int): List<Int> {
        var arrayOfYears = arrayOf(years, 15, 15)
        var countForLoop = years
            do {
                if (years == 1) break
                if (countForLoop == 9) {
                    arrayOfYears[1] += 9
                    arrayOfYears[2] += 9
                }
                if (countForLoop <= 8) {
                    arrayOfYears[1] += 4
                    arrayOfYears[2] += 5
                }
                --countForLoop
            } while (countForLoop != 0)
        return arrayOfYears.toList()
    }
}