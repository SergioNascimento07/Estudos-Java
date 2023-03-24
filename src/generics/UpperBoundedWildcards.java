package generics;

import java.util.List;
//coringas limitados por cime
// so passa listas de MinhaClasse e herdeiros de MinhaClasse
public class UpperBoundedWildcards {
    public void imprimeLista(List<? extends Pessoas> listaPessoas) {
        for (Pessoas p: listaPessoas) {
            System.out.println(p);
        }
    }
}
