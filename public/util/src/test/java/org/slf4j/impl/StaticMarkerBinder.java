package org.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

public class StaticMarkerBinder implements MarkerFactoryBinder {

	/**
	 * The unique instance of this class.
	 */
	public static final StaticMarkerBinder SINGLETON = new StaticMarkerBinder();

	final IMarkerFactory markerFactory = new BasicMarkerFactory();

	@Override
	public IMarkerFactory getMarkerFactory() {
		return markerFactory;
	}

	@Override
	public String getMarkerFactoryClassStr() {
		return BasicMarkerFactory.class.getName();
	}

}
