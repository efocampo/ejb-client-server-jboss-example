package com.eocampo.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import com.eocampo.add.AddBeanRemote;

public class ClientAddConsumer {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		properties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		properties.put(Context.PROVIDER_URL, "remote://localhost:4447");

		properties.put(Context.SECURITY_PRINCIPAL, "auditoria");
		properties.put(Context.SECURITY_CREDENTIALS,"auditoria1*");
		properties.put("jboss.naming.client.ejb.context", "true");

		try {
			Context ctx = new InitialContext(properties);
			Object ref = ctx.lookup("server/AddBean!com.eocampo.add.AddBeanRemote");
			
			AddBeanRemote ebr = (AddBeanRemote) 
					PortableRemoteObject.narrow(ref, AddBeanRemote.class);
			
			System.out.println("5 + 8 = " + ebr.add(5, 8));
		} catch (NamingException e) {
	
			e.printStackTrace();
		}
	}

}
