package ConsumerInterface;

import java.util.function.Consumer;

class movie
{
	int name;

	public movie(int name) {
		super();
		this.name = name;
	}
	
	
}
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    Consumer<movie> c=m-> System.out.println(m.name+"ready to release");
    
    Consumer<movie> c1=m-> System.out.println(m.name+"released but it is bigger flop");
    
    Consumer<movie> c2=m-> System.out.println(m.name+"storing innformation in database");
    
  
//c.accept(m);
    
	}

}
