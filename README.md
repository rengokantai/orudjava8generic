# orudjava8generic
##2. Basics of Generics
###2 Generics and Inheritance
```
List<String> strings = new List<>();
List<Object> objects = strings;
//objects = strings 
//does not compile
//List<String> is not a subclass of List<Object>
```
####04:33
add list of numbers
```
public static double sumList(List<Number> numbers){
  return numbers.stream().mapToDouble(Number::doubleValue).sum();
}
```
##3. Wildcards and PECS
###1 Unbounded Wildcards in Java 8
