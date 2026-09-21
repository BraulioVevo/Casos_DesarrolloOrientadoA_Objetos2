# SpeedFast - Sistema Concurrente de Gestión de Entregas (Semana 6)

Este proyecto corresponde a la implementación de un sistema concurrente para la empresa **SpeedFast**, desarrollado en Java como parte de la asignatura **Desarrollo Orientado a Objetos II** en Duoc UC.

## 🚀 Características

* **Registro de Pedidos**: Permite ingresar un nuevo pedido con ID, Dirección y Tipo (*Comida*, *Encomienda*, *Express*).
* **Listado de Pedidos**: 
  * Vista en tabla mediante `JTable` (Ventana desplegable).
  * Vista rápida en texto enriquecido mediante `JTextArea` en la pantalla principal.
* **Simulación de Entrega**: Procesa los pedidos almacenados y notifica el inicio de la ruta de entrega.
* **Persistencia en Memoria**: Mantiene el estado de la aplicación utilizando una instancia única de controlador (`PedidoController`).

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje**: Java 17+
* **Interfaz Gráfica (GUI)**: Java Swing (IntelliJ GUI Designer)
* **IDE**: IntelliJ IDEA

---

## 📂 Estructura del Proyecto

```text
src/
├── controller/
│   └── PedidoController.java      # Lógica de negocio y almacenamiento en memoria
├── model/
│   ├── Pedido.java                # Clase modelo base de pedidos
│   └── EstadoPedido.java          # Enum con los estados del pedido (PENDIENTE, EN_CAMINO, etc.)
├── view/
│   ├── VentanaPrincipal.java      # Ventana principal del sistema (.java y .form)
│   ├── VentanaRegistroPedido.java # Formulario de ingreso (.java y .form)
│   └── VentanaListaPedidos.java    # Tabla de visualización (.java y .form)
└── main/
    └── Main.java                  # Punto de entrada de la aplicación

```

🚀 Ejecución del Proyecto
Clona el repositorio:

Bash
git clone https://github.com/BraulioVevo/Casos_DesarrolloOrientadoA_Objetos2.git

Abre el proyecto en IntelliJ IDEA. 

En este caso, se debe seleccionar la carpeta terminada en "Semana6", que es donde esta el caso de esta semana.

Ejecuta la clase Main.java situada en el paquete app.
