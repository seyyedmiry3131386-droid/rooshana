package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fc8 extends hc8 {
    public final /* synthetic */ int d = 1;
    public final AutoCloseable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc8(cc8 cc8Var, String str, gc8 gc8Var) {
        super(cc8Var, str);
        js3.p(cc8Var, "db");
        js3.p(str, "sql");
        this.e = gc8Var;
    }

    @Override // defpackage.rb7
    public final String B0(int i) {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).B0(i);
            default:
                b();
                ln2.i(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.rb7
    public final void W(int i, String str) {
        switch (this.d) {
            case 0:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                ((gc8) this.e).W(i, str);
                break;
            default:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                b();
                ((ic8) this.e).x(i, str);
                break;
        }
    }

    @Override // defpackage.hc8, defpackage.rb7
    public boolean a0() {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).a0();
            default:
                return super.a0();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.d) {
            case 0:
                ((gc8) this.e).close();
                break;
            default:
                ((ic8) this.e).close();
                this.c = true;
                break;
        }
    }

    @Override // defpackage.rb7
    public final boolean f1() {
        switch (this.d) {
            case 0:
                gc8 gc8Var = (gc8) this.e;
                boolean zF1 = gc8Var.f1();
                boolean zEqualsIgnoreCase = gc8Var.B0(0).equalsIgnoreCase("wal");
                cc8 cc8Var = this.a;
                if (zEqualsIgnoreCase) {
                    cc8Var.Z();
                } else {
                    cc8Var.w();
                }
                return zF1;
            default:
                b();
                ((ic8) this.e).execute();
                return false;
        }
    }

    @Override // defpackage.rb7
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).getColumnCount();
            default:
                b();
                return 0;
        }
    }

    @Override // defpackage.rb7
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).getColumnName(i);
            default:
                b();
                ln2.i(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.rb7
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).getLong(i);
            default:
                b();
                ln2.i(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.rb7
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((gc8) this.e).isNull(i);
            default:
                b();
                ln2.i(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.rb7
    public final void l(int i, long j) {
        switch (this.d) {
            case 0:
                ((gc8) this.e).l(i, j);
                break;
            default:
                b();
                ((ic8) this.e).l(i, j);
                break;
        }
    }

    @Override // defpackage.hc8, defpackage.rb7
    public final void o() {
        switch (this.d) {
            case 0:
                ((gc8) this.e).o();
                break;
            default:
                b();
                ((ic8) this.e).o();
                break;
        }
    }

    @Override // defpackage.hc8, defpackage.rb7
    public void reset() {
        switch (this.d) {
            case 0:
                ((gc8) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc8(cc8 cc8Var, String str) {
        super(cc8Var, str);
        js3.p(cc8Var, "db");
        js3.p(str, "sql");
        this.e = cc8Var.F(str);
    }
}
