package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 extends fi4 {
    public static final p1 l = p1.b(new mh(4));
    public final Object d;
    public final Context e;
    public final hy2 f;
    public vh1 g;
    public Thread h;
    public xh1 i;
    public ly j;
    public Boolean k;

    public ci1(Context context) {
        this(context, new hy2(24));
    }

    public static void c(zo8 zo8Var, vh1 vh1Var, HashMap map) {
        for (int i = 0; i < zo8Var.a; i++) {
            ep8 ep8Var = (ep8) vh1Var.D.get(zo8Var.a(i));
            if (ep8Var != null) {
                yo8 yo8Var = ep8Var.a;
                ep8 ep8Var2 = (ep8) map.get(Integer.valueOf(yo8Var.c));
                if (ep8Var2 == null || (ep8Var2.b.isEmpty() && !ep8Var.b.isEmpty())) {
                    map.put(Integer.valueOf(yo8Var.c), ep8Var);
                }
            }
        }
    }

    public static int d(b bVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(bVar.d);
        if (strG2 == null || strG == null) {
            return (z && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        String str2 = j29.a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(vh1 vh1Var, int i, b bVar) {
        if ((i & 3584) == 0) {
            return false;
        }
        fp8 fp8Var = vh1Var.u;
        if (fp8Var.c && (i & 2048) == 0) {
            return false;
        }
        if (fp8Var.b) {
            boolean z = (bVar.I == 0 && bVar.J == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i, ei4 ei4Var, int[][][] iArr, zh1 zh1Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessS;
        ei4 ei4Var2 = ei4Var;
        ArrayList arrayList = new ArrayList();
        int i3 = ei4Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ei4Var2.b[i4]) {
                zo8 zo8Var = ei4Var2.c[i4];
                for (int i5 = 0; i5 < zo8Var.a; i5++) {
                    yo8 yo8VarA = zo8Var.a(i5);
                    List listF = zh1Var.f(i4, yo8VarA, iArr[i4][i5]);
                    int i6 = yo8VarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        ai1 ai1Var = (ai1) listF.get(i7);
                        int iA = ai1Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessS = ImmutableList.s(ai1Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ai1Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    ai1 ai1Var2 = (ai1) listF.get(i8);
                                    int i9 = i3;
                                    if (ai1Var2.a() == 2 && ai1Var.b(ai1Var2)) {
                                        arrayList2.add(ai1Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessS = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessS);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            ei4Var2 = ei4Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((ai1) list.get(i10)).c;
        }
        ai1 ai1Var3 = (ai1) list.get(0);
        return Pair.create(new o62(0, ai1Var3.b, iArr2), Integer.valueOf(ai1Var3.a));
    }

    @Override // defpackage.fi4
    public final void a() {
        xh1 xh1Var;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    vy2.r("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (xh1Var = this.i) != null) {
            xh1Var.d();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.fi4
    public final void b(hp8 hp8Var) {
        if (hp8Var instanceof vh1) {
            k((vh1) hp8Var);
        }
        uh1 uh1Var = new uh1(e());
        uh1Var.e(hp8Var);
        k(new vh1(uh1Var));
    }

    public final vh1 e() {
        vh1 vh1Var;
        synchronized (this.d) {
            vh1Var = this.g;
        }
        return vh1Var;
    }

    public final void f() {
        boolean z;
        n62 n62Var;
        xh1 xh1Var;
        synchronized (this.d) {
            try {
                z = this.g.s0 && Build.VERSION.SDK_INT >= 32 && (xh1Var = this.i) != null && xh1Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (n62Var = this.a) == null) {
            return;
        }
        n62Var.h.e(10);
    }

    public final void h() {
        synchronized (this.d) {
            this.g.getClass();
        }
    }

    public final void k(vh1 vh1Var) {
        boolean zEquals;
        vh1Var.getClass();
        synchronized (this.d) {
            zEquals = this.g.equals(vh1Var);
            this.g = vh1Var;
        }
        if (zEquals) {
            return;
        }
        if (vh1Var.s0 && this.e == null) {
            wn5.k0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        n62 n62Var = this.a;
        if (n62Var != null) {
            n62Var.h.e(10);
        }
    }

    public ci1(Context context, hy2 hy2Var) {
        vh1 vh1Var = vh1.x0;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = hy2Var;
        if (vh1Var != null) {
            this.g = vh1Var;
        } else {
            vh1Var.getClass();
            uh1 uh1Var = new uh1(vh1Var);
            uh1Var.e(vh1Var);
            this.g = new vh1(uh1Var);
        }
        this.j = ly.h;
        if (this.g.s0 && context == null) {
            wn5.k0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
