# SpeedFast - Sistema Concurrente de Gestión de Entregas (Semana 6)

Este proyecto corresponde a la implementación de un sistema concurrente para la empresa **SpeedFast**, desarrollado en Java como parte de la asignatura **Desarrollo Orientado a Objetos II** en Duoc UC.

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
