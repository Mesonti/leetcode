// function return count steps for goal target
class NumberToStep {
    fun numberOfSteps(num: Int): Int {
        var newNum = num
        var steps = 0
        while (newNum > 0) {
            steps++
            if (newNum % 2 == 0) {
                newNum /= 2
            }
            else {
                newNum -= 1
            }
        }
        return steps
    }

}