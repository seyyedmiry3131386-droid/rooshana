package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l81 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new l81("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = j29.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public l81(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            vy2.j(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.l81 b(android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l81.b(android.os.Bundle):l81");
    }

    public final k81 a() {
        k81 k81Var = new k81();
        k81Var.a = this.a;
        k81Var.b = this.d;
        k81Var.c = this.b;
        k81Var.d = this.c;
        k81Var.e = this.e;
        k81Var.f = this.f;
        k81Var.g = this.g;
        k81Var.h = this.h;
        k81Var.i = this.i;
        k81Var.j = this.n;
        k81Var.k = this.o;
        k81Var.l = this.j;
        k81Var.m = this.k;
        k81Var.n = this.l;
        k81Var.o = this.m;
        k81Var.p = this.p;
        k81Var.q = this.q;
        k81Var.r = this.r;
        return k81Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = z81.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (hb7 hb7Var : (hb7[]) spanned.getSpans(0, spanned.length(), hb7.class)) {
                    hb7Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(hb7.c, hb7Var.a);
                    bundle2.putInt(hb7.d, hb7Var.b);
                    arrayList.add(z81.a(spanned, hb7Var, 1, bundle2));
                }
                for (bh8 bh8Var : (bh8[]) spanned.getSpans(0, spanned.length(), bh8.class)) {
                    bh8Var.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(bh8.d, bh8Var.a);
                    bundle3.putInt(bh8.e, bh8Var.b);
                    bundle3.putInt(bh8.f, bh8Var.c);
                    arrayList.add(z81.a(spanned, bh8Var, 2, bundle3));
                }
                for (xc3 xc3Var : (xc3[]) spanned.getSpans(0, spanned.length(), xc3.class)) {
                    arrayList.add(z81.a(spanned, xc3Var, 3, null));
                }
                for (ya9 ya9Var : (ya9[]) spanned.getSpans(0, spanned.length(), ya9.class)) {
                    ya9Var.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(ya9.b, ya9Var.a);
                    arrayList.add(z81.a(spanned, ya9Var, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && l81.class == obj.getClass()) {
            l81 l81Var = (l81) obj;
            Bitmap bitmap2 = l81Var.d;
            if (TextUtils.equals(this.a, l81Var.a) && this.b == l81Var.b && this.c == l81Var.c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == l81Var.e && this.f == l81Var.f && this.g == l81Var.g && this.h == l81Var.h && this.i == l81Var.i && this.j == l81Var.j && this.k == l81Var.k && this.l == l81Var.l && this.m == l81Var.m && this.n == l81Var.n && this.o == l81Var.o && this.p == l81Var.p && this.q == l81Var.q && this.r == l81Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
