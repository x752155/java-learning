package com.learn.a20date261115;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalender {

		public static void main(String[] args) throws ParseException {
				// 20261116 16:42 -> 17:49
				// 169 -> 173

				// Date类
				// jdk7
				// Date SimpleDateFormat Calendar

				Date dt = new Date(); // 本质System.currentTimeMillis()
				System.out.println("=== Date 对象 === " + dt); // 获取当前时间 Sun Nov 15 16:45:12 CST 2026
				System.out.println("=== Date 对象 getTime 时间戳 === " + dt.getTime()); // === Date 对象 getTime=== 1794732722461



				// dt.setTime(dt.getTime() - 1000*60*60*24*100);
				// System.out.println("=== Date 对象 100天前 === " + dt); // 计算产生误差！！，因为默认是int有最大值

				dt.setTime(dt.getTime() - 1000L*60*60*24*100); // 强行转换为long，计算时间
				System.out.println("=== Date 对象 100天前 === " + dt);



				// SimpleDateFormat -> 按照期望的格式展示
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 指定参数构造
				SimpleDateFormat sdf2 = new SimpleDateFormat(); // 默认构造
				Date d = new Date();
				System.out.println("==== 使用默认格式的 sdf === " + sdf2.format(d)); //==== 使用默认格式的 sdf === 2026/11/15 下午5:04
				System.out.println("==== 使用自定义yyyy格式的 sdf === " + sdf.format(d)); // ==== 使用自定义yyyy格式的 sdf === 2026-11-15 17:04:10

				//解析时间，获取Date对象
				System.out.println("=== 通过模板 解析回Date对象 === " + sdf2.parse("2026/11/15 下午5:04")); // 注意 必须使用定义时候的格式



				//Calendar -> 抽象日历类
				// 单独设置月 年 日 -> 类似js的Date
				// 通过getInstance获取实例
				Calendar calendar = Calendar.getInstance(); // 抽象类 获取子类
				System.out.println("=== Calendar 获取时间 ==== " + calendar.getTime() ); //Sun Nov 15 17:10:51 CST 2026

				Date date = new Date();
				calendar.setTime(date);
				//细节 月份 0-11
				// 星期：星期日开始

				System.out.println("== 获取时间中的 年份 ===" + calendar.get(Calendar.YEAR));  // 2026
				System.out.println("== 获取时间中的 月 ===" + calendar.get(Calendar.MONTH)); // 10(应该加一 变成11月)
				System.out.println("== 获取时间中的 日 ===" + calendar.get(Calendar.DAY_OF_MONTH)); // 15
				System.out.println("== 获取时间中的 星期x ===" + calendar.get(Calendar.DAY_OF_WEEK)); // 1 -> 代表周日

				// 设置时间
				calendar.set(Calendar.YEAR, 2020);
				System.out.println("=== 设置年份为2000 的日期 === " + calendar.getTime()); //Sun Nov 15 17:18:26 CST 2020

				// 加减时间
				calendar.add(Calendar.MONTH, -2); // 加负数就是减
				System.out.println("=== 月份减少2 === " + calendar.getTime()); // Tue Sep 15 17:20:19 CST 2020



				// JDK8的时间类 -> 简单 解决了多线程的时间数据安全问题 -> 时间不可变

				// 日历相关
				// 1. 时区相关
				System.out.println("=== 获取所有时区 === " + ZoneId.getAvailableZoneIds());
				System.out.println("=== 获取系统时区 === " + ZoneId.systemDefault()); // Asia/Shanghai
				System.out.println("=== 获取指定时区 === " + ZoneId.of("Asia/Aden"));

				// 2. 时间戳相关
				System.out.println("=== 时间戳 === " + Instant.now()); // 时间戳 标准时 国内需要加8
				Instant ins = Instant.now();
				System.out.println("=== 结合时区 获取本地时间戳 === " +  ins.atZone(ZoneId.systemDefault())); //2026-11-15T17:28:54.879880+08:00[Asia/Shanghai]


				Instant ins1 = Instant.ofEpochSecond(10); // 原点10秒后
				Instant ins2 = Instant.ofEpochSecond(100); // 原点100秒后
				System.out.println(ins1); // 1970-01-01T00:00:10Z
				System.out.println("=== 比较时间戳的前后 === " + ins1.isAfter(ins2) ); // false


				System.out.println("== plusxxx 增加时间 生成新instance对象 === " + ins1.plusSeconds(10000L)); // 1970-01-01T02:46:50Z


				// 3. 带日期的时间
				ZonedDateTime zdt = ZonedDateTime.now(); // 当前时间
				System.out.println(zdt); // 2026-11-15T17:36:53.171826+08:00[Asia/Shanghai]
				// 其他的略，项目中学

				// 格式化相关
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				System.out.println("== 格式化 == " + dtf.format(zdt)); //2026/11/15
				// 其他方法略


				//日历
				LocalDateTime ldt = LocalDateTime.now();
				System.out.println("== 日历类 == " + ldt); //2026-11-15T17:40:31.537343
				System.out.println("=== 日历类获取时间 get == " + ldt.getYear()); // 2026
				System.out.println("=== 日历类获取时间 getxxx == " + ldt.getMonthValue()); // 11

				System.out.println("=== 日历类修改时间 withxx === " + ldt.withYear(2022)); // 返回新对象 2022-11-15T17:41:57.918242



				// 下面的工具类 略
				// Duration -> 计算时间间隔（秒/纳秒）
				// Period -> 计算年月日的间隔（年/月/日）
				// ChronoUnit -> 日期间隔

		}
}
