package zdsw.util;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * <br><b>标题：Json工具类</b>
 * <br><b>功能： </b>
 * <pre>
 * </pre>
 * @author zhangd
 * @version 1.0.0
 * @since 2017年7月1日下午2:34:24
 */
public class JsonUtils
{
	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	/**
	 * 将对象转换成json字符串。
	 * <p>Title: pojoToJson</p>
	 * <p>Description: </p>
	 * @param data
	 * @return
	 */
	public static String obj2Json(Object data)
	{
		try
		{
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e)
		{
			throw new RuntimeException("Obj转换为Json串出错！", e);
		}
	}

	/**
	 * 将json结果集转化为对象
	 * 
	 * @param jsonData json数据
	 * @param clazz 对象中的object类型
	 * @return
	 */
	public static <T> T json2Obj(String jsonData, Class<T> beanType)
	{
		try
		{
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		} catch (Exception e)
		{
			throw new RuntimeException("Json串转换为Obj出错！", e);
		}
	}

	/**
	 * 将json数据转换成pojo对象list
	 * <p>Title: jsonToList</p>
	 * <p>Description: </p>
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> List<T> json2List(String jsonData, Class<T> beanType)
	{
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
		try
		{
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		} catch (Exception e)
		{
			throw new RuntimeException("Json串转换为List出错！", e);
		}
	}
}
