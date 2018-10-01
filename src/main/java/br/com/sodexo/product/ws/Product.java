package br.com.sodexo.product.ws;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sodexo.product.dao.CommonDAO;

@Path("/product")
public class Product {
	
	public void setCommonDAO(CommonDAO commonDAO){
		this.commonDAO = commonDAO;
	}

	@Inject 
	private CommonDAO commonDAO;

	  // This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Plain Product" + teste();
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Product " + teste() + "</hello>";
	  }

	  private String teste() {
		 String ret = "ret:" + commonDAO.verifyDominio("SIT_CRD", "");

		return ret;
	  }
	  
}
