package com.relevel.bookmyshowclone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @since Jul 21, 2021 1:40 PM
 */
@Entity
public class ShowBooking {
    
    @Id
    private long bookingId;
}
