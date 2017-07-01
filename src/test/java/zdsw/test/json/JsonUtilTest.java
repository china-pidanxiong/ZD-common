package zdsw.test.json;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import zdsw.util.JsonUtils;
/**
 * <br><b>标题：json工具类测试</b>
 * <br><b>功能： </b>
 * <pre>
 * </pre>
 * @author zhangd
 * @version 1.0.0
 * @since 2017年7月1日下午2:44:30
 */
public class JsonUtilTest
{
	@Test
	public void obj2JsonTest()
	{
		Map<String,Object> map = new HashMap<>();
		Map<String,Object> levelMap = new HashMap<>();
		levelMap.put("zhangd1", "Hello");
		levelMap.put("zhangd2", "World");
		map.put("level", levelMap);
		String jsonObj = JsonUtils.obj2Json(map);
		System.out.println(jsonObj);
	}

	@Test
	public void json2ObjTest()
	{
		Entity e = new Entity();
		e.setEcode("Z00000001");
		e.setEname("zhangd");
//		String jsonObj = "{'Entity':{'ename':'zhangd','ecode':'Z00001'}}";
		String jsonObj = JsonUtils.obj2Json(e);
		Entity entity = JsonUtils.json2Obj(jsonObj, Entity.class);
		System.out.println(entity);
	}

	@Test
	public void json2ListTest()
	{
	}

	class Entity
	{
		private String	ename;
		private String	ecode;

		public String getEname()
		{
			return ename;
		}

		public void setEname(String ename)
		{
			this.ename = ename;
		}

		public String getEcode()
		{
			return ecode;
		}

		public void setEcode(String ecode)
		{
			this.ecode = ecode;
		}

		@Override
		public String toString()
		{
			return "Entity [ename=" + ename + ", ecode=" + ecode + "]";
		}
	}
}
