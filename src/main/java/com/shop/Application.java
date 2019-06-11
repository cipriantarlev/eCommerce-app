package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application /* implements CommandLineRunner */ {

//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	ProductService user;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("Insert new product {}",
//				user.insertProduct(new Product(4L, "Samsung Galaxy S9", ProductType.electronics, new BigDecimal("3500"),
//						new byte[] { 1 }, new Stoc(4L, 75))));
//
//	}
}
