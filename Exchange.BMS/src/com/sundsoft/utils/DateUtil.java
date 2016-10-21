package com.sundsoft.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

public class DateUtil {
	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return str
	 */
	public static String DateToStr(Date date, String format) {

		SimpleDateFormat sformat = new SimpleDateFormat(format);
		String str = sformat.format(date);
		return str;
	}

	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return str
	 */
	public static String DateToStr(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		return str;
	}
	public static String Date2Str(Date date) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String str = format.format(date);
		return str;
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str) throws Exception {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return date;
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str, String format) throws Exception {

		SimpleDateFormat sformat = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = sformat.parse(str);
		} catch (ParseException e) {

			e.printStackTrace();
			throw e;
		}
		return date;
	}

	/**
	 * 日期增减计算
	 * 
	 * @param dateString
	 * @param add
	 *            整数往后推,负数往前移动
	 * @return
	 * @throws ParseException
	 */
	public static String getDateStringAdd(String dateString, int add)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, add);
		date = calendar.getTime();
		String dateToString = formatter.format(date);
		return dateToString;
	}

	/**
	 * 获取当前月第一天 如果是2015年10月
	 * 
	 * @return 2015-10-01
	 * @throws ParseException
	 */
	public static String getMonthFristDay() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// 获取当前月第一天：
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);
		// 设置为1号,当前日期既为本月第一天
		String first = format.format(c.getTime());
		return first;
	}

	/**
	 * 获取当前月最后一天 如果是2015年10月
	 * 
	 * @return 2015-10-31
	 * @throws ParseException
	 */
	public static String getMonthLastDay() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		String last = format.format(c.getTime());
		System.out.println(last);
		return last;
	}

	/**
	 * 判断当前日期是星期几
	 * 
	 * @param pTime
	 *            修要判断的时间
	 * @return dayForWeek 判断结果
	 * @Exception 发生异常
	 */
	public static int dayForWeek(String pTime) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(format.parse(pTime));
		int dayForWeek = 0;
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			dayForWeek = 7;
		} else {
			dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return dayForWeek;
	}

	/**
	 * 计算日期差的天数
	 * 
	 * @param beginDateString
	 * @param endDateString
	 * @return
	 * @throws ParseException
	 */
	public static long dateMinus(String beginDateString, String endDateString)
			throws ParseException {
		long minusDay = 0;
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate = dfs.parse(beginDateString);
		java.util.Date endDate = dfs.parse(endDateString);
		minusDay = (endDate.getTime() - beginDate.getTime()) / 1000 / 60 / 60
				/ 24;
		return minusDay;
	}

	/**
	 * 月份期增减计算
	 * 
	 * @param MonthString
	 *            '2015-01-01'
	 * @param add
	 *            2
	 * @return 2015-03
	 * @throws ParseException
	 */
	public static String getMonthStringAdd(String MonthString, int add)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		Date date = formatter.parse(MonthString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, add);// 整数往后推,负数往前移动
		date = calendar.getTime();
		String dateToString = formatter.format(date);
		return dateToString;
	}

	/**
	 * 计算月份差
	 * 
	 * @param beginMonthString
	 *            "2015-01-02",
	 * @param endMonthString
	 *            "2015-05-01"
	 * @return 4
	 * @throws ParseException
	 */
	public static long dateMonths(String beginMonthString,
			String endMonthString) throws ParseException {
		long minusDay = 0;
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM");
		java.util.Date beginDate = dfs.parse(beginMonthString);
		java.util.Date endDate = dfs.parse(endMonthString);
		minusDay = (endDate.getTime() - beginDate.getTime()) / 1000 / 60 / 60
				/ 24 / 30;
		return minusDay;
	}
	/**
	 * 得到两个日期之间所有日期
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static List<String> process(String date1, String date2){
		String dateFormat = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		List<String> dates = new ArrayList<String>();
		
		dates.add(date1);//将默认日期加入list
		if(date1.equals(date2)){
			//System.out.println("两个日期相等!");
			return dates;
		}
		String tmp;
		if(date1.compareTo(date2) >= 0){//确保 date1的日期不晚于date2			
			tmp = date1;
			date1 = date2;
			date2 = tmp;
		}
		
		tmp = format.format(str2Date(date1).getTime() + 3600*24*1000);
		
		int num = 0;
		while(tmp.compareTo(date2) <= 0){
			////System.out.println(tmp);
			dates.add(tmp);
			num++;
			tmp = format.format(str2Date(tmp).getTime() + 3600*24*1000);
		}
		
		if(num == 0){
			//System.out.println("两个日期相邻!");
		}
		return dates;
	}
	public static Date str2Date(String str) {
		String dateFormat = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		if (str == null) {
			return null;
		}
		try {
			return format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			return null;
	}
	public static void main(String[] args) throws Exception {
//		System.out.println(getMonthLastDay());
//		getDateStringAdd("2015-09-06", -1);
//		System.out.println(dateMonths("2015-01-02", "2015-05-01"));
//		System.out.println(getMonthStringAdd("2015-01-02", 2));
//		System.out.println(DateToStr(new Date(), "yyyy-MM-dd"));
//		System.out.println(process("2015-02-08","2015-02-03"));
//		System.out.println(Date2Str(new Date()));
//		System.out.println(StrToDate("2015-10-23","yyyy-MM-dd"));
		long iv = 1465888287827l;//getTimeMills(0,0,1);
		System.out.println(iv);
		Date date = new Date(iv);
		System.out.println(date);
		Calendar cal = new GregorianCalendar();
		cal.setTime(new Date());
//		System.out.println(DateToStr(cal.getTime()));
		cal.add(Calendar.DATE, 1);
		System.out.println(DateToStr(cal.getTime()));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime().getTime());
	}
	
	/**
	 * 
	* @author liujn
	* @Title: getTimeMills
	* @Description: 获取当前时间加减输入年月日后的毫秒数
	* @param @param year 整数
	* @param @param month 整数
	* @param @param date 整数
	* @param @return
	* @return long
	* @throws
	 */
	public static long getTimeMills(int year ,int month,int date){
		Calendar cal = new GregorianCalendar();
		cal.setTime(new Date());
//		System.out.println(DateToStr(cal.getTime()));
		cal.add(Calendar.YEAR, year);
		cal.add(Calendar.MONTH, month);
		cal.add(Calendar.DATE, date);
		return cal.getTime().getTime();
	}

}
