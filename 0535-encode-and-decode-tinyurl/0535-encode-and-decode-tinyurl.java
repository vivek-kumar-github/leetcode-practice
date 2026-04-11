public class Codec {
    private Map<String, String> code2url = new HashMap<>();
    private Map<String, String> url2code = new HashMap<>();
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String prefix = "http://shortly.com/";
    private Random random = new Random();

    private String genKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(CHARS.charAt(random.nextInt(62)));
        }
        return sb.toString();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (url2code.containsKey(longUrl)) {
            return prefix + url2code.get(longUrl);
        }
        String key = genKey();
        while(code2url.containsKey(key)) {
            key = genKey();
        }
        code2url.put(key, longUrl);
        url2code.put(longUrl, key);
        return prefix + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(prefix, "");
        return code2url.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));