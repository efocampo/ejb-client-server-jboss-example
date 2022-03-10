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
           ``` <security-realm name="ejb-security-realm">   <br />
                <server-identities> 
                    <secret value="YXVkaXRvcmlhMSo="/>
                </server-identities>
            </security-realm>```
  - sd
