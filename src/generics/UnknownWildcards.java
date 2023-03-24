package generics;

import java.util.List;

public class UnknownWildcards {
    
    public void imprimeLista(List<?> lista){
        for (Object obj: lista){
            System.out.println(obj);
        }
    }
}
