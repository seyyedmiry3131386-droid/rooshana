package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.n1;
import com.google.common.primitives.a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aq4 {
    public final Object a;
    public final Object b;
    public final pc7[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public bq4 g;
    public boolean h;
    public final boolean[] i;
    public final v80[] j;
    public final fi4 k;
    public final zs4 l;
    public aq4 m;
    public zo8 n;
    public jp8 o;
    public long p;

    public aq4(v80[] v80VarArr, long j, fi4 fi4Var, qc1 qc1Var, zs4 zs4Var, bq4 bq4Var, jp8 jp8Var) {
        this.j = v80VarArr;
        this.p = j;
        this.k = fi4Var;
        this.l = zs4Var;
        ks4 ks4Var = bq4Var.a;
        this.b = ks4Var.a;
        this.g = bq4Var;
        this.n = zo8.d;
        this.o = jp8Var;
        this.c = new pc7[v80VarArr.length];
        this.i = new boolean[v80VarArr.length];
        long j2 = bq4Var.b;
        long j3 = bq4Var.d;
        boolean z = bq4Var.f;
        zs4Var.getClass();
        Object obj = ks4Var.a;
        int i = sg6.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        ks4 ks4VarA = ks4Var.a(pair.second);
        ys4 ys4Var = (ys4) ((HashMap) zs4Var.e).get(obj2);
        ys4Var.getClass();
        ((HashSet) zs4Var.h).add(ys4Var);
        xs4 xs4Var = (xs4) ((HashMap) zs4Var.f).get(ys4Var);
        if (xs4Var != null) {
            xs4Var.a.e(xs4Var.b);
        }
        ys4Var.c.add(ks4VarA);
        zp4 zp4VarB = ys4Var.a.b(ks4VarA, qc1Var, j2);
        ((IdentityHashMap) zs4Var.d).put(zp4VarB, ys4Var);
        zs4Var.d();
        this.a = j3 != -9223372036854775807L ? new st0(zp4VarB, !z, 0L, j3) : zp4VarB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, zp4] */
    public final long a(jp8 jp8Var, long j, boolean z, boolean[] zArr) {
        v80[] v80VarArr;
        pc7[] pc7VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= jp8Var.b) {
                break;
            }
            if (z || !jp8Var.r(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            v80VarArr = this.j;
            int length = v80VarArr.length;
            pc7VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (v80VarArr[i2].b == -2) {
                pc7VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = jp8Var;
        c();
        long jE = this.a.e((p62[]) jp8Var.d, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < v80VarArr.length; i3++) {
            if (v80VarArr[i3].b == -2 && this.o.s(i3)) {
                pc7VarArr[i3] = new fv(17);
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < pc7VarArr.length; i4++) {
            if (pc7VarArr[i4] != null) {
                vy2.s(jp8Var.s(i4));
                if (v80VarArr[i4].b != -2) {
                    this.f = true;
                }
            } else {
                vy2.s(((p62[]) jp8Var.d)[i4] == null);
            }
        }
        return jE;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            jp8 jp8Var = this.o;
            if (i >= jp8Var.b) {
                return;
            }
            boolean zS = jp8Var.s(i);
            p62 p62Var = ((p62[]) this.o.d)[i];
            if (zS && p62Var != null) {
                p62Var.k();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            jp8 jp8Var = this.o;
            if (i >= jp8Var.b) {
                return;
            }
            boolean zS = jp8Var.s(i);
            p62 p62Var = ((p62[]) this.o.d)[i];
            if (zS && p62Var != null) {
                p62Var.h();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ko7] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jQ = this.f ? this.a.q() : Long.MIN_VALUE;
        return jQ == Long.MIN_VALUE ? this.g.e : jQ;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zp4] */
    public final void f(float f, bm8 bm8Var, boolean z) {
        this.e = true;
        this.n = this.a.n();
        jp8 jp8VarJ = j(f, bm8Var, z);
        bq4 bq4Var = this.g;
        long jMax = bq4Var.b;
        long j = bq4Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(jp8VarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        bq4 bq4Var2 = this.g;
        this.p = (bq4Var2.b - jA) + j2;
        this.g = bq4Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ko7] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.q() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zp4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof st0;
            zs4 zs4Var = this.l;
            if (z) {
                zs4Var.h(((st0) r0).a);
            } else {
                zs4Var.h(r0);
            }
        } catch (RuntimeException e) {
            wn5.H("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r14v25, types: [o62] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r4v100 */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v99 */
    /* JADX WARN: Type inference failed for: r5v34, types: [o62] */
    /* JADX WARN: Type inference failed for: r5v52, types: [o62] */
    /* JADX WARN: Type inference failed for: r6v5, types: [o62[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v62 */
    public final jp8 j(float f, bm8 bm8Var, boolean z) {
        final vh1 vh1Var;
        final ?? r7;
        String str;
        int i;
        String str2;
        yo8 yo8Var;
        Pair pairJ;
        int[] iArr;
        ?? J;
        Object languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        ?? J2;
        boolean z2;
        p62 acVar;
        j50 j50Var;
        int i2;
        int[] iArr2;
        ei4 ei4Var;
        yo8 yo8Var2;
        int i3;
        fp8 fp8Var;
        Object o62Var;
        fp8 fp8Var2;
        int i4;
        Context context;
        int[] iArr3;
        fi4 fi4Var = this.k;
        v80[] v80VarArr = this.j;
        zo8 zo8Var = this.n;
        fi4Var.getClass();
        int i5 = 1;
        int[] iArr4 = new int[v80VarArr.length + 1];
        int length = v80VarArr.length + 1;
        yo8[][] yo8VarArr = new yo8[length][];
        int[][][] iArr5 = new int[v80VarArr.length + 1][][];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = zo8Var.a;
            yo8VarArr[i6] = new yo8[i7];
            iArr5[i6] = new int[i7][];
        }
        int length2 = v80VarArr.length;
        final int[] iArr6 = new int[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            iArr6[i8] = v80VarArr[i8].A();
        }
        int i9 = 0;
        while (i9 < zo8Var.a) {
            yo8 yo8VarA = zo8Var.a(i9);
            int i10 = yo8VarA.c == 5 ? i5 : 0;
            int length3 = v80VarArr.length;
            int i11 = i5;
            int i12 = 0;
            int i13 = 0;
            while (i13 < v80VarArr.length) {
                v80 v80Var = v80VarArr[i13];
                fi4 fi4Var2 = fi4Var;
                zo8 zo8Var2 = zo8Var;
                int i14 = i5;
                int iMax = 0;
                for (int i15 = 0; i15 < yo8VarA.a; i15++) {
                    iMax = Math.max(iMax, v80Var.z(yo8VarA.d[i15]) & 7);
                }
                int i16 = iArr4[i13] == 0 ? i14 : 0;
                if (iMax > i12 || (iMax == i12 && i10 != 0 && i11 == 0 && i16 != 0)) {
                    i12 = iMax;
                    i11 = i16;
                    length3 = i13;
                }
                i13++;
                fi4Var = fi4Var2;
                zo8Var = zo8Var2;
                i5 = i14;
            }
            fi4 fi4Var3 = fi4Var;
            zo8 zo8Var3 = zo8Var;
            int i17 = i5;
            if (length3 == v80VarArr.length) {
                iArr3 = new int[yo8VarA.a];
            } else {
                v80 v80Var2 = v80VarArr[length3];
                int[] iArr7 = new int[yo8VarA.a];
                for (int i18 = 0; i18 < yo8VarA.a; i18++) {
                    iArr7[i18] = v80Var2.z(yo8VarA.d[i18]);
                }
                iArr3 = iArr7;
            }
            int i19 = iArr4[length3];
            yo8VarArr[length3][i19] = yo8VarA;
            iArr5[length3][i19] = iArr3;
            iArr4[length3] = i19 + 1;
            i9++;
            fi4Var = fi4Var3;
            zo8Var = zo8Var3;
            i5 = i17;
        }
        fi4 fi4Var4 = fi4Var;
        int i20 = i5;
        int i21 = 0;
        zo8[] zo8VarArr = new zo8[v80VarArr.length];
        String[] strArr = new String[v80VarArr.length];
        int[] iArr8 = new int[v80VarArr.length];
        for (int i22 = 0; i22 < v80VarArr.length; i22++) {
            int i23 = iArr4[i22];
            zo8VarArr[i22] = new zo8((yo8[]) j29.X(i23, yo8VarArr[i22]));
            iArr5[i22] = (int[][]) j29.X(i23, iArr5[i22]);
            strArr[i22] = v80VarArr[i22].j();
            iArr8[i22] = v80VarArr[i22].b;
        }
        ei4 ei4Var2 = new ei4(iArr8, zo8VarArr, iArr6, iArr5, new zo8((yo8[]) j29.X(iArr4[v80VarArr.length], yo8VarArr[v80VarArr.length])));
        final ci1 ci1Var = (ci1) fi4Var4;
        synchronized (ci1Var.d) {
            ci1Var.h = Thread.currentThread();
            vh1Var = ci1Var.g;
        }
        if (ci1Var.k == null && (context = ci1Var.e) != null) {
            ci1Var.k = Boolean.valueOf(j29.T(context));
        }
        if (vh1Var.s0 && Build.VERSION.SDK_INT >= 32 && ci1Var.i == null) {
            ci1Var.i = new xh1(ci1Var.e, ci1Var, ci1Var.k);
        }
        int i24 = ei4Var2.a;
        Context context2 = ci1Var.e;
        ?? r6 = new o62[i24];
        int i25 = 0;
        while (true) {
            if (i25 >= ei4Var2.a) {
                r7 = 0;
                break;
            }
            if (2 == iArr8[i25] && zo8VarArr[i25].a > 0) {
                r7 = i20;
                break;
            }
            i25++;
        }
        Pair pairJ2 = ci1.j(i20, ei4Var2, iArr5, new zh1() { // from class: ph1
            @Override // defpackage.zh1
            public final List f(int i26, yo8 yo8Var3, int[] iArr9) {
                ci1 ci1Var2 = ci1Var;
                ci1Var2.getClass();
                vh1 vh1Var2 = vh1Var;
                qh1 qh1Var = new qh1(ci1Var2, vh1Var2);
                int i27 = iArr6[i26];
                lj3 lj3VarM = ImmutableList.m();
                for (int i28 = 0; i28 < yo8Var3.a; i28++) {
                    lj3VarM.O(new rh1(i26, yo8Var3, i28, vh1Var2, iArr9[i28], r7, qh1Var, i27));
                }
                return lj3VarM.S();
            }
        }, new mh(7));
        if (pairJ2 != null) {
            r6[((Integer) pairJ2.second).intValue()] = (o62) pairJ2.first;
        }
        if (pairJ2 == null) {
            str = null;
        } else {
            o62 o62Var2 = (o62) pairJ2.first;
            str = o62Var2.a.d[o62Var2.b[0]].d;
        }
        fp8 fp8Var3 = vh1Var.u;
        if (fp8Var3.a == 2) {
            i = 2;
            str2 = str;
            pairJ = null;
            yo8Var = null;
        } else {
            i = 2;
            u4 u4Var = new u4(vh1Var, str, iArr6, (!vh1Var.k || context2 == null) ? null : j29.w(context2), 2);
            str2 = str;
            yo8Var = null;
            pairJ = ci1.j(2, ei4Var2, iArr5, u4Var, new mh(6));
        }
        int i26 = 4;
        if ((vh1Var.A || pairJ == null) && fp8Var3.a != i) {
            iArr = iArr8;
            J = ci1.j(4, ei4Var2, iArr5, new v4(17, vh1Var), new mh(5));
        } else {
            iArr = iArr8;
            J = yo8Var;
        }
        if (J != 0) {
            r6[((Integer) ((Pair) J).second).intValue()] = (o62) ((Pair) J).first;
        } else if (pairJ != null) {
            r6[((Integer) pairJ.second).intValue()] = (o62) pairJ.first;
        }
        int i27 = 3;
        if (fp8Var3.a == 2) {
            J2 = yo8Var;
        } else {
            if (!vh1Var.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = yo8Var;
            } else {
                String str3 = j29.a;
                languageTag = locale.toLanguageTag();
            }
            J2 = ci1.j(3, ei4Var2, iArr5, new tg1(vh1Var, str2, languageTag, 1), new mh(8));
        }
        if (J2 != 0) {
            r6[((Integer) ((Pair) J2).second).intValue()] = (o62) ((Pair) J2).first;
        }
        int i28 = 0;
        while (i28 < i24) {
            int i29 = iArr[i28];
            if (i29 == 2 || i29 == 1 || i29 == i27 || i29 == i26) {
                i3 = i28;
                fp8Var = fp8Var3;
            } else {
                zo8 zo8Var4 = zo8VarArr[i28];
                int[][] iArr9 = iArr5[i28];
                if (fp8Var3.a == 2) {
                    i3 = i28;
                    fp8Var = fp8Var3;
                } else {
                    yo8 yo8Var3 = yo8Var;
                    ?? r22 = yo8Var3;
                    int i30 = i21;
                    int i31 = i30;
                    while (i30 < zo8Var4.a) {
                        yo8 yo8VarA2 = zo8Var4.a(i30);
                        int[] iArr10 = iArr9[i30];
                        yo8 yo8Var4 = yo8Var3;
                        zo8 zo8Var5 = zo8Var4;
                        ?? r4 = r22;
                        int i32 = i28;
                        int i33 = i21;
                        while (i33 < yo8VarA2.a) {
                            int i34 = i33;
                            if (bl4.l(iArr10[i33], vh1Var.t0)) {
                                fp8Var2 = fp8Var3;
                                th1 th1Var = new th1(yo8VarA2.d[i34], iArr10[i34]);
                                if (r4 != 0) {
                                    i4 = i30;
                                    if (dx0.a.d(th1Var.b, r4.b).d(th1Var.a, r4.a).f() > 0) {
                                    }
                                } else {
                                    i4 = i30;
                                }
                                r4 = th1Var;
                                yo8Var4 = yo8VarA2;
                                i31 = i34;
                            } else {
                                fp8Var2 = fp8Var3;
                                i4 = i30;
                            }
                            i33 = i34 + 1;
                            fp8Var3 = fp8Var2;
                            i30 = i4;
                            r4 = r4;
                        }
                        i30++;
                        i28 = i32;
                        zo8Var4 = zo8Var5;
                        r22 = r4;
                        yo8Var3 = yo8Var4;
                    }
                    i3 = i28;
                    fp8Var = fp8Var3;
                    if (yo8Var3 != null) {
                        o62Var = new o62(i21, yo8Var3, new int[]{i31});
                    }
                    r6[i3] = o62Var;
                }
                o62Var = yo8Var;
                r6[i3] = o62Var;
            }
            i28 = i3 + 1;
            fp8Var3 = fp8Var;
            i27 = 3;
            i26 = 4;
            i21 = 0;
        }
        int i35 = ei4Var2.a;
        zo8[] zo8VarArr2 = ei4Var2.c;
        HashMap map = new HashMap();
        for (int i36 = 0; i36 < i35; i36++) {
            ci1.c(zo8VarArr2[i36], vh1Var, map);
        }
        ci1.c(ei4Var2.f, vh1Var, map);
        for (int i37 = 0; i37 < i35; i37++) {
            ep8 ep8Var = (ep8) map.get(Integer.valueOf(ei4Var2.b[i37]));
            if (ep8Var != null) {
                yo8 yo8Var5 = ep8Var.a;
                ImmutableList immutableList = ep8Var.b;
                r6[i37] = (immutableList.isEmpty() || zo8VarArr2[i37].b(yo8Var5) == -1) ? yo8Var : new o62(0, yo8Var5, a.g(immutableList));
            }
        }
        int i38 = ei4Var2.a;
        for (int i39 = 0; i39 < i38; i39++) {
            zo8 zo8Var6 = ei4Var2.c[i39];
            Map map2 = (Map) vh1Var.v0.get(i39);
            if (map2 != null && map2.containsKey(zo8Var6)) {
                Map map3 = (Map) vh1Var.v0.get(i39);
                if (map3 != null && map3.get(zo8Var6) != null) {
                    throw new ClassCastException();
                }
                r6[i39] = yo8Var;
            }
        }
        for (int i40 = 0; i40 < i24; i40++) {
            int i41 = ei4Var2.b[i40];
            if (vh1Var.w0.get(i40) || vh1Var.E.contains(Integer.valueOf(i41))) {
                r6[i40] = yo8Var;
            }
        }
        hy2 hy2Var = ci1Var.f;
        j50 j50Var2 = ci1Var.b;
        vy2.t(j50Var2);
        hy2Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i42 = 0;
        while (i42 < r6.length) {
            ?? r5 = r6[i42];
            if (r5 == 0 || r5.b.length <= 1) {
                yo8Var2 = yo8Var;
                arrayList.add(yo8Var2);
            } else {
                lj3 lj3VarM = ImmutableList.m();
                lj3VarM.O(new zb(0L, 0L));
                arrayList.add(lj3VarM);
                yo8Var2 = yo8Var;
            }
            i42++;
            yo8Var = yo8Var2;
        }
        int length4 = r6.length;
        long[][] jArr = new long[length4][];
        int i43 = 0;
        while (i43 < r6.length) {
            ?? r14 = r6[i43];
            if (r14 == 0) {
                jArr[i43] = new long[0];
                ei4Var = ei4Var2;
            } else {
                int[] iArr11 = r14.b;
                jArr[i43] = new long[iArr11.length];
                int i44 = 0;
                while (i44 < iArr11.length) {
                    ei4 ei4Var3 = ei4Var2;
                    long j = r14.a.d[iArr11[i44]].j;
                    long[] jArr2 = jArr[i43];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i44] = j;
                    i44++;
                    ei4Var2 = ei4Var3;
                }
                ei4Var = ei4Var2;
                Arrays.sort(jArr[i43]);
            }
            i43++;
            ei4Var2 = ei4Var;
        }
        ei4 ei4Var4 = ei4Var2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr4 = jArr[i45];
            jArr3[i45] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        ac.u(arrayList, jArr3);
        ga5 ga5VarB = n1.b();
        vy2.m(2, "expectedValuesPerKey");
        d94 d94VarA = new n1(ga5VarB).a();
        int i46 = 0;
        while (i46 < length4) {
            long[] jArr5 = jArr[i46];
            if (jArr5.length <= 1) {
                j50Var = j50Var2;
                i2 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j50Var = j50Var2;
                int i47 = 0;
                while (true) {
                    long[] jArr6 = jArr[i46];
                    i2 = length4;
                    double dLog = 0.0d;
                    if (i47 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j2 = jArr6[i47];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i47] = dLog;
                    i47++;
                    length4 = i2;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i48 = length5 - 1;
                double d = dArr[i48] - dArr[0];
                int i49 = 0;
                while (i49 < i48) {
                    double d2 = dArr[i49];
                    int i50 = i49 + 1;
                    d94VarA.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i50]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i46));
                    i49 = i50;
                }
            }
            i46++;
            length4 = i2;
            j50Var2 = j50Var;
            iArr12 = iArr2;
        }
        j50 j50Var3 = j50Var2;
        int[] iArr14 = iArr12;
        ImmutableList immutableListN = ImmutableList.n(d94VarA.values());
        for (int i51 = 0; i51 < immutableListN.size(); i51++) {
            int iIntValue = ((Integer) immutableListN.get(i51)).intValue();
            int i52 = iArr14[iIntValue] + 1;
            iArr14[iIntValue] = i52;
            jArr3[iIntValue] = jArr[iIntValue][i52];
            ac.u(arrayList, jArr3);
        }
        for (int i53 = 0; i53 < r6.length; i53++) {
            if (arrayList.get(i53) != null) {
                jArr3[i53] = jArr3[i53] * 2;
            }
        }
        ac.u(arrayList, jArr3);
        lj3 lj3VarM2 = ImmutableList.m();
        for (int i54 = 0; i54 < arrayList.size(); i54++) {
            lj3 lj3Var = (lj3) arrayList.get(i54);
            lj3VarM2.O(lj3Var == null ? ImmutableList.q() : lj3Var.S());
        }
        ImmutableList immutableListS = lj3VarM2.S();
        p62[] p62VarArr = new p62[r6.length];
        for (int i55 = 0; i55 < r6.length; i55++) {
            ?? r52 = r6[i55];
            if (r52 != 0) {
                int[] iArr15 = r52.b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        acVar = new od2(r52.a, new int[]{iArr15[0]});
                    } else {
                        long j3 = 25000;
                        acVar = new ac(r52.a, iArr15, j50Var3, 10000, j3, j3, (ImmutableList) immutableListS.get(i55));
                    }
                    p62VarArr[i55] = acVar;
                }
            }
        }
        x37[] x37VarArr = new x37[i24];
        int i56 = 0;
        while (i56 < i24) {
            ei4 ei4Var5 = ei4Var4;
            x37VarArr[i56] = (vh1Var.w0.get(i56) || vh1Var.E.contains(Integer.valueOf(ei4Var5.b[i56])) || (ei4Var5.b[i56] != -2 && p62VarArr[i56] == null)) ? null : x37.c;
            i56++;
            ei4Var4 = ei4Var5;
        }
        ei4 ei4Var6 = ei4Var4;
        if (vh1Var.u.a != 0) {
            int i57 = 0;
            int i58 = -1;
            int i59 = 0;
            while (true) {
                if (i59 < ei4Var6.a) {
                    int i60 = ei4Var6.b[i59];
                    p62 p62Var = p62VarArr[i59];
                    if (i60 != 1 && p62Var != null) {
                        break;
                    }
                    if (i60 == 1 && p62Var != null && p62Var.length() == 1) {
                        if (ci1.i(vh1Var, iArr5[i59][ei4Var6.c[i59].b(p62Var.c())][p62Var.i(0)], p62Var.m())) {
                            i57++;
                            i58 = i59;
                        }
                    }
                    i59++;
                } else if (i57 == 1) {
                    int i61 = vh1Var.u.b ? 1 : 2;
                    x37 x37Var = x37VarArr[i58];
                    x37VarArr[i58] = new x37(i61, x37Var != null && x37Var.b);
                }
            }
        }
        Pair pairCreate = Pair.create(x37VarArr, p62VarArr);
        p62[] p62VarArr2 = (p62[]) pairCreate.second;
        List[] listArr = new List[p62VarArr2.length];
        for (int i62 = 0; i62 < p62VarArr2.length; i62++) {
            p62 p62Var2 = p62VarArr2[i62];
            listArr[i62] = p62Var2 != null ? ImmutableList.s(p62Var2) : ImmutableList.q();
        }
        lj3 lj3Var2 = new lj3(4);
        int i63 = 0;
        while (true) {
            int i64 = ei4Var6.a;
            zo8[] zo8VarArr3 = ei4Var6.c;
            if (i63 >= i64) {
                break;
            }
            zo8 zo8Var7 = zo8VarArr3[i63];
            List list = listArr[i63];
            int i65 = 0;
            while (i65 < zo8Var7.a) {
                yo8 yo8VarA3 = zo8Var7.a(i65);
                int i66 = zo8VarArr3[i63].a(i65).a;
                int[] iArr16 = new int[i66];
                int i67 = 0;
                int i68 = 0;
                while (i67 < i66) {
                    List[] listArr2 = listArr;
                    if ((ei4Var6.e[i63][i65][i67] & 7) == 4) {
                        iArr16[i68] = i67;
                        i68++;
                    }
                    i67++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr16, i68);
                zo8 zo8Var8 = zo8Var7;
                int iMin = 16;
                String str4 = null;
                int i69 = 0;
                boolean z3 = false;
                int i70 = 0;
                while (i69 < iArrCopyOf.length) {
                    String str5 = zo8VarArr3[i63].a(i65).d[iArrCopyOf[i69]].n;
                    int i71 = i70 + 1;
                    if (i70 == 0) {
                        str4 = str5;
                    } else {
                        z3 = (!Objects.equals(str4, str5)) | z3;
                    }
                    iMin = Math.min(iMin, ei4Var6.e[i63][i65][i69] & 24);
                    i69++;
                    i70 = i71;
                }
                if (z3) {
                    iMin = Math.min(iMin, ei4Var6.d[i63]);
                }
                boolean z4 = iMin != 0;
                int i72 = yo8VarA3.a;
                int[] iArr17 = new int[i72];
                boolean[] zArr = new boolean[i72];
                for (int i73 = 0; i73 < yo8VarA3.a; i73++) {
                    iArr17[i73] = ei4Var6.e[i63][i65][i73] & 7;
                    int i74 = 0;
                    while (true) {
                        if (i74 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        p62 p62Var3 = (p62) list.get(i74);
                        if (p62Var3.c().equals(yo8VarA3) && p62Var3.t(i73) != -1) {
                            z2 = true;
                            break;
                        }
                        i74++;
                    }
                    zArr[i73] = z2;
                }
                lj3Var2.O(new qp8(yo8VarA3, z4, iArr17, zArr));
                i65++;
                listArr = listArr3;
                zo8Var7 = zo8Var8;
            }
            i63++;
        }
        zo8 zo8Var9 = ei4Var6.f;
        for (int i75 = 0; i75 < zo8Var9.a; i75++) {
            yo8 yo8VarA4 = zo8Var9.a(i75);
            int[] iArr18 = new int[yo8VarA4.a];
            Arrays.fill(iArr18, 0);
            lj3Var2.O(new qp8(yo8VarA4, false, iArr18, new boolean[yo8VarA4.a]));
        }
        jp8 jp8Var = new jp8((x37[]) pairCreate.first, (p62[]) pairCreate.second, new rp8(lj3Var2.S()), ei4Var6);
        for (int i76 = 0; i76 < jp8Var.b; i76++) {
            if (jp8Var.s(i76)) {
                vy2.s(((p62[]) jp8Var.d)[i76] != null || this.j[i76].b == -2);
            } else {
                vy2.s(((p62[]) jp8Var.d)[i76] == null);
            }
        }
        for (p62 p62Var4 : (p62[]) jp8Var.d) {
            if (p62Var4 != null) {
                p62Var4.p(f);
                p62Var4.f(z);
            }
        }
        return jp8Var;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof st0) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            st0 st0Var = (st0) obj;
            st0Var.e = 0L;
            st0Var.f = j;
        }
    }
}
