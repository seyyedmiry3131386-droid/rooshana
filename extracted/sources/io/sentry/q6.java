package io.sentry;

import io.sentry.protocol.TransactionNameSource;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 extends k6 {
    public static final TransactionNameSource s = TransactionNameSource.CUSTOM;
    public String p;
    public TransactionNameSource q;
    public p6 r;

    public q6(String str, TransactionNameSource transactionNameSource, String str2, p6 p6Var) {
        super(new io.sentry.protocol.v(), new m6(), str2, null);
        io.sentry.config.a.W(str, "name is required");
        this.p = str;
        this.q = transactionNameSource;
        a(p6Var);
        this.m = io.sentry.config.a.s(null, p6Var == null ? null : p6Var.a, p6Var == null ? null : p6Var.b, p6Var == null ? null : p6Var.c);
    }

    public static q6 b(k kVar) {
        kVar.getClass();
        c cVar = (c) kVar.d;
        Double d = cVar.c;
        q6 q6Var = new q6((io.sentry.protocol.v) kVar.b, (m6) kVar.c, "default", (m6) null);
        q6Var.p = "<unlabeled transaction>";
        q6Var.r = null;
        q6Var.q = s;
        q6Var.m = io.sentry.config.a.s(cVar, null, null, null);
        return q6Var;
    }
}
