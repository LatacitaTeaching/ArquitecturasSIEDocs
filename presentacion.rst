=======================
 Capa de Presentación
=======================

Descripción
============

Todo sistema de información empresarial, para que resulte útil, debe proporcionar mecanismos para que sus usuarios puedan interactuar cómodamente con él. Es decir, se hace necesario el desarrollo de una *capa de presentación* que permita a los usuarios realizar peticiones al sistema y visualizar, de manera adecuada, las respuestas a dichas peticiones. 

Por diferentes razones, como la ubicuidad, estandarización o capacidad multiplataforma de la web, estas capas de presentación se desarrollan principalmente hoy en día como interfaces web que se comunican con el servidor del sistema a través del protocolo HTTP. 

El objetivo de esta última fase de nuestro proyecto es el desarrollo de una capa de presentación web, implementada en Angular, para el sistema *Polaflix*. Para satisfacer dicho objetivo se deberán completar las siguientes actividades.  

Actividades a realizar
=======================

Para superar esta etapa del proyecto, el estudiante deberá realizar las siguientes actividades.

  #. Crear una maquetación inicial en HTML y CSS que de soporte a algunas de las interfaces web del sistema.    
  #. Implementar un *router* adecuado que de soporte a la aplicación del patrón *Single.Page Application* para las interfaces que hayan sido creadas. 
  #. Crear los componentes Angular que sean necesarios para dotar de interactividad a las interfaces creadas.
  #. Crear los servicios necesarios para recuperar los datos que sean necesarios para  

Para poder superar esta etapa no es necesario implementar todas las interfaces. El estudiante tan solo deberá implementar:

  #. La interfaz de entrada a la aplicación (Ver Descripción, Figura 1).
  #. Una de las dos siguientes opciones:
   
    a. La interfaz para visualizar una serie, incluyendo la opción que realiza la llamada para marca un capítulo como visto (Ver Descripción, Figura 2).
    b. La interfaz para visualizar el catálogo de series, incluyendo la opción que realizar la llamada para agregar una serie a la lista de pendientes para el usuario (Ver Descripción, Figura 3). 

El resto de interfaces podrán implementarse de manera opcional, pero no tendrán ningún efecto sobre la calificación del estudiante salvo que éste esté interesado en optar a la *matrícula de honor* en la asignatura. Es decir, se podrá obtener la máxima calificación en esta fase sin necesidad de realizar ninguna interfaz adicional, pero el número de interfaces adicionales implementadas puede ser un criterio para decidir qué estudiante obtiene la *matrícula de honor* en el caso de que haya varios estudiantes en situación de obtenerla.   

.. tip::
   Para facilitar la implementación del sistema y obviar la necesidad de autenticarse, se puede almacenar el nombre del usuario que se visualizará en la interfaz de la aplicación como una variable *Javascript* almacenada en la propia capa de presentación.  

Elementos a entregar
=====================

  #. El código resultante de crear las interfaces web requeridas, aplicando el patrón SPA y definiendo servicios para recuperar la información del servidor. 

Criterios de calificación
==========================

SPA y Router
-------------

Para este elemento del proyecto se valorará que:

  * Se haya implementado un router para dar soporte al patrón *Single-Page Application*. 
  * Los elementos enrutados se corresponda exclusivamente con los elementos variables de las interfaces de la aplicación. 
  * Se haga una correcta utilización de los párametros de las URLs para pasar información entre componentes.   

Componentes Angular
--------------------

Para este elemento del proyecto se valorará que:

  * Haya un componente definido para cada parte de la interfaz que requiera interactividad o se tenga que construir dinámicamente a partir de datos recuperados de la API REST.
  * Los componentes hagan un correcto uso del concepto de *programación reactiva*, definiendo una serie de *variables observadas* que controlen el comportamiento de la aplicación.
  * Se haga un correcto uso de los elementos de Angular para mostrar y ocultar elementos.    

Servicios
----------

Para este elemento del proyecto se valorará que:

  * Se hayan definido servicios que permitan realizar llamadas AJAX adecuada a la API REST del sistema.
  * Estos servicios tengan un comportamiento asíncrono correcto.
  * Se haga un tratamiento adecuado de los códigos de error que puedan ser recibidos.    