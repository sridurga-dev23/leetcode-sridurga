// Last updated: 9/2/2026, 9:36:43 AM
1// Java Solution
2class RandomizedSet {
3    List<Integer> list;
4    Map<Integer, Integer> map;
5    Random random;
6
7    public RandomizedSet() {
8        list = new ArrayList<>();
9        map = new HashMap<>();
10        random = new Random();
11    }
12    
13    public boolean insert(int val) {
14        if(map.containsKey(val)){
15            return false;
16        }
17        list.add(val);
18        map.put(val,list.size()-1);
19        return true;
20    }
21    
22    public boolean remove(int val) {
23        if(!map.containsKey(val)){
24            return false;
25        }
26        // find index of val from map
27        int index= map.get(val);
28
29        // swap index with last element in list
30        int lastElement = list.get(list.size()-1);
31        list.set(index, lastElement);
32        map.put(lastElement, index);
33
34        // remove the last element from list
35        list.remove(list.size()-1);
36
37        // reflect changes in the map
38        map.remove(val);
39
40        return true;
41    }
42    
43    public int getRandom() {
44        // Generate a random index and return the corresponding value from the list
45        int randomIndex = random.nextInt(list.size());
46        return list.get(randomIndex);
47    }
48}
49
50
51
52/**
53 * Your RandomizedSet object will be instantiated and called as such:
54 * RandomizedSet obj = new RandomizedSet();
55 * boolean param_1 = obj.insert(val);
56 * boolean param_2 = obj.remove(val);
57 * int param_3 = obj.getRandom();
58 */