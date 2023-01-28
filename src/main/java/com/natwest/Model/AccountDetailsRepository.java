package com.natwest.Model;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.natwest.exception.CustomerNotFoundException;



@Repository
public interface AccountDetailsRepository extends JpaRepository<Accounts,String>
{
	

//	@Query(value="select * from accountdetails", nativeQuery=true)
	

}
