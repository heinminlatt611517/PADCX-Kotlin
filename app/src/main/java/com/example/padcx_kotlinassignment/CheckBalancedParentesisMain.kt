package com.example.padcx_kotlinassignment

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    do {
        print("Please enter BalancedParentheses number =>")
        val value = scanner.next()
        println("$value :"+checkBalancedParentesis(value))
    }while (checkBalancedParentesis(value)?.equals("Not Balanced")!!)
}

fun checkBalancedParentesis(expr: String): String? {
    if (expr.isEmpty()) return "Balanced"
    val stack = Stack<Char>()
    for (i in 0 until expr.length) {
        val current = expr[i]
        if (current == '{' || current == '(' || current == '[') {
            stack.push(current)
        }
        if (current == '}' || current == ')' || current == ']') {
            if (stack.isEmpty()) return "Not Balanced"
            val last = stack.peek()
            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') stack.pop() else return "Not Balanced"
        }
    }
    return if (stack.isEmpty()) "Balanced" else "Not Balanced"
}
