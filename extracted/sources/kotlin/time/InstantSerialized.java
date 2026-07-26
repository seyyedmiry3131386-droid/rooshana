package kotlin.time;

import defpackage.ct2;
import defpackage.js3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes3.dex */
final class InstantSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    public long a;
    public int b;

    public InstantSerialized(int i, long j) {
        this.a = j;
        this.b = i;
    }

    private final Object readResolve() {
        Instant instant = Instant.c;
        return ct2.j(this.b, this.a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        js3.p(objectInput, "input");
        this.a = objectInput.readLong();
        this.b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        js3.p(objectOutput, "output");
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }

    public InstantSerialized() {
        this(0, 0L);
    }
}
