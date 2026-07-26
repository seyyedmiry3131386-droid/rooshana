package androidx.room.coroutines;

import defpackage.bp2;
import defpackage.do3;
import defpackage.fv;
import defpackage.js3;
import defpackage.qx1;
import defpackage.s11;
import defpackage.wq2;
import defpackage.x2;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s11 {
    public final d a;
    public final d b;
    public final fv c;
    public final ThreadLocal d;
    public volatile boolean e;
    public final long f;
    public final int g;

    public a(do3 do3Var) {
        this.c = new fv(8);
        this.d = new ThreadLocal();
        int i = qx1.d;
        this.f = wq2.T(30, DurationUnit.e);
        this.g = 2;
        d dVar = new d(1, new x2(16, do3Var));
        this.a = dVar;
        this.b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #3 {all -> 0x01a7, blocks: (B:64:0x0123, B:69:0x0141, B:71:0x014c, B:86:0x01ab, B:87:0x01b2), top: B:113:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a7, blocks: (B:64:0x0123, B:69:0x0141, B:71:0x014c, B:86:0x01ab, B:87:0x01b2), top: B:113:0x0123 }] */
    @Override // defpackage.s11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(boolean r18, defpackage.qp2 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.a.M(boolean, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    public a(final do3 do3Var, final String str, int i) {
        js3.p(str, "fileName");
        this.c = new fv(8);
        this.d = new ThreadLocal();
        int i2 = qx1.d;
        this.f = wq2.T(30, DurationUnit.e);
        this.g = 2;
        if (i > 0) {
            final int i3 = 0;
            this.a = new d(i, new bp2() { // from class: t11
                @Override // defpackage.bp2
                public final Object invoke() throws Exception {
                    switch (i3) {
                        case 0:
                            mb7 mb7VarD = do3Var.d(str);
                            ln2.d(mb7VarD, "PRAGMA query_only = 1");
                            return mb7VarD;
                        default:
                            return do3Var.d(str);
                    }
                }
            });
            final int i4 = 1;
            this.b = new d(1, new bp2() { // from class: t11
                @Override // defpackage.bp2
                public final Object invoke() throws Exception {
                    switch (i4) {
                        case 0:
                            mb7 mb7VarD = do3Var.d(str);
                            ln2.d(mb7VarD, "PRAGMA query_only = 1");
                            return mb7VarD;
                        default:
                            return do3Var.d(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
