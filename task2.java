public class task2 {
    public static void main(String[] args) {
        
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
        };

        System.out.println(buildCSV(headers, data));

    };

    public static String buildCSV (String[] headers, String[][] data) {

        StringBuilder result = new StringBuilder(String.join(",\t", headers));
        for (int i = 0; i < data.length; i++) {
            result.append("\n" + String.join(",\t", data[i]));
        }

        return result.toString();

    }

}
