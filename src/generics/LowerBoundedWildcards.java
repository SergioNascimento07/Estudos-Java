package generics;

import java.util.List;
//Só aceita da classe pessoa pra cima
//Não aceita nenhum herdeito de Pessoas
public class LowerBoundedWildcards {
    public void imprimeLista(List<? super Pessoas> listaPessoas) {
        for (Object p : listaPessoas){
            System.out.println(p);
        }
    }
}
