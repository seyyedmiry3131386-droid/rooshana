package defpackage;

import androidx.room.coroutines.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class wh6 implements rb7 {
    public final rb7 a;
    public final long b;
    public final /* synthetic */ e c;

    public wh6(e eVar, rb7 rb7Var) {
        js3.p(rb7Var, "delegate");
        this.c = eVar;
        this.a = rb7Var;
        this.b = h27.g();
    }

    @Override // defpackage.rb7
    public final String B0(int i) {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.B0(i);
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final void W(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            this.a.W(i, str);
        } else {
            ln2.i(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public final boolean a0() {
        return getLong(0) != 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            this.a.close();
        } else {
            ln2.i(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public final boolean f1() {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.f1();
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final int getColumnCount() {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.getColumnCount();
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final String getColumnName(int i) {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.getColumnName(i);
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final long getLong(int i) {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.getLong(i);
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final boolean isNull(int i) {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            return this.a.isNull(i);
        }
        ln2.i(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.rb7
    public final void l(int i, long j) {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            this.a.l(i, j);
        } else {
            ln2.i(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public final void o() {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            this.a.o();
        } else {
            ln2.i(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public final void reset() {
        if (this.c.e) {
            ln2.i(21, "Statement is recycled");
            throw null;
        }
        if (this.b == h27.g()) {
            this.a.reset();
        } else {
            ln2.i(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
