===================
 Modelo de Dominio
===================

Descripción
============

El primer paso para la elaboración del proyecto consiste en la definición del *modelo de dominio*. Dicho *modelo de dominio* deberá caracterizar el dominio de la aplicación. Para ello, el modelo de dominio deberá especificar los elementos que constituyen el problema que queremos resolver, los datos que contienen dichos elementos y las reglas de manipulación de dichos elementos.
El modelo de dominio debe de estar libre de detalles de bajo nivel, propios de tecnologías o formas de implementación concretas, constituyendo un lenguaje universal para el desarrollo de la aplicación que facilite la comunicación entre desarrolladores y *stakeholders*.

Con esta idea en mente, la filosofía de desarrollo *Domain-Driven Design* [Evans2003]_ trata de establecer una serie de pautas para una adecuada elaboración de un modelo de dominio. Para ello se distinguen entre diferentes tipos de entidades de dominio, como *Entities* o *Value Objects* y se establecen una serie de reglas para establecer relaciones entre estos elementos. El seguimiento de estas reglas permite obtener modelos de dominio que preservan la integridad de sus elementos mientras que se asegura una cierta facilidad de evolución.

Actividades a realizar
=======================

Para superar esta etapa del proyecto, el alumno deberá realizar las siguientes actividades.

  #. Elaborar un *modelo de dominio*, representado mediante un diagrama de clases UML, que caracterice el* sistema Polaflix* anterioremente descrito.
  #. Clasificar los elementos del modelo anterior como *Entities*, *Value Objects* o *Services*.
  #. Identificar los *aggregates*, destacando su *aggregate root*, del modelo creado.
  #. Refactorizar el *modelo de dominio* inicialmente creado para que sea conforme a las reglas de *Domain-Driven Design*.
  #. Implementar el modelo de dominio en Java, utilizando simplemente *POJOs (Plain Old Java Objects)*, dentro de un proyecto *Spring Boot*.

Elementos a entregar
=====================

  #. Uno o más diagramas de clase UML, representando el modelo de domino creadado y refactorizado.
  #. Un documento de texto simple, o un archivo *pdf* no muy elaborado, donde se especifique de qué tipo (*Entity*, *Value Object* o *Service*) es cada elemento del modelo de dominio y qué *aggregates* existen dentro de dicho modelo, identificando por cada *aggregate* su *aggregate root*. Además, se deberán proporcionar todas las justificaciones que se consideren oportunas para justificar las decisiones anteriores.
  #. El código resultante de transformar el modelo de dominio anterior a Java.

Para la elaboración del modelo de dominio se recomienda utilizar MagicDraw_ como herramienta de modelado, aunque se deja libertad al alumno para utilizar la herramienta de modelado que considere más adecuada, existiendo incluso la posibilidad de elaborar los modelos a mano. En este último caso, el alumno deberá cuidar la limpieza de los modelos creados y escanearlos antes de su entrega.

Criterios de calificación
==========================

Modelo de Dominio
------------------

Para el modelo de dominio se valorará que:

  * Sea correcto desde un punto de vista de sintáctico.
  * Soporte todas las acciones a nivel de negocio que esté previsto realizar sobre dicho modelo de dominio.
  * Sea conforme a las reglas de *Domain-Driven Design*.
  * Facilite la gestión de las reglas de negocio asociadas al dominio.
  * Facilite ciertas evoluciones fácilmente anticipables.
  * Esté limpio, ordenado y sus nombres sean significativos.

Documento *Domain-Driven Design*
---------------------------------

En este apartado se valorará simplemente que las *entities*, *value objects* y *services*, *aggregates* y *aggregate roots* estén correctamente identificados, así como que las explicaciones proporcionadas sean coherentes y correctas desde un punto de vista técnico.

Implementación de los POJOs
----------------------------

En este apartado se valorará que:

  * La implementación creada sea conforme al modelo de dominio.
  * La elección de las estructuras de datos para las colecciones sea adecuada.
  * La lógica de negocio que se haya definido e implementado sea eficiente.
  * Los diferentes elementos que conforman el modelo tengan correctamente definidos sus métodos ``equals`` y ``hashCode``, y, opcionalmente, su método ``compareTo``.

.. _MagicDraw: https://www.nomagic.com/products/magicdraw
.. [Evans2003] E. J. Evans. *Domain-Driven Design*. Addison-Wesley, 2003.
