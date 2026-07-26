package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wy {
    public static final wy c = new wy(ImmutableList.s(vy.d));
    public static final ImmutableList d;
    public static final ImmutableMap e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        tv8.f(3, objArr);
        d = ImmutableList.l(3, objArr);
        j0 j0Var = new j0(4);
        j0Var.c(5, 6);
        j0Var.c(17, 6);
        j0Var.c(7, 6);
        j0Var.c(30, 10);
        j0Var.c(18, 6);
        j0Var.c(6, 8);
        j0Var.c(8, 8);
        j0Var.c(14, 8);
        e = j0Var.a(true);
    }

    public wy(List list) {
        for (int i = 0; i < list.size(); i++) {
            vy vyVar = (vy) list.get(i);
            this.a.put(vyVar.a, vyVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((vy) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static ImmutableList a(int[] iArr, int i) {
        lj3 lj3VarM = ImmutableList.m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            lj3VarM.O(new vy(i2, i));
        }
        return lj3VarM.S();
    }

    public static wy b(Context context, ly lyVar, r79 r79Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), lyVar, r79Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wy c(android.content.Context r11, android.content.Intent r12, defpackage.ly r13, defpackage.r79 r14) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.c(android.content.Context, android.content.Intent, ly, r79):wy");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(defpackage.ly r14, androidx.media3.common.b r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.d(ly, androidx.media3.common.b):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        return j29.m(this.a, wyVar.a) && this.b == wyVar.b;
    }

    public final int hashCode() {
        return (j29.n(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
