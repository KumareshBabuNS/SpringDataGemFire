package pivotal.au.se.deptemp.repos;

import java.util.Collection;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pivotal.au.se.deptemp.beans.Department;

public interface DeptRepository extends CrudRepository<Department, String> 
{
	Department findByName(String name);
	
	@Query("SELECT * FROM /departments")
	Collection<Department> myFindAll();
}
