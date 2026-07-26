package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class vm4 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public vm4(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == vm4.class) {
            vm4 vm4Var = (vm4) obj;
            if (TextUtils.equals(this.a, vm4Var.a) && this.b == vm4Var.b && this.c == vm4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((rm7.k(this.a, 31, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
