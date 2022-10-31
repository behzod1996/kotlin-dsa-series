# Basics

### Why learn Data Structures & Algorithms?

As a programmer, you regularly use various collection types, such as arrays, maps and sets. These are data structures that hold a collection of data, each structure having its own performance characteristics.

Data structures are a well-studied disciple and the concepts are `language agnostic`.

Algorithms, on the other hand, are a set of operations that complete a task. This can be a sorting algorithm that moves data around to put it in order. Algorithms are essential to software and many have been created to act as building blocks for useful programs.

So why should you learn data structures and algorithms?

### Interviews

An important reason to keep your algorithmic skills up to par is to prepare for interviews. Most companies have at least one or two algorithmic questions to test your abilities as an engineer. A strong foundation in data structures and algorithms is the “bar” for many software engineering positions.

### Work

Using an appropriate data structure is crucial when working with lots of  data. Using the right algorithm plays a significant role in the  performance and scalability of your software. Your mobile apps will be  more responsive and have better battery life. Your server apps will be
able to handle more concurrent requests and use less energy. Algorithms  often include proofs of correctness that you can leverage to build
better software.

Using the correct data structure also helps to provide context to the reader. As an example, you might come across a `Set` in your codebase. Immediately, you can deduce:

### Self-Improvement

Knowing the strategies used by algorithms to solve tricky problems gives you ideas for improvements that you can make to your code. The Swift
standard library has a small set of general-purpose collection types;  they don’t cover every case. And, yet, as you will see, these primitives can be used as a great starting point for building more complex and  special-purpose abstractions. Knowing more data structures than just the standard array and dictionary gives you a bigger collection of tools that you can use to build your apps.

> A wise man once said: The practice of algorithms is akin to how musicians practice their scales. The more polished your foundations are, the better you will become in working with more complex pieces of software.
>

### List performance

Aside from being a random-access collection, there are other areas of performance that are of interest on how well or poorly does the data structures fare when the amount of data it contains needs to grow. For lists, this varies on two factors.

```kotlin
mutablePlaces.add("Budapest")
println(mutablePlaces) 
// prints [Paris, London, Bucharest, Budapest]
```

This is a `constant-time` operation, meaning the time it takes to perform this operation stays the same no matter how large the list becomes.

Inserting new elements from anywhere aside from the end will force elements to shift back to make room for the new element:

```kotlin
mutablePlaces.add(0, "Kiev")
// [Kiev, Paris, London, Bucharest, Budapest]
```

To be precise, every element must shift back by one index. The time for this operation grows as the number of elements in the list grows.

The second factor that determines the speed of insertion is the list’s **capacity**.

Underneath the hood, Kotlin lists are allocated with a predetermined amount of  space for its elements. If you try to add new elements to a list that is  already at maximum capacity, the `List` must restructure itself to make more room for more elements.