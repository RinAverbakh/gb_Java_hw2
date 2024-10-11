public class task1 {
    public static void main(String[] args) {

        String base = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";

        System.out.println(buildUrl(base, params));

    }

    public static String buildUrl (String base, String params) {

        StringBuilder url = new StringBuilder(base);
        String [] pairs = params.split("&");

        for (int i = 0; i < pairs.length; i++) {

            String [] pair = pairs[i].split("=");
            if (!"null".equals(pair[1])) {

                if (i > 0) url.append("&");
                url.append(pair[0]).append("=").append(pair[1]);
            }
        }

        return url.toString();

    }
}