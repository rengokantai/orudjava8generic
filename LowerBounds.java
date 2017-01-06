import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowwerBounds{

  public static void main(String[] args){
    List<String> strings = Stream.of("a","b","c").collect(Collectors.toList());
    
    strings.forEach((String s)->System.out.println(s));
    
    
    
    List<Integer> integers = Stream.of(2,3,6).peek(i->System.out.println(Integer.toBinaryString(i))).peek((Number n)->System.out.println(n.doubleValue())).peek((Object o)->System.out.println(o.hashCode())).collect(Collectors.toList());
    System.out.println(integers);
  }
  
}
