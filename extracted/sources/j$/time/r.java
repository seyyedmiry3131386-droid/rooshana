package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public r() {
    }

    public r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                g gVar = (g) obj;
                objectOutput.writeInt(gVar.a);
                objectOutput.writeByte(gVar.b);
                objectOutput.writeByte(gVar.c);
                return;
            case 4:
                ((j) obj).R(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                g gVar2 = localDateTime.a;
                objectOutput.writeInt(gVar2.a);
                objectOutput.writeByte(gVar2.b);
                objectOutput.writeByte(gVar2.c);
                localDateTime.b.R(objectOutput);
                return;
            case 6:
                z zVar = (z) obj;
                LocalDateTime localDateTime2 = zVar.a;
                g gVar3 = localDateTime2.a;
                objectOutput.writeInt(gVar3.a);
                objectOutput.writeByte(gVar3.b);
                objectOutput.writeByte(gVar3.c);
                localDateTime2.b.R(objectOutput);
                zVar.b.L(objectOutput);
                zVar.c.F(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((x) obj).a);
                return;
            case 8:
                ((ZoneOffset) obj).L(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.a.R(objectOutput);
                pVar.b.L(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                g gVar4 = localDateTime3.a;
                objectOutput.writeInt(gVar4.a);
                objectOutput.writeByte(gVar4.b);
                objectOutput.writeByte(gVar4.c);
                localDateTime3.b.R(objectOutput);
                offsetDateTime.b.L(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.a);
                objectOutput.writeByte(vVar.b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.a);
                objectOutput.writeByte(nVar.b);
                return;
            case 14:
                q qVar = (q) obj;
                objectOutput.writeInt(qVar.a);
                objectOutput.writeInt(qVar.b);
                objectOutput.writeInt(qVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    public static Object a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                long j = objectInput.readLong();
                long j2 = objectInput.readInt();
                return Duration.i(j$.com.android.tools.r8.a.N(j, j$.com.android.tools.r8.a.R(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.Q(j2, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.D(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.d;
                return g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.M(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                g gVar2 = g.d;
                return LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                g gVar3 = g.d;
                LocalDateTime localDateTimeF = LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput));
                ZoneOffset zoneOffsetK = ZoneOffset.K(objectInput);
                w wVar = (w) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeF, "localDateTime");
                Objects.requireNonNull(zoneOffsetK, "offset");
                Objects.requireNonNull(wVar, "zone");
                if (!(wVar instanceof ZoneOffset) || zoneOffsetK.equals(wVar)) {
                    return new z(localDateTimeF, wVar, zoneOffsetK);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = x.c;
                String utf = objectInput.readUTF();
                Objects.requireNonNull(utf, "zoneId");
                return (utf.length() <= 1 || utf.startsWith(Marker.ANY_NON_NULL_MARKER) || utf.startsWith("-")) ? ZoneOffset.G(utf) : (utf.startsWith("UTC") || utf.startsWith("GMT")) ? w.E(utf, 3) : utf.startsWith("UT") ? w.E(utf, 2) : x.G(utf);
            case 8:
                return ZoneOffset.K(objectInput);
            case 9:
                int i2 = p.c;
                return new p(j.M(objectInput), ZoneOffset.K(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                g gVar4 = g.d;
                return new OffsetDateTime(LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput)), ZoneOffset.K(objectInput));
            case 11:
                int i4 = t.b;
                return t.C(objectInput.readInt());
            case 12:
                int i5 = v.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.s(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.s(b2);
                return new v(i6, b2);
            case 13:
                int i7 = n.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                l lVarF = l.F(b3);
                Objects.requireNonNull(lVarF, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b4);
                if (b4 <= lVarF.E()) {
                    return new n(lVarF.getValue(), b4);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + lVarF.name());
            case 14:
                q qVar = q.d;
                int i8 = objectInput.readInt();
                int i9 = objectInput.readInt();
                int i10 = objectInput.readInt();
                return ((i8 | i9) | i10) == 0 ? q.d : new q(i8, i9, i10);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
