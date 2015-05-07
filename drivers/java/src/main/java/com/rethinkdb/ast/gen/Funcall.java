// Autogenerated by convert_protofile.py on 2015-05-07.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Funcall extends RqlQuery {


    public Funcall(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Funcall(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Funcall(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.FUNCALL, args, optargs);
    }
    protected Funcall(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


   /* Static factories */
    public static Funcall fromArgs(Object... args){
        return new Funcall(new Arguments(args), null);
    }


}
