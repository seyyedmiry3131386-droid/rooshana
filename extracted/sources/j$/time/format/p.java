package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import j$.time.w;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public p(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar = dateTimeFormatter.d;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) temporalAccessor.l(j$.time.temporal.q.b);
            w wVar = (w) temporalAccessor.l(j$.time.temporal.q.a);
            j$.time.chrono.b bVarT = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            Objects.equals(null, wVar);
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarT = mVar3.t(temporalAccessor);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.e(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + mVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new o(bVarT, temporalAccessor, mVar3, wVar);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.e(pVar)) {
            return Long.valueOf(temporalAccessor.w(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
