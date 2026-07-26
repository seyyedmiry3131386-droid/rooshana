package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends ct2 {
    public final /* synthetic */ uz1 p;

    public tz1(uz1 uz1Var) {
        this.p = uz1Var;
    }

    @Override // defpackage.ct2
    public final void q(Throwable th) {
        this.p.a.f(th);
    }

    @Override // defpackage.ct2
    public final void s(vp7 vp7Var) {
        uz1 uz1Var = this.p;
        uz1Var.c = vp7Var;
        vp7 vp7Var2 = uz1Var.c;
        zz1 zz1Var = uz1Var.a;
        uz1Var.b = new wv8(vp7Var2, zz1Var.g, zz1Var.i, Build.VERSION.SDK_INT >= 34 ? e02.a() : dt2.o());
        zz1 zz1Var2 = uz1Var.a;
        zz1Var2.getClass();
        ArrayList arrayList = new ArrayList();
        zz1Var2.a.writeLock().lock();
        try {
            zz1Var2.c = 1;
            arrayList.addAll(zz1Var2.b);
            zz1Var2.b.clear();
            zz1Var2.a.writeLock().unlock();
            zz1Var2.d.post(new bm0(arrayList, zz1Var2.c, (Throwable) null));
        } catch (Throwable th) {
            zz1Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
