package io.sentry.android.sqlite;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bp2;
import defpackage.ic8;
import defpackage.js3;
import defpackage.tx8;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ic8 {
    public final ic8 a;
    public final a b;
    public final String c;

    public e(ic8 ic8Var, a aVar, String str) {
        js3.p(ic8Var, "delegate");
        js3.p(aVar, "sqLiteSpanManager");
        js3.p(str, "sql");
        this.a = ic8Var;
        this.b = aVar;
        this.c = str;
    }

    @Override // defpackage.ic8
    public final int E() {
        return ((Number) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteStatement$executeUpdateDelete$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.a.E());
            }
        })).intValue();
    }

    @Override // defpackage.ec8
    public final void K0(int i) {
        this.a.K0(i);
    }

    @Override // defpackage.ec8
    public final void N(int i, double d) {
        this.a.N(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ic8
    public final void execute() {
        this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteStatement$execute$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.a.execute();
                return tx8.a;
            }
        });
    }

    @Override // defpackage.ec8
    public final void i0(int i, byte[] bArr) {
        this.a.i0(i, bArr);
    }

    @Override // defpackage.ic8
    public final long k1() {
        return ((Number) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteStatement$executeInsert$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Long.valueOf(this.g.a.k1());
            }
        })).longValue();
    }

    @Override // defpackage.ec8
    public final void l(int i, long j) {
        this.a.l(i, j);
    }

    @Override // defpackage.ec8
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.ic8
    public final String o0() {
        return (String) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteStatement$simpleQueryForString$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.a.o0();
            }
        });
    }

    @Override // defpackage.ic8
    public final long r() {
        return ((Number) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteStatement$simpleQueryForLong$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Long.valueOf(this.g.a.r());
            }
        })).longValue();
    }

    @Override // defpackage.ec8
    public final void x(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.a.x(i, str);
    }
}
