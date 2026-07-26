package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class wb implements dp2, hl0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wb(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object d(Object obj) {
        ry ryVar = (ry) this.b;
        Object obj2 = ryVar.c;
        om0 om0Var = (om0) this.c;
        synchronized (obj2) {
            ((ArrayList) ryVar.d).remove(om0Var);
        }
        return tx8.a;
    }

    @Override // defpackage.hl0
    public void b(g77 g77Var) {
        ((om0) this.c).resumeWith(g77Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    @Override // defpackage.dp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.invoke(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hl0
    public void l(xv6 xv6Var, IOException iOException) {
        if (xv6Var.q) {
            return;
        }
        ((om0) this.c).resumeWith(b.a(iOException));
    }
}
