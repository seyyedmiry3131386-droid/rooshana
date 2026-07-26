package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.ImmutableIntArray;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cw0 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final wp7 a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final ImmutableIntArray h;
    public final boolean i;

    static {
        String str = j29.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public cw0(wp7 wp7Var, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, ImmutableIntArray immutableIntArray) {
        this.a = wp7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = immutableIntArray;
    }

    public static boolean a(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((cw0) list.get(i2)).h.a(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static ImmutableList c(List list, xp7 xp7Var, cb6 cb6Var) {
        int i;
        lj3 lj3Var = new lj3(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            cw0 cw0Var = (cw0) list.get(i2);
            wp7 wp7Var = cw0Var.a;
            if ((wp7Var == null || !xp7Var.a.contains(wp7Var)) && ((i = cw0Var.b) == -1 || !cb6Var.a(i))) {
                if (cw0Var.i) {
                    cw0Var = new cw0(cw0Var.a, cw0Var.b, cw0Var.c, cw0Var.d, cw0Var.e, cw0Var.f, new Bundle(cw0Var.g), false, cw0Var.h);
                }
                lj3Var.O(cw0Var);
            } else {
                lj3Var.O(cw0Var);
            }
        }
        return lj3Var.S();
    }

    public static cw0 d(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(j);
        wp7 wp7VarA = bundle2 == null ? null : wp7.a(bundle2);
        int i2 = bundle.getInt(k, -1);
        int i3 = bundle.getInt(l, 0);
        CharSequence charSequence = bundle.getCharSequence(m, "");
        Bundle bundle3 = bundle.getBundle(n);
        boolean z = i < 3 || bundle.getBoolean(o, true);
        Uri uri = (Uri) bundle.getParcelable(p);
        int i4 = bundle.getInt(q, 0);
        int[] intArray = bundle.getIntArray(r);
        bw0 bw0Var = new bw0(i4, i3);
        if (wp7VarA != null) {
            vy2.i("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", bw0Var.c == -1);
            bw0Var.b = wp7VarA;
        }
        if (i2 != -1) {
            bw0Var.c(i2);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            bw0Var.b(uri);
        }
        bw0Var.f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        bw0Var.g = new Bundle(bundle3);
        bw0Var.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        vy2.j(intArray.length != 0);
        bw0Var.i = intArray.length == 0 ? ImmutableIntArray.d : new ImmutableIntArray(Arrays.copyOf(intArray, intArray.length));
        return bw0Var.a();
    }

    public static ImmutableList e(List list, boolean z, boolean z2) {
        wp7 wp7Var;
        int i;
        wp7 wp7Var2;
        int iA;
        if (list.isEmpty()) {
            return ImmutableList.q();
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            cw0 cw0Var = (cw0) list.get(i4);
            boolean z3 = cw0Var.i;
            ImmutableIntArray immutableIntArray = cw0Var.h;
            if (z3 && (wp7Var2 = cw0Var.a) != null && wp7Var2.a == 0) {
                int i5 = 0;
                while (true) {
                    if (i5 >= immutableIntArray.length() || (iA = immutableIntArray.a(i5)) == 6) {
                        break;
                    }
                    if (z && i2 == -1 && iA == 2) {
                        i2 = i4;
                        break;
                    }
                    if (z2 && i3 == -1 && iA == 3) {
                        i3 = i4;
                        break;
                    }
                    i5++;
                }
            }
        }
        lj3 lj3VarM = ImmutableList.m();
        if (i2 != -1) {
            lj3VarM.O(((cw0) list.get(i2)).b(ImmutableIntArray.b(2)));
        }
        if (i3 != -1) {
            lj3VarM.O(((cw0) list.get(i3)).b(ImmutableIntArray.b(3)));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            cw0 cw0Var2 = (cw0) list.get(i6);
            if (cw0Var2.i && (wp7Var = cw0Var2.a) != null && wp7Var.a == 0 && i6 != i2 && i6 != i3) {
                ImmutableIntArray immutableIntArray2 = cw0Var2.h;
                int i7 = immutableIntArray2.b;
                int i8 = i7;
                while (true) {
                    if (i8 >= immutableIntArray2.c) {
                        i = -1;
                        break;
                    }
                    if (immutableIntArray2.a[i8] == 6) {
                        i = i8 - i7;
                        break;
                    }
                    i8++;
                }
                if (i >= 0) {
                    lj3VarM.O(cw0Var2.b(ImmutableIntArray.b(6)));
                }
            }
        }
        return lj3VarM.S();
    }

    public static ImmutableList f(List list, cb6 cb6Var, Bundle bundle) {
        if (list.isEmpty()) {
            return ImmutableList.q();
        }
        boolean zA = cb6Var.a.a(7, 6);
        boolean zA2 = cb6Var.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zA || z) ? -1 : 0;
        int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
        lj3 lj3VarM = ImmutableList.m();
        for (int i3 = 0; i3 < list.size(); i3++) {
            cw0 cw0Var = (cw0) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    lj3VarM.O(cw0Var.b(new ImmutableIntArray(0, 2, new int[]{2, 6})));
                } else {
                    lj3VarM.O(cw0Var.b(new ImmutableIntArray(0, 3, new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                lj3VarM.O(cw0Var.b(new ImmutableIntArray(0, 2, new int[]{3, 6})));
            } else {
                lj3VarM.O(cw0Var.b(ImmutableIntArray.b(6)));
            }
        }
        return lj3VarM.S();
    }

    public final cw0 b(ImmutableIntArray immutableIntArray) {
        if (this.h.equals(immutableIntArray)) {
            return this;
        }
        return new cw0(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, immutableIntArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw0)) {
            return false;
        }
        cw0 cw0Var = (cw0) obj;
        return Objects.equals(this.a, cw0Var.a) && this.b == cw0Var.b && this.c == cw0Var.c && this.d == cw0Var.d && Objects.equals(this.e, cw0Var.e) && TextUtils.equals(this.f, cw0Var.f) && this.i == cw0Var.i && this.h.equals(cw0Var.h);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        wp7 wp7Var = this.a;
        if (wp7Var != null) {
            bundle.putBundle(j, wp7Var.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(k, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(q, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(l, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(m, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(n, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(p, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(o, z);
        }
        ImmutableIntArray immutableIntArray = this.h;
        if (immutableIntArray.length() == 1 && immutableIntArray.a(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(r, Arrays.copyOfRange(immutableIntArray.a, immutableIntArray.b, immutableIntArray.c));
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h);
    }
}
