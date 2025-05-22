### **🐫 Convenciones Camel Case en Java: Nombra como un Profesional**  
*Domina el arte de nombrar clases, variables y métodos para escribir código limpio y legible.*  

---

#### **¿Qué es Camel Case?**  
Camel Case es un estilo de escritura donde cada palabra compuesta **comienza con mayúscula** (excepto la primera en algunos casos) y se eliminan los espacios. En Java, existen dos variantes clave:  

| **Tipo** | **Uso** | **Ejemplo** |  
|----------|---------|-------------|  
| **Upper Camel Case** (Pascal Case) | Clases, Interfaces, Archivos. | `StringBuilder`, `HolaMundo.java` |  
| **Lower Camel Case** | Variables, Métodos. | `numeroDeIntentos`, `calcularSalario()` |  

---

#### **Reglas de Oro en Java**  
1. **Clases y Archivos**:  
   - Upper Camel Case.  
   - Coinciden en nombre (`HolaMundo` → `HolaMundo.java`).  
   ```java  
   public class CalculadoraSalario {  // ✔️ Upper Camel Case  
       // Código aquí  
   }  
   ```  

2. **Variables y Métodos**:  
   - Lower Camel Case.  
   - Nombres descriptivos y en minúscula inicial.  
   ```java  
   int edadUsuario = 30;                  // ✔️ Variable  
   void calcularImpuestoAnual() { ... }   // ✔️ Método  
   ```  

3. **Constantes**:  
   - Mayúsculas con `_` (no aplica Camel Case).  
   ```java  
   final double IVA = 0.16;               // ✔️ Constante  
   final int MAX_INTENTOS = 3;  
   ```  

---

#### **Ejemplo Integral**  
```java  
public class GestorUsuarios {  // Upper Camel Case (Clase)  
    // Constante  
    public static final int EDAD_MINIMA = 18;  
    
    // Variable de instancia (Lower Camel Case)  
    private String nombreUsuario;  
    
    // Método (Lower Camel Case)  
    public void establecerNombreUsuario(String nuevoNombre) {  
        this.nombreUsuario = nuevoNombre;  
    }  
}  
```  

---

#### **🚫 Errores Comunes**  
- **Mezclar estilos**:  
  ```java  
  String NombreDelUsuario;  // ❌ Upper Camel Case en variable  
  void Calcular_salario() { ... }  // ❌ Snake Case en método  
  ```  
- **Nombres ambiguos**:  
  ```java  
  int a;  // ❌ ¿Qué representa 'a'?  
  int numIntentosFallidos;  // ✔️ Claro y descriptivo  
  ```  

---

### **💡 ¿Por qué Usar Camel Case?**  
- **Legibilidad**: `fechaDeNacimiento` > `fechadenacimiento`.  
- **Consistencia**: Todo el equipo sigue las mismas reglas.  
- **Estándar de la Industria**: Reconocido en Java, C#, JavaScript, etc.  

---

#### **¿Y los Acrónimos?**  
Para siglas o acrónimos, trata la primera letra como mayúscula:  
```java  
String urlSegura;        // ✔️ "url" como palabra única  
void generarPDF() { ... }  
```  

---

### **🚀 Buenas Prácticas Adicionales**  
- **Evita abreviaturas innecesarias**:  
  - ❌ `calcSal()` → ✔️ `calcularSalario()`.  
- **Métodos que retornan booleanos**: Usa prefijos como `es` o `tiene`.  
  ```java  
  boolean esValido;  
  boolean tienePermisos();  
  ```  

---
