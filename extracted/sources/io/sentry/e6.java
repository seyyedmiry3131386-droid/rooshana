package io.sentry;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 {
    public final io.sentry.protocol.v a;
    public final m6 b;
    public final Boolean c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public e6(io.sentry.protocol.v vVar, m6 m6Var, Boolean bool) {
        this.a = vVar;
        this.b = m6Var;
        this.c = bool;
    }

    public final String a() {
        m6 m6Var = this.b;
        io.sentry.protocol.v vVar = this.a;
        Boolean bool = this.c;
        if (bool == null) {
            return vVar + "-" + m6Var;
        }
        return vVar + "-" + m6Var + "-" + (bool.booleanValue() ? "1" : "0");
    }
}
