package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 {
    public final String a;
    public final b b;
    public final b c;
    public final int d;
    public final int e;

    public hc1(String str, b bVar, b bVar2, int i, int i2) {
        vy2.j(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        bVar.getClass();
        this.b = bVar;
        bVar2.getClass();
        this.c = bVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hc1.class == obj.getClass()) {
            hc1 hc1Var = (hc1) obj;
            if (this.d == hc1Var.d && this.e == hc1Var.e && this.a.equals(hc1Var.a) && this.b.equals(hc1Var.b) && this.c.equals(hc1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + rm7.k(this.a, (((527 + this.d) * 31) + this.e) * 31, 31)) * 31);
    }
}
