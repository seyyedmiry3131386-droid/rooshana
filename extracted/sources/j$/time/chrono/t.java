package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n q(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b t(TemporalAccessor temporalAccessor) {
        return j$.time.g.E(temporalAccessor);
    }

    private t() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final e u(LocalDateTime localDateTime) {
        return LocalDateTime.D(localDateTime);
    }

    public static boolean j(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
