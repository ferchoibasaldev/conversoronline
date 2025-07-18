# 💱 Conversor de Monedas en Java (POO)

Este es un proyecto de consola desarrollado en Java usando el paradigma de **Programación Orientada a Objetos (POO)**. El conversor permite convertir entre diferentes monedas utilizando la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/), y está estructurado en clases separadas para promover la escalabilidad y el mantenimiento.

---

## 📂 Estructura del Proyecto

```
ConversorMonedas/
├── src/
│   └── com/
│       └── nandothedeveloper/
│           └── conversor/
│               ├── Main.java
│               ├── model/
│               │   └── ConversionResult.java
│               ├── service/
│               │   └── CurrencyConverterService.java
│               └── util/
│                   └── ApiClient.java
└── lib/
    └── json-20230227.jar
```

---

## 🛠 Tecnologías Usadas

- Java 8+
- HTTP (HttpURLConnection)
- Librería `org.json` para el manejo de respuestas JSON
- API: [ExchangeRate-API](https://www.exchangerate-api.com/)
- IDE recomendado: Visual Studio Code o IntelliJ IDEA

---

## 🚀 Cómo ejecutar

### 1. Clona el repositorio

```bash
git clone https://github.com/tuusuario/conversor-monedas-java.git
cd conversor-monedas-java
```

### 2. Descarga la librería JSON

Coloca el archivo `json-20230227.jar` en la carpeta `/lib`.

Puedes descargarlo desde [aquí](https://repo1.maven.org/maven2/org/json/json/20230227/json-20230227.jar).

---

### 3. Compila el proyecto

```bash
javac -cp "lib/json-20230227.jar" -d out src/com/nandothedeveloper/conversor/**/*.java
```

### 4. Ejecuta el conversor

```bash
java -cp "out;lib/json-20230227.jar" com.nandothedeveloper.conversor.Main
```

> En Mac o Linux, usa `:` en vez de `;` en el classpath.

---

## 💡 Ejemplo de uso

```bash
=== CONVERSOR DE MONEDAS ===
Moneda origen (ej. USD): USD
Moneda destino (ej. PEN): PEN
Cantidad a convertir: 10

10.00 USD = 37.50 PEN
```

---

## 🔐 API Key

Este proyecto usa tu clave de la API:

```
https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/USD/PEN/10
```

Asegúrate de reemplazar `"YOUR_API_KEY"` por tu clave personal. Puedes obtener una gratis en:

➡️ https://www.exchangerate-api.com/


## 👨‍💻 Autor

Desarrollado por **Fernando Ibarra Salinas**  
🔗 [@nandothedeveloper](https://github.com/nandothedeveloper)

---

## 📄 Licencia

MIT License – libre para uso personal, académico o profesional.
