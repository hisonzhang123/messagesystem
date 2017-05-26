package com.edu.common.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.stereotype.Component;

public class NamespaceHandler extends NamespaceHandlerSupport{

	@Override
	public void init() {
		//注册服务器解析器
		registerBeanDefinitionParser(ElmentsNames.CLIENT_FACTORY, new ClientFactoryParser());
	}

}
