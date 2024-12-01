# Effective Java - Complete Summary (All 101 Items)

## Part 1: Creating and Destroying Objects

1. **Consider static factory methods instead of constructors**: Use static methods for better flexibility and
   readability.
2. **Consider a builder when faced with many constructor parameters**: Simplify complex object creation using the
   builder pattern.
3. **Enforce the singleton property with a private constructor or an enum**: Use singletons for classes requiring a
   single instance.
4. **Enforce noninstantiability with a private constructor**: Prevent instantiation of utility classes.
5. **Prefer dependency injection to hardwiring resources**: Decouple classes from dependencies using injection.
6. **Avoid creating unnecessary objects**: Reuse objects to reduce overhead.
7. **Eliminate obsolete object references**: Avoid memory leaks by cleaning up unused references.
8. **Avoid finalizers and cleaners**: Use try-with-resources or close methods for resource management.
9. **Prefer try-with-resources to try-finally**: Automatically manage resources using try-with-resources.

## Part 2: Methods Common to All Objects

10. **Override equals judiciously**: Ensure `equals` adheres to reflexivity, symmetry, transitivity, consistency, and
    null checks.
11. **Always override hashCode when you override equals**: Ensure equal objects have consistent hash codes.
12. **Always override toString**: Provide a clear and informative string representation of objects.
13. **Override clone judiciously**: Prefer copy constructors or static factory methods over `clone`.
14. **Consider implementing Comparable**: Define a natural order for your objects.

## Part 3: Classes and Interfaces

15. **Minimize the accessibility of classes and members**: Use encapsulation to reduce exposure.
16. **In public classes, use accessor methods, not public fields**: Preserve flexibility by using getter and setter
    methods.
17. **Minimize mutability**: Favor immutable objects for simplicity and thread safety.
18. **Favor composition over inheritance**: Reduce fragility by composing objects instead of inheriting.
19. **Design and document for inheritance or else prohibit it**: Clearly define how inheritance should be used or
    prevent it.
20. **Prefer interfaces to abstract classes**: Interfaces provide greater flexibility for multiple implementations.
21. **Design interfaces for posterity**: Ensure interfaces are forward-compatible and extensible.
22. **Use interfaces only to define types**: Avoid constant interfaces.
23. **Prefer class hierarchies to tagged classes**: Use polymorphism instead of type codes.
24. **Favor static member classes over nonstatic**: Reduce coupling with static nested classes.
25. **Limit source files to a single top-level class**: Simplify file organization and reduce conflicts.

## Part 4: Generics

26. **Don’t use raw types**: Always specify type parameters for type safety.
27. **Eliminate unchecked warnings**: Resolve or suppress unchecked warnings for cleaner code.
28. **Prefer lists to arrays**: Lists are type-safe, whereas arrays are not.
29. **Favor generic types**: Use generics to create reusable and type-safe classes.
30. **Favor generic methods**: Use generics to create flexible and type-safe methods.
31. **Use bounded wildcards to increase API flexibility**: Support more use cases with `? extends` and `? super`.
32. **Combine generics and varargs judiciously**: Avoid heap pollution when combining generics with varargs.
33. **Consider typesafe heterogeneous containers**: Use generics and `Class` objects to create flexible containers.

## Part 5: Enums and Annotations

34. **Use enums instead of int constants**: Enums are safer, more expressive, and more powerful.
35. **Use instance fields instead of ordinals**: Avoid using `ordinal` to store data; use fields instead.
36. **Use EnumSet instead of bit fields**: Simplify set operations with `EnumSet`.
37. **Use EnumMap instead of ordinal indexing**: Use `EnumMap` for mapping enums to values.
38. **Emulate extensible enums with interfaces**: Combine enums with interfaces for extensibility.
39. **Prefer annotations to naming patterns**: Use annotations for metadata and behavior tagging.
40. **Consistently use the @Override annotation**: Prevent errors by ensuring methods override superclass methods.
41. **Use marker interfaces to define types**: Marker interfaces provide compile-time type information.

## Part 6: Lambdas and Streams

42. **Prefer lambdas to anonymous classes**: Lambdas are more concise and readable.
43. **Prefer method references to lambdas**: Use method references for clarity and simplicity.
44. **Favor the use of standard functional interfaces**: Use `Function`, `Supplier`, `Consumer`, etc., for common tasks.
45. **Use streams judiciously**: Streams are powerful but can reduce clarity for simple cases.
46. **Prefer side-effect-free functions in streams**: Avoid modifying external state in stream operations.
47. **Prefer Collection to Stream as a return type**: Collections offer more flexibility than streams.
48. **Use caution when making streams parallel**: Ensure thread safety and avoid performance pitfalls in parallel
    streams.

## Part 7: Methods

