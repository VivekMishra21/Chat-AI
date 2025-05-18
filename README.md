# 🤖 Chat-AI - Spring Boot + Spring AI + Ollama

This is a GenAI project using **Spring Boot**, **Spring AI**, and **Ollama** to create an AI chatbot backed by local large language models like `mistral:latest`.

## 🚀 Features

- 🔗 RESTful API using Spring Boot
- 🧠 AI chat powered by [Spring AI](https://docs.spring.io/spring-ai/reference/)
- 🦙 Local inference using [Ollama](https://ollama.com/)
- 📥 Clean architecture using `ChatClient` abstraction

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.4.5
- Spring AI (1.0.0-M8)
- Ollama (running locally)
- REST API

---

## 📦 Maven Configuration

```xml
<properties>
    <java.version>17</java.version>
    <spring-ai.version>1.0.0-M8</spring-ai.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-starter-model-ollama</artifactId>
    </dependency>
</dependencies>
```

---

## 🔧 Configuration

In your `application.properties`:

```properties
spring.application.name=Chat-AI
spring.ai.ollama.chat.option=mistral:latest
```

Make sure you have Ollama installed and the model is pulled:

```bash
ollama run mistral
```

---

## 📡 API Endpoint

### `GET /api/{message}`

- **Description:** Get a response from the AI model for the given message.
- **Example:**  
  `GET http://localhost:8080/api/hello`

- **Response:**
  ```json
  {
    "response": "Hi there! How can I assist you today?"
  }
  ```

---

## ▶️ Running the Project

### 1. Clone the Repository

```bash
git clone https://github.com/VivekMishra21/Chat-AI.git
cd Chat-AI
```

### 2. Start Ollama with Mistral

```bash
ollama pull mistral
ollama run mistral
```

### 3. Run the Spring Boot App

```bash
./mvnw spring-boot:run
```

---

## 📌 Project Structure

```
├── controller
│   └── OllamaController.java
├── application.properties
├── pom.xml
└── ...
```

---

## 🧠 Future Improvements

- Add frontend using React/Angular
- Support chat history
- Model switching support (e.g., LLaMA, Gemma)
- Deploy with Docker

---

## 🧑‍💻 Author

**Vivek Mishra**

---

## ⭐️ Give it a Star

If you find this project useful, feel free to give it a ⭐️ on [GitHub](https://github.com/VivekMishra21/Chat-AI)!

---
