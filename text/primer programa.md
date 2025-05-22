### **🖥️ Tu Primer Programa en Java: ¡Hola Mundo!**  
*De la teoría a la práctica: escribe, compila y ejecuta tu primer código.*  

---

#### **📝 Estructura Básica de un Programa Java**  
Todo programa en Java gira alrededor de dos elementos clave:  
1. **Clase Principal**: Debe coincidir exactamente con el nombre del archivo (incluyendo mayúsculas).  
2. **Método `main`**: Punto de entrada del programa. Sin él, la JVM no sabrá por dónde empezar.  

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

**Desglose del código**:  
- **`public class HolaMundo`**: Define una clase pública llamada `HolaMundo`.  
- **`public static void main(String[] args)`**: Método principal.  
  - `public`: Accesible desde cualquier lugar.  
  - `static`: No requiere una instancia de la clase para ejecutarse.  
  - `void`: No retorna ningún valor.  
  - `String[] args`: Permite pasar argumentos desde la consola.  
- **`System.out.println()`**: Imprime texto en la consola y añade un salto de línea.  

---

#### **⚙️ Ejecución Paso a Paso**  
1. **Guarda el código** en un archivo llamado `HolaMundo.java`.  
2. **Compila** desde la terminal:  
   ```bash
   javac HolaMundo.java
   ```  
   Esto genera un archivo `HolaMundo.class` (bytecode).  
3. **Ejecuta** el programa:  
   ```bash
   java HolaMundo
   ```  
   Salida:  
   ```bash
   ¡Hola Mundo!
   ```  

**💡 Consejo**: En un IDE como IntelliJ, haz clic derecho y selecciona *Run 'HolaMundo.main()'*.  

---

#### **🔍 Sintaxis Clave y Buenas Prácticas**  
- **Case Sensitivity**: `HolaMundo` ≠ `holamundo`.  
- **Llaves `{}`**: Delimitan bloques de código (clases, métodos).  
- **Punto y coma `;`**: Termina cada instrucción.  
- **Comentarios**:  
  - **Una línea**: `// Esto es un comentario`.  
  - **Varias líneas**:  
    ```java
    /* Este es un comentario 
       de múltiples líneas */
    ```  
  - **Javadoc**:  
    ```java
    /**
     * Descripción de la clase o método.
     * @author TuNombre
     */
    ```  

---

#### **🖨️ System.out.println() vs System.out.print()**  
| **Método** | **Comportamiento** | **Ejemplo** | **Salida** |  
|------------|--------------------|-------------|------------|  
| `println()` | Imprime y añade salto de línea |  
```java  
System.out.println("Hola");  
System.out.println("Mundo");  
```  
|  
```  
Hola  
Mundo  
```  
| `print()` | Imprime en la misma línea |  
```java  
System.out.print("Hola ");  
System.out.print("Mundo");  
```  
|  
```  
Hola Mundo  
```  

---

#### **🚨 Errores Comunes (y Cómo Evitarlos)**  
1. **Nombre de archivo ≠ nombre de clase**:  
   - ❌ `holamundo.java` → ✔️ `HolaMundo.java`.  
2. **Faltan `;` o `{}`**:  
   - ❌ `System.out.println("Hola")` → ✔️ `System.out.println("Hola");`.  
3. **Ejecutar sin compilar**:  
   - ❌ `java HolaMundo.java` → ✔️ Primero `javac`, luego `java`.  

---
