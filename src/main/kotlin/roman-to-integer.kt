class RomanToInteger {
    fun romanToInt(s: String): Int {

        var normalInt = 0
        for (integer in s) {
            // split?
            // think about reading massive of string for delimeters on roman parts
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