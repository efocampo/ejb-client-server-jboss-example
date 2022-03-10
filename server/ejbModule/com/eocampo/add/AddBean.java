package com.eocampo.add;

import java.io.Serializable;

import javax.ejb.Stateless;

/*
 * @author Efrén Ocampo
 */

@Stateless
public class AddBean implements AddBeanRemote, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2228357250721786846L;

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
