/*
 * Copyright 2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.innserv.dao;

import com.innserv.domain.User;
import com.innserv.exceptions.DataSourceTableDoesNotExistException;
import com.innserv.exceptions.UserDoesNotExistException;
import com.innserv.exceptions.UserExistsException;

public interface UserDao {

	public void save(User user) throws UserExistsException, DataSourceTableDoesNotExistException;

	public void update(User user) throws UserDoesNotExistException, DataSourceTableDoesNotExistException;
	
	public User find (String email) throws DataSourceTableDoesNotExistException;

}
