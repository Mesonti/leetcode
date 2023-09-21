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
    var mapOfRomanInteger: Map<Int, String> = mapOf(1 to "I", 4 to "IV", 5 to "V",
        9 to "IX", 10 to "X", 40 to "XL", 50 to "L", 90 to "XC", 100 to "C",
        400 to "CD", 500 to "D", 900 to "CM", 1000 to "M")

    fun romanToInt(romanInteger: String): Int {
        // M CM XC IV
        // M CM XC IV 1000 + 900 + 90 + 4
        // IV — 4, IX - 9
        // XL - 40, XC — 90
        // CD — 400, CM — 900
        var normalInt = 0
        for (integer in romanInteger) {
            when (integer) {
                'I' -> { normalInt += 1 }
                'V' -> { normalInt += 5 }
                'X' -> { normalInt += 10 }
                'L' -> { normalInt += 50 }
                'C' -> { normalInt += 100 }
                'D' -> { normalInt += 500 }
                'M' -> { normalInt += 1000 }
            }
        }
        return normalInt
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