Singleton Pattern Example in Java

This repository demonstrates the Singleton Design Pattern using three implementations:
- Basic Singleton (`Logger`)
- Thread-Safe Singleton (`ThreadSafeLogger`)
- Enum-based Singleton (`EnumLogger`) – the recommended way



 Compile all files:
javac src/*.java


 Run examples:
java -cp src LoggerTest
java -cp src ThreadSafeLoggerTest
java -cp src EnumLoggerTest


 📌 Output

Each implementation shows that only one instance is created throughout the application.
📂 Project Structure

```
src/
  Logger.java
  LoggerTest.java
  ThreadSafeLogger.java
  ThreadSafeLoggerTest.java
  EnumLogger.java
  EnumLoggerTest.java
```
 Design Pattern Summary

| Type               | Thread-Safe | Lazy | Easy | Recommended |
|--------------------|-------------|------|------|-------------|
| Basic Singleton    | ❌          | ✅   | ✅   | ❌          |
| Thread-Safe        | ✅          | ✅   | ⚠️   | ⚠️          |
| Enum Singleton     | ✅          | ❌   | ✅✅✅ | ✅✅✅       |

DD
