# Estructuras dinámicas de datos: Pilas y Colas en Java

Programación de Servicios y Procesos · 2º DAM · UD01

## Descripción

Conjunto de ejercicios de consola en Java que usan estructuras de datos dinámicas, **Pila** (LIFO) y **Cola** (FIFO), implementadas desde cero con nodos enlazados, sin usar las colecciones de `java.util` (`Stack`, `ArrayDeque`, `LinkedList`...).

## Estructura del proyecto

Las tres clases de la estructura de datos están en un paquete aparte y se reutilizan en todos los ejercicios:

| Clase | Descripción |
|---|---|
| `Nodo<T>` | Clase común y genérica: guarda un dato y la referencia al siguiente nodo. Es la base de la pila y de la cola. |
| `Pila<T>` | Pila (LIFO) construida sobre `Nodo<T>`. Operaciones: `push`, `pop`, `peek`, `isEmpty`, `size`. |
| `Cola<T>` | Cola (FIFO) construida sobre `Nodo<T>`. Operaciones: `offer`, `poll`, `peek`, `isEmpty`, `size`. |

**Reutilización de código:** `Pila` y `Cola` no definen nodos propios, las dos usan la misma clase `Nodo<T>`.

## Ejercicios

### Ejercicio 01 · Invertir un texto con una pila

Aplicación de consola que invierte el texto introducido usando exclusivamente operaciones de una pila. Cada carácter de la línea se apila (`push`) y después se desapila (`pop`) para construir la cadena invertida, comprobando con `isEmpty` cuándo termina. No se recorre la cadena hacia atrás ni se usan utilidades de inversión directa.

**Ejemplo:** `Hola` → `aloH`

### Ejercicio 02 · Fila de clientes con una cola

Simulación de una fila de clientes atendidos por orden de llegada. Se gestiona por consola con el siguiente menú:

1. **Llegada:** se encola el nombre del cliente.
2. **Atender:** se desencola y se muestra el cliente atendido.
3. **Mostrar cola:** se muestra el estado actual de la cola.
4. **Salir.**

El menú valida la entrada para que el programa no se interrumpa si se escribe algo que no es un número, y avisa si se intenta atender con la cola vacía.

### Ejercicio 03 · Comprobador de palíndromos

Comprueba si una palabra o frase es palíndroma usando a la vez una pila (lectura inversa) y una cola (lectura directa).

1. Se normaliza el texto: minúsculas y sin espacios.
2. Cada carácter se inserta en la pila y en la cola.
3. Se desapila y se desencola a la vez, comparando los elementos correspondientes. Si todos coinciden, es palíndromo.

**Ejemplos:** `Ana lava lana` → es palíndromo · `Hola` → no es palíndromo

### Ejercicio 04 · Conversión de decimal a binario

Conversión de un entero decimal positivo a binario usando una pila. Se divide el número entre 2 de forma repetida y se van apilando los restos. Al desapilarlos salen en orden inverso al que se obtuvieron, y esa secuencia es el número en binario.

**Ejemplo:** `10` → restos `0, 1, 0, 1` → al desapilar: `1010`

## Requisitos y ejecución

**Requisitos:** Java 17 o superior (o la versión que use el curso) y un IDE como IntelliJ IDEA o Eclipse.

**Cómo ejecutarlo:**

1. Descarga el proyecto: en la página del repositorio de GitHub pulsa **Code → Download ZIP** y descomprime la carpeta (o clónalo con `git clone`).
2. Abre el proyecto en tu IDE:
   - **IntelliJ IDEA:** *File → Open* y selecciona la carpeta del proyecto.
   - **Eclipse:** *File → Import → Existing Projects into Workspace* y selecciona la carpeta.
3. Comprueba que el IDE tiene configurado un JDK (*File → Project Structure → Project SDK* en IntelliJ).
4. Abre la clase `Main` del ejercicio que quieras probar y ejecútala (botón **Run** o clic derecho → *Run 'Main'*).

## Autor

Raul Talbi Daza · 2º DAM
