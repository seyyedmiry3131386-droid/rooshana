package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ji7 implements yi5 {
    public final String a;
    public final String b;
    public final int c;

    public ji7(String str, String str2) {
        js3.p(str, "queryString");
        js3.p(str2, "querySource");
        this.a = str;
        this.b = str2;
        this.c = rr6.toSearchUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji7)) {
            return false;
        }
        ji7 ji7Var = (ji7) obj;
        return js3.i(this.a, ji7Var.a) && js3.i(this.b, ji7Var.b);
    }

    @Override // defpackage.yi5
    public final int getActionId() {
        return this.c;
    }

    @Override // defpackage.yi5
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("queryString", this.a);
        bundle.putString("querySource", this.b);
        bundle.putInt("index", -1);
        return bundle;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 1;
    }

    public final String toString() {
        return bl4.w("ToSearchUser(queryString=", this.a, ", querySource=", this.b, ", index=-1)");
    }
}
