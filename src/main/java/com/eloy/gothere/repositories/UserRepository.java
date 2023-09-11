package com.eloy.gothere.repositories;

import com.eloy.gothere.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
