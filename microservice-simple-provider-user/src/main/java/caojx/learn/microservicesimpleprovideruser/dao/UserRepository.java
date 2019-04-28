package caojx.learn.microservicesimpleprovideruser.dao;

import caojx.learn.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户DAO
 *
 * @author caojx
 * @version $Id: UserRepository.java,v 1.0 2019-03-19 13:12 caojx
 * @date 2019-03-19 13:12
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}