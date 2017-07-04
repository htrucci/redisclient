package com.htrucci.redisclient;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by 201410089 on 2017-07-04.
 */

public class Member {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String addr;

    @Getter
    @Setter
    private String number;
}
