---

### **🚀 Java SE: Versiones, Arquitectura y Herramientas Esenciales**  
*Domina las bases técnicas para convertirte en un desarrollador Java eficiente.*  

---

#### **🔄 Versiones de Java: Evolución y Licencias**  
Java ha evolucionado constantemente desde su lanzamiento en 1995. Cada versión trae mejoras, pero es crucial entender su ciclo de vida:  

- **Java SE 6 (2006)**: La versión que consolidó a Java en la industria. Aún usada en sistemas heredados (*legacy*).  
- **Java SE 8 (2014)**: Introdujo *lambdas* y Streams, revolucionando el manejo de datos.  
- **Java SE 11 LTS (2018)**: Primera versión con licencia comercial bajo Oracle.  
  - **Gratis para desarrollo y testing**, pero requiere pago en producción:  
    - $2.5 USD/mes por usuario (escritorio).  
    - $25 USD/mes por procesador (servidores).  
  - **OpenJDK**: Alternativa *open-source* y gratuita, compatible al 100% con Oracle JDK.  

Desde **Java SE 9 (2017)**, las actualizaciones son cada **6 meses**, pero las versiones **LTS** (*Long-Term Support*) reciben soporte por **3 años**. En este curso usaremos **Java SE 11 LTS**, ideal para proyectos estables.  

---

#### **🏗️ Arquitectura de Java: JDK, JRE y JVM**  
Java no es solo código: es un ecosistema de herramientas. Aquí su estructura:  

![Arquitectura de Java](img_doc/java_platform.png)  

1. **JDK (Java Development Kit)**:  
   - **Compilador**: Traduce código `.java` a **bytecode** (archivos `.class`).  
   - **JRE (Java Runtime Environment)**: Entorno para ejecutar aplicaciones.  
   - **APIs**: Bibliotecas predefinidas (*java.util*, *java.io*).  
   - **Herramientas adicionales**: Depurador, generador de documentación (*javadoc*).  

2. **JRE (Java Runtime Environment)**:  
   - **JVM (Java Virtual Machine)**: Ejecuta bytecode en cualquier sistema operativo.  
   - **Bibliotecas estándar**: Funciones esenciales para I/O, redes, gráficos.  

3. **JVM (Java Virtual Machine)**:  
   - **Intérprete + JIT Compiler**: Convierte bytecode en instrucciones específicas del sistema.  
   - **Garbage Collector**: Libera memoria automáticamente.  

🔍 **Relación entre JDK, JRE y JVM**:  
![JDK, JRE y JVM](img_doc/5.png)  

---

#### **⚙️ ¿Cómo Java es *multiplataforma*?**  
Java combina **compilación** e **interpretación**:  
1. **Compilas** tu código `.java` a bytecode (`.class`).  
2. La **JVM** interpreta el bytecode y lo adapta al sistema operativo.  

![Proceso de compilación](img_doc/compilacion2.png)  

**Ejemplo**: Un programa compilado en Windows funcionará en Linux *sin cambios*, gracias a la JVM específica de cada OS.  

---

#### **🛠️ Configuración de Entorno: Cambiar Versiones de Java**  
Si tienes múltiples versiones instaladas:  
- **Por línea de comandos** (Windows):  
  ```bash  
  setx JAVA_HOME "C:\Program Files\Java\jdk-11"  
  ```  
  ![Cambiar variables de entorno](img_doc/cmd_variable_entorno.png)  

- **En IntelliJ IDEA**:  
  ![Seleccionar JDK en IntelliJ](img_doc/IDE_java.png)  

---

#### **🔍 Herramientas Clave: JShell y JAR**  
- **JShell (Java 9+)**:  
  - Consola interactiva para probar código sin crear proyectos.  
  ```bash  
  jshell  
  > System.out.println("¡Hola desde JShell!");  
  ```  
  ![Ejemplo de JShell](img_doc/jshell.png)  

- **Archivos JAR**:  
  - Empaquetan múltiples `.class` en un solo archivo comprimido (como ZIP).  
  - Ejecutables con:  
    ```bash  
    java -jar mi_app.jar  
    ```  
  - Requieren una JVM igual o superior a la versión de compilación.  

---

#### **📦 Plataformas Java: Más Allá de SE**  
Java se adapta a distintos contextos:  

| **Plataforma** | **Uso Principal** |  
|----------------|-------------------|  
| **Java SE**    | Aplicaciones de escritorio, consola y Android. |  
| **Java EE**    | Sistemas empresariales (APIs REST, microservicios). |  
| **Java ME**    | Dispositivos embebidos (IoT, tarjetas inteligentes). |  
| **JavaFX**     | Interfaces gráficas modernas con efectos multimedia. |  

