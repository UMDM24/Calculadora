# 📱 **Jetpack Compose Calculator**
Una aplicación de calculadora básica e intuitiva desarrollada con Android Studio utilizando Jetpack Compose. Este proyecto implementa una interfaz moderna con una arquitectura sencilla, ideal para entender el manejo de estados en Kotlin.
##Características
  * Interfaz Declarativa: Construida totalmente con Jetpack Compose.
  * Gestión de Estados: Uso de mutableStateOf y remember para actualizar la pantalla en tiempo real.
  * Operaciones Soportadas: Suma, resta, multiplicación y división.
  * Diseño Adaptable: Uso de Surface y MaterialTheme para soporte de temas del sistema.
  * Validación de Errores: Manejo de divisiones por cero y errores de formato.

## 🛠️ **Tecnologías Utilizadas**
  * ![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white) **Android Studio:** Entorno de desarrollo 
  * ![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=flat&logo=kotlin&logoColor=white) **Kotlin:** Lenguaje principal de desarrollo.
  * ![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat&logo=jetpackcompose&logoColor=white)**Jetpack Compose:** Toolkit moderno para construir UI nativa.
  * ![Material Design 3](https://img.shields.io/badge/Material%20Design%203-7D5260?style=flat&logo=materialdesign&logoColor=white)**Material Design 3:** Estándares de diseño de Google.

## 📖 **Cómo funciona**
El núcleo de la lógica reside en dos funciones principales:
  1. calculadora(): La función Composable que define la estructura visual (Layout) mediante Column, Row y una lista dinámica de botones.
  2. calculateResult(): Gestiona los eventos de clic. Diferencia entre números, operadores, la limpieza de pantalla (C) y la ejecución del cálculo (=).
  ```
    Kotlin
  ```
  ```
    // Ejemplo de la lógica de evaluación implementada
    fun evaluarExpresion(expresion: String): String {
        val operadores = listOf("+", "-", "*", "/")
        // Busca el operador, separa los operandos y ejecuta la operación
    
    }
 ```
  
## 📦 Instalación y Uso
  1. Clona este repositorio:  
    ```
    git clone https://github.com/UMDM24/Calculadora.git
    ```
  2. Abre el proyecto en Android Studio (Asegurar que Minimum SDK sea API 36.0).
  3. Sincroniza el proyecto con los archivos de Gradle.
  4. Ejecuta la aplicación en un emulador o dispositivo físico.

## 📝 Notas de desarrollo
Este proyecto fue desarrollado como parte de un ejercicio de fortalecimiento en Ingeniería de Sistemas, enfocándose en la implementación de lógica de control y componentes de UI modernos en Android.

## 👨‍💻 Autor
Uberto De Aguas
* Estudiante de Ingeniería de Sistemas.
* Interesado en .NET, Ciberseguridad y Desarrollo Móvil.
