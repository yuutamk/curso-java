**Tipos de datos primitivos**
Los tipos de datos primitivos que Java utiliza como se observa en la imagen anterior, son los
tipos de datos simples que al declararlos no es necesaria una invocación y estos carecen de
métodos.


![tabla de tipos de datos primitivos](./img_doc/tabla-primitivos.png)

**Enteros**
Estos tipos de datos se utilizan para guardar cifras y se dividen en dos categorías
"enteros" y "decimales", estos tipos de datos tienen la característica de que tienen un
límite de almacenamiento, si el valor que se le asigna sobrepasa el límite ocasionará un
desbordamiento y el código fuente marcara errores, por eso es muy importante elegir el tipo
de dato que se utiliza y analizar si el valor incrementará con el tiempo.
En Java, se pueden utilizar los siguientes tipos de datos numéricos para números enteros:
1.​ byte​ : ocupa 1 byte de memoria.
2.​ short: ocupa 2 bytes de memoria.
3.​ int​ : ocupa 4 bytes de memoria
4.​ long​ : ocupa 8 bytes de memoria.


>⚠️ Nota:
>- Para diferenciar un int de un long es necesario poner una ‘L’ al final del número de tipo long.
> <br>
>
>    ```java
>    long numLong = 1234L;
>    ```
> <br>

![representacion grafica de tipos de datos primitivos](./img_doc/img_primitivos.png)


**Decimales**
Para datos numéricos con punto decimal o flotante existen dos opciones: float y double.

1.​ float : ocupa 4 bytes de memoria y no tiene tanta precisión como double.
2.​ double: ocupa 8 bytes de memoria y tiene más precisión qué float.


>⚠️ Nota:
>- Para hacer la distinción entre estos, es necesario poner una ‘F/f’ al
final del número flotante o ‘D/d’.
> <br>
>
>    ```java
>    float numf = 1234F;
>    double numd = 1234D;
>    ```
> <br>


![representacion grafica de datos flotantes y double](./img_doc/img_float_double.png)

**Carácter**
Para datos de tipo texto o más bien caracteres el único tipo de dato primitivo que podemos
utilizar es el char y solo podrá contener un carácter en su valor.
1.​ char : ocupa 2 bytes de memoria y es de rango unicode.


>⚠️ Nota:
>- El valor de este dato siempre debe declararse con comillas simples y alternativamente podrías declararlo en su valor ASCII.
> <br>
>
>    ```java
>    char letra = 'a';
>    char letraAscii = 97; //Valor de a en ASCII
>    ```
> <br>



Lógicos
Para utilizar datos lógicos y poder representar decisiones se utiliza el tipo de dato boolean
donde su valor puede ser: false y true.

Ejemplo de datos primitivos

```java
public class TiposPrimitivos {
   public static void main(String[] args) {
       // Enteros
       byte edad = 25;
       int poblacion = 1000000;
       long distancia = 9876543210L;

       // Decimales
       float precio = 19.99f;
       double pi = 3.141592653589793;

       // Caracteres y booleanos
       char inicial = 'J';
       boolean esActivo = true;
   }
}
```

Constantes
En Java, una constante es una variable cuyo valor no puede cambiar después de ser
inicializado. Para definir constantes se utiliza la palabra clave final.



>⚠️ Nota:
>- Por convención al nombrar constantes siempre será en mayúsculas para identificar rápidamente el tipo.
> <br>
>
>    ```java
>    final int HORASDIA = 24;
>    ```
> <br>

**Constantes primitivas**

```java
final int EDAD_MINIMA = 18;
final double PI = 3.14159;
```

**Constantes de objetos**

```java
final String MENSAJE_BIENVENIDA = "Bienvenido a Java!";
final List<String> DIAS_SEMANA = Arrays.asList("Lunes", "Martes", "Miércoles");
```

**Constantes estáticas**

Si una constante debe ser accesible globalmente, se combina final con static.

```java
public class Configuracion {
   public static final int MAX_USUARIOS = 100;
   public static final String URL_BASE = "https://api.miapp.com/";
}
```


**Ejemplo de declaración y uso de constantes**

```java
public class EjemploConstantes {
   // Constantes globales
   public static final int MAX_EDAD = 120;
   public static final String SALUDO = "¡Hola, Mundo!";

   public static void main(String[] args) {
       // Constantes locales
       final double GRAVEDAD_TIERRA = 9.81;

       System.out.println("Máxima edad permitida: " + MAX_EDAD);
       System.out.println(SALUDO);
       System.out.println("Gravedad en la Tierra: " + GRAVEDAD_TIERRA);

       // Error: no se puede modificar una constante
       // MAX_EDAD = 130; // <- Esto genera un error de compilación
   }
}
```

Buenas prácticas con constantes

Usa final siempre para valores constantes:
Esto garantiza que no puedan ser modificados después de la inicialización.

