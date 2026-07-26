package defpackage;

import android.content.Context;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class qo2 implements dc8 {
    public final Context a;
    public final String b;
    public final dc0 c;
    public final c24 d;
    public boolean e;

    public qo2(Context context, String str, dc0 dc0Var) {
        js3.p(context, "context");
        js3.p(dc0Var, "callback");
        this.a = context;
        this.b = str;
        this.c = dc0Var;
        this.d = a.a(new x2(26, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c24 c24Var = this.d;
        if (c24Var.isInitialized()) {
            ((androidx.sqlite.db.framework.a) c24Var.getValue()).close();
        }
    }

    @Override // defpackage.dc8
    public final cc8 g0() {
        return ((androidx.sqlite.db.framework.a) this.d.getValue()).b(false);
    }

    @Override // defpackage.dc8
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.dc8
    public final cc8 p0() {
        return ((androidx.sqlite.db.framework.a) this.d.getValue()).b(true);
    }

    @Override // defpackage.dc8
    public final void setWriteAheadLoggingEnabled(boolean z) {
        c24 c24Var = this.d;
        if (c24Var.isInitialized()) {
            ((androidx.sqlite.db.framework.a) c24Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.e = z;
    }
}
