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
        //sample.checkMatch();
        //sample.checkIndexOf();
        sample.checkLastIndexOf();
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

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a')); // char로 매개변수를 넘긴 경우
        System.out.println(text.indexOf("a ")); // String으로 매개변수를 넘긴 경우
        System.out.println(text.indexOf('a', 20)); // fromIndex : text문자열의 20번째 자리부터 값을 확인
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z')); // text에 없는 char를 찾는 경우
        // indexOf(int ch, int fromIndex) 또는 indexOf(String str, int fromIndex)
        // 매개변수로 char 또는 String을 넘겨 문자열 내에서 매개변수의 위치를 찾을 수 있다.
        // fromIndex (생략가능): 문자열의 fromIndex번째 자리부터 시작해 앞에서부터 값을 찾는다
        // 문자열에 그 값이 없다면 -1을 리턴한다.
    }

    public void checkLastIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a')); // char로 매개변수를 넘긴 경우
        System.out.println(text.lastIndexOf("a ")); // String으로 매개변수를 넘긴 경우
        System.out.println(text.lastIndexOf('a', 20)); // fromIndex : text문자열의 20번째 자리부터 값을 확인
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z')); // text에 없는 char를 찾는 경우
        // lastIndexOf(int ch, int fromIndex) 또는 lastIndexOf(String str, int fromIndex)
        // 매개변수로 char 또는 String을 넘겨 문자열 내에서 매개변수의 위치를 찾을 수 있다
        // indexOf()와 달리 뒤에서부터(오른쪽부터) 찾기 시작한다.
        // fromIndex (생략가능): 문자열의 fromIndex번째 자리부터 시작해 뒤에서부터 값을 찾는다
        // 문자열에 그 값이 없다면 -1을 리턴한다.
    }
}
