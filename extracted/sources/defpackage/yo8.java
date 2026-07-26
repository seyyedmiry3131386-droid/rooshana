package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yo8 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final b[] d;
    public int e;

    static {
        String str = j29.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public yo8(String str, b... bVarArr) {
        vy2.j(bVarArr.length > 0);
        this.b = str;
        this.d = bVarArr;
        this.a = bVarArr.length;
        int iH = tv4.h(bVarArr[0].n);
        this.c = iH == -1 ? tv4.h(bVarArr[0].m) : iH;
        String str2 = bVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = bVarArr[0].f | 16384;
        for (int i2 = 1; i2 < bVarArr.length; i2++) {
            String str3 = bVarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i2, bVarArr[0].d, bVarArr[i2].d);
                return;
            } else {
                if (i != (bVarArr[i2].f | 16384)) {
                    c("role flags", i2, Integer.toBinaryString(bVarArr[0].f), Integer.toBinaryString(bVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static yo8 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        return new yo8(bundle.getString(g, ""), (b[]) (parcelableArrayList == null ? ImmutableList.q() : yh0.s(new p58(8), parcelableArrayList)).toArray(new b[0]));
    }

    public static void c(String str, int i, String str2, String str3) {
        StringBuilder sbT = rm7.t("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbT.append(str3);
        sbT.append("' (track ");
        sbT.append(i);
        sbT.append(")");
        wn5.H("TrackGroup", "", new IllegalStateException(sbT.toString()));
    }

    public final int b(b bVar) {
        int i = 0;
        while (true) {
            b[] bVarArr = this.d;
            if (i >= bVarArr.length) {
                return -1;
            }
            if (bVar == bVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        b[] bVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bVarArr.length);
        for (b bVar : bVarArr) {
            List list = bVar.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(b.R, bVar.a);
            bundle2.putString(b.S, bVar.b);
            String str = b.w0;
            ImmutableList<wz3> immutableList = bVar.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(immutableList.size());
            for (wz3 wz3Var : immutableList) {
                wz3Var.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = wz3Var.a;
                if (str2 != null) {
                    bundle3.putString(wz3.c, str2);
                }
                bundle3.putString(wz3.d, wz3Var.b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(b.T, bVar.d);
            bundle2.putInt(b.U, bVar.e);
            bundle2.putInt(b.V, bVar.f);
            int i = bVar.g;
            if (i != b.Q.g) {
                bundle2.putInt(b.x0, i);
            }
            bundle2.putInt(b.W, bVar.h);
            bundle2.putInt(b.X, bVar.i);
            bundle2.putString(b.Y, bVar.k);
            bundle2.putString(b.Z, bVar.m);
            bundle2.putString(b.a0, bVar.n);
            bundle2.putInt(b.b0, bVar.o);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(b.c0 + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(b.d0, bVar.r);
            bundle2.putLong(b.e0, bVar.s);
            bundle2.putInt(b.f0, bVar.u);
            bundle2.putInt(b.g0, bVar.v);
            bundle2.putInt(b.z0, bVar.w);
            bundle2.putInt(b.A0, bVar.x);
            bundle2.putFloat(b.h0, bVar.y);
            bundle2.putInt(b.i0, bVar.z);
            bundle2.putFloat(b.j0, bVar.A);
            bundle2.putByteArray(b.k0, bVar.B);
            bundle2.putInt(b.l0, bVar.C);
            cv0 cv0Var = bVar.D;
            if (cv0Var != null) {
                String str3 = b.m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(cv0.i, cv0Var.a);
                bundle4.putInt(cv0.j, cv0Var.b);
                bundle4.putInt(cv0.k, cv0Var.c);
                bundle4.putByteArray(cv0.l, cv0Var.d);
                bundle4.putInt(cv0.m, cv0Var.e);
                bundle4.putInt(cv0.n, cv0Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(b.y0, bVar.E);
            bundle2.putInt(b.n0, bVar.F);
            bundle2.putInt(b.o0, bVar.G);
            bundle2.putInt(b.p0, bVar.H);
            bundle2.putInt(b.q0, bVar.I);
            bundle2.putInt(b.r0, bVar.J);
            bundle2.putInt(b.s0, bVar.K);
            bundle2.putInt(b.u0, bVar.M);
            bundle2.putInt(b.v0, bVar.N);
            bundle2.putInt(b.t0, bVar.O);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yo8.class == obj.getClass()) {
            yo8 yo8Var = (yo8) obj;
            if (this.b.equals(yo8Var.b) && Arrays.equals(this.d, yo8Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + rm7.k(this.b, 527, 31);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
