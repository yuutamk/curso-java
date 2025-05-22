### **📅 Java en la Actualidad**
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

**En este curso**: Usaremos **Java 8, 11 y 17** para entender tanto código heredado como buenas prácticas modernas.  

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
| **IntelliJ IDEA** <img width="100px" heigth="100px" src="https://static-00.iconduck.com/assets.00/intellij-idea-icon-512x512-ksbwsbbn.png"> | - Soporte nativo para Kotlin y Spring. <br> - Autocompletado inteligente. | - La versión Ultimate es de pago (≈$50/mes). |  
| **Eclipse** <img width="100px" heigth="100px" src="https://static-00.iconduck.com/assets.00/eclipse-icon-512x479-6ivkqawb.png">| - Gratuito y personalizable. <br> - Spring Tool Suite (STS) integra Spring. | - Interfaz menos intuitiva. |  
| **NetBeans** <img width="100px" heigth="100px" src="https://netbeans.apache.org/_/images/apache-netbeans.svg">| - Oficial de Oracle. <br> - Ideal para JavaFX. | - Menos popular desde 2020. |  

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

---

