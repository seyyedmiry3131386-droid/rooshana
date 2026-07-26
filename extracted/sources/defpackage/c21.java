package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class c21 implements rb7 {
    public final rb7 a;

    public c21(rb7 rb7Var) {
        this.a = rb7Var;
    }

    @Override // defpackage.rb7
    public final String B0(int i) {
        return this.a.B0(i);
    }

    @Override // defpackage.rb7
    public final void W(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.a.W(i, str);
    }

    @Override // defpackage.rb7
    public final boolean a0() {
        return this.a.a0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rb7 rb7Var = this.a;
        rb7Var.reset();
        rb7Var.o();
    }

    @Override // defpackage.rb7
    public final boolean f1() {
        return this.a.f1();
    }

    @Override // defpackage.rb7
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // defpackage.rb7
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // defpackage.rb7
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // defpackage.rb7
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // defpackage.rb7
    public final void l(int i, long j) {
        this.a.l(i, j);
    }

    @Override // defpackage.rb7
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.rb7
    public final void reset() {
        this.a.reset();
    }
}
