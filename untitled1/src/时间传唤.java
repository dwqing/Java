import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 时间传唤 {

    public String getDate(String content){
        Pattern p = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2}) (\\d{1,2}):(\\d{1,2}):(\\d{1,2})");
        Matcher matcher = p.matcher(content);
        while (matcher.find()) {
            return ((Matcher) matcher).group(0);
        }
        return "";
    }
    public void fun() {
        String text = "开奖日期：2021年3月28日 兑奖截止日期：2021年5月26日";
        Pattern p = Pattern.compile("(\\d{4})年(\\d{1,2})月(\\d{1,2})日");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
    public static void main(String[] args) {
        String s = "2023-03-07T20:24:53.677+08:00";
        String w = s.substring(11,16);
        System.out.println(w);
    }
}
