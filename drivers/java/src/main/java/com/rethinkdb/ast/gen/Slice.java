// Autogenerated by nvert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Slice extends RqlQuery {


    public Slice(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Slice(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Slice(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.SLICE, args, optargs);
    }
    protected Slice(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }

    public static Slice fromArgs(Object... args){
        return new Slice(new Arguments(args), null);
    }

}
