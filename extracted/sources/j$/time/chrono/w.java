package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String h() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(j$.time.g.E(temporalAccessor));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n q(int i) {
        return z.q(i);
    }

    public final j$.time.temporal.t j(j$.time.temporal.a aVar) {
        switch (v.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.s("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.e;
                int i = zVarArr[zVarArr.length - 1].b.a;
                int iMin = 1000000000 - zVarArr[zVarArr.length - 1].b.a;
                int i2 = zVarArr[0].b.a;
                int i3 = 1;
                while (true) {
                    z[] zVarArr2 = z.e;
                    if (i3 >= zVarArr2.length) {
                        return j$.time.temporal.t.f(iMin, 999999999 - i);
                    }
                    z zVar = zVarArr2[i3];
                    iMin = Math.min(iMin, (zVar.b.a - i2) + 1);
                    i2 = zVar.b.a;
                    i3++;
                }
                break;
            case 6:
                z zVar2 = z.d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                for (z zVar3 : z.e) {
                    jMin = Math.min(jMin, ((zVar3.b.I() ? 366 : 365) - zVar3.b.H()) + 1);
                    if (zVar3.n() != null) {
                        jMin = Math.min(jMin, zVar3.n().b.H() - 1);
                    }
                }
                return j$.time.temporal.t.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.t.e(y.d.a, 999999999L);
            case 8:
                long j = z.d.a;
                z[] zVarArr3 = z.e;
                return j$.time.temporal.t.e(j, zVarArr3[zVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
