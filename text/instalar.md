## Instalación de Java en windows
A continuación mostraremos cómo instalar la herramienta de desarrollo JDK.
 JDK
incluye Java Runtime Environment, el compilador Java y las API de Java.
Algunas PC’s pueden tener Java ya instalado. Para verificar si tienes Java instalado en
una PC con Windows, escribe lo siguiente en el símbolo del sistema (cmd.exe):

```cmd
C:\Users\Your Name>java -version
```

Si Java está instalado, verás algo como esto (dependiendo de la versión):

```cmd
java version "17.0.2" 2022-01-18 LTS
Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)
```


Si no tienes Java instalado en tu computadora, realiza lo siguiente:
Visita la página de Java en Oracle: https://www.oracle.com/java/

![pagina de oracle](./img_doc/6.png)

Da clic en Download Java, te redireccionará a la siguiente página

![señala la version de java en la pagina de oracle](./img_doc/7.png)

Elige la pestaña que dice Java 17 y da clic donde dice Windows

![señala la version de Descarga para windows](./img_doc/8.png)

A continuación descarga el archivo ejecutable que se encuentra en el apartado de abajo.
Dirígete a la carpeta de Descargas y ejecuta el archivo:

**jdk-17_windows-x64_bin.exe**


![ejecutable de Instalación de java de oracle](./img_doc/9.png)


Da clic en Siguiente

![interfaz del instalador de java para seleccionar la ruta de instalacion](./img_doc/10.png)

Escoge la dirección donde quieres almacenar los archivos del programa o puedes dejar
el que muestra por default; da clic en Siguiente. Espera a que se instale
Al finalizar la instalación, cierra la ventana.

![finalizar el proceso de instalacion en la interfaz del instalador de java](./img_doc/11.png)


A continuación, ubica la carpeta \bin en el Explorador de Archivos

![ruta se muestra en el explorador de archivos](./img_doc/12.png)


Copia la dirección de la carpeta \bin , en el caso del ejemplo es la siguiente:

**C:\Program Files\Java\jdk-17.0.2\bin**

Ve a "Propiedades del sistema" (Se puede encontrar en Panel de control > Sistema >
Configuración avanzada del sistema).

![panel de control Configuración avanzada](./img_doc/13.png)

Haz clic en el botón "Variables de entorno" en la pestaña "Opciones avanzadas".

![configuracion variables de entorno](./img_doc/14.png)

Luego, selecciona la variable "Path" en Variables del sistema y haz clic en el botón
"Editar".

![editar Path](./img_doc/15.png)

Haz clic en el botón "Nuevo" y agrega la ruta donde está instalado Java, que es la que
habíamos copiado arriba **C:\Program Files\Java\jdk-17.0.2\bin** (si no se especificó
nada más cuando lo instaló). Luego, haz clic en "Aceptar" y guarda la configuración.

![agregar variable de entorno](./img_doc/16.png)

Por último, abre el símbolo del sistema (cmd.exe) y escribe java -version para ver si Java
se está ejecutando en tu máquina


```cmd
C:\Users\Your Name>java -version
java version "17.0.2" 2022-01-18 LTS
Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
```
También tenemos algunos editores en línea para programar en Java. Aquí te dejamos algunos:

https://www.jdoodle.com/online-java-compiler/
https://www.programiz.com/java-programming/online-compiler/
https://www.interviewbit.com/online-java-compiler/


## Instalar en mac OS

[![Miniatura del video](https://img.youtube.com/vi/pShVlXCM75I/maxresdefault.jpg)](https://www.youtube.com/watch?v=pShVlXCM75I)

[![Miniatura del video](https://img.youtube.com/vi/47AeOQJCV6s/maxresdefault.jpg)](https://www.youtube.com/watch?v=47AeOQJCV6s)





## Instalacion en Linux base debian

[![Miniatura del video](https://img.youtube.com/vi/QauitHvQZHA/maxresdefault.jpg)](https://www.youtube.com/watch?v=QauitHvQZHA)

