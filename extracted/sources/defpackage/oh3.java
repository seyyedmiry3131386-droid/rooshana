package defpackage;

import androidx.media3.common.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oh3 implements iv4 {
    public final byte[] a;
    public final String b;
    public final String c;

    public oh3(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    @Override // defpackage.iv4
    public final void b(pp4 pp4Var) {
        String str = this.b;
        if (str != null) {
            pp4Var.a = str;
        }
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oh3.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((oh3) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return dw1.k(this.a.length, "\"", rm7.t("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
