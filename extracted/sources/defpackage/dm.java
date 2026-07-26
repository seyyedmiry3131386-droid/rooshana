package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dm extends rh3 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public dm(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.rh3, defpackage.iv4
    public final void b(pp4 pp4Var) {
        pp4Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dm.class == obj.getClass()) {
            dm dmVar = (dm) obj;
            if (this.d == dmVar.d && Objects.equals(this.b, dmVar.b) && Objects.equals(this.c, dmVar.c) && Arrays.equals(this.e, dmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.rh3
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
