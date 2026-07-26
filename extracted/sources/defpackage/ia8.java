package defpackage;

import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class ia8 extends i implements v48 {
    public final void A(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            js3.m(objArr);
            e(Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((t() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    @Override // defpackage.v48
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            js3.m(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((t() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }
}
