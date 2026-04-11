public class Codec {
    //deterministic approach using hashCode()
    private Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        while(map.containsKey(key) && !map.get(key).equals(longUrl)) {
            key++;
        }
        map.put(key, longUrl);
        return "http://shortly.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace("http://shortly.com/", ""));
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));