package org.neuefische;

import lombok.Getter;

import java.sql.Timestamp;
@Getter
public class FunWithJava {
    Timestamp timestamp;
    FunWithJava(){
        timestamp = new Timestamp(System.currentTimeMillis());
    }

}
