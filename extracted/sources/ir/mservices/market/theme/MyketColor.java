package ir.mservices.market.theme;

import android.content.res.Resources;
import defpackage.br9;
import defpackage.eq6;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketColor implements Serializable {
    public final BlendedColor a;
    public final BlendedColor b;
    public final BlendedColor c;
    public final BlendedColor d;
    public final BlendedColor e;
    public final NeutralVariantBlendedColor f;
    public final AlphaColor g;
    public final AlphaColor h;

    public MyketColor(int i, int i2, Resources resources) {
        Float fValueOf = Float.valueOf(0.85f);
        Float fValueOf2 = Float.valueOf(0.8f);
        Float fValueOf3 = Float.valueOf(0.7f);
        Float fValueOf4 = Float.valueOf(0.6f);
        Float fValueOf5 = Float.valueOf(0.5f);
        Float fValueOf6 = Float.valueOf(0.4f);
        Float fValueOf7 = Float.valueOf(0.3f);
        Float fValueOf8 = Float.valueOf(0.0f);
        List listC = br9.C(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, fValueOf8, Float.valueOf(-0.3f), Float.valueOf(-0.4f), Float.valueOf(-0.5f), Float.valueOf(-0.6f));
        List listC2 = br9.C(Float.valueOf(1.0f), Float.valueOf(0.95f), Float.valueOf(0.9f), fValueOf, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, Float.valueOf(0.2f), Float.valueOf(0.1f), fValueOf8);
        this.a = new BlendedColor(resources, i, listC);
        this.b = new BlendedColor(resources, i2, listC);
        this.c = new BlendedColor(resources, eq6.success, listC);
        this.d = new BlendedColor(resources, eq6.error, listC);
        this.e = new BlendedColor(resources, eq6.black, listC2);
        this.f = new NeutralVariantBlendedColor(resources, i);
        this.g = new AlphaColor(resources, eq6.black);
        this.h = new AlphaColor(resources, eq6.white);
    }
}
