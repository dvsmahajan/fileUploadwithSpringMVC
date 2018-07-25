package org.dvsCorp.userDataStore.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	private SessionFactory factory;
	
}
