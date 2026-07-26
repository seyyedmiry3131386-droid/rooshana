package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gr1 {
    public final va5 a;
    public final va5 b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new gr1(pair, new Pair(fValueOf2, fValueOf2));
    }

    public gr1(Pair... pairArr) {
        js3.p(pairArr, "mappings");
        this.a = new va5(pairArr.length);
        this.b = new va5(pairArr.length);
        int length = pairArr.length;
        for (int i = 0; i < length; i++) {
            this.a.a(((Number) pairArr[i].a).floatValue());
            this.b.a(((Number) pairArr[i].b).floatValue());
        }
        dt2.H(this.a);
        dt2.H(this.b);
    }
}
