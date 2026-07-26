package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.j;
import j$.time.l;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final l a;
    public final byte b;
    public final j$.time.d c;
    public final j d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(l lVar, int i, j$.time.d dVar, j jVar, boolean z, d dVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = lVar;
        this.b = (byte) i;
        this.c = dVar;
        this.d = jVar;
        this.e = z;
        this.f = dVar2;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iO = this.e ? 86400 : this.d.O();
        int i = this.g.a;
        int i2 = this.h.a - i;
        int i3 = this.i.a - i;
        byte b = iO % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i4 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / 1800 : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        j$.time.d dVar = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b << Dot11LinkAdaptationControl.ASELI) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(iO);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.a);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.a);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        j jVarD;
        int i;
        int i2;
        int i3 = dataInput.readInt();
        l lVarF = l.F(i3 >>> 28);
        int i4 = ((264241152 & i3) >>> 22) - 32;
        int i5 = (3670016 & i3) >>> 19;
        j$.time.d dVarC = i5 == 0 ? null : j$.time.d.C(i5);
        int i6 = (507904 & i3) >>> 14;
        d dVar2 = d.values()[(i3 & 12288) >>> 12];
        int i7 = (i3 & 4080) >>> 4;
        int i8 = (i3 & 12) >>> 2;
        int i9 = i3 & 3;
        if (i6 == 31) {
            long j = dataInput.readInt();
            j jVar = j.e;
            j$.time.temporal.a.SECOND_OF_DAY.s(j);
            int i10 = (int) (j / 3600);
            long j2 = j - ((long) (i10 * 3600));
            int i11 = (int) (j2 / 60);
            dVar = dVar2;
            jVarD = j.D(i10, i11, (int) (j2 - ((long) (i11 * 60))), 0);
        } else {
            dVar = dVar2;
            int i12 = i6 % 24;
            j jVar2 = j.e;
            j$.time.temporal.a.HOUR_OF_DAY.s(i12);
            jVarD = j.h[i12];
        }
        ZoneOffset zoneOffsetI = ZoneOffset.I(i7 == 255 ? dataInput.readInt() : (i7 - 128) * 900);
        if (i8 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i8 * 1800) + zoneOffsetI.a;
        }
        ZoneOffset zoneOffsetI2 = ZoneOffset.I(i);
        if (i9 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = (i9 * 1800) + zoneOffsetI.a;
        }
        ZoneOffset zoneOffsetI3 = ZoneOffset.I(i2);
        boolean z = i6 == 24;
        Objects.requireNonNull(lVarF, "month");
        Objects.requireNonNull(jVarD, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetI, "standardOffset");
        Objects.requireNonNull(zoneOffsetI2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetI3, "offsetAfter");
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !jVarD.equals(j.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (jVarD.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(lVarF, i4, dVarC, jVarD, z, dVar3, zoneOffsetI, zoneOffsetI2, zoneOffsetI3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = ((this.d.O() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.d dVar = this.c;
        return ((this.g.a ^ (this.f.ordinal() + (iO + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.h.a) ^ this.i.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.a - this.h.a > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        j$.time.d dVar = this.c;
        if (dVar != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dVar.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
