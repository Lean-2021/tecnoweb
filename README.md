# TecnoWeb - Consola Java (Curso)

Proyecto de practica para gestionar productos desde consola.

## Que incluye hoy

- Modelo de producto (`model`)
- Servicio de productos con operaciones CRUD (`service`)
- Excepciones personalizadas (`exception`)
- Validaciones de entrada (`util`)
- Menu en consola (`ui`)

## Estado actual del menu

- Implementado: opciones **1 a 5** (productos)
- Implementado: opcion **9** (salir)
- Pendiente: opciones **6, 7 y 8** (pedidos). Se implementaran en una futura version.

## Estructura del proyecto

- `src/`: codigo fuente Java
- `lib/`: librerias externas (si se agregan)
- `bin/`: salida compilada

> Nota: la carpeta `bin/` compilada no se sube al repositorio (`.gitignore`).

## Como usar este proyecto (paso a paso)

Requisito: tener Java (JDK) instalado.

1. Clonar el repositorio.
2. Entrar a la carpeta del proyecto.
3. Elegir una forma de ejecucion:

### Opcion A: ejecutar desde VS Code (recomendada)

- Instalar en VS Code la extension **Extension Pack for Java**.
- Abrir el proyecto y entrar al archivo `App.java`.
- Presionar el boton **Run/Play** para compilar y ejecutar.

### Opcion B: compilar y ejecutar por terminal

Compilar:

```bash
javac -d bin src/com/tecno/ecommerce/**/*.java
```

Si tu terminal no soporta `**`, compila desde la raiz con:

```bash
javac -d bin src/com/tecno/ecommerce/App.java src/com/tecno/ecommerce/model/*.java src/com/tecno/ecommerce/service/*.java src/com/tecno/ecommerce/ui/*.java src/com/tecno/ecommerce/util/*.java src/com/tecno/ecommerce/exception/*.java
```

Ejecutar:

```bash
java -cp bin com.tecno.ecommerce.App
```

4. Usar las opciones del menu en consola.

## Que muestra la opcion 1 (Listar productos)

Al listar productos, se muestran estos datos por cada producto:

- `ID` (entero)
- `Nombre` (texto)
- `Categoria` (texto)
- `Descripcion` (texto)
- `Precio` (decimal)
- `Stock` (entero)

## Datos que pide el sistema

### Opcion 3: Agregar producto

Campos solicitados (todos obligatorios):

- `Nombre`: texto, no vacio
- `Categoria`: texto, no vacio
- `Descripcion`: texto, no vacio
- `Precio`: numero decimal, mayor o igual a 0
- `Stock`: numero entero, mayor o igual a 0

### Opcion 4: Actualizar producto

1. Primero pide `ID` del producto (entero).
2. Se valida que ese ID exista.
3. Si existe, pide los mismos campos de alta:

- `Nombre`: texto, no vacio
- `Categoria`: texto, no vacio
- `Descripcion`: texto, no vacio
- `Precio`: numero decimal, mayor o igual a 0
- `Stock`: numero entero, mayor o igual a 0

### Opcion 5: Eliminar producto

- Pide `ID` del producto (entero).
- Se valida que el ID exista antes de eliminar.

## Observaciones

- En actualizar y eliminar, se valida que el `ID` ingresado exista.
- En actualizar, si el ID no existe, no se piden los nuevos datos y se muestra el error correspondiente.
- Validaciones de tipo (en el momento de escribir):
	- Si en un entero o decimal se ingresa un formato incorrecto, el sistema avisa en ese momento y vuelve a pedir el dato.
- Validaciones de contenido (al confirmar crear/actualizar):
	- Los campos de texto (`Nombre`, `Categoria`, `Descripcion`) se validan cuando se intenta crear o actualizar.
	- Si alguno esta vacio, se muestra el mensaje indicando que campo esta mal.
	- Esto se muestra despues de completar todos los campos de la opcion.
