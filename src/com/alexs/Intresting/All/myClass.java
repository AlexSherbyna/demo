package com.alexs.Intresting.All;



public class myClass {

    public static String createGreeting(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(1));
        sb.append(input.charAt(3));
        return sb.toString();
    }

    public  double getSuccessRate(String statistic) {
        double sum = 0.0;
            if (statistic.isEmpty()) {
                return 0.0;
            }

            for (int i = 0; i < statistic.length(); i++){
                if(statistic.charAt(i) == '1') {
                    sum += 1;
                }
            }
            System.out.println(sum / statistic.length());
            return sum / statistic.length();
    }

    public  String getValue(String dataFromDatabase) {

        String lowerFormat = dataFromDatabase.toLowerCase()
                .substring(dataFromDatabase.indexOf('=')+1);

        System.out.println(lowerFormat);

        return lowerFormat;
    }

    public boolean isWerewolf(String target) {
        StringBuilder rev = new StringBuilder(target) ;
        return target.equals(rev.reverse().toString());
    }

    public  String makeAbbr(String fullName) {
        String[] greetingDividedByWhitespace = fullName.split(" ");
            StringBuilder abbr = new StringBuilder();
        for (String x: greetingDividedByWhitespace){
            abbr.append(x.toUpperCase().charAt(0));
        }
        System.out.println(abbr.toString());

     return    greetingDividedByWhitespace.toString();

    }
    public static String getMiddleString(String originalString) {
        Integer center = 0;
        StringBuilder sb = new StringBuilder();
        if (originalString.length() != 0) {
            center = originalString.length() / 2;
            if (originalString.length() % 2 == 0) {
                sb.append(originalString.charAt(center - 1)).append(originalString.charAt(center));
            } else {
                sb.append(originalString.charAt(center));
            }
            System.out.println(originalString.charAt(center));
            System.out.println(sb);
            return sb.toString();
        }
        return "";
    }

    public  String removeOddChars(String originalString) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < originalString.length(); i++) {
                if(i % 2 == 0) {
                    sb.append(originalString.charAt(i));
                }
            }
            System.out.println(sb);
            return sb.toString();
        }

//    public  String[] markStringEnds(String originalString) {
//        String arr[] = new String[2];
//        arr[0] = originalString.;
//        arr[1] = originalString.toUpperCase();
//        System.out.println(arr[0] +" " +arr[1]);
//        return  arr;
//
//    }
    public  int getSum(int[] values, int startValue) {
        boolean startValueFound = false;
        int sum = 0;
        for (int element : values) {
            if (startValueFound) {
                sum += element;
            }
            if (element == startValue) {
                startValueFound = true;
            }
        }
        return sum;


    }


}
