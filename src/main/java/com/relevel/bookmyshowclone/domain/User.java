package com.relevel.bookmyshowclone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @since Jul 21, 2021 1:38 PM
 */
@Entity
public class User {
    
    @Id
    private long userId;
}
