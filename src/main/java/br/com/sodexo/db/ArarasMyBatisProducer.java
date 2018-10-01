package br.com.sodexo.db;

import java.io.InputStream;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;

public class ArarasMyBatisProducer {

  @Produces
  //@ArarasDatasource
  @ApplicationScoped
  @SessionFactoryProvider
  public SqlSessionFactory getSessionFactory() {
    String resource = "mybatis-config-araras.xml";
    InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    return sqlSessionFactory;
  }

	
}

