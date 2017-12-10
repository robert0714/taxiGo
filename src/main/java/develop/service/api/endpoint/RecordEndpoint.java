package develop.service.api.endpoint;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils; 
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import develop.service.api.model.RecordRequest;
import develop.service.api.model.TaxiRepsonse;
import develop.service.api.model.TaxiStatus;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/record")
public class RecordEndpoint {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value = "紀錄乘客搭車資訊", notes = "")
	@RequestMapping(value = { "" }, method = RequestMethod.POST)
	public TaxiRepsonse record(@RequestBody RecordRequest request) {
		List<String> blankAttr = blankAttribute(request);
		TaxiRepsonse result =new TaxiRepsonse();
		if(!CollectionUtils.isEmpty(blankAttr)  ) {
			String message = String.format(
					TaxiStatus.TRA40013.getDes()+": %", StringUtils.join(blankAttr,","));
			result.setMessage(message);
			result.setStatus(TaxiStatus.TRA40013);
			
		}
		return result;
	}

	public List<String> blankAttribute(final RecordRequest parameter) {
		final Field[] fields = parameter.getClass().getDeclaredFields();
		List<String> resultLs =new ArrayList<>();
		 
		for (Field field : fields) {
			String name = field.getName();
			try {
				final Object value = PropertyUtils.getProperty(parameter, name);
				Class<?> cls = PropertyUtils.getPropertyType(parameter, name);
				if (value == null) {
					resultLs.add(name);
				} else if (ClassUtils.isAssignable(cls, String.class)) {
					String tmp = (String) value;
					if (StringUtils.isBlank(tmp)) {
						resultLs.add(name);
					}
				}
			} catch (IllegalAccessException e) {
				log.error(e.getMessage(), e);
			} catch (InvocationTargetException e) {
				log.error(e.getMessage(), e);
			} catch (NoSuchMethodException e) {
				log.error(e.getMessage(), e);
			} catch (SecurityException e) {
				log.error(e.getMessage(), e);
			}
		}
		return resultLs;
	}
}
