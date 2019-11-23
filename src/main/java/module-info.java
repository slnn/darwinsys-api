module com.darwinsys.api {
	
	requires transitive java.desktop;
	requires java.persistence;
	requires java.prefs;
	requires java.sql;
	requires java.sql.rowset;
	requires javax.servlet.api;
	requires mail;
	requires junit;

	exports com.darwinsys.calendar;
	exports com.darwinsys.csv;
	exports com.darwinsys.database;
	exports com.darwinsys.diff;
	exports com.darwinsys.formatting;
	exports com.darwinsys.genericui;
	exports com.darwinsys.geo;
	exports com.darwinsys.graphics;
	exports com.darwinsys.html;
	exports com.darwinsys.io;
	exports com.darwinsys.lang;
	exports com.darwinsys.locks;
	provides com.darwinsys.locks.PessimisticLockManager
		with com.darwinsys.locks.PessimisticLockManagerImpl;
	exports com.darwinsys.mail;
	exports com.darwinsys.model;
	exports com.darwinsys.net;
	exports com.darwinsys.notepad;
	exports com.darwinsys.preso;
	exports com.darwinsys.reflection;
	exports com.darwinsys.regex;
	exports com.darwinsys.security;
	exports com.darwinsys.sql;
	exports com.darwinsys.swingui;
	exports com.darwinsys.tel;
	exports com.darwinsys.testdata;
	exports com.darwinsys.testing;
	exports com.darwinsys.tools;
	exports com.darwinsys.unix;
	exports com.darwinsys.util;
	exports com.darwinsys.xml;
}
