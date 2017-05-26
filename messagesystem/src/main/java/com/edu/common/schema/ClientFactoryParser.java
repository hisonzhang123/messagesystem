package com.edu.common.schema;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import com.edu.common.client.ClientFactory;


public class ClientFactoryParser extends AbstractBeanDefinitionParser{
	@Override
	protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
		System.out.println("parseInternal !!!");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(ClientFactory.class);
		
		return builder.getBeanDefinition();
	}
}
