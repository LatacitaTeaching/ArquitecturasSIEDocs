================================
 Anotaciones JPA y Repositorios
================================

Descripción
============

Un *modelo de dominio*, como el elaborado en la fase anterior del proyecto, permite representar y manipular una serie entidades conforme a las reglas de negocio de un determinado dominio o contexto de aplicación. Este modelo de dominio, y su implementación, nos permiten disponer de la lógica necesaria para pode gestionar los elementos de dominio de manera adecuada, atendiendo así las posibles peticiones de los usuarios del sistema.

No obstante, el *modelo de dominio* creado en el punto anterior adolece de un problema, que es que reside sólo en memoria principal o RAM. Este hecho tiene asociado dos problemas fundamentales:

  #. Si el número de elementos de dominio a gestionar es muy grande, nos quedaremos sin memoria rápidamente.
  #. La memoria del sistema es volátil, por lo que cualquier corte en la alimentación del sistema hará que perdamos los datos alojados en ella.

Por tanto, para que nuestra sistema sea útil desde un punto de vista práctica, necesitamos guardar los elementos de nuestro modelo de dominio en algún tipo de almacén persistente, como una base de datos relacional o una hoja XML.

Actividades a realizar
=======================

Para superar esta etapa del proyecto, el alumno deberá realizar las siguientes actividades.

  #. Anotar los POJOs creados como ``@Entity`` o ``@Embbedadable``.
  #. Proporcionar un identificador adecuadom, utilizando ``@Id`` para cada POJO. Decidir si dicho identificador será autogenerado o no.
  #. Anotar las propiedades de cada POJO, utilizando para ello ``@OneToOne``, ``@OneToMany``, ``@ManyToOne`` o ``@ManyToMany``. Indicar, además para las asociaciones bidireccionales que lo necesiten, cual es la referencia opuesta correspondiente.
  #. Elegir una estrategia de propagación de operaciones cuando se considere necesario.
  #. Anotar las jerarquías de herencia, justificando el patrón de transformación elegido en cada caso.
  #. Crear los repositorios que se consideren necesarios para la gestión de la aplicación.
  #. Utilizando los repositorios creados, cargar la base de datos con una serie de datos iniciales.

Ficheros Auxiliares
====================

:download:`application.properties <files/application.properties>`

Elementos a entregar
=====================

  #. El código resultante de anotar con JPA los POJOs creados en la fase anterior.
  #. Un documento de texto simple, o un archivo *pdf* no muy elaborado, que justifique las estrategias de herencia seleccionadas, así como cualquier otro detalle que se considere relevante, como la elección de los idemtificadores.
  #. El código resultante de añadir los repositorios que se consideren necesarios a la aplicación.

Criterios de calificación
==========================

Anotaciones JPA
----------------

Para esta fase del proyecto se valorará que:

  * La elección de ``@Entity`` o ``@Embbedadable`` sea coherente con respecto a lo definido en el documento de *Domain-Driven Design*.
  * La elección de los identificadores es correcta y coherente.
  * El uso de las anotaciones para transformaciones referencias y colecciones es correcto.
  * En el caso de las asociaciones bidireccionales, los ``mappedBy`` están correctamente especificados.
  * Las estrategias de propagación de operaciones son correctas y coherentes.
  * La transformación de las jerarquías de herencia son correctas y coherentes.

Repositorios Spring JPA
-------------------------

Para esta fase del proyecto se valorará que:

  * La definición de los repositorios sea correcta.
  * Sólo existan repositorios para aquellos elementos de dominio que realmente lo precisen.
  * El alumno sea capaz de cargar la aplicación con una serie de datos iniciales.
