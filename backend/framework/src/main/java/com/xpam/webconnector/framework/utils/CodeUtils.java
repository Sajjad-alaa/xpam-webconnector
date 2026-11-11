package com.xpam.webconnector.framework.utils;


public class CodeUtils {
    private static final java.util.regex.Pattern NUMBER =
            java.util.regex.Pattern.compile("^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$");


    /**
     * 对导出文件的换行符进行转义
     * @param value
     * @return
     */
    public static String escapeCsvValue(String value) {
        // XPAM: a cell starting with = + - @ (or tab / CR) is run as a formula by spreadsheet programs
        // XPAM: plain numbers (e.g. -5, +1.5e3) are not formulas and must stay untouched
        if (!value.isEmpty() && "=+-@\t\r".indexOf(value.charAt(0)) >= 0 && !NUMBER.matcher(value).matches()) {
            value = "'" + value;
        }
        if (value.contains("\"") || value.contains(",") || value.contains("\n") || value.contains("\r")) {
            value = value.replace("\"", "\"\"");
            value = "\"" + value + "\"";
        }
        return value;
    }
}
