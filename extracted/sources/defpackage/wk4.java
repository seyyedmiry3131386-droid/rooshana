package defpackage;

import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wk4 implements iv4 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public wk4(byte[] bArr, String str, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                vy2.j(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                vy2.j(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                vy2.j(z);
                break;
            case "auxiliary.tracks.map":
                vy2.j(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
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

    public final ArrayList d() {
        vy2.r("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk4.class == obj.getClass()) {
            wk4 wk4Var = (wk4) obj;
            if (this.a.equals(wk4Var.a) && Arrays.equals(this.b, wk4Var.b) && this.c == wk4Var.c && this.d == wk4Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + rm7.k(this.a, 527, 31)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk4.toString():java.lang.String");
    }
}
