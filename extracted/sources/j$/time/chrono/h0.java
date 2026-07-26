package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends a implements Serializable {
    public static final h0 c = new h0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n q(int i) {
        if (i == 0) {
            return k0.BEFORE_BE;
        }
        if (i == 1) {
            return k0.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j0) {
            return (j0) temporalAccessor;
        }
        return new j0(j$.time.g.E(temporalAccessor));
    }

    private h0() {
    }

    public final j$.time.temporal.t j(j$.time.temporal.a aVar) {
        int i = g0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.e(tVar.a + 6516, tVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.f((-(tVar2.a + 543)) + 1, tVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.e(tVar3.a + 543, tVar3.d + 543);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
