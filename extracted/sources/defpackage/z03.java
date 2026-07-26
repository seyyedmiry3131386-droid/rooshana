package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z03 implements iv4 {
    public final String a;
    public final String b;
    public final List c;

    public z03(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ void b(pp4 pp4Var) {
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z03.class == obj.getClass()) {
            z03 z03Var = (z03) obj;
            if (TextUtils.equals(this.a, z03Var.a) && TextUtils.equals(this.b, z03Var.b) && this.c.equals(z03Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? dw1.s(t61.n(" [", str, ", "), this.b, "]") : "");
        return sb.toString();
    }
}
