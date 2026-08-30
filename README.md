# Sistema de Gestión de Envíos - SpeedFast 🚚

Este proyecto corresponde a la evaluación de la **Semana 3** de la asignatura **Desarrollo Orientado a Objetos II** (Duoc UC). La aplicación simula un sistema integral de despacho de pedidos expreso para la empresa *SpeedFast*, aplicando los principios de la Programación Orientada a Objetos (POO): **Abstracción, Polimorfismo e Interfaces**.


---

## 📐 Estructura y Arquitectura del Sistema

El proyecto está organizado en paquetes para mantener un bajo acoplamiento y alta cohesión:

```text
src/
├── app/
│   └── Main.java                 # Punto de entrada y simulación
├── model/
│   ├── Pedido.java               # Clase base abstracta
│   ├── PedidoComida.java         # Subclase especializada
│   ├── PedidoEncomienda.java     # Subclase especializada
│   └── PedidoExpress.java        # Subclase especializada
├── service/
│   └── GestorDeEnvios.java       # Control de historial y trazabilidad
└── strategy/
    ├── Cancelable.java           # Interfaz para cancelación
    ├── Despachable.java          # Interfaz para flujo de despacho
    └── Rastreable.java           # Interfaz para seguimiento

```

🚀 Ejecución del Proyecto
Clona el repositorio:

Bash
git clone https://github.com/BraulioVevo/S1_Caso_SpeedFast.git

Abre el proyecto en IntelliJ IDEA. 

En este caso, se debe seleccionar la carpeta terminada en S3, que es donde esta el caso de esta semana.

Ejecuta la clase Main.java situada en el paquete app.
