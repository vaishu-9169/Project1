package com.natwest.Model;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.natwest.exception.CustomerNotFoundException;



@Repository
public interface IcustomerRepository extends JpaRepository<Customer,String>
{
	@Query(value="select * from Customer1 cust where cust.email like %:emailParam%", nativeQuery=true)
	Optional<Customer> findByEmail(@Param("emailParam") String email);
//	List<Customer> findByEmail(@Param("emailParam") String email);
	

	@Query(value="select * from Customer1 cust where cust.email like %:emailParam% and cust.password like %:passParam%", nativeQuery=true)
	public Customer  validateCustomer(@Param("emailParam") String email,@Param("passParam") String password);
	

}
