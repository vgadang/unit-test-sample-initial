package com.aol.demo.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CatalogDaoIntegrationTestConfig.class})
public class CatalogDaoImplIntegrationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogDaoImplIntegrationTest.class);
	
	@Autowired
	private CatalogDao catalogDao;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetProduct() {
	}

}
