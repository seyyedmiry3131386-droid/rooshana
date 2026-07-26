package kotlin.uuid;

import defpackage.js3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes3.dex */
final class UuidSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    public long a;
    public long b;

    public UuidSerialized(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final Object readResolve() {
        long j = this.a;
        long j2 = this.b;
        return (j == 0 && j2 == 0) ? Uuid.c : new Uuid(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        js3.p(objectInput, "input");
        this.a = objectInput.readLong();
        this.b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        js3.p(objectOutput, "output");
        objectOutput.writeLong(this.a);
        objectOutput.writeLong(this.b);
    }

    public UuidSerialized() {
        this(0L, 0L);
    }
}
