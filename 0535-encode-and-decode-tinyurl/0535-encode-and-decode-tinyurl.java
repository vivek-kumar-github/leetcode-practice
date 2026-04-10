public class Codec {
    private HashMap<Integer, String> map = new HashMap<>();
    private int counter = 0;
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(counter, longUrl);
        return "http:shortly.com/" + counter++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace("http:shortly.com/", ""));
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));