package caojx.learn.microservicesimpleconsumermovieribbonconfigjava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 用户实体类
 *
 * @author caojx
 * @version $Id: User.java,v 1.0 2019-03-19 13:08 caojx
 * @date 2019-03-19 13:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

}