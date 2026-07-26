package androidx.sqlite.driver;

import defpackage.cc8;
import defpackage.js3;
import defpackage.mb7;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements mb7 {
    public final cc8 a;

    public a(cc8 cc8Var) {
        js3.p(cc8Var, "db");
        this.a = cc8Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    @Override // defpackage.mb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rb7 m1(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.driver.a.m1(java.lang.String):rb7");
    }

    @Override // defpackage.mb7
    public final boolean n() {
        return this.a.n();
    }
}
