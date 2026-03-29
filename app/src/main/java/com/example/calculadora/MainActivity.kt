package com.example.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            calculadora()
        }
    }
}

@Composable
fun calculadora() {
    var result by remember { mutableStateOf("") }
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier
            = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text(text = result, style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(20.dp))

            val buttons = listOf(
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
            )
            buttons.chunked(4).forEach { row ->
                Row {
                    row.forEach { button ->
                        Button(
                            onClick = { result = calculateResult(result, button) },
                            modifier = Modifier.weight(1f).padding(8.dp)
                        )
                        {
                            Text(button)
                        }
                    }
                }

            }
        }
    }
}

fun calculateResult(currentResult: String, input: String): String {

    return when (input) {
        "C" -> ""
        "=" -> {
            try {
                evaluarExpresion(currentResult)
            } catch (e: Exception) {
                "Error"
            }
        }
        else -> {
            if (currentResult == "Error") input else currentResult + input
        }
    }
}

fun evaluarExpresion(expresion: String): String {
    val operadores = listOf("+", "-", "*", "/")
    val operador = operadores.find { expresion.contains(it) } ?: return expresion

    val partes = expresion.split(operador)
    if (partes.size < 2 || partes[1].isEmpty()) return expresion

    val num1 = partes[0].toDoubleOrNull() ?: 0.0
    val num2 = partes[1].toDoubleOrNull() ?: 0.0

    val resultado = when (operador) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else return "Error"
        else -> 0.0
    }
    return if (resultado % 1 == 0.0) resultado.toInt().toString() else resultado.toString()
}