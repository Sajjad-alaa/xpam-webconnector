package org.jumpserver.chen.framework.utils;


public class CodeUtils {

    /**
     * 对导出文件的换行符进行转义
     * @param value
     * @return
     */
    public static String escapeCsvValue(String value) {
        // XPAM: a cell starting with = + - @ (or tab / CR) is run as a formula by spreadsheet programs
        if (!value.isEmpty() && "=+-@\t\r".indexOf(value.charAt(0)) >= 0) {
            value = "'" + value;
        }
        if (value.contains("\"") || value.contains(",") || value.contains("\n") || value.contains("\r")) {
            value = value.replace("\"", "\"\"");
            value = "\"" + value + "\"";
        }
        return value;
    }
}
