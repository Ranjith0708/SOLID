
# SOLID Principles

The SOLID principles are five key design guidelines for writing maintainable and scalable object-oriented code.

| Principle | Stands For                        | What It Means                                                              | Example in Practice                                                                           |
|-----------|-----------------------------------|----------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| **S**     | Single Responsibility Principle   | A class should have only **one reason to change**.                         | Split `InvoiceManager` into `Invoice`, `InvoicePrinter`, and `InvoiceRepository`.             |
| **O**     | Open/Closed Principle            | Classes should be **open for extension**, but **closed for modification**. | Add new report types (PDF, Excel) without touching existing code—use a `Report` interface.    |
| **L**     | Liskov Substitution Principle    | Subtypes should be **fully substitutable** for their base types.           | Don't make `Square extends Rectangle` if it changes behavior. Use a `Shape` interface instead.|
| **I**     | Interface Segregation Principle  | Don’t force a class to implement **unused interfaces**.                    | Break `Machine` into `Printer`, `Scanner`, `Fax`.                                             |
| **D**     | Dependency Inversion Principle   | High-level modules should depend on **abstractions**, not concrete classes.| `Application` depends on `Database` interface, not `MySQLDatabase`.                           |

---

## Quick Code Templates

### Single Responsibility Principle (SRP)
```java
class Invoice {}
class InvoicePrinter {}
class InvoiceSaver {}
```

### Open/Closed Principle (OCP)
```java
interface Report { void generate(); }
class PDFReport implements Report { /* ... */ }
```

### Liskov Substitution Principle (LSP)
```java
interface Shape { int getArea(); }
class Rectangle implements Shape { /* ... */ }
class Square implements Shape { /* ... */ }
```

### Interface Segregation Principle (ISP)
```java
interface Printer { void print(); }
interface Scanner { void scan(); }
```

### Dependency Inversion Principle (DIP)
```java
interface Database { void connect(); }
class App {
    Database db;
    App(Database db) { this.db = db; }
}
```

