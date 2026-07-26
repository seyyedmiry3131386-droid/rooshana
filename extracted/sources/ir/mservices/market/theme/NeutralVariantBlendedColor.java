package ir.mservices.market.theme;

import android.content.res.Resources;
import defpackage.c26;
import defpackage.eq6;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class NeutralVariantBlendedColor implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public NeutralVariantBlendedColor(Resources resources, int i) {
        this.a = c26.A(i, resources, eq6.white, 0.99f);
        this.b = c26.A(i, resources, eq6.neutral_variant_5, 0.97f);
        this.c = c26.A(i, resources, eq6.neutral_variant_10, 0.95f);
        this.d = c26.A(i, resources, eq6.neutral_variant_20, 0.98f);
        this.e = c26.A(i, resources, eq6.neutral_variant_30, 0.98f);
        this.f = c26.A(i, resources, eq6.neutral_variant_80, 0.92f);
        this.g = c26.A(i, resources, eq6.neutral_variant_90, 0.97f);
        this.h = c26.A(i, resources, eq6.neutral_variant_100, 0.97f);
    }
}
