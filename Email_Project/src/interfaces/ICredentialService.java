package interfaces;

import models.Employee;

public interface ICredentialService {

		String generatePassword();
		String generateEmailAddress(Employee employee);
		void showCredentials(Employee employee);
	}
