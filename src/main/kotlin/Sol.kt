import java.util.LinkedList

class Sol {

    // 1342 completed
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

    fun middleNode(head: LinkedList<Int>) {
        // найти размер списка
        // с помощью сортировки понять какой в середине
        // получить его индекс и вывести его в консоль
        for (element in head) {
            
        }
    }

    // completed
    fun isLeapYear(year: Int): Boolean {
        return if ((year % 4) == 0) return true else false
    }


    fun spinWords(sentence: String): String {
        var newString = sentence.split(" ").toString()
        return newString

        // слово из пяти букв
        // оволс из пяти букв

    }

    // upSpeed = 10, downSpeed = 9, dHeight = 50, —
    /**
     * Рассчитыва...
     */
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

    // completed
    fun simpleMultiplication(n: Int): Int {

        return if ((n % 2) == 0) {
            n * 9
        }
        else {
            n * 8
        }
    }

    fun maxMultiple(d: Int, b: Int): Int {
        var n = b
        var count = 0
        do {
            n -= d
            count++
            if (n == 1 || (count * d) <= b) count *= d
        } while (n != 1 || count <= n)
        return count
        }
    }
