Informe de Aplicación de Reglas de Clean Code y Arquitectura Hexagonal
Información General

Proyecto: Users Management System
Autor: Caled Manuel Vivanco Pajaro
Repositorio: https://github.com/CaledVivanco/Java_QA

Objetivo

El objetivo de este informe es describir las mejoras realizadas en el proyecto aplicando principios de Clean Code y Arquitectura Hexagonal, corrigiendo malas prácticas en el código.

Reglas Aplicadas y Soluciones
Regla 1: Una sola responsabilidad por función
Problema:

Existían métodos que realizaban múltiples tareas, especialmente en la clase Main.

Solución:

Se dividieron las responsabilidades en métodos más pequeños:

buildContainer()
runApplication()
buildCli()

Resultado:

Código más claro
Fácil mantenimiento
Regla 4: Evitar uso de == null
Problema:

Se usaban validaciones como:

if (value == null)
Solución:

Se reemplazó por:

Objects.requireNonNull(value, "El valor no puede ser nulo");

Resultado:

Mejor control de errores
Código más seguro
Regla 6: No usar logging en el dominio
Problema:

Clases del dominio contenían logs.

Solución:

Se eliminaron los logs del dominio.

Resultado:

Dominio limpio
Independencia de infraestructura
Regla 9: Encapsulamiento y control de instancias
Problema:
Constructores públicos en excepciones
Dependencia del dominio hacia entidades (UserEntity)
Solución:
Constructores privados
Métodos fábrica (because...)
Eliminación de toEntity()

Resultado:

Mejor encapsulamiento
Arquitectura más limpia
Regla 10: Evitar valores hardcodeados
Problema:

Valores escritos directamente en el código.

Solución:

Uso de constantes:

private static final int MIN_LENGTH = 8;
private static final String ERROR_MESSAGE = "Mensaje de error";

Resultado:

Código mantenible
Fácil de modificar
Regla 15: Inmutabilidad
Problema:

Uso de @Data permitía modificar objetos.

Solución:

Uso de:

@Value

Resultado:

Objetos inmutables
Mayor seguridad
Regla 22: Reducir acoplamiento
Problema:

Clases muy dependientes entre sí.

Solución:

Separación de responsabilidades en métodos y clases.

Resultado:

Código más flexible
Mejor escalabilidad
Regla 23: Evitar conocimiento disperso
Problema:

Validaciones repetidas en varias clases.

Solución:

Centralización en Value Objects:

UserEmail
UserPassword

Resultado:

Menos duplicación
Código más organizado
Regla 24: Consistencia
Problema:

Uso de múltiples frameworks de logging.

Solución:

Unificación del sistema de logging.

Resultado:

Código uniforme
Fácil comprensión
Arquitectura Hexagonal
Problema:

El dominio dependía de la infraestructura.

Solución:
Implementación de Ports & Adapters
Eliminación de dependencias externas en el dominio

Resultado:

Dominio independiente
Código más profesional
Conclusión

Después de aplicar las reglas:

Código más limpio
Mejor organizado
Fácil mantenimiento
Cumple buenas prácticas profesionales

Se logró transformar el proyecto en una solución más escalable y alineada con estándares de desarrollo moderno.
