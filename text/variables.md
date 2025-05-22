### **📦 Variables en Java**  
*Aprende a guardar y manipular información en la memoria de tu aplicación.*  

---

#### **¿Qué es una Variable?**  
Una variable es como una **caja etiquetada** en la memoria RAM donde almacenas datos: números, texto, valores booleanos, etc. Cada variable tiene:  
- **Nombre único**: Para identificarla (ej: `edad`, `salario`).  
- **Tipo de dato**: Define qué información puede guardar (ej: `int`, `String`).  
- **Valor**: El dato que almacena, modificable durante la ejecución.  

```java
public class Variables {
    public static void main(String[] args) {
        // Declaración y asignación:
        int velocidad = 80;           // Entero
        String nombre = "Anahí";      // Texto
        boolean estaActivo = true;    // Booleano (true/false)
        
        // Modificar valor:
        velocidad = 90;  
        System.out.println(velocidad);  // Salida: 90
    }
}
```

---

#### **🔑 Reglas para Nombrar Variables**  
| **Válido** | **Inválido** | **Buena Práctica** |  
|------------|--------------|---------------------|  
| `edad` | `1edad` (empieza con número) | Usa minúsculas y camelCase: `miEdad`. |  
| `_salario` | `salario total` (espacios) | Evita `_` y `$` al inicio. |  
| `$puntuacion` | `int` (palabra reservada) | Nombres descriptivos: `numeroDeIntentos`. |  

**Java es *case sensitive***:  
```java
int edad = 24;  
int EDAD = 25;  
System.out.println(edad);  // 24  
System.out.println(EDAD);  // 25  
```

---

#### **📌 Tipos de Variables**  
1. **Variables Locales**:  
   - Declaradas **dentro de un método**.  
   - Solo existen dentro de ese método.  
   ```java
   void calcularEdad() {
       int edad = 30;  // Variable local
       System.out.println(edad);
   }
   ```

2. **Variables de Instancia**:  
   - Declaradas **en una clase, fuera de métodos**.  
   - Cada objeto de la clase tiene su propia copia.  
   ```java
   public class Empleado {
       String nombre;  // Variable de instancia
   }
   ```

3. **Variables Estáticas**:  
   - Declaradas con `static`.  
   - Compartidas por **todas las instancias** de la clase.  
   ```java
   public class Contador {
       static int total;  // Variable estática
   }
   ```

---

#### **🚫 Errores Comunes**  
- **Usar una variable no declarada**:  
  ```java
  System.out.println(puntuacion);  // ❌ ¡puntuacion no existe!  
  ```  
- **Cambiar el tipo de dato**:  
  ```java
  int edad = 25;  
  edad = "veinticinco";  // ❌ int ≠ String  
  ```  
- **Variables locales no inicializadas**:  
  ```java
  void metodo() {  
      int velocidad;  
      System.out.println(velocidad);  // ❌ ¡No tiene valor!  
  }  
  ```  

---

#### **💡 Mejores Prácticas**  
1. **Inicializa siempre tus variables**:  
   ```java
   int intentos = 0;  // ✔️  
   ```  
2. **Usa `final` para constantes**:  
   ```java
   final double PI = 3.1416;  // No cambiará  
   ```  
3. **Elige nombres autoexplicativos**:  
   - ❌ `int a = 10;`  
   - ✔️ `int numeroDeUsuarios = 10;`  

---
