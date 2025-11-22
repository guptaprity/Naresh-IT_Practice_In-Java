# Stream Creation in Java (Stream API Examples)

This project demonstrates different ways to create and use **Streams in Java**, including:

* Creating streams from collections
* Creating streams from arrays
* Using `Stream.of()`
* Using infinite streams with `generate()` and `iterate()`
* Working with primitive streams (`IntStream`, `DoubleStream`, `LongStream`)
* Using parallel streams
* Using Java `record` with streams

## 📌 Features Covered

### 1. Creating Stream from a List

```java
List<String> list = Arrays.asList("NIT", "Java", "Stram", "Collection");
Stream<String> stream = list.stream();
```

### 2. Creating Stream from an Array

Using `Arrays.stream()` method:

```java
int[] x = {12, 90, 89, 90, 12, 56, 45};
IntStream intStream = Arrays.stream(x);
```

### 3. Using `Stream.of()`

```java
Stream.of(p1, p2, p3, p4);
```

### 4. Infinite Streams

Using `generate()` and `iterate()`:

```java
Stream<Double> s1 = Stream.generate(() -> Math.random()).limit(5);
Stream<Integer> iterate = Stream.iterate(101, n -> n + 2).limit(5);
```

### 5. Parallel Streams

```java
Stream<String> parallelStream = list.parallelStream();
```

## 📦 Product Record

This project uses a Java **record**:

```java
record Product(Integer id, String name, Double price) {}
```

## ▶️ How to Run

1. Clone the repository
2. Open in any Java IDE
3. Run the class `SreamCreation.java`
4. Output will display different types of Streams

## 📝 Purpose

This code is designed to help beginners understand **various stream creation techniques** available in Java, which are essential for fast data processing and functional-style programming.

---

⭐ *If you find this helpful, consider starring the repo!*
