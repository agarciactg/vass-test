# Proyecto Spring Boot con Endpoint REST

Este es un proyecto básico de Spring Boot que incluye un endpoint REST para probar el funcionamiento del framework.

## Estructura del Proyecto

El proyecto sigue una estructura estándar de proyecto Spring Boot. A continuación se muestra una breve descripción de cada directorio y archivo:

- **src/main/java**: Contiene el código fuente de la aplicación Java.
  - **com.example.EndpointGet**: Paquete principal de la aplicación.
    - **EndpointGetApplication.java**: Clase principal de la aplicación que inicia el contexto de Spring Boot.
    - **TestController.java**: Clase que define el controlador REST con el endpoint `/Test/Status`.

- **src/main/resources**: Contiene los archivos de recursos de la aplicación, como archivos de configuración.
- **pom.xml**: Archivo de configuración de Maven que define las dependencias y la configuración del proyecto.

## Ejecución del Proyecto

Para ejecutar el proyecto, puedes utilizar cualquier IDE compatible con Maven o utilizar la línea de comandos. Asegúrate de tener instalado Java y Maven en tu sistema.

1. Clona el repositorio: `git clone https://github.com/agarciactg/vass-test`.
2. Navega al directorio del proyecto: `cd endpointget`.
3. Ejecuta el comando Maven para compilar y ejecutar la aplicación: `mvn spring-boot:run`.

La aplicación se iniciará y estará disponible en [http://localhost:8080](http://localhost:8080).

## Probando el Endpoint

Una vez que la aplicación esté en funcionamiento, puedes probar el endpoint REST `/Test/Status` enviando una solicitud GET con un parámetro `value`. Por ejemplo:

GET /Test/Status?value=4

Esto debería devolver el texto "Aprobado" si el valor es mayor o igual a 3, o "Reprobado" en caso contrario.

¡Disfruta probando tu aplicación Spring Boot!

