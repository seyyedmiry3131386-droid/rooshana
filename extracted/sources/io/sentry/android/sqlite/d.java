package io.sentry.android.sqlite;

import defpackage.bp2;
import defpackage.c24;
import defpackage.cc8;
import defpackage.dc8;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dc8 {
    public final dc8 a;
    public final a b;
    public final c24 c = kotlin.a.a(new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteOpenHelper$sentryWritableDatabase$2
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            d dVar = this.g;
            return new c(dVar.a.p0(), dVar.b);
        }
    });
    public final c24 d = kotlin.a.a(new bp2() { // from class: io.sentry.android.sqlite.SentrySupportSQLiteOpenHelper$sentryReadableDatabase$2
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            d dVar = this.g;
            return new c(dVar.a.g0(), dVar.b);
        }
    });

    public d(dc8 dc8Var) {
        this.a = dc8Var;
        this.b = new a(dc8Var.getDatabaseName());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.dc8
    public final cc8 g0() {
        return (cc8) this.d.getValue();
    }

    @Override // defpackage.dc8
    public final String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.dc8
    public final cc8 p0() {
        return (cc8) this.c.getValue();
    }

    @Override // defpackage.dc8
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
