package com.eocampo.add;

import javax.ejb.Remote;

/*
 * @author Efrén Ocampo
 */


@Remote
public interface AddBeanRemote {
	public int add(int a, int b);
}
