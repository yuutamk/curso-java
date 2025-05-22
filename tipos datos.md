### **📚 Tipos de Datos Primitivos en Java**  
*Almacena información de manera eficiente con los fundamentos básicos de Java.*  

---

#### **¿Qué Son los Tipos Primitivos?**  
Los tipos primitivos son **datos básicos predefinidos** en Java. Ocupan un espacio fijo en memoria, no son objetos y carecen de métodos. Son ideales para optimizar rendimiento en operaciones simples.  

![Tabla de tipos de datos primitivos](./img_doc/tabla-primitivos.png)  

---

### **1. Enteros: Sin Decimales**  
Guardan números completos. Elige según el rango necesario:  

| **Tipo** | **Tamaño** | **Rango** | **Ejemplo** |  
|----------|------------|-----------|-------------|  
| **`byte`** | 1 byte | -128 a 127 | `byte edad = 25;` |  
| **`short`** | 2 bytes | -32,768 a 32,767 | `short poblacion = 15000;` |  
| **`int`** | 4 bytes | ±2.147 billones | `int distanciaLuna = 384400;` |  
| **`long`** | 8 bytes | ±9.223 trillones | `long habitantesMundo = 7900000000L;` |  

**⚠️ Notas Clave**:  
- Usa `L` en literales `long`: `long valor = 123456789L;`.  
- Desbordamiento: Si superas el rango, el valor se "reinicia" (ej: `byte 127 + 1 = -128`).  

---

### **2. Decimales: Con Punto Flotante**  
Para números con precisión fraccional:  

| **Tipo** | **Tamaño** | **Precisión** | **Ejemplo** |  
|----------|------------|---------------|-------------|  
| **`float`** | 4 bytes | ~6-7 dígitos | `float pi = 3.1416F;` |  
| **`double`** | 8 bytes | ~15 dígitos | `double masaElectron = 9.1e-31;` |  

**⚠️ Notas Clave**:  
- Usa `F` en literales `float`: `float precio = 19.99F;`.  
- `double` es el predeterminado (no requiere sufijo).  

---

### **3. Carácter (`char`): Un Solo Símbolo**  
Almacena caracteres Unicode:  
- **Tamaño**: 2 bytes.  
- **Rango**: 0 a 65,535 (incluye emojis, letras acentuadas, etc.).  

```java  
char letra = 'A';  
char simbolo = '€';  
char ascii = 65;  // 'A' en ASCII  
```  

**⚠️ Usa comillas simples**: `' '`, no `" "`.  

---

### **4. Booleano (`boolean`): Lógica Binaria**  
Solo dos valores: `true` o `false`.  
- **Tamaño**: 1 bit (pero ocupa 1 byte por optimización).  
- **Valor por defecto**: `false`.  

```java  
boolean esActivo = true;  
if (esActivo) {  
    System.out.println("Acceso concedido.");  
}  
```  

---

### **🔒 Constantes: Valores Inmutables**  
Declaradas con `final`, su valor no cambia. Por convención, se escriben en **MAYÚSCULAS**.  

#### **Tipos de Constantes**  
1. **Primitivas**:  
   ```java  
   final int EDAD_MINIMA = 18;  
   final double PI = 3.14159;  
   ```  

2. **De Objeto**:  
   ```java  
   final String MENSAJE = "¡Bienvenido!";  
   final List<String> DIAS = List.of("Lunes", "Martes");  
   ```  

3. **Estáticas (Globales)**:  
   ```java  
   public class Config {  
       public static final int MAX = 100;  
       public static final String URL = "https://api.com";  
   }  
   ```  

**Buenas Prácticas**:  
- **Evita valores "mágicos"**:  
  ```java  
  // ❌ Mal:  
  if (edad > 18) { ... }  

  // ✅ Mejor:  
  final int EDAD_ADULTO = 18;  
  if (edad > EDAD_ADULTO) { ... }  
  ```  
- **Agrupa en clases**:  
  ```java  
  public class Errores {  
      public static final String ERROR_404 = "No encontrado";  
  }  
  ```  

---

### **🚨 Errores Frecuentes**  
1. **Sufijos olvidados**:  
   ```java  
   long num = 12345678901;    // ❌ Debe ser 12345678901L  
   float precio = 19.99;      // ❌ Debe ser 19.99F  
   ```  

2. **Modificar constantes**:  
   ```java  
   final int MAX = 100;  
   MAX = 200;  // ❌ Error de compilación.  
   ```  

3. **Confundir `char` y `String`**:  
   ```java  
   char genero = "M";  // ❌ Usa 'M'  
   ```  

---

### **🛠️ Ejemplo Integral**  
```java  
public class Ejemplo {  
    public static void main(String[] args) {  
        // Enteros  
        byte edad = 30;  
        long distancia = 9876543210L;  

        // Decimales  
        double precio = 19.99;  
        float pi = 3.1416F;  

        // Carácter y booleano  
        char grupo = 'A';  
        boolean esValido = true;  

        // Constante  
        final int DIAS_ANO = 365;  
        System.out.println("Días: " + DIAS_ANO);  
    }  
}  
```  

---

**👉 Próximo Tema: *Strings y Manipulación de Texto*.**  
*Aprenderás a trabajar con cadenas de caracteres y métodos útiles.*  

--- 
**¿Dudas sobre cuándo usar `float` vs `double`?** ¡Consulta en los comentarios! 💬🚀