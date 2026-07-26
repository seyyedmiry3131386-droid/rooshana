package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements TemporalAccessor {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ w d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    public o(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, w wVar) {
        this.a = bVar;
        this.b = temporalAccessor;
        this.c = mVar;
        this.d = wVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.e(pVar);
        }
        return this.b.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.k(pVar);
        }
        return this.b.k(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.w(pVar);
        }
        return this.b.w(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(a aVar) {
        if (aVar == j$.time.temporal.q.b) {
            return this.c;
        }
        if (aVar == j$.time.temporal.q.a) {
            return this.d;
        }
        if (aVar == j$.time.temporal.q.c) {
            return this.b.l(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        w wVar = this.d;
        if (wVar != null) {
            str2 = " with zone " + wVar;
        }
        return this.b + str + str2;
    }
}
