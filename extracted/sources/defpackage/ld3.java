package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ld3 extends u2 {
    @Override // defpackage.u2
    public final kd3 j() {
        throw new ClassCastException("Cannot cast Inline instance to Block");
    }

    @Override // defpackage.u2
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return "InlineImpl{name='" + ((String) this.c) + "', start=" + this.a + ", end=" + this.b + ", attributes=" + ((Map) this.d) + '}';
    }
}
