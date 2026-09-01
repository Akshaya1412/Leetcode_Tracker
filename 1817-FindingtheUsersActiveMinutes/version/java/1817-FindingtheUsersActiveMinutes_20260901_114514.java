// Last updated: 9/1/2026, 11:45:14 AM
1class TimeMap {
2private HashMap<String,String> hashMap;
3private LinkedList<Integer> list;
4    public TimeMap() {
5        hashMap=new HashMap<>();
6        list=new LinkedList<>();
7    }
8    
9    public void set(String key, String value, int timestamp) {
10        hashMap.put(timestamp+key,value);
11        list.add(timestamp);
12    }
13    
14    public String get(String key, int timestamp) {
15        if(hashMap.containsKey(timestamp+key)){
16            return hashMap.get(timestamp+key);
17        }
18        else{
19            int length=list.size()-1;
20            boolean cond=false;
21            while(length>=0&&!cond){
22                String str=list.get(length)+key;
23                cond=timestamp>list.get(length)&&hashMap.containsKey(str);
24                if(cond){
25                    return hashMap.get(str);
26                }
27                length--;
28            }
29        }
30        return "";
31    }
32}
33
34/**
35 * Your TimeMap object will be instantiated and called as such:
36 * TimeMap obj = new TimeMap();
37 * obj.set(key,value,timestamp);
38 * String param_2 = obj.get(key,timestamp);
39 */