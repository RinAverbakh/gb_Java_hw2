public class task3 {
    public static void main(String[] args) {
        String initData = new String(" line1 \n \n   line2  \n  \n    \n   line3   ");
        
        System.out.println(deleteSpaceInString(initData));
    }

    public static String deleteSpaceInString (String initData) {

        String[] arrLine = initData.split("\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrLine.length; i++) {
            if (!arrLine[i].trim().isEmpty()) result.append(arrLine[i].trim()).append("\n");
            if (i == arrLine.length-1) result.deleteCharAt(result.length()-1);
        }

        return result.toString();
    }

}
