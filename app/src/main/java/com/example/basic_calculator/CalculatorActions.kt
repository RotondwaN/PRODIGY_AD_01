package com.example.basic_calculator

sealed class CalculatorActions{
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculation: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}
