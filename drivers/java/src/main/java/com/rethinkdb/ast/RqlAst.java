package com.rethinkdb.ast;

import com.rethinkdb.RethinkDBConnection;
import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.proto.TermType;

import java.util.*;

/** Base class for all reql queries.
 */
public class RqlAst {

    private TermType termType;
    protected Arguments args = new Arguments();
    protected OptArgs optargs = new OptArgs();

    // ** Protected Methods ** //

    protected RqlAst(TermType termType, Arguments args) {
        this(termType, args, new OptArgs());
    }

    protected RqlAst(TermType termType) {
        this(termType, new Arguments(), new OptArgs());
    }

    protected RqlAst(TermType termType, Arguments args, OptArgs optargs) {
        this(null, termType, args, optargs);
    }
    public RqlAst(RqlAst previous, TermType termType, Arguments args, OptArgs optargs) {
        this.termType = termType;

        init(previous, args, optargs);
    }

    protected void init(RqlAst previous, Arguments args, OptArgs optargs) {
        if (previous != null && previous.termType != null) {
            this.args.add(previous);
        }

        if (args != null) {
            for (Object arg : args) {
                this.args.add(RqlUtil.toRqlAst(arg));
            }
        }

        if (optargs != null) {
            for (Map.Entry<String, Object> kv : optargs.entrySet()) {
                this.optargs.put(kv.getKey(), RqlUtil.toRqlAst(kv.getValue()));
            }
        }
    }

    protected TermType getTermType() {
        return termType;
    }

    protected Arguments getArguments() {
        return args;
    }

    protected OptArgs getOptArgs() {
        return optargs;
    }

    protected Map<String, Object> build() {
        throw new RuntimeException("build is not implemented");
    }
}
