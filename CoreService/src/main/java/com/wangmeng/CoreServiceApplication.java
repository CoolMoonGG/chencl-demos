package com.wangmeng;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:spring/application.xml")
public class CoreServiceApplication {

	private static Logger logger = Logger.getLogger(CoreServiceApplication.class.getName());

	/**
	 * Constructor
	 */
	public CoreServiceApplication() {
	}

	/**
	 * application starter
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CoreServiceApplication.class);
		app.setWebEnvironment(false);
		app.run(args);
		MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
		logger.info("CoreService started ...");

	}

}
