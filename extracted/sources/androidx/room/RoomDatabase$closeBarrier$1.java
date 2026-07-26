package androidx.room;

import defpackage.bp2;
import defpackage.dc8;
import defpackage.e51;
import defpackage.js3;
import defpackage.s11;
import defpackage.tx8;
import defpackage.xj1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements bp2 {
    @Override // defpackage.bp2
    public final Object invoke() throws Exception {
        d dVar = (d) this.receiver;
        e51 e51Var = dVar.a;
        if (e51Var == null) {
            js3.V("coroutineScope");
            throw null;
        }
        js3.j(e51Var, null);
        dVar.d();
        xj1 xj1Var = dVar.e;
        if (xj1Var == null) {
            js3.V("connectionManager");
            throw null;
        }
        ((s11) xj1Var.g).close();
        dc8 dc8Var = (dc8) xj1Var.h;
        if (dc8Var != null) {
            dc8Var.close();
        }
        return tx8.a;
    }
}
