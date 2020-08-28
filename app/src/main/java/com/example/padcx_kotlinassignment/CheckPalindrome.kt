package com.example.padcx_kotlinassignment

import java.util.*


fun main(args: Array<String>) {
    //Input Stream
    val sc = Scanner(System.`in`)

    //Input String Value
    println("Enter String : ")
    val inString: String = sc.nextLine()
        checkPalindrome(inString)


}

private fun checkPalindrome(inString: String) {
    if (isPalindromeString(inString)) {
        println("$inString is a Palindrome String")

    } else {
        println("$inString is not a Palindrome String")
       enterAgainString()
    }
}

private fun enterAgainString(){
    val sc = Scanner(System.`in`)
    println("Enter String : ")
    val inString: String = sc.nextLine()
    checkPalindrome(inString)
}

fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)
    val reverseStr = sb.reverse().toString()
    return inputStr.equals(reverseStr, ignoreCase = true)
}