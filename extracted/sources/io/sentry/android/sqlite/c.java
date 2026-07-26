package io.sentry.android.sqlite;

import android.database.Cursor;
import defpackage.bp2;
import defpackage.cc8;
import defpackage.gc8;
import defpackage.ic8;
import defpackage.js3;
import defpackage.ut4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cc8 {
    public final cc8 a;
    public final a b;

    public c(cc8 cc8Var, a aVar) {
        js3.p(cc8Var, "delegate");
        js3.p(aVar, "sqLiteSpanManager");
        this.a = cc8Var;
        this.b = aVar;
    }

    @Override // defpackage.cc8
    public final boolean B() {
        return this.a.B();
    }

    @Override // defpackage.cc8
    public final ic8 F(String str) {
        js3.p(str, "sql");
        return new e(this.a.F(str), this.b, str);
    }

    @Override // defpackage.cc8
    public final Cursor G0(final ut4 ut4Var) {
        return (Cursor) this.b.a(((gc8) ut4Var.b).b, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteDatabase$query$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.a.G0(ut4Var);
            }
        });
    }

    @Override // defpackage.cc8
    public final void O() {
        this.a.O();
    }

    @Override // defpackage.cc8
    public final boolean V0() {
        return this.a.V0();
    }

    @Override // defpackage.cc8
    public final long X() {
        return this.a.X();
    }

    @Override // defpackage.cc8
    public final boolean Z() {
        return this.a.Z();
    }

    @Override // defpackage.cc8
    public final void b0() {
        this.a.b0();
    }

    @Override // defpackage.cc8
    public final long c0() {
        return this.a.c0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.cc8
    public final void d0() {
        this.a.d0();
    }

    @Override // defpackage.cc8
    public final int getVersion() {
        return this.a.getVersion();
    }

    @Override // defpackage.cc8
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.cc8
    public final boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // defpackage.cc8
    public final String m() {
        return this.a.m();
    }

    @Override // defpackage.cc8
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.cc8
    public final void p() {
        this.a.p();
    }

    @Override // defpackage.cc8
    public final boolean q0() {
        return this.a.q0();
    }

    @Override // defpackage.cc8
    public final List s() {
        return this.a.s();
    }

    @Override // defpackage.cc8
    public final void w() {
        this.a.w();
    }

    @Override // defpackage.cc8
    public final boolean x0() {
        return this.a.x0();
    }

    @Override // defpackage.cc8
    public final void y0() {
        this.a.y0();
    }
}
