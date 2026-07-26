package com.google.common.collect;

import defpackage.s7;
import defpackage.wn5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class GeneralRange<T> implements Serializable {
    public final Comparator a;
    public final boolean b;
    public final Object c;
    public final BoundType d;
    public final boolean e;
    public final Object f;
    public final BoundType g;

    public GeneralRange(Comparator comparator, boolean z, Object obj, BoundType boundType, boolean z2, Object obj2, BoundType boundType2) {
        comparator.getClass();
        this.a = comparator;
        this.b = z;
        this.e = z2;
        this.c = obj;
        boundType.getClass();
        this.d = boundType;
        this.f = obj2;
        boundType2.getClass();
        this.g = boundType2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(obj, obj2);
            wn5.k(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.a;
                wn5.j((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Object obj) {
        if (this.b) {
            int iCompare = this.a.compare(obj, this.c);
            z = (iCompare < 0) | ((iCompare == 0) & (this.d == BoundType.a));
        }
        if (z) {
            return false;
        }
        if (this.e) {
            int iCompare2 = this.a.compare(obj, this.f);
            z = (iCompare2 > 0) | ((iCompare2 == 0) & (this.g == BoundType.a));
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GeneralRange b(GeneralRange generalRange) {
        boolean z;
        int iCompare;
        boolean z2;
        int iCompare2;
        BoundType boundType;
        Object obj;
        int iCompare3;
        boolean z3 = generalRange.e;
        boolean z4 = generalRange.b;
        BoundType boundType2 = generalRange.g;
        Object obj2 = generalRange.f;
        BoundType boundType3 = generalRange.d;
        Object obj3 = generalRange.c;
        Comparator comparator = generalRange.a;
        Comparator comparator2 = this.a;
        wn5.j(comparator2.equals(comparator));
        BoundType boundType4 = BoundType.a;
        boolean z5 = this.b;
        if (z5) {
            Object obj4 = this.c;
            if (!z4 || ((iCompare = comparator2.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType3 == boundType4))) {
                boundType3 = this.d;
                z = z5;
                obj3 = obj4;
            } else {
                z = z5;
            }
        } else {
            z = z4;
        }
        boolean z6 = this.e;
        if (z6) {
            Object obj5 = this.f;
            if (!z3 || ((iCompare2 = comparator2.compare(obj5, obj2)) <= 0 && !(iCompare2 == 0 && boundType2 == boundType4))) {
                boundType2 = this.g;
                z2 = z6;
                obj2 = obj5;
            } else {
                z2 = z6;
            }
        } else {
            z2 = z3;
        }
        if (z && z2 && ((iCompare3 = comparator2.compare(obj3, obj2)) > 0 || (iCompare3 == 0 && boundType3 == boundType4 && boundType2 == boundType4))) {
            boundType2 = BoundType.b;
            boundType = boundType4;
            obj = obj2;
        } else {
            boundType = boundType3;
            obj = obj3;
        }
        return new GeneralRange(this.a, z, obj, boundType, z2, obj2, boundType2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.a.equals(generalRange.a) && this.b == generalRange.b && this.e == generalRange.e && this.d.equals(generalRange.d) && this.g.equals(generalRange.g) && s7.l(this.c, generalRange.c) && s7.l(this.f, generalRange.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d, this.f, this.g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        BoundType boundType = this.d;
        BoundType boundType2 = BoundType.b;
        sb.append(boundType == boundType2 ? '[' : '(');
        sb.append(this.b ? this.c : "-∞");
        sb.append(',');
        sb.append(this.e ? this.f : "∞");
        sb.append(this.g == boundType2 ? ']' : ')');
        return sb.toString();
    }
}
