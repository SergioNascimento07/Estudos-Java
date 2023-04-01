package collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;



public class Main {
    public static void main(String[] args) {
        Map<String, Double> carrosPop = new HashMap<>(){{
            put("gol", 14.2);
            put("uno", 16.4);
            put("mobi", 18.4);
            put("hb20", 14.5);
            put("kwid", 12.9);
        }};

        System.out.println(carrosPop);
        carrosPop.put("gol", 20d);
        System.out.println(carrosPop);
        //não tem como adicionar nada, so alterar

        //confere se contem
        System.out.println(carrosPop.containsKey("mobi"));
        System.out.println(carrosPop.containsValue(14.5));
        
        //printa o valor da chave
        System.out.println(carrosPop.get("uno"));

        //retorna um set -- retorna todas as chaves
        System.out.println(carrosPop.keySet());

        //retorna os valores
        //retorna uma collection
        System.out.println(carrosPop.values());

        Double valorConsumo = Collections.max(carrosPop.values());
        
        //retorna set com elementos do tipo entry
        //interface entry esta dentro da map e tem key e value
        System.out.println("1 "+carrosPop.entrySet());


        Set<Map.Entry<String, Double>> entries = carrosPop.entrySet();
        System.out.println("2 "+entries);
        String modeloMaisEficiente;
        //está trabalhando com set de chaves e valores
        for (Map.Entry<String, Double> entry:entries
        ){
             if (entry.getValue().equals(valorConsumo)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente);
             }
        }

        //keySet retorna set com modelos
        //values retorna collection de valores

        Double consumoMenosEficiente =  Collections.min(carrosPop.values());
        String modeloMenosEficiente = "";
        for (Entry<String,Double> entry : carrosPop.entrySet()) {
            if (entry.getValue() == consumoMenosEficiente){
                modeloMenosEficiente = entry.getKey();
            }
        } 
        System.out.println(carrosPop.size());
        System.out.println(modeloMenosEficiente);


        Iterator<Double> iterator = carrosPop.values().iterator();

        while (iterator.hasNext()){
            if(iterator.next() < 15.0){
                iterator.remove();
            }
        }

        System.out.println(carrosPop);
        
        //PARA IMPRIMIR NA ORDEM INFORMADA
        //linkedHashMap imprime na ordem
        Map<String, Double> carrosPop2 = new LinkedHashMap<>(){{
            put("gol", 14.2);
            put("uno", 16.4);
            put("mobi", 18.4);
            put("hb20", 14.5);
            put("kwid", 12.9);
        }};

        System.out.println(carrosPop2);


        Map<String, Double> carrosPop3 = new TreeMap<>(){{
            put("gol", 14.2);
            put("uno", 16.4);
            put("mobi", 18.4);
            put("hb20", 14.5);
            put("kwid", 12.9);
        }};

        System.out.println(carrosPop3);
        System.out.println(carrosPop3.isEmpty());
    }
}
