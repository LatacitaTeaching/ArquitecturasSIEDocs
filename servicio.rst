=======================
 Capa de Servicio
=======================

Descripción
============

Un *modelo de dominio*, como el elaborado en la fase anterior del proyecto, permite representar y manipular conforme a las reglas de negocio de un determinado dominio una serie entidades pertenecientes a dicho dominio. Este modelo de dominio, y su implementación, nos permiten disponer de la lógica necesaria para poder gestionar dicho dominio de manera adecuada, atendiendo así las posibles peticiones de los usuarios del sistema.

No obstante, el *modelo de dominio* creado no es capaz por sí mismo de atender a las peticiones de los potenciales clientes. Estas peticiones llegarán al sistema como paquetes HTTP, que es necesario descodificar y redirigir al método o a los métodos adecuados del modelo de dominio. A continuación, se deberán persistir todos los cambios realizados en las entidades de dominio y componer una respuesta adecuada para el cliente que formuló la petición inicial, teniendo en cuenta los resultados obtenidos.

Para realizar todas las operaciones anteriores, es necesario la definición de una capa de servicio que contenga un controlador HTTP. En la mayoría de los sistemas hipermedia actuales, entre los que se encuentran los sistemas de información empresarial, este controlador HTTP se diseñan siguiendo las directrices de las arquitecturas REST.

Por tanto, en esta parte del proyecto crearemos una capa de servicio con controlador HTTP REST.

Actividades a realizar
=======================

Para superar esta etapa del proyecto, el alumno deberá realizar las siguientes actividades.

  #. Identificar los recursos que formarán la API del sistema.
  #. Proporcionar una URI adecuada para cada recurso.
  #. Especificar qué verbos HTTP serán aplicables a cada recurso.
  #. Por cada recurso y verbo, especificar la acción a realizar, posibles parámetros de entrada, respuestas proporcionadas y uno o más modelos de respuesta.
  #. Implementar los controladores REST utilizando las facilidades proporcionadas por *Spring*.
  #. Definir e implementar las operaciones que estarán disponibles a nivel de servicio, utilizando las anotaciones proporcionadas por *Spring* para la gestión de transacciones.
  #. Conectar los controladores HTTP con la capa de servicio.

Ficheros Auxiliares
====================

:download:`Modelo Especificación de API Rest <files/restApi(modelo).txt>`

Elementos a entregar
=====================

  #. Un documento de texto simple, o un archivo *pdf* no muy elaborado, que contenga la especificación de la API REST creada.
  #. El código correspondiente a la implementación de los controladores REST en *Spring*.
  #. Los POJOs con *anotaciones Jackson* para especificar su serialización.
  #. El código correspondiente a la implementación de la capa de servicio, con las anotaciones correspondientes para la gestión transaccional.

Criterios de calificación
==========================

Especificación API REST
------------------------

  Para esta fase del proyecto se valorará que:

  * Estén expuestos todos los recursos necesarios para el correcto desarrollo de la aplicación.
  * No estén expuestos recursos que no se consideren necesarios para el desarrollo de la aplicación.
  * La URI asociada a cada recurso es correcta.
  * Se potencia el paso de parámetros por URI frente a los parámetros HTTP.
  * Los verbos asociados a cada recurso permiten gestionarlos de manera adecuada.
  * Cada verbo y recurso tienen parámetros de entrada cuando se considera necesario.
  * Las respuestas para cada recurso y verbo cubren las diferentes posibles situaciones que puedan darse durante la ejecución de una petición.
  * Existen modelos de respuesta cuando sea necesario.
  * Los modelos de respuesta ofrecen un balance adecuado entre la cantidad de  información enviada y el número de peticiones que necesitan realizar los clientes para completar una determinada tarea.

Implementación Controladores REST
----------------------------------

Para esta fase del proyecto se valorará que:

  * Existe un controlador REST por cada *aggregate root* que sea necesario gestionar.
  * Exista un método para cada par (recurso, verbo) contenido en la aplicación.
  * Cada método esté correctamente asociado a su URI.
  * Cada método recupera sus parámetros de manera adecuada.
  * Cada método delega en la capa de servicio de manera correcta, cuando sea necesario.
  * Cada método devuelve una respuesta adecuada en función del resultado de su ejecución.

Serialización JSON
--------------------

Para esta fase del proyecto se valorará que:

  * Se hayan utilizado *anotaciones Jackson* de manera adecuada para definir las propiedades que aparecerán en cada respuesta HTTP y las que quedarán excluida.
  * Se han utilizado de manera adecuada las anotaciones para cortar *referencias circulares*.
  * Se han utilizado de manera adecuada las anotaciones para gestión de *value objects*.
  * Se han utilizado definido y utilizado de manera adecuadas vistas que definan DTOs.

.. Trucos y Consejos
.. ==================
