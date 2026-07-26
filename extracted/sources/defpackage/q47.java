package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class q47 {
    public static final p47 Companion = new p47();
    public final int a;
    public final String b;

    public q47(int i, String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q47)) {
            return false;
        }
        q47 q47Var = (q47) obj;
        return this.a == q47Var.a && js3.i(this.b, q47Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ReportPlayerErrorRequestDto(id=" + this.a + ", text=" + this.b + ")";
    }

    public /* synthetic */ q47(String str, int i, int i2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, o47.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }
}
