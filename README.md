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





##4. Examples from the Java 8 API
###1 Stream.max in the Java 8 API
```
Employee maxId = employees.stream().max(new Comparator<Employee>(){
  @Override
  public int compare(Employee a,Employee b){
    return a.getId()-b.getId();
  }
}).orElse(Employee.DEFAULT_EMPLOYEE);
```
same as
```
employees.stream().max(comparingInt(Employee::getId)).orElse(Employee.DEFAULT_EMPLOYEE);
```

###4 Collectors.toMap in the Java 8 API
```
Map<Integer,Employee> employeeMap = employees.stream().collect(toMap(Employee::getId,
```


###5 Map.Entry.comparingByKey and comparingByValue in the Java 8 API
####08:02 reverse order
```
map.entrySet().stream().sorted(Map.Entry.comparingKey(Comparator.reverseOrder())).forEach(entry->System.print(entry.getKey());
```
or
```
.comparingKey(comparing(Employee::getName)))
```







##5. Type erasure
###1 Basic Type erasure
####01:52

##6. Summary
###1 Multiple Bounds and Conclusions
```<? super T>``` to provide  
```<? extends T>``` to use
