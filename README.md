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


###2 Upper Bounds in Java 8 (extends)


###3 Lower Bounds and PECS in Java 8
see LowwerBounds.java.  

PECS:
- Producer Extends, Consumer Super

__In java 8, streams__
- __providing a value from the stram ->super__
- __using the value in the supplied ;ambda ->extends__


##5. Type erasure
###1 Basic Type erasure
####01:52

##6. Summary
###1 Multiple Bounds and Conclusions
```<? super T>``` to provide  
```<? extends T>``` to use
