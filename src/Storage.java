import java.util.*;
import java.util.stream.Collectors;

class Storage {
    private Map<String, List<String>> map = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(value);

    }

    public void printValues(String key) {
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException("Nie ma takiego klucza");
        }
        List<String> values = map.get(key);
        System.out.println(values);
    }

    //FIXME:Adapt implementation to new type of value
    public void findValues(String value) {
        map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(value))
                .map(Map.Entry::getKey)
                .forEach(key -> System.out.println(key));

    }
}
