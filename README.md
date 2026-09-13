# Sistema de Gestión de Envíos - SpeedFast 🚚

Este proyecto corresponde a la evaluación de la **Semana 5** de la asignatura **Desarrollo Orientado a Objetos II** (Duoc UC). La aplicación simula un sistema integral de despacho de pedidos expreso para la empresa *SpeedFast*, aplicando los principios de la Programación Orientada a Objetos (POO): **Abstracción, Polimorfismo e Interfaces**.


---

## 📐 Estructura y Arquitectura del Sistema

El proyecto está organizado en paquetes para mantener un bajo acoplamiento y alta cohesión:

```
Sistema_Speedfast_Semana5/
└── src/
    ├── app/
    │   └── Main.java             # Clase principal: inicializa la zona de carga y ejecuta el pool de hilos
    ├── model/
    │   ├── EstadoPedido.java     # Enum con los estados del pedido (PENDIENTE, EN_REPARTO, ENTREGADO)
    │   ├── Pedido.java           # Clase base abstracta/padre
    │   ├── PedidoComida.java     # Subclase especializada
    │   ├── PedidoEncomienda.java # Subclase especializada
    │   └── PedidoExpress.java    # Subclase especializada
    ├── service/
    │   ├── GestorDeEnvios.java   # Servicio de registro e historial de envíos
    │   ├── Repartidor.java       # Implementa Runnable; define la lógica de trabajo de cada hilo
    │   └── ZonaDeCarga.java      # Recurso compartido con métodos sincronizados
    └── strategy/
        ├── Cancelable.java       
        └── Rastreable.java
        └── Despachable.java

```

🚀 Ejecución del Proyecto
Clona el repositorio:

Bash
git clone https://github.com/BraulioVevo/Casos_DesarrolloOrientadoA_Objetos2.git

Abre el proyecto en IntelliJ IDEA. 

En este caso, se debe seleccionar la carpeta terminada en "Semana5", que es donde esta el caso de esta semana.

Ejecuta la clase Main.java situada en el paquete app.
