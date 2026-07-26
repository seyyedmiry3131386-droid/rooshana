package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ik6 extends rh3 {
    public final String b;
    public final byte[] c;

    public ik6(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik6.class == obj.getClass()) {
            ik6 ik6Var = (ik6) obj;
            if (Objects.equals(this.b, ik6Var.b) && Arrays.equals(this.c, ik6Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.rh3
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
