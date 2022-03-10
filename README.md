# ejb-client-server-jboss-example
Desktop client built in maven that makes calls to a remote EJB implementation on Jboss Server that returns the result of the sum of two numbers.  The calls are protected with security-realm in Jboss.

## Server
- Create Jboss user (It must be user application)
- Command: ```./add-user.sh```
- The username will be: ```auditoria```
- The password will be: ```auditoria1*```
- Slaves Hosts: ```Y```
- Copy the secret value, in my case: ``` <secret value="YXVkaXRvcmlhMSo=" /> ```
- The file standalone.xml should be as follows:
  - Add new security-realm under security-reals section:
           ![security-reals section](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/security-real.png)
  - Set the security realm connection and port
           ![security realm connection](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/connector.png)
   ![port1](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/port.png) 
  - Deployment log
          ![deployment log](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/deployment.png)
  -My standalone.xml
 [standalone.xml](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/standalone.xml)
 ## Client
 - Execution output
 ![Execution output](https://raw.githubusercontent.com/efocampo/ejb-client-server-jboss-example/main/server/files/clientExecution.png)
