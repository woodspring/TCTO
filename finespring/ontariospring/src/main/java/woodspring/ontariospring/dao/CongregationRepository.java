package woodspring.ontariospring.dao;

import java.sql.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import woodspring.ontariospring.model.Congregation;


@Repository("congregationRepository")
public interface CongregationRepository extends CrudRepository<Congregation, Long> {
    List<Congregation> findByUpdatedTS(Date date);

	// Congregation query example and return a stream
    @Query("select c from Congregation c where c.name = :name")
    Stream<Congregation> findByNameReturnStream(@Param("name") String name);
    
    @Query("from Congregation h where lower(h.name) like CONCAT('%', lower(:name), '%')")
    public Iterable<Congregation> findByName(@Param("name") String name);


	// Congregation query example and return a stream
    @Query("select c from Congregation c where c.team = :team")
    Stream<Congregation> findByTeamReturnStream(@Param("team") String team);

}
