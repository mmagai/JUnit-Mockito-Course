package com.javaClass;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper;
	
	
	
	
	@Test
	public void testisValidParantheses_actualParantheses() {
		
        StringHelper helper = new StringHelper();
        boolean actual = helper.isValidParantheses("()");
        
        Assert.assertEquals(true, actual);
		
	}
	

	@Test
	public void testisValidParantheses_wrongParantheses() {
		
        StringHelper helper = new StringHelper();
        boolean actual = helper.isValidParantheses("{{");
        
        Assert.assertEquals(false, actual);
		
	}
	
	

}
