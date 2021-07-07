package ConsumerInterface;

import java.util.function.Consumer;

public class test {
public static void main(String[] args) {
	Consumer<String> c=s->System.out.println(s);
	c.accept("swati");
	c.accept("pratibha");
}
}
