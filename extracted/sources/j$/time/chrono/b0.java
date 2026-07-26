package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends a implements Serializable {
    public static final b0 c = new b0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String h() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n q(int i) {
        if (i == 0) {
            return e0.BEFORE_ROC;
        }
        if (i == 1) {
            return e0.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof d0) {
            return (d0) temporalAccessor;
        }
        return new d0(j$.time.g.E(temporalAccessor));
    }

    public final j$.time.temporal.t j(j$.time.temporal.a aVar) {
        int i = a0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.e(tVar.a - 22932, tVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.f(tVar2.d - 1911, (-tVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.e(tVar3.a - 1911, tVar3.d - 1911);
    }

    private b0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
