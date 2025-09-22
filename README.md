# ⚡ Java Exception Handling Exercises  

## 📄 Description - Enunciado del ejercicio  

### Nivell 2 - Exercici 1 (ES)  
Crea una clase llamada **Producte** con los atributos **nombre** y **precio**, y otra clase llamada **Venda**.  
La clase **Venda** contiene una colección de productos y el precio total de la venta.  

La clase **Venda** tiene un método llamado `calcularTotal()` que lanza la excepción personalizada **VendaBuidaException** y muestra el mensaje:  
👉 *"Per fer una venda primer has d’afegir productes"*  
si la colección de productos está vacía.  

- Si hay productos, recorre la colección y guarda la suma de todos los precios en el atributo **precio total de la venta**.  
- La excepción personalizada **VendaBuidaException** debe heredar de la clase `Exception`.  
- En su constructor debe recibir el mensaje anterior y, al capturarla, debe mostrarse por consola con `getMessage()`.  

Además, se debe escribir el código necesario para **generar y capturar una excepción de tipo `IndexOutOfBoundsException`**.  

### Level 2 - Exercise 1 (EN)  
Create a class called **Producte** with the attributes **name** and **price**, and another class called **Venda**.  
The **Venda** class contains a collection of products and the total price of the sale.  

The **Venda** class includes a method `calcularTotal()` which throws a custom exception **VendaBuidaException** and displays:  
👉 *"Per fer una venda primer has d’afegir productes"*  
if the product collection is empty.  

- If products exist, iterate over the collection and store the sum of their prices in the **total price** attribute.  
- The custom exception **VendaBuidaException** must extend the `Exception` class.  
- Its constructor must accept the error message above, and when caught, the exception should be displayed using `getMessage()`.  

Additionally, write the code required to **generate and handle an `IndexOutOfBoundsException`**.  

---

### Nivell 2 - Exercici 1 (ES)  
Crea una clase llamada **Entrada** que controle las diferentes excepciones que pueden aparecer en Java al introducir datos por teclado con la clase `Scanner`.  

- Primero, se debe instanciar un objeto de `Scanner`.  
- Después, implementar métodos estáticos para leer distintos tipos de datos desde teclado.  
- Si ocurre una excepción, debe gestionarse y volver a solicitar el dato hasta que el usuario lo introduzca correctamente.  
- Ejemplo: si se introduce un `float` con punto en lugar de coma, debe mostrar `"Error de format"` y seguir pidiendo el valor hasta que sea correcto.  

**Métodos a implementar capturando `InputMismatchException`:**  
- `public static byte llegirByte(String missatge)`  
- `public static int llegirInt(String missatge)`  
- `public static float llegirFloat(String missatge)`  
- `public static double llegirDouble(String missatge)`  

**Métodos a implementar capturando una excepción personalizada (`Exception`):**  
- `public static char llegirChar(String missatge)`  
- `public static String llegirString(String missatge)`  
- `public static boolean llegirSiNo(String missatge)` → si el usuario introduce `"s"`, retorna `true`, si introduce `"n"`, retorna `false`.  

### Level 2 - Exercise 1 (EN)  
Create a class called **Entrada** to handle different exceptions that may occur when entering data via keyboard using the `Scanner` class.  

- First, instantiate a `Scanner` object.  
- Then, create static methods to read different types of input.  
- If an exception occurs, handle it and re-prompt the user until the input is valid.  
- Example: if a `float` is entered with a dot instead of a comma, show `"Error de format"` and keep asking until the value is correct.  

**Methods to implement (handling `InputMismatchException`):**  
- `public static byte llegirByte(String message)`  
- `public static int llegirInt(String message)`  
- `public static float llegirFloat(String message)`  
- `public static double llegirDouble(String message)`  

**Methods to implement (handling a custom `Exception`):**  
- `public static char llegirChar(String message)`  
- `public static String llegirString(String message)`  
- `public static boolean llegirSiNo(String message)` → if the user enters `"s"`, return `true`; if `"n"`, return `false`.  

---

## 💻 Technologies Used  
- **Language:** Java (2025 version)  
- **IDE / Framework:** IntelliJ IDEA (latest version)  
- **Version Control:** Git & GitHub  
- **Concepts Applied:** Exception Handling, Custom Exceptions, Input Validation  
- **Database:** Not used in this project  
- **Deployment Environment:** Not specified  

---

## 📋 Requirements  
- **Java JDK 21+ (2025 version)**  
- **IntelliJ IDEA (Community or Ultimate, latest version)**  
- **Git (latest version)**  

---

## 🛠️ Installation  
1. Clone this repository:  
   ```bash
   git clone https://github.com/yvangabrieli/S1.02.Exceptions