Combina static con final para constantes globales:
Si una constante no depende de una instancia de la clase, hazla estática para evitar la creación de copias innecesarias.
public static final String APP_NAME = "MiAplicacion";

Nombres en mayúsculas con guiones bajos:
Sigue la convención de escribir los nombres de las constantes en MAYÚSCULAS y separar palabras con guiones bajos.

- ✅ final int MAX_LONGITUD = 100;
- ❌ final int MaxLongitud = 100;



Declara constantes como privadas si no se usan fuera de la clase:​
Restringe el acceso si la constante no debe ser visible para otras clases.
private static final double TASA_INTERES = 3.5;


Agrupa constantes relacionadas en una clase o interfaz:

Para mejorar la organización, agrupa constantes en una clase específica.

```java
public class ConstantesErrores {
    public static final String ERROR_404 = "Página no encontrada";
    public static final String ERROR_500 = "Error interno del
servidor";
}
```


Evita redefinir valores mágicos:​
Usa constantes en lugar de valores mágicos (números o cadenas "hardcodeados"). Esto
facilita la legibilidad y mantenimiento.

- ❌ if (edad > 18)
- ✅ if (edad > EDAD_MINIMA)

Evita inicializaciones complejas:​
Las constantes deben tener valores simples y no depender de cálculos complejos en tiempo
de ejecución. Si es necesario, usa inicializadores estáticos.

```java
public static final double RAIZ_2;
static {
    RAIZ_2 = Math.sqrt(2);
}
```


---




<!-- doc pilares -->


**Tipo de dato int**
El primer tipo de datos que almacenaremos es el número entero. Los números enteros
son muy comunes en la programación. A menudo los ves usados para almacenar
edades, o tamaños máximos, o la cantidad de veces que se ha ejecutado algún código,
entre muchos otros usos.
En Java, los números enteros se almacenan en el tipo de datos primitivo int.
● ints contienen números positivos, números negativos y cero. No almacenan
fracciones o números con decimales en ellos.
● El tipo de datos int Almacena números enteros desde -2,147,483,648 hasta
2,147,483,647
● El valor por default de int es 0.
Para declarar una variable de tipo int, usamos la palabra clave int antes del nombre de
la variable:

```java
// int variable declaración
int fechaCreacionJava;
// Asignación
fechaCreacionJava = 1996;
// Declaración y asignación
int numeroTiposPrimitivos = 8;
```

Tipo de dato double
Los números enteros no cumplen con lo que necesitamos para cada programa. ¿Y si
quisiéramos almacenar el precio de algo? Necesitamos un punto decimal. ¿Y si
quisiéramos almacenar la población mundial? Ese número sería mayor de lo que puede
contener el tipo int.
El tipo de datos primitivo double puede ayudar.
● double puede contener decimales, así como números muy grandes y muy
pequeños.
● El tipo de datos double es un punto flotante de precisión doble de 64 bits.
● El valor por default de double es 0.0d
Para declarar una variable de tipo double, usamos la palabra clave double en la
declaración:

```java
// los doubles pueden tener decimales:
double precio = 8.99;
// los doubles pueden tener valores mayores que los que podría contener un int:
double pib = 1 285 518 000;
```

Tipo de dato boolean
A menudo, nuestros programas enfrentan preguntas que solo pueden responderse con
un sí o un no.
¿Está encendido el horno? ¿La luz es verde? ¿Comí el desayuno?
Estas preguntas se responden con un boolean, un tipo de dato que hace referencia a uno
de los siguientes dos valores: verdadero (true) o falso (false).
Declaramos variables booleanas usando la palabra clave boolean antes del nombre de
la variable.

```java
boolean javaEsUnLenguajeCompilado = true;
boolean javaEsUnaTazaDeCafe = false;
```
● El valor por default de boolean es false.

●El tipo de datos booleano especifica un bit de información, pero su "tamaño" no se
puede definir con precisión.

**Tipo de dato char**

¿Cómo respondemos preguntas como: ¿Cuál es la respuesta correcta, a, b, c, o d? ¿Con
qué letra empieza tu nombre?
El tipo de datos char puede contener cualquier carácter, como una letra, un espacio o un
signo de puntuación.
● Debe estar entre comillas simples, '.
● Es un carácter Unicode de 16 bits.
● Su valor por default es ‘\u0000’ (Java usa el sistema Unicode, no el sistema de
código ASCII. El \u0000 es el rango más bajo del sistema Unicode.).
Por ejemplo:

```java
char respuesta = 'a';
char primeraLetra = 'p';
char signo = '!';
```


**Tipo de dato String**

El tipo de datos String se utiliza para almacenar una secuencia de caracteres (texto). Los
valores de String (cadena) deben estar entre comillas dobles. Las cadenas (String) en
Java no son tipos primitivos, sino objetos. Ya hemos visto ejemplos de String, por
ejemplo, cuando imprimimos "¡Hola Mundo!".

```java
String saludo = "¡Hola Mundo!";
System.out.println(saludo);
```