package kotlin.uuid;

import defpackage.a77;
import defpackage.js3;
import defpackage.zp0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final Uuid c = new Uuid(0, 0);
    public final long a;
    public final long b;

    public Uuid(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new UuidSerialized(this.a, this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid uuid2 = uuid;
        js3.p(uuid2, "other");
        long j = uuid2.a;
        long j2 = this.a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.b ^ Long.MIN_VALUE, uuid2.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.a == uuid.a && this.b == uuid.b;
    }

    public final int hashCode() {
        long j = this.a ^ this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        a77.d(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        a77.d(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        a77.d(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        a77.d(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        a77.d(this.b, bArr, 24, 2, 8);
        return new String(bArr, zp0.a);
    }
}