49. **Check parameters for validity**: Validate inputs to avoid runtime errors.
50. **Make defensive copies when needed**: Protect internal state by copying mutable inputs and outputs.
51. **Design method signatures carefully**: Choose method names and parameter types thoughtfully.
52. **Use overloading judiciously**: Avoid ambiguous overloaded methods.
53. **Use varargs judiciously**: Validate input and avoid excessive use of varargs.
54. **Return empty collections or arrays, not nulls**: Simplify client code by avoiding `null` returns.
55. **Return Optionals judiciously**: Use `Optional` for potentially absent values, but not excessively.

## Part 8: General Programming

56. **Adhere to generally accepted naming conventions**: Follow consistent naming standards for clarity.
57. **Avoid unnecessary use of checked exceptions**: Use unchecked exceptions for programming errors.
58. **Favor the use of standard exceptions**: Use exceptions like `IllegalArgumentException` for common scenarios.
59. **Throw exceptions appropriate to the abstraction**: Avoid exposing implementation details in exceptions.
60. **Document all exceptions thrown by each method**: Help users handle exceptions properly.
61. **Include failure-capture information in exceptions**: Provide detailed information in exception messages.
62. **Strive for failure atomicity**: Ensure operations leave objects in a consistent state on failure.
63. **Don’t ignore exceptions**: Always handle exceptions appropriately.

## Part 9: Performance

64. **Consider using APIs over handwritten code**: Leverage standard libraries for efficiency and maintainability.
65. **Refer to objects by their interfaces**: Use interfaces for flexibility and better design.
66. **Prefer interfaces to reflection**: Avoid reflection unless necessary for dynamic behavior.
67. **Use native methods judiciously**: Prefer Java code over native methods for portability and maintainability.
68. **Optimize judiciously**: Optimize only when performance is a verified issue.

## Part 10: Serialization

69. **Adhere to the general contract when overriding equals**: Ensure consistent behavior in equality checks.
70. **Always override hashCode when you override equals**: Ensure consistent behavior in hash-based collections.
71. **Always override toString**: Provide meaningful string representations for debugging and logging.
72. **Override clone judiciously**: Prefer alternatives to `clone` for copying objects.
73. **Implement Serializable judiciously**: Serialization introduces risks; consider alternatives.

## Part 11: Concurrency

74. **Prefer atomic variables to synchronized variables**: Use atomic variables for better performance and clarity.
75. **Avoid excessive synchronization**: Minimize synchronized blocks to reduce contention.
76. **Prefer executors and tasks to threads**: Use the `Executor` framework for scalable concurrency.
77. **Use concurrent collections judiciously**: Prefer `ConcurrentHashMap` and other utilities over manual
    synchronization.
78. **Document thread safety**: Clearly indicate if a class is thread-safe, not thread-safe, or conditionally
    thread-safe.
79. **Avoid thread-local variables when possible**: Use sparingly to avoid memory leaks and complexity.

## Part 12: General Good Practices

80. **Avoid using Java serialization**: Prefer modern serialization frameworks like JSON or Protocol Buffers.
81. **Use dependency injection judiciously**: Inject dependencies for better decoupling.
82. **Avoid reflection for performance and security**: Use reflection sparingly to avoid performance and maintainability
    issues.
83. **Follow Java conventions for serialization**: Follow established practices when implementing `Serializable`.
84. **Prefer enums to singletons**: Enums are the best way to implement singletons.

## Part 13: Additional Best Practices

85. **Use lazy initialization judiciously**: Avoid premature or excessive use of lazy initialization.
86. **Minimize scope of local variables**: Declare variables in the narrowest possible scope.
87. **Prefer immutable objects**: Reduce complexity with immutable classes.
88. **Avoid instance pooling**: Favor object creation for simplicity and performance.
89. **Document thread safety assumptions**: Ensure proper usage by explicitly documenting thread safety.

## Part 14: Concurrency and Performance

90. **Use dependency injection to improve flexibility**: Decouple dependencies for easier testing and maintenance.
91. **Avoid excessive synchronization**: Overuse of synchronized blocks can degrade performance and cause deadlocks.
92. **Prefer concurrency utilities to low-level synchronization**: Use frameworks like `java.util.concurrent`.
93. **Be cautious with parallel streams**: Ensure proper thread safety when using parallel streams.

## Part 15: General Practices

94. **Use enums for singletons**: Simplify singleton design by using enums.
95. **Use atomic variables instead of locks**: For single variables, atomic classes are simpler and faster.
96. **Use ThreadLocal variables with care**: Avoid misuse to prevent memory leaks and unnecessary complexity.

## Part 16: Final Notes

97. **Avoid Java serialization**: Serialization introduces many risks; consider safer alternatives like JSON or Protocol
    Buffers.
98. **Prefer alternatives to `clone`**: Use copy constructors or factory methods instead of `clone`.
99. **Use interfaces for types**: Always prefer interfaces for type definition and flexibility.
100. **Avoid raw types**: Use generics for type-safe and maintainable code.
101. **Prefer immutability**: Immutable objects are simpler, safer, and easier to use in multithreaded environments.
