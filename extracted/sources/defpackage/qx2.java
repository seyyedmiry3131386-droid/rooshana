package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qx2 {
    public final String a;
    public final String b;

    public qx2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qx2.class == obj.getClass()) {
            qx2 qx2Var = (qx2) obj;
            if (TextUtils.equals(this.a, qx2Var.a) && TextUtils.equals(this.b, qx2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return dw1.s(sb, this.b, "]");
    }
}
