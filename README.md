# Java Basic Dev Log

## Day 2

### Problems

- List of Fibonacci number to N.
- Count vowels in a string

### What I learn

- Remind me of recursive function.
- `java.util.List` is an interface, so you cannot use `List<Integer> l = new List<Integer>();`. Use `new ArrayList<Integer>()` instead.
- `java.util.Array` is a fixed size type, all elements must be the same type. Data is located on continuous memory zone.
- `java.util.ArrayList` is a dynamic size type. It can contain both primitive type or Object type. If T is an Object Type, `ArrayList` can contain T's inheritances.
- `Integer` is a wrapper class of `int`, and provides methods that working with that `int` value.
  - Default value of an `int` variable is `0`, and default value of `Integer` is null.
  - `Integer` can be contained in a Java Collection type, but `int`.
- Use `"aeiou".indexOf(c)!=-1` to check if c is one of the five vowels or not.

## Day 1

- Review syntax with `Sum.SumToN`, `Sum.SumOddToN` , and `Sum.SumEvenToN`.
- Remind me of inputting from Console.