package ucanuup.cc.string.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtil {

	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:    if this string is null or "" return  true  else return false.
	 * @author: WenBin     
	 * @date:   2018年11月2日 上午10:27:22   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isEmpty(String str) {
		if(str == null) {
			return true;
		}else {
			if(str.equals("")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:    if this string is null or "" return  false  else return true. 
	 * @author: WenBin     
	 * @date:   2018年11月2日 上午10:28:41   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:    if this string is null or "","  " return  true  else return false.
	 * @author: WenBin     
	 * @date:   2018年11月2日 上午10:32:38   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isBlank(String str) {
		if(str == null) {
			return true;
		}else {
			if(str.trim().equals("")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:    if this string is null or "","  " return  false  else return true.
	 * @author: WenBin     
	 * @date:   2018年11月2日 上午10:33:36   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:   if string  has chinese  return true else return false 
	 * @author: WenBin     
	 * @date:   2018年11月2日 上午10:41:47   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean ishasChinese(String str) {
		Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
	}
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:    是否是邮件
	 * @author: WenBin     
	 * @date:   2018年11月2日 下午12:58:47   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isEmail(String email){
        boolean flag = false;
        if(StringUtil.isBlank(email)) {
        	return false;
        }
        String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(email);
        flag = matcher.matches();
        return flag;
    }
	
	/**
	 * @Title:  StringUtil.java   
	 * @Package ucanuup.cc.string.utils   
	 * @Description:   是否是数字 
	 * @author: WenBin     
	 * @date:   2018年11月2日 下午12:55:47   
	 * @version V1.0 
	 * @Copyright: 2018
	 */
	public static boolean isNumeric(String str) {
		if (str == null) {  
            return false;  
        }  
        int sz = str.length();  
        for (int i = 0; i < sz; i++) {  
            if (Character.isDigit(str.charAt(i)) == false) {  
                return false;  
            }  
        }  
        return true;  
	}
	
	private StringUtil() {};
}
