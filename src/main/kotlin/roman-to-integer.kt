class RomanToInteger {

    var four = 0
    var nine = 0
    var fourteen = 0

    fun printNum() {
        println(four)
        println(nine)
        println(fourteen)
    }


    // поместить в HashMap ключ(цифра)=значение(римское число)
    var mapOfRomanInteger: Map<Int, String> = mapOf(1 to "I",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L",
        90 to "XC",
        100 to "C",
        400 to "CD",
        500 to "D",
        900 to "CM",
        1000 to "M")

    fun romanToInt(romanInteger: String): Int {
        // M CM XC IV
        // M CM XC IV 1000 + 900 + 90 + 4
        // IV — 4, IX - 9
        // XL - 40, XC — 90
        // CD — 400, CM — 900
        var result = 0

        var prevValue = 0
        var currentValue = 0

        for (integer in romanInteger) {
            when (integer) {
                'I' -> { currentValue = 1 }
                'V' -> { currentValue = 5 }
                'X' -> { currentValue = 10 }
                'L' -> { currentValue = 50 }
                'C' -> { currentValue = 100 }
                'D' -> { currentValue = 500 }
                'M' -> { currentValue = 1000 }

            }
        }
        return currentValue
    }
}


/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
IV = 4
IX = 9
XL = 40
C = 90
CD = 400
CM = 900
*/

class Solution1 {
    fun romanToArabic(romanInteger: String): Int {
        var arabicNumber = 0
        romanInteger.forEachIndexed { index, element ->
            var nextChar = '_'
            if (index + 1 > romanInteger.length - 1) nextChar = '_' else nextChar = romanInteger[index + 1]
            when (element) {
                'I' -> if(nextChar == 'V' || nextChar == 'X') arabicNumber -= 1 else arabicNumber += 1
                'V' -> arabicNumber += 5
                'X' -> if (nextChar == 'L' || nextChar == 'C') arabicNumber -= 10 else arabicNumber += 10
                'L' -> arabicNumber += 50
                'C' -> if (nextChar == 'D' || nextChar == 'M') arabicNumber -= 100 else arabicNumber += 100
                'D' -> arabicNumber += 500
                'M' -> arabicNumber += 1000
                else -> arabicNumber += 0
            }
        }
        return arabicNumber
    }
}