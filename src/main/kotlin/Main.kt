fun main(args: Array<String>) {
    fun romanToInt(s: String): Int {
        var number = 0
        var index = 0
        while (index < s.length) {
            when (s[index]) {
                'I' -> {
                    if (index < s.length - 1) {
                        when (s[index + 1]) {
                            'V' -> {
                                number += 4
                                index++
                            }

                            'X' -> {
                                number += 9
                                index++
                            }

                            else -> number += 1
                        }
                    } else number += 1
                }

                'V' -> number += 5
                'X' -> {
                    if (index < s.length - 1) {
                        when (s[index + 1]) {
                            'L' -> {
                                number += 40
                                index++
                            }

                            'C' -> {
                                number += 90
                                index++
                            }

                            else -> number += 10
                        }
                    } else number += 10
                }

                'L' -> number += 50
                'C' -> {
                    if (index < s.length - 1) {
                        when (s[index + 1]) {
                            'D' -> {
                                number += 400
                                index++
                            }

                            'M' -> {
                                number += 900
                                index++
                            }

                            else -> number += 100
                        }
                    } else number += 100
                }

                'D' -> number += 500
                'M' -> number += 1000
            }
            index++
        }
        return number
    }

    print(romanToInt("MCMXCIV").toString())
//    val stringBuilder1 = StringBuilder("Suhail")
//    println(stringBuilder1.deleteCharAt(2))
//    println(stringBuilder1.length)
//    println(stringBuilder1.deleteAt(0))
//    println(stringBuilder1.length)
}