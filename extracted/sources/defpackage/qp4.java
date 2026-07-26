package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qp4 {
    public static final qp4 K = new qp4(new pp4());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final ImmutableList J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final fv6 i;
    public final fv6 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        String str = j29.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public qp4(pp4 pp4Var) {
        Boolean boolValueOf = pp4Var.q;
        Integer numValueOf = pp4Var.p;
        Integer numValueOf2 = pp4Var.G;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = pp4Var.a;
        this.b = pp4Var.b;
        this.c = pp4Var.c;
        this.d = pp4Var.d;
        this.e = pp4Var.e;
        this.f = pp4Var.f;
        this.g = pp4Var.g;
        this.h = pp4Var.h;
        this.i = pp4Var.i;
        this.j = pp4Var.j;
        this.k = pp4Var.k;
        this.l = pp4Var.l;
        this.m = pp4Var.m;
        this.n = pp4Var.n;
        this.o = pp4Var.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = pp4Var.r;
        Integer num = pp4Var.s;
        this.s = num;
        this.t = num;
        this.u = pp4Var.t;
        this.v = pp4Var.u;
        this.w = pp4Var.v;
        this.x = pp4Var.w;
        this.y = pp4Var.x;
        this.z = pp4Var.y;
        this.A = pp4Var.z;
        this.B = pp4Var.A;
        this.C = pp4Var.B;
        this.D = pp4Var.C;
        this.E = pp4Var.D;
        this.F = pp4Var.E;
        this.G = pp4Var.F;
        this.H = numValueOf2;
        this.J = pp4Var.I;
        this.I = pp4Var.H;
    }

    public static qp4 b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        pp4 pp4Var = new pp4();
        pp4Var.a = bundle.getCharSequence(L);
        pp4Var.b = bundle.getCharSequence(M);
        pp4Var.c = bundle.getCharSequence(N);
        pp4Var.d = bundle.getCharSequence(O);
        pp4Var.e = bundle.getCharSequence(P);
        pp4Var.f = bundle.getCharSequence(Q);
        pp4Var.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        pp4Var.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        pp4Var.m = (Uri) bundle.getParcelable(V);
        pp4Var.y = bundle.getCharSequence(g0);
        pp4Var.z = bundle.getCharSequence(h0);
        pp4Var.A = bundle.getCharSequence(i0);
        pp4Var.D = bundle.getCharSequence(l0);
        pp4Var.E = bundle.getCharSequence(m0);
        pp4Var.F = bundle.getCharSequence(o0);
        pp4Var.H = bundle.getBundle(t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            pp4Var.i = fv6.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            pp4Var.j = fv6.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            pp4Var.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            pp4Var.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            pp4Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            pp4Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            pp4Var.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            pp4Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            pp4Var.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            pp4Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            pp4Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            pp4Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            pp4Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            pp4Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            pp4Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            pp4Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            pp4Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            pp4Var.I = ImmutableList.n(stringArrayList);
        }
        return new qp4(pp4Var);
    }

    public final pp4 a() {
        pp4 pp4Var = new pp4();
        pp4Var.a = this.a;
        pp4Var.b = this.b;
        pp4Var.c = this.c;
        pp4Var.d = this.d;
        pp4Var.e = this.e;
        pp4Var.f = this.f;
        pp4Var.g = this.g;
        pp4Var.h = this.h;
        pp4Var.i = this.i;
        pp4Var.j = this.j;
        pp4Var.k = this.k;
        pp4Var.l = this.l;
        pp4Var.m = this.m;
        pp4Var.n = this.n;
        pp4Var.o = this.o;
        pp4Var.p = this.p;
        pp4Var.q = this.q;
        pp4Var.r = this.r;
        pp4Var.s = this.t;
        pp4Var.t = this.u;
        pp4Var.u = this.v;
        pp4Var.v = this.w;
        pp4Var.w = this.x;
        pp4Var.x = this.y;
        pp4Var.y = this.z;
        pp4Var.z = this.A;
        pp4Var.A = this.B;
        pp4Var.B = this.C;
        pp4Var.C = this.D;
        pp4Var.D = this.E;
        pp4Var.E = this.F;
        pp4Var.F = this.G;
        pp4Var.G = this.H;
        pp4Var.I = this.J;
        pp4Var.H = this.I;
        return pp4Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        fv6 fv6Var = this.i;
        if (fv6Var != null) {
            bundle.putBundle(S, fv6Var.c());
        }
        fv6 fv6Var2 = this.j;
        if (fv6Var2 != null) {
            bundle.putBundle(T, fv6Var2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        ImmutableList immutableList = this.J;
        if (!immutableList.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(immutableList));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qp4.class == obj.getClass()) {
            qp4 qp4Var = (qp4) obj;
            if (Objects.equals(this.a, qp4Var.a) && Objects.equals(this.b, qp4Var.b) && Objects.equals(this.c, qp4Var.c) && Objects.equals(this.d, qp4Var.d) && Objects.equals(this.e, qp4Var.e) && Objects.equals(this.f, qp4Var.f) && Objects.equals(this.g, qp4Var.g) && Objects.equals(this.h, qp4Var.h) && Objects.equals(this.i, qp4Var.i) && Objects.equals(this.j, qp4Var.j) && Arrays.equals(this.k, qp4Var.k) && Objects.equals(this.l, qp4Var.l) && Objects.equals(this.m, qp4Var.m) && Objects.equals(this.n, qp4Var.n) && Objects.equals(this.o, qp4Var.o) && Objects.equals(this.p, qp4Var.p) && Objects.equals(this.q, qp4Var.q) && Objects.equals(this.r, qp4Var.r) && Objects.equals(this.t, qp4Var.t) && Objects.equals(this.u, qp4Var.u) && Objects.equals(this.v, qp4Var.v) && Objects.equals(this.w, qp4Var.w) && Objects.equals(this.x, qp4Var.x) && Objects.equals(this.y, qp4Var.y) && Objects.equals(this.z, qp4Var.z) && Objects.equals(this.A, qp4Var.A) && Objects.equals(this.B, qp4Var.B) && Objects.equals(this.C, qp4Var.C) && Objects.equals(this.D, qp4Var.D) && Objects.equals(this.E, qp4Var.E) && Objects.equals(this.F, qp4Var.F) && Objects.equals(this.G, qp4Var.G) && Objects.equals(this.H, qp4Var.H) && Objects.equals(this.J, qp4Var.J)) {
                if ((this.I == null) == (qp4Var.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
