// Autogenerated by convert_protofile.py on 2015-05-07.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Enum.java
package com.rethinkdb.proto;

public enum QueryType {

    START(1),
    CONTINUE(2),
    STOP(3),
    NOREPLY_WAIT(4);

    public final int value;

    private QueryType(int value){
        this.value = value;
    }
}
