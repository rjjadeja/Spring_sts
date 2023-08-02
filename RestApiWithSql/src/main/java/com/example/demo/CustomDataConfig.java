package com.example.demo;

import java.util.Properties;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;        
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.mysql.cj.xdevapi.SessionFactory;

public class CustomDataConfig {
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(@Qualifier("dataSource")DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder((javax.sql.DataSource) dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("com.bonoboz.common.model","com.bonoboz.convaTec.model"); // add , for separate folder 
		return (SessionFactory) sessionBuilder.buildSessionFactory();
	}
	
	protected Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.jdbc.batch_size", "1000");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.use_sql_comments", "true");
		properties.put("hibernate.order_inserts", "true");
		properties.put("hibernate.order_updates", "true");
		properties.put("hibernate.connection.CharSet", "utf8");
		properties.put("hibernate.connection.characterEncoding", "utf8");
		/*properties.put("hibernate.connection.CharSet", "utf8mb4");
		properties.put("hibernate.connection.characterEncoding", "utf8mb4");*/
		properties.put("hibernate.connection.useUnicode", "true");
		//model and db sync
		properties.put("hibernate.hbm2ddl.auto", "update");

//	    properties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory");
//		properties.put("hibernate.cache.provider_class", "org.hibernate.cache.EhCacheProvider");
//		properties.put("net.sf.ehcache.configurationResourceName", "/ehcache.xml");
//		properties.put("hibernate.cache.use_second_level_cache", "true");
//		properties.put("hibernate.cache.use_query_cache",
//			    Boolean.TRUE.toString());

		return properties;
}}
