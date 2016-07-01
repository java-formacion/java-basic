package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {
	ArrayList<String> paises = new ArrayList<String>();

	static final String ITALIA = "Italia";
	static final String ALEMANIA = "Alemania";
	static final String FRANCIA = "Francia";

	@Test
	public void test() {

		paises.add(ALEMANIA);
		paises.add(FRANCIA);
		paises.add(ITALIA);

		paises.remove(0);
		paises.get(0);

		assertEquals(FRANCIA, paises.get(0));

		paises.indexOf(ITALIA);

	}

}
