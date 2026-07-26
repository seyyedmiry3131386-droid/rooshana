package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ii7 implements yi5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e = rr6.toSearchResult;

    public ii7(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii7)) {
            return false;
        }
        ii7 ii7Var = (ii7) obj;
        return js3.i(this.a, ii7Var.a) && js3.i(this.b, ii7Var.b) && js3.i(this.c, ii7Var.c) && this.d == ii7Var.d;
    }

    @Override // defpackage.yi5
    public final int getActionId() {
        return this.e;
    }

    @Override // defpackage.yi5
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("query", this.a);
        bundle.putString("querySource", this.b);
        bundle.putString("tab", this.c);
        bundle.putInt("index", this.d);
        return bundle;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("ToSearchResult(query=", this.a, ", querySource=", this.b, ", tab=");
        sbT.append(this.c);
        sbT.append(", index=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
