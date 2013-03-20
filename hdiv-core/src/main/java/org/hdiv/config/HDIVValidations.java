/**
 * Copyright 2005-2011 hdiv.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hdiv.validator.Validation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Validations for urls defined by the user in the hdiv-validations.xml file of Spring.
 * 
 * @author Gorka Vicente
 * @since HDIV 1.1
 */
public class HDIVValidations implements BeanFactoryAware {

	/**
	 * Map containing the urls to which the user wants to apply validation for the editable parameters.
	 */
	protected Map urls;

	/**
	 * Map for configuration purpose.
	 */
	protected Map rawUrls;

	/**
	 * Spring bean container factory.
	 */
	private BeanFactory beanFactory;

	/**
	 * Using data read from HDIV custom schema and stored within 'rawUrls' attribute, initialize 'urls' attribute.
	 * 
	 */
	public void init() {

		this.urls = new HashMap();

		Iterator iterator = this.rawUrls.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			List ids = (List) rawUrls.get(key);
			this.urls.put(key, this.createValidationList(ids));
		}

	}

	/**
	 * Convert List with bean ids in another List with the bean instances.
	 * 
	 * @param ids
	 *            List with bean ids.
	 * @return List with bean instances.
	 */
	private List createValidationList(List ids) {
		List newList = new ArrayList();

		Iterator iterator = ids.iterator();
		while (iterator.hasNext()) {
			String id = (String) iterator.next();
			Validation validation = (Validation) this.beanFactory.getBean(id);
			newList.add(validation);
		}
		return newList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return urls.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
	 */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	/**
	 * @return Returns the urls.
	 */
	public Map getUrls() {
		return urls;
	}

	/**
	 * @param urls
	 *            The urls to set.
	 */
	public void setUrls(Map urls) {
		this.urls = urls;
	}

	/**
	 * @return the rawUrls
	 */
	public Map getRawUrls() {
		return rawUrls;
	}

	/**
	 * @param rawUrls
	 *            the rawUrls to set
	 */
	public void setRawUrls(Map rawUrls) {
		this.rawUrls = rawUrls;
	}

}
