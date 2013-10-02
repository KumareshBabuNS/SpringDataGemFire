package pivotal.au.se.deptemp.repos;

import java.util.Collection;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pivotal.au.se.deptemp.beans.Employee;

public interface EmpRepository extends CrudRepository<Employee, String>
{
	@Query("SELECT * FROM /employees where deptno = $1")
	Collection<Employee> empsInDeptno(int deptno);
	
}
