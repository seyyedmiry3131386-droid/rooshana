package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j[] h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = h;
            if (i < jVarArr.length) {
                jVarArr[i] = new j(i, 0, 0, 0);
                i++;
            } else {
                j jVar = jVarArr[0];
                g = jVar;
                j jVar2 = jVarArr[12];
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static j G(long j) {
        j$.time.temporal.a.NANO_OF_DAY.s(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return D(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static j E(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        j jVar = (j) temporalAccessor.l(j$.time.temporal.q.g);
        if (jVar != null) {
            return jVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static j D(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new j(i, i2, i3, i4);
    }

    public j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w();
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return F(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return N();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return N() / 1000;
            }
            return F(pVar);
        }
        return pVar.l(this);
    }

    public final int F(j$.time.temporal.p pVar) {
        switch (i.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (N() / 1000000);
            case 7:
                return this.c;
            case 8:
                return O();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final j c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (j) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.s(j);
        switch (i.a[aVar.ordinal()]) {
            case 1:
                return Q((int) j);
            case 2:
                return G(j);
            case 3:
                return Q(((int) j) * 1000);
            case 4:
                return G(j * 1000);
            case 5:
                return Q(((int) j) * 1000000);
            case 6:
                return G(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.s(i);
                    return D(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return L(j - ((long) O()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.s(i2);
                    return D(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return J(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return I(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return I(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i3);
                    return D(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i4);
                    return D(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return I((j - ((long) (this.a / 12))) * 12);
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    public final j Q(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i);
        return D(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            switch (i.b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return K(j);
                case 2:
                    return K((j % 86400000000L) * 1000);
                case 3:
                    return K((j % 86400000) * 1000000);
                case 4:
                    return L(j);
                case 5:
                    return J(j);
                case 6:
                    return I(j);
                case 7:
                    return I((j % 2) * 12);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
        }
        return (j) rVar.i(this, j);
    }

    public final j I(long j) {
        return j == 0 ? this : D(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j J(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return D(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final j L(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return D(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final j K(long j) {
        if (j != 0) {
            long jN = N();
            long j2 = (((j % 86400000000000L) + jN) + 86400000000000L) % 86400000000000L;
            if (jN != j2) {
                return D((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.b || aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d) {
            return null;
        }
        if (aVar == j$.time.temporal.q.g) {
            return this;
        }
        if (aVar == j$.time.temporal.q.f) {
            return null;
        }
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int O() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long N() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int iCompare = Integer.compare(this.a, jVar.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, jVar.b)) == 0 && (iCompare = Integer.compare(this.c, jVar.c)) == 0) ? Integer.compare(this.d, jVar.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (j) j$.com.android.tools.r8.a.a(gVar, this);
    }

    public final int hashCode() {
        long jN = N();
        return (int) (jN ^ (jN >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void R(DataOutput dataOutput) throws IOException {
        if (this.d == 0) {
            if (this.c == 0) {
                if (this.b == 0) {
                    dataOutput.writeByte(~this.a);
                    return;
                } else {
                    dataOutput.writeByte(this.a);
                    dataOutput.writeByte(~this.b);
                    return;
                }
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    public static j M(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.s(i3);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(i4);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i2);
        j$.time.temporal.a.NANO_OF_SECOND.s(i);
        return D(i3, i4, i2, i);
    }
}
