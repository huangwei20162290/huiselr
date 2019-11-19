package com.huiselr.test;

public class RegexTest {
    public static void main(String[] args) {
        String str="50024319970921200Y";
        boolean matches = str.matches("/(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)/");
        //校验18位身份证号码的正则表达式
        boolean matches1 = str.matches("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");
        //校验15位身份证号码的正则表达式
        boolean matches2 = str.matches("^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}$");
        //校验总的身份证号码,15位和18位都适用
        boolean matches3 = str.matches("(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}$)");
        System.err.println(matches1);
        System.err.println(matches3);
//        System.out.println(matches);
//        System.out.println(23.4>23.4);

        String sql="where 1=1";
        sql+=" and";
        System.err.println(sql);

    }
}
