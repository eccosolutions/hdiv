/**
 * Copyright 2005-2012 hdiv.org
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
package org.hdiv.urlProcessor;

import java.util.Map;

/**
 * Contains the data of an url.
 * 
 * @author Gotzon Illarramendi
 */
public class UrlData {

	/**
	 * Original url, previous to any change.
	 */
	private String originalUrl;

	/**
	 * Original urls anchor
	 */
	private String anchor;

	/**
	 * JSessionId value
	 */
	private String jSessionId;

	/**
	 * Url that starts with contextPath
	 */
	private String contextPathRelativeUrl;

	/**
	 * The same as contextPathRelativeUrl with contextPath erased
	 */
	private String urlWithoutContextPath;

	/**
	 * Map with original url parameter name and values
	 */
	private Map originalUrlParams;

	/**
	 * Map with processed url parameter name and values
	 */
	private Map processedUrlParams;

	/**
	 * True if the url points to this app
	 */
	private boolean internal = true;

	/**
	 * Protocol, server and port of the url
	 */
	private String server;

	/**
	 * True if the url is part of a form action. False if is a link url.
	 */
	private boolean isFormUrl;

	/**
	 * Constructor
	 * 
	 * @param url
	 *            Original url
	 * @param isFormUrl
	 *            is form or link url?
	 */
	public UrlData(String url, boolean isFormUrl) {
		this.originalUrl = url;
		this.isFormUrl = isFormUrl;
	}

	/**
	 * Determines if url contains parameters
	 * 
	 * @return has parameters?
	 */
	public boolean containsParams() {
		return originalUrlParams != null && originalUrlParams.size() > 0;
	}

	/**
	 * @return the originalUrl
	 */
	public String getOriginalUrl() {
		return originalUrl;
	}

	/**
	 * @param originalUrl
	 *            the originalUrl to set
	 */
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	/**
	 * @return the anchor
	 */
	public String getAnchor() {
		return anchor;
	}

	/**
	 * @param anchor
	 *            the anchor to set
	 */
	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}

	/**
	 * @return the contextPathRelativeUrl
	 */
	public String getContextPathRelativeUrl() {
		return contextPathRelativeUrl;
	}

	/**
	 * @param contextPathRelativeUrl
	 *            the contextPathRelativeUrl to set
	 */
	public void setContextPathRelativeUrl(String contextPathRelativeUrl) {
		this.contextPathRelativeUrl = contextPathRelativeUrl;
	}

	/**
	 * @return the urlWithoutContextPath
	 */
	public String getUrlWithoutContextPath() {
		return urlWithoutContextPath;
	}

	/**
	 * @param urlWithoutContextPath
	 *            the urlWithoutContextPath to set
	 */
	public void setUrlWithoutContextPath(String urlWithoutContextPath) {
		this.urlWithoutContextPath = urlWithoutContextPath;
	}

	/**
	 * @return the originalUrlParams
	 */
	public Map getOriginalUrlParams() {
		return originalUrlParams;
	}

	/**
	 * @param originalUrlParams
	 *            the originalUrlParams to set
	 */
	public void setOriginalUrlParams(Map originalUrlParams) {
		this.originalUrlParams = originalUrlParams;
	}

	/**
	 * @return the processedUrlParams
	 */
	public Map getProcessedUrlParams() {
		return processedUrlParams;
	}

	/**
	 * @param processedUrlParams
	 *            the processedUrlParams to set
	 */
	public void setProcessedUrlParams(Map processedUrlParams) {
		this.processedUrlParams = processedUrlParams;
	}

	/**
	 * @return the internal
	 */
	public boolean isInternal() {
		return internal;
	}

	/**
	 * @param internal
	 *            the internal to set
	 */
	public void setInternal(boolean internal) {
		this.internal = internal;
	}

	/**
	 * @return the server
	 */
	public String getServer() {
		return server;
	}

	/**
	 * @param server
	 *            the server to set
	 */
	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * @return the isFormUrl
	 */
	public boolean isFormUrl() {
		return isFormUrl;
	}

	/**
	 * @param isFormUrl
	 *            the isFormUrl to set
	 */
	public void setFormUrl(boolean isFormUrl) {
		this.isFormUrl = isFormUrl;
	}

	/**
	 * @return the jSessionId
	 */
	public String getjSessionId() {
		return jSessionId;
	}

	/**
	 * @param jSessionId
	 *            the jSessionId to set
	 */
	public void setjSessionId(String jSessionId) {
		this.jSessionId = jSessionId;
	}

}
