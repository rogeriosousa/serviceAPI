package br.com.sodexo.application;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

import br.com.sodexo.product.ws.Product;


@ApplicationPath("/rest")
public class SodexoApplication extends javax.ws.rs.core.Application {

	public SodexoApplication() {
//		BeanConfig conf = new BeanConfig();
//	    conf.setVersion("1.0.0");
//	    conf.setTitle("Bacen API");
//	    conf.setDescription("Api Sodexo - Provides access to individual/LegalPerson registration info,"
//	    		+ " Restriction Global, Except By Client, Except By Decision Center, Log Access HP");
//	    conf.setContact("Sodexo BR Web Team");
//	    conf.setBasePath("/webs2/");
//	    conf.setSchemes(new String[] { "http", "https" });
//	    conf.setResourcePackage("br.com.sodexo.ebsws.ApiRest.resources");
//	    conf.setScan(true);
	}
	
	@Override
	  public Set<Class<?>> getClasses() {
	      Set<Class<?>> resources = new HashSet<Class<?>>();

	      resources.add(Product.class);
	      
	      return resources;
	   }
}