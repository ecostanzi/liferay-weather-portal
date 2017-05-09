package org.ecostanzi.weather.userimporter;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.security.ldap.exportimport.LDAPUserImporter;
import org.osgi.service.component.annotations.Component;

import javax.naming.directory.Attributes;
import javax.naming.ldap.LdapContext;

/**
 * @author enrico
 */
@Component(
	immediate = true,
	property = {
	},
	service = LDAPUserImporter.class
)
public class WeatherServiceUserImporter implements LDAPUserImporter{

	private Log _log = LogFactoryUtil.getLog(WeatherServiceUserImporter.class);

	@Override
	public User importUser(long ldapServerId, long companyId, LdapContext ldapContext, Attributes attributes, String password) throws Exception {
		_log.info("Hello there! I'm pretending to import users!");
		return null;
	}

	@Override
	public long getLastImportTime() throws Exception {
		return 0;
	}

	@Override
	public User importUser(long ldapServerId, long companyId, String emailAddress, String screenName) throws Exception {
		return null;
	}

	@Override
	public User importUser(long companyId, String emailAddress, String screenName) throws Exception {
		return null;
	}

	@Override
	public User importUserByScreenName(long companyId, String screenName) throws Exception {
		return null;
	}

	@Override
	public void importUsers() throws Exception {

	}

	@Override
	public void importUsers(long companyId) throws Exception {

	}

	@Override
	public void importUsers(long ldapServerId, long companyId) throws Exception {

	}
}