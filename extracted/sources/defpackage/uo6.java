package defpackage;

import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class uo6 {
    public static final ol3 e;
    public static final /* synthetic */ ox3[] f;
    public static final uo6 g;
    public static final List h;
    public final int a;
    public final int b;
    public final int c;
    public final ck4 d = new ck4(7, false);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(uo6.class, "labelId", "getLabelId()I", 0);
        g27.a.getClass();
        ox3[] ox3VarArr = {mutablePropertyReference1Impl};
        f = ox3VarArr;
        e = new ol3(19);
        uo6 uo6Var = new uo6(Integer.MAX_VALUE, -1, -1);
        int i = ts6.player_quality_auto;
        ox3 ox3Var = ox3VarArr[0];
        Integer numValueOf = Integer.valueOf(i);
        js3.p(ox3Var, "property");
        uo6Var.d.b = numValueOf;
        g = uo6Var;
        h = br9.C(Integer.valueOf(ts6.player_quality_auto), Integer.valueOf(ts6.player_quality_excellent), Integer.valueOf(ts6.player_quality_very_good), Integer.valueOf(ts6.player_quality_good), Integer.valueOf(ts6.player_quality_medium), Integer.valueOf(ts6.player_quality_low));
    }

    public uo6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        ox3 ox3Var = f[0];
        ck4 ck4Var = this.d;
        ck4Var.getClass();
        js3.p(ox3Var, "property");
        Integer num = (Integer) ck4Var.b;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property " + ox3Var.getName() + " should be initialized before get.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo6)) {
            return false;
        }
        uo6 uo6Var = (uo6) obj;
        return this.a == uo6Var.a && this.b == uo6Var.b && this.c == uo6Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return dw1.k(this.c, ")", bl4.B(this.a, this.b, "QualityTrack(videoHeight=", ", groupIndex=", ", trackIndex="));
    }
}
