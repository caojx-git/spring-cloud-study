package caojx.learn.microservicesimpleproviderusersleuthzipkin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 用户实体类
 *
 * @author caojx
 * @version $Id: User.java,v 1.0 2019-03-19 13:08 caojx
 * @date 2019-03-19 13:08
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

}