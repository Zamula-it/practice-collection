package org.itstep;
import java.util.*;
public class MapSetTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Set<String>> networkMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String channel = scanner.nextLine();
           String show = scanner.nextLine();
            if (!networkMap.containsKey(channel)) {
                networkMap.put(channel, new TreeSet<>());
            }
            networkMap.get(channel).add(show);
            System.out.println(networkMap);
        }
        String[] channels = networkMap.keySet().toArray(new String[0]);
        Arrays.sort(channels);
        for (String channel: channels) {
            System.out.println( channel + ": " + networkMap.get(channel));
        }
    }
}
