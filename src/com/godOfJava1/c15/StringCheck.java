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
        //sample.checkLastIndexOf();
        //sample.charAt();
        //sample.copyValueOf();
        //sample.toCharArray();
        //sample.checkSubString();
        //sample.checkSplit();
        //sample.checkTrim();
        //sample.checkReplace();
        //sample.checkFormat();
        //sample.checkCase();
        sample.checkValueOf();
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

    public void checkLastIndexOf() {
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

    public void charAt() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.charAt(5));
        // charAt() : 특정 인덱스의 char값을 리턴한다.
    }

    public void copyValueOf() {
        char values[] = new char[] {'J', 'a', 'v', 'a'};
        String java = String.copyValueOf(values); // 배열 전체를 문자열로 변환
        String ava = String.copyValueOf(values, 1, 3); // values의 인덱스1부터 3길이만큼만 변환
        System.out.println(java);
        System.out.println(ava);
        // copyValueOf() : char배열의 값을 문자열로 변환한다.
        // 주의 : 이 메소드는 static메소드이기 때문에 static하게 호출하여 사용해야 한다 - String.copyValueOf() 의 형태로.
    }

    public void toCharArray() {
        String java = "Java";
        char[] javaArr = java.toCharArray();
        for (char aJava : javaArr) {
            System.out.println(aJava);
        }
        // toCharArray() : 문자열을 char배열로 변환한다.
        // 모든 String 객체는 내부에 char배열을 포함한다.
    }

    public void checkSubString() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        // String tech = text.substring(5, 4); // error - endIndex에는 길이가 아닌 끝 인덱스번호를 할당해야.
        String tech = text.substring(5, 9);
        System.out.println(tech);
        // substring(int beginIndex, int endIndex) : 문자열 일부 값을 잘라내는 메소드
        // beginIndex : 잘라낼 시작 인덱스.
        // endIndex(생략가능) : 잘라낼 끝 인덱스. 생략하면 beginIndex부터 문자열 끝까지 잘라냄
        // endIndex는 beginIndex + 잘라낼 문자 길이 로 구하는 것이 편하다.
    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
        // split(String regex, int limit) : 문자열을 여러 개의 String배열로 나누는 메소드
        // regex : regex의 정규 표현식에 맞추어 String을 잘라 String[]으로 리턴한다.
        // limit(생략가능) : 리턴값인 String[]의 최대 크기를 제한할 수 있다.
        // java.util.StringTokenizer 를 사용하는 방법도 있다.
    }

    public void checkTrim() {
        String[] strings = new String[] {
                " a", " b ", "   c", "d    ", "e   f", "   "
        };
        for(String string : strings) {
            System.out.println("[" + string + "]");
            System.out.println("[" + string.trim() + "]");
        }
        // trim() : 문자열의 맨 앞, 맨 뒤의 공백을 제거한 문자열을 리턴함.
        
        String text = " a "; 
        if (text != null && text.trim().length() > 0) {
            System.out.println("OK");
        } 
        // 공백을 제외한 char값이 하나라도 존재하는지 확인하는 코드. 반드시 null체크를 해야 한다(null이면 NullPointerException 발생)
    }

    public void checkReplace() {
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s', 'z')); // text객체의 char를 변환
        System.out.println(text); // replace가 원본 String을 변화시키지는 않는다.
        System.out.println(text.replace("tring", "trike")); // CharSequence타입의 매개변수를 사용해 값을 변경
        System.out.println(text.replaceAll(" ", "|")); // 정규표현식을 사용하는 replaceAll()의 예시
        System.out.println(text.replaceFirst(" ", "|"));
        // replace() 및 replace로 시작하는 메소드 : 문자열의 일부를 변경하는 메소드.
        // 기존 문자열의 값은 바뀌지 않으며, 대소문자를 구분한다.
        // replace(CharSequence A, CharSequence B) : 문자열에 있는 A를 B로 치환한다
        // replaceAll(String regex, String replacement) : regex의 정규표현식에 포함된 모든 내용을 replacement로 치환한다.
        // replaceFirst(String regex, String replacement) :  regex의 정규표현식에 포함되는 첫 번째 내용만 replacement로 치환한다.
    }

    public void checkFormat() {
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, 하루에 %f%%의 시간을 책을 쓰는 데 할애하고 있습니다.";
        String realText = String.format(text, "이상민", 7, 10.5, "이건", "들어가나");
        // String realText = String.format(text, "이상민", 7); // java.util.MissingFormatArgumentException 발생
        System.out.println(realText);
        // format(Locale l, String format, Object... args) : format의 문자열 내용 중 변한해야 하는 부분을 args의 내용으로 변경한다.
        // locale(생략가능) : 지정한 지역 정보에 맞추어 대소문자 변경.
        // format에서  %s : String(문자열), %d : 정수형, %f : float, %% : % 를 의미함.
        // format의 기준에 맞는 문자열을 args에 제시된 순서대로 치환한다.
        // format보다 많은 args를 나열하는 것은 상관없지만, args를 모자라게 나열하면 MissingFormatArgumentException 예외가 발생한다.
    }

    public void checkCase() {
        String text = "Upper Case and Lower Case";
        System.out.println(text);
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        // toUpperCase(Locale locale) : 모든 문자열의 내용을 대문자로 변경한다.
        // toLowerCase(Locale locale) : 모든 문자열의 내용을 소문자로 변경한다.
        // locale(생략가능) : 지정한 지역 정보에 맞추어 대소문자 변경.
    }

    public void checkValueOf() {
        byte b = 1;
        String byte1 = String.valueOf(b);
        String byte2 = b + "";
        System.out.println(byte1);
        System.out.println(byte2);
        // valueOf() : 기본 자료형을 문자열로 변환하는 메소드.
        // 기본 자료형 : boolean, char, char[], double, float, int, long, Object
        // valueOf()를 사용해 기본자료형->문자열로 변환해도 되지만, byte2처럼 다른 문자열과 합쳐서도 변환이 가능하다.
        // valueOf(Object obj) : valueOf()는 매개변수인 객체가 null일 때 "null"이라는 문자열을 리턴해준다. (NullPointerException 발생하지 않음)
    }
}
