package defpackage;

import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class gu7 implements bq1 {
    public final i a;
    public final long b;
    public final Object c;
    public final om0 d;

    public gu7(i iVar, long j, Object obj, om0 om0Var) {
        this.a = iVar;
        this.b = j;
        this.c = obj;
        this.d = om0Var;
    }

    @Override // defpackage.bq1
    public final void a() {
        i iVar = this.a;
        synchronized (iVar) {
            if (this.b < iVar.t()) {
                return;
            }
            Object[] objArr = iVar.h;
            js3.m(objArr);
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            vy2.f(objArr, j, vy2.i);
            iVar.o();
        }
    }
}
