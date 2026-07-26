package defpackage;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d30 {
    public final String a;
    public final byte[] b;
    public final Priority c;

    public d30(String str, byte[] bArr, Priority priority) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    public static wv8 a() {
        wv8 wv8Var = new wv8(5, false);
        wv8Var.d = Priority.a;
        return wv8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d30) {
            d30 d30Var = (d30) obj;
            if (this.a.equals(d30Var.a) && Arrays.equals(this.b, d30Var.b) && this.c.equals(d30Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return dw1.s(sb, strEncodeToString, ")");
    }
}
