//package zdsw.test.map;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//
///**
// * <br><b>标题：map工具类测试</b>
// * <br><b>功能：</b>
// * <pre>
// * 
// * </pre>
// * @author 张东
// * 审核：
// * 重构：
// * @since 2017年7月27日下午8:18:42
// */
//public class MapUtilsTest
//{
//	@Test
//	public void testObj2Map()
//	{
//		TestObj testObj = newObj();
//		Map<String,Object> map1 = MapUtils.obj2Map(testObj);
//		AssertJUnit.assertTrue(map1.size() > 0);
//		testObj.setNum(null);
//		Map<String,Object> map2 = MapUtils.obj2Map(testObj);
//		AssertJUnit.assertTrue(map2.size() > 0);
//	}
//
//	@Test
//	public void testMap2Obj()
//	{
//		final int age = 10;
//		final String name = "zhangdong";
//		final Date birthday = new Date();
//		Map<String,Object> map = new HashMap<>();
//		map.put("age", age);
//		map.put("name", name);
//		map.put("birthday", birthday);
//		TestObj testObj = MapUtils.map2Obj(TestObj.class, map);
//		AssertJUnit.assertEquals(testObj.getAge(), age);
//		AssertJUnit.assertEquals(testObj.getName(), name);
//		AssertJUnit.assertEquals(testObj.getBirthday(), birthday);
//		System.out.println(testObj);
//	}
//
//	private TestObj newObj()
//	{
//		TestObj testObj = new TestObj();
//		testObj.setName("zhangdong");
//		testObj.setAge(25);
//		testObj.setNum(1);
//		testObj.setBirthday(new Date());
//		return testObj;
//	}
//
//	public static class TestObj
//	{
//		private String	name;
//		private int		age;
//		private Integer	num;
//		private Date	birthday;
//
//		public String getName()
//		{
//			return name;
//		}
//
//		public void setName(String name)
//		{
//			this.name = name;
//		}
//
//		public int getAge()
//		{
//			return age;
//		}
//
//		public void setAge(int age)
//		{
//			this.age = age;
//		}
//
//		public Integer getNum()
//		{
//			return num;
//		}
//
//		public void setNum(Integer num)
//		{
//			this.num = num;
//		}
//
//		public Date getBirthday()
//		{
//			return birthday;
//		}
//
//		public void setBirthday(Date birthday)
//		{
//			this.birthday = birthday;
//		}
//
//		@Override
//		public String toString()
//		{
//			return "TestObj [name=" + name + ", age=" + age + ", num=" + num + ", birthday=" + birthday + "]";
//		}
//
//	}
//}
