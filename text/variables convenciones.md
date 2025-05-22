### **🔄 Modificación de Variables en Java**  
*Aprende a manipular datos dinámicamente para crear programas flexibles.*  

---

#### **📊 Actualizando Variables Numéricas**  
Java permite **reasignar valores** a variables existentes usando operadores de asignación. Ejemplo:  

```java
public class UpdatingVariable {
    public static void main(String[] args) {
        int salario = 1000;
        salario = salario + 200;  // 1200
        salario += 300;           // 1500 (equivalente a salario = salario + 300)
        System.out.println(salario); 

        // Otros operadores útiles:
        salario -= 500;  // 1000 (resta)
        salario *= 2;    // 2000 (multiplicación)
        salario /= 5;    // 400 (división)
    }
}
```

**Operadores de Asignación**  
| **Operador** | **Ejemplo** | **Equivalente** |  
|--------------|-------------|------------------|  
| `+=` | `a += 5` | `a = a + 5` |  
| `-=` | `b -= 3` | `b = b - 3` |  
| `*=` | `c *= 2` | `c = c * 2` |  
| `/=` | `d /= 4` | `d = d / 4` |  

---

#### **📝 Concatenando Strings**  
Para variables de texto (`String`), el operador `+` une cadenas:  

```java
public class Concatenacion {
    public static void main(String[] args) {
        String nombre = "Anahí";
        nombre = nombre + " Salgado";           // Anahí Salgado
        nombre += " Díaz de la Vega";           // Anahí Salgado Díaz de la Vega
        nombre = "Ing. " + nombre;              // Ing. Anahí Salgado Díaz de la Vega
        System.out.println(nombre); 
    }
}
```

**💡 Tip**: Usa `+=` para evitar repeticiones:  
```java
String mensaje = "Hola";
mensaje += ", bienvenido!";  // Hola, bienvenido!
```

---

### **📌 Convenciones de Nombres en Java**  
*Reglas para escribir código limpio y profesional.*  

#### **Reglas Obligatorias**  
1. **Case Sensitivity**: `celphone` ≠ `celPhone`.  
2. **Caracteres Iniciales**: Letras, `$`, o `_`.  
   - ✔️ `$pais`, `_colorFondo`, `edad`.  
   - ❌ `1telefono`, `@email`.  
3. **Sin Espacios**: Usa camelCase para nombres compuestos.  
   - ✔️ `backgroundColor`.  
   - ❌ `background_color` (válido, pero no recomendado).  

#### **Buenas Prácticas**  
- **Variables**: camelCase (`minWidth`, `employeeName`).  
- **Constantes**: MAYÚSCULAS con `_` (`final int MAX_WIDTH = 100;`).  
- **Nombres Significativos**: Evita abreviaturas crípticas.  

```java
public class NamingJava {
    public static void main(String[] args) {
        // Variables válidas (pero mejóralas):
        int celphone = 33337777;      // ✔️ Mejor: numeroCelular
        String $countryName = "Spain";// ✔️ Mejor: pais 
        
        // Constantes (usa 'final'):
        final int MAX_WIDTH = 9999;   // ✔️ Correcto
        final double PI = 3.1416;     // ✔️ Valor inmutable
    }
}
```

#### **🚫 Errores Comunes**  
- **Nombres no Descriptivos**:  
  ```java
  int a = 10;      // ❌ ¿Qué representa 'a'? 
  int numUsuarios = 10;  // ✔️ Claridad
  ```  
- **Olvidar `final` en Constantes**:  
  ```java
  int POSITION = -5;     // ❌ Cualquiera puede modificarlo
  final int POSITION = -5; // ✔️ Constante real
  ```  

---
