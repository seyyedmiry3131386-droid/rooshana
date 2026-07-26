package androidx.sqlite.driver;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.cc8;
import defpackage.hc8;
import defpackage.js3;
import defpackage.ln2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends hc8 {
    public final SupportSQLiteStatement$Companion$TransactionOperation d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cc8 cc8Var, String str, SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation) {
        super(cc8Var, str);
        js3.p(cc8Var, "db");
        js3.p(str, "sql");
        this.d = supportSQLiteStatement$Companion$TransactionOperation;
    }

    @Override // defpackage.rb7
    public final String B0(int i) {
        b();
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final void W(int i, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b();
        ln2.i(25, "column index out of range");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c = true;
    }

    @Override // defpackage.rb7
    public final boolean f1() {
        int iOrdinal = this.d.ordinal();
        cc8 cc8Var = this.a;
        if (iOrdinal == 0) {
            cc8Var.b0();
            cc8Var.y0();
            return false;
        }
        if (iOrdinal == 1) {
            cc8Var.y0();
            return false;
        }
        if (iOrdinal == 2) {
            cc8Var.p();
            return false;
        }
        if (iOrdinal == 3) {
            cc8Var.d0();
            return false;
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        cc8Var.O();
        return false;
    }

    @Override // defpackage.rb7
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // defpackage.rb7
    public final String getColumnName(int i) {
        b();
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final long getLong(int i) {
        b();
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final boolean isNull(int i) {
        b();
        ln2.i(21, "no row");
        throw null;
    }

    @Override // defpackage.rb7
    public final void l(int i, long j) {
        b();
        ln2.i(25, "column index out of range");
        throw null;
    }
}
