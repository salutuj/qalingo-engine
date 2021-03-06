/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.domain.enumtype;

/**
 * 
 */
public enum ProductAssociationLinkType {

	/**
	 * 
	 */
	CROSS_SELLING("CROSS_SELLING"),
	
	/**
	 * 
	 */
	UP_SELLING("UP_SELLING"),
	
	/**
	 * 
	 */
	CUSTOMER_RECOMMENDATION("CUSTOMER_RECOMMENDATION");
	
	private String propertyKey = "";

	/**
	 * Constructor.
	 * 
	 * @param propertyKey the property key.
	 */
	ProductAssociationLinkType(final String propertyKey) {
		this.propertyKey = propertyKey;
	}

	/**
	 * Get the localization property key.
	 * 
	 * @return the localized property key
	 */
	public String getPropertyKey() {
		return this.propertyKey;
	}
}
