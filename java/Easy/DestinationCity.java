package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args){
        List<List<String>> paths = new ArrayList<>();
        List<String> p1 = new ArrayList<>();
        List<String> p2 = new ArrayList<>();
        List<String> p3 = new ArrayList<>();
        p1.add("London");
        p1.add("New York");
        p2.add("New York");
        p2.add("Lima");
        p3.add("Lima");
        p3.add("Sao Paulo");
        paths.add(p1);
        paths.add(p2);
        paths.add(p3);

        System.out.println(paths);
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        HashSet<String> s = new HashSet<>();
        for(int i = 0; i < paths.size(); i++){
            s.add(paths.get(i).get(0));
        }
        for(int i = 0; i < paths.size(); i++){
            if(!s.contains(paths.get(i).get(1) )) return paths.get(i).get(1);
        }
        return "";
    }
}
