
### **📚 Sintaxis Básica en Java**  
*Aprende las reglas del juego para escribir código limpio y funcional.*  

---

#### **🏛️ Estructura de una Clase en Java**  
En Java, todo gira alrededor de **clases** y **métodos**. Aquí la anatomía básica:  

```java
public class HolaMundo {  // Clase principal (debe coincidir con el nombre del archivo)
    public static void main(String[] args) {  // Método principal (punto de entrada)
        System.out.println("¡Hola Mundo!");   // Instrucción
    }
}
```

- **`public class HolaMundo`**:  
  - `public`: La clase es accesible desde cualquier parte.  
  - `class`: Palabra clave para definir una clase.  
  - `HolaMundo`: Nombre de la clase (¡Case Sensitive! `HolaMundo` ≠ `holamundo`).  

- **`public static void main(String[] args)`**:  
  - `public` y `static`: Permiten ejecutar el método sin crear un objeto (lo veremos en POO).  
  - `void`: El método no retorna ningún valor.  
  - `String[] args`: Permite recibir argumentos desde la terminal (ej: `java HolaMundo Juan`).  

---

#### **🖨️ Imprimir en Consola: print() vs println()**  
| **Método** | **Comportamiento** | **Ejemplo** | **Salida** |  
|------------|--------------------|-------------|------------|  
| `println()` | Imprime y añade salto de línea |```System.out.println("Hola");``` <br> ```System.out.println("Mundo");``` | Hola <br> Mundo|
| `print()` | Imprime en la misma línea |  ```System.out.print("Hola ");```<br> ```System.out.print("Mundo");```| Hola Mundo |
 

**💡 Tip**: En IntelliJ, escribe `sout` y presiona `Tab` para autocompletar `System.out.println();`.

---

#### **💬 Comentarios: Explica tu Código**  
Los comentarios son notas para humanos (¡Java los ignora!). Usalos para:  
- Documentar funciones complejas.  
- Desactivar código temporalmente.  
- Explicar decisiones de diseño.  

| **Tipo** | **Sintaxis** | **Uso** |  
|----------|--------------|---------|  
| **Una línea** | `// Comentario aquí` | Explicaciones brebes. |  
| **Varias líneas** |  
```java  
/* Esto es un comentario  
   de múltiples líneas */  
```  
| Bloques de texto largos. |  
| **Javadoc** |  
```java  
/**  
 * Calcula la suma de dos números.  
 * @param a Primer número.  
 * @param b Segundo número.  
 * @return Resultado de a + b.  
 */  
```  
| Documentación técnica para APIs. |  

---

### **🔧 Proceso de Compilación: De Código a Ejecución**  
Java es **compilado** e **interpretado**. Así funciona la magia:  

![Proceso de compilación de Java](./img_doc/compilacion2.png)  

1. **Escritura**: Creas un archivo `.java` (código fuente).  
2. **Compilación**:  
   ```bash  
   javac HolaMundo.java  # Genera HolaMundo.class (bytecode)  
   ```  
   - El compilador (`javac`) verifica errores sintácticos.  
3. **Ejecución**:  
   ```bash  
   java HolaMundo  # La JVM traduce bytecode a instrucciones de máquina  
   ```  

**¿Por qué es multiplataforma?**  
- El **bytecode** (`.class`) es universal.  
- La **JVM** se encarga de adaptarlo al sistema operativo.  

---

#### **🚨 Errores Comunes al Compilar**  
- **Falta el `;`**:  
  ```java  
  System.out.println("Hola Mundo")  // ❌ Falta punto y coma  
  ```  
- **Nombre de clase ≠ archivo**:  
  ```java  
  public class Hola { ... }  // ❌ Archivo debe llamarse Hola.java  
  ```  
- **Ejecutar sin compilar**:  
  ```bash  
  java HolaMundo.java  // ❌ Usa primero javac  
  ```  

---

### **🚀 ¿Qué Viene Después?**  
- **Variables y tipos de datos**: `int`, `String`, `boolean`.  
- **Operadores**: Aritméticos (`+`, `-`), comparación (`==`, `>`), lógicos (`&&`, `||`).  
- **Condicionales**: `if`, `else`, `switch`.  

**👉 En el próximo capítulo, darás vida a tus programas con datos dinámicos.**  

--- 
**¿Atascado con un error de compilación?** ¡Comparte tu código en los comentarios y te ayudamos! 🔍🚀