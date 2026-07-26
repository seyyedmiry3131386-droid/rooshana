package defpackage;

import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes.dex */
public final class cj2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof cj2) {
            return this.a == ((cj2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? ApplicationStateDto.STATE_NONE : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? HomeDto.MAIN : "Invalid";
    }
}