---


---

### **📅 Java en la Actualidad: Versiones, Herramientas y Frameworks**  
*Desde Java 8 hasta Java 17: ¿Qué necesitas saber para empezar?*  

---

#### **🔄 Java 8 vs. Java 11 vs. Java 17: Elige tu Versión**  
Java sigue evolucionando, pero las empresas priorizan **estabilidad sobre novedad**. Aquí un resumen clave:  

| **Versión** | **Estado** | **Soporte** |  
|-------------|------------|--------------|  
| **Java 8 (LTS)** | La más popular hasta 2023. Usada en el 65% de proyectos (Según JetBrains, 2022). | Soporte gratuito hasta **diciembre 2020**. Post 2020, Oracle cobra por actualizaciones críticas. |  
| **Java 11 (LTS)** | Versión recomendada para nuevos proyectos. | Soporte LTS hasta **septiembre 2026** (gratuito con OpenJDK). |  
| **Java 17 (LTS)** | Última LTS (2021). Incluye mejoras de rendimiento y sintaxis. | Soporte hasta **2029**. |  

**¿Por qué Java 8 sigue siendo reina?**  
- **Legado**: Muchos sistemas bancarios y gubernamentales la usan.  
- **Familiaridad**: Lambdas y Streams (*Java 8*) aún son la base de muchos tutoriales.  
- **Coste de migración**: Actualizar a Java 11+ puede romper código antiguo.  

**En este curso**: Usaremos **Java 8 y 11** para entender tanto código heredado como buenas prácticas modernas.  

---

#### **🛠️ Herramientas Imprescindibles**  
1. **Gestores de Dependencias**:  
   - **Maven**:  
     - *Ventaja*: Configuración centralizada en `pom.xml`.  
     - *Desventaja*: XML puede ser verboso.  
   - **Gradle**:  
     - Usa Kotlin/Groovy para scripts más limpios.  
     - Ideal para proyectos Android y microservicios.  

2. **Frameworks Estrella**:  
   - **Spring (Java EE/Spring Boot)**:  
     - Crea APIs REST, aplicaciones web y microservicios con anotaciones simples (`@RestController`, `@Autowired`).  
     - Incluye Spring Security (autenticación) y Spring Data JPA (bases de datos).  
   - **Hibernate (ORM)**:  
     - Mapea objetos Java a tablas de bases de datos sin escribir SQL manual.  
     - Ejemplo: `@Entity` para convertir una clase en una tabla.  

---

#### **💻 IDEs: Elige tu Arma**  
Un **IDE** es tu taller de desarrollo: editor de código, depurador, integración con Git y más. Opciones clave:  

| **IDE** | **Ventajas** | **Desventajas** |  
|---------|--------------|------------------|  
| **IntelliJ IDEA** | - Soporte nativo para Kotlin y Spring. <br> - Autocompletado inteligente. | - La versión Ultimate es de pago (≈$50/mes). |  
| **Eclipse** | - Gratuito y personalizable. <br> - Spring Tool Suite (STS) integra Spring. | - Interfaz menos intuitiva. |  
| **NetBeans** | - Oficial de Oracle. <br> - Ideal para JavaFX. | - Menos popular desde 2020. |  

**Recomendación**:  
- **Principiantes**: Usa **IntelliJ IDEA Community Edition** (gratis).  
- **Desarrollo Empresarial**: **Spring Tool Suite (basado en Eclipse)** para integración con Spring Boot.  

---

#### **🚀 Java en 2024: Tendencias**  
- **Jakarta EE**: La evolución *open-source* de Java EE para aplicaciones en la nube.  
- **Quarkus**: Framework para microservicios rápidos (usa menos memoria que Spring).  
- **Kotlin**: Lenguaje moderno que corre en la JVM, 100% compatible con Java.  

---

### **🔧 Configura tu Entorno**  
**Pasos para empezar**:  
1. **Descarga JDK 11**: Usa [OpenJDK](https://adoptium.net/) (gratis).  
2. **Instala IntelliJ IDEA**: [Versión Community](https://www.jetbrains.com/idea/).  
3. **Crea tu Primer Proyecto**:  
   - Selecciona **Maven** o **Gradle**.  
   - ¡Escribe tu primer `HolaMundo.java`!  

```java  
public class HolaMundo {  
    public static void main(String[] args) {  
        System.out.println("¡Java nunca murió!");  
    }  
}  
```  
