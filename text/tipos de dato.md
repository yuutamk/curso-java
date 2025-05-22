### **📊 Tipos de Datos en Java: Primitivos vs. Objetos**  
*Conoce cómo Java clasifica la información y optimiza el uso de memoria.*  

---

#### **Clasificación General**  
En Java, los datos se dividen en dos categorías principales:  

| **Tipo** | **Características** | **Ejemplos** |  
|----------|----------------------|--------------|  
| **Primitivos** | - Valores básicos almacenados directamente en memoria. <br> - 8 tipos predefinidos. <br> - Ocupan tamaños fijos. | `int`, `double`, `boolean`, `char` |  
| **Objetos (No Primitivos)** | - Referencias a datos complejos. <br> - Almacenados en el *heap*. <br> - Permiten métodos y herencia. | `String`, `Arrays`, `ArrayList`, `Clases personalizadas` |  

---

### **Tipos de Datos Primitivos**  
#### **1. Enteros (sin decimales)**  

| **Tipo** | **Tamaño** | **Rango** | **Ejemplo** | **Uso Típico** |  
|----------|------------|-----------|--------------|----------------|  
| **`byte`** | 1 byte | -128 a 127 | `byte edad = 25;` | Datos pequeños (ej: edad). |  
| **`short`** | 2 bytes | -32,768 a 32,767 | `short poblacion = 15000;` | Números medianos (ej: inventario). |  
| **`int`** | 4 bytes | -2,147M a 2,147M | `int distanciaTierraLuna = 384400;` | Enteros generales (más usado). |  
| **`long`** | 8 bytes | -9,223Q a 9,223Q | `long habitantesMundo = 7_900_000_000L;` | Números gigantes (ej: astronomía).  

**⚠️ Nota**: Usa `L` al final para literales `long`.  

---

#### **2. Flotantes (con decimales)**  

| **Tipo** | **Tamaño** | **Precisión** | **Ejemplo** | **Uso Típico** |  
|----------|------------|---------------|--------------|----------------|  
| **`float`** | 4 bytes | ~6-7 dígitos | `float pi = 3.1416F;` | Decimales de baja precisión. |  
| **`double`** | 8 bytes | ~15 dígitos | `double masaElectron = 9.1e-31;` | Decimales científicos (más usado).  

**⚠️ Nota**: Usa `F` al final para literales `float`.  

---

#### **3. Otros Primitivos**  

| **Tipo** | **Tamaño** | **Valores** | **Ejemplo** | **Uso Típico** |  
|----------|------------|-------------|--------------|----------------|  
| **`boolean`** | 1 bit | `true`/`false` | `boolean esActivo = true;` | Condicionales y flags. |  
| **`char`** | 2 bytes | Unicode (0 a 65,535) | `char letra = 'A';` | Caracteres únicos.  

**⚠️ Nota**: `char` usa comillas simples (`' '`), `String` (objeto) usa dobles (`" "`).  

---

### **Tipos de Datos Objeto (No Primitivos)**  
| **Tipo** | **Características** | **Ejemplo** |  
|----------|----------------------|--------------|  
| **`String`** | Secuencia de caracteres inmutable. | `String nombre = "Ana";` |  
| **`Array`** | Colección de elementos del mismo tipo. | `int[] edades = {25, 30, 18};` |  
| **Clases Personalizadas** | Modelan entidades con atributos y métodos. | `Usuario usuario = new Usuario();` |  

**Diferencias Clave**:  
- **Valor vs Referencia**: Los primitivos guardan el valor, los objetos guardan una dirección de memoria.  
- **Valores por Defecto**:  
  - Primitivos: `0`, `0.0`, `false`, `\u0000` (char).  
  - Objetos: `null`.  

---

### **🔍 ¿Cómo Elegir el Tipo Correcto?**  
1. **Enteros**: Usa `int` por defecto. Solo usa `byte`/`short` si el rango es limitado.  
2. **Decimales**: Prefiere `double` (más preciso). Usa `float` solo para optimizar memoria.  
3. **Booleanos**: Solo para condiciones lógicas.  
4. **Texto**: `char` para un carácter, `String` para cadenas.  

---

### **🚨 Errores Comunes**  
- **Olvidar `L`/`F`**:  
  ```java  
  long num = 10000000000;   // ❌ Error: Necesita L  
  float pi = 3.1416;        // ❌ Error: Necesita F  
  ```  
- **Confundir `==` con Objetos**:  
  ```java  
  String a = "Hola";  
  String b = new String("Hola");  
  System.out.println(a == b);  // ❌ Falso (compara direcciones, no contenido)  
  ```  

---

