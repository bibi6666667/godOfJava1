package com.godOfJava1.c15;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] addresses = new String[] {
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };
        
        //sample.checkAddress(addresses);
        //sample.containsAddress(addresses);
        sample.checkMatch();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0; // 이렇게도 선언 가능
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) { // startsWith(startText) : String이 startText로 시작하면 true 반환 
                startCount++;
            }
            if (address.endsWith(endText)) { // endsWith(endText) : String이 endText로 끝나면 true 반환
                endCount++;
            }
        }
        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";
        for (String address : addresses) {
            if (address.contains(containText)) {// contains(containText) : String이 containText를 포함하면 true 반환
                containCount++;
            }
        }
        System.out.println("Contains " + containText + " count is " + containCount);
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2, compare1, 0, 1)); // 매개변수가 4개인 regionMatches()
        System.out.println(text.regionMatches(5, compare1, 0, 2)); // 매개변수가 4개인 regionMatches()
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4)); // 매개변수가 5개인 regionMatches()
        // regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        // 문자열 중 특정 영역이 매개변수로 넘어온 문자열과 동일한지 확인하는 메소드.
    }
}
