package pe.gob.osinergmin.grh.sgsv.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@EntityScan("pe.gob.osinergmin.grh.sgsv")
@EnableTransactionManagement
@PropertySources({@PropertySource("classpath:application.properties")})
@EnableJpaRepositories(
		basePackages = {"pe.gob.osinergmin.grh.sgsv.repository"}, 
	    entityManagerFactoryRef = "grhEntityManager", 
	    transactionManagerRef = "grhTransactionManager"
	)
public class DataSourceConfig {
	@Autowired
    private Environment environment;
	
	@Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean grhEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        
        em.setDataSource(grhDataSource());
        em.setPackagesToScan(new String[] { "pe.gob.osinergmin.grh.sgsv.domain",});

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();        
        em.setJpaVendorAdapter(vendorAdapter);
        
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", environment.getProperty("spring.jpa.hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }
	
	@Primary
    @Bean(destroyMethod = "")
//	public DataSource grhDataSource() throws DataSourceLookupFailureException {//Descomentar para pase
//	  final JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//	  return dataSourceLookup.getDataSource(environment.getProperty("grh.datasource.jndi-name"));
//	}//Descomentar para pase
    public DataSource grhDataSource() {//Comentar para pase
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( environment.getProperty("spring.datasource.driver"));
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));

        return dataSource;
    }//Comentar para pase

    @Primary
    @Bean
    public PlatformTransactionManager grhTransactionManager() {
 
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(grhEntityManager().getObject());
        return transactionManager;
    }
	
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setFieldMatchingEnabled(true);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}


}
