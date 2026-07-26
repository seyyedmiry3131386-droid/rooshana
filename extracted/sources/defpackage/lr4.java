package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class lr4 {
    public final String a;
    public final int b;
    public final int c;

    public lr4(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr4)) {
            return false;
        }
        lr4 lr4Var = (lr4) obj;
        int i = lr4Var.c;
        String str = lr4Var.a;
        int i2 = lr4Var.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
