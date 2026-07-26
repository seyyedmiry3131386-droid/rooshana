package androidx.datastore.preferences.protobuf;

import defpackage.rj0;
import defpackage.sj0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends sj0 {
    public final k b;
    public sj0 c;

    public j(RopeByteString ropeByteString) {
        super(1);
        this.b = new k(ropeByteString);
        this.c = b();
    }

    @Override // defpackage.sj0
    public final byte a() {
        sj0 sj0Var = this.c;
        if (sj0Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = sj0Var.a();
        if (!this.c.hasNext()) {
            this.c = b();
        }
        return bA;
    }

    public final rj0 b() {
        k kVar = this.b;
        if (kVar.hasNext()) {
            return new rj0(kVar.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }
}
