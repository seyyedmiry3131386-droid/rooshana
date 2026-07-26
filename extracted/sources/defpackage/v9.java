package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class v9 implements w9 {
    public final String a;

    public v9(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9) && js3.i(this.a, ((v9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("LinkCta(text=", this.a, ")");
    }
}
