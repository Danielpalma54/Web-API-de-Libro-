# Web-API-de-Libro-
# Web API de Libro con control de excepciones y mejor descripción de API
 los utils se crearon para manejar excepciones de manera uniforme y estructurar respuestas de error de una manera consistente. 
 
 ![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/d883aa78-5442-4e4d-8d82-d8dd803e33c9)

LibroException: Esta clase se utiliza para representar excepciones específicas relacionadas con la lógica de negocio de los libros. Cuando no se encuentra un libro con un ID específico, se lanza una excepción de tipo LibroException con un mensaje personalizado.

ExceptionResponse: Esta clase proporciona una estructura uniforme para las respuestas de error. Contiene campos como la marca de tiempo (timestamp), el mensaje de error (message) y los detalles adicionales (details)

ExceptionHandler: Esta clase actúa como un manejador global de excepciones y define cómo se deben manejar las excepciones específicas (LibroException). Cuando se produce una excepción LibroException, este manejador la intercepta y construye una respuesta HTTP adecuada utilizando la clase ExceptionResponse.


# Controller Modificado

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/b9a1cadf-17c0-4333-bbf0-7aa009e7fd06)

El controlador LibroController gestiona las solicitudes HTTP relacionadas con libros, delegando las operaciones de negocio al servicio LibroService. Utiliza anotaciones como @GetMapping y @PostMapping para mapear las solicitudes a métodos específicos, proporcionando respuestas adecuadas según las operaciones realizadas, como obtener una lista de libros, recuperar un libro por su ID y crear un nuevo libro. 


# Modificacion de los API
** Si no existe el libro, lanzar un expcetion LibroException (GET /libros/{id_libro}). Enviar el estado NOT_FOUND con un mensaje personalizado
--LibroException

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/779c864d-23e8-46b6-8a9d-6e274d2c2a72)

--LibroException

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/db89e282-a357-445b-b34e-3dc1867a2bd7)

--RExceptionHandler

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/cf5522a3-097c-4114-bea0-8aaa306a18cc)

# EJECUCION
-- ECLIPSE
![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/9df30d6e-223b-457b-affd-7bbde311016c)

-- POSTMAN

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/28376d12-fe82-4a75-be72-41f01ceee6e8)


-- LIBRO NO ENCONTRADA

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/24f24a78-839d-4f6c-89ad-5ff7b1b240b5)


-- LIBRO CREADO

![image](https://github.com/Danielpalma54/Web-API-de-Libro-/assets/147771801/af0f9fed-7a7b-4afa-8e33-940b42246444)





