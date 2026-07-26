package ir.mservices.market.theme;

import android.content.res.Resources;
import defpackage.c26;
import defpackage.js3;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BlendedColor implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public BlendedColor(Resources resources, int i, List list) {
        js3.p(list, "percents");
        this.a = c26.h(i, resources, ((Number) list.get(0)).floatValue());
        this.b = c26.h(i, resources, ((Number) list.get(1)).floatValue());
        this.c = c26.h(i, resources, ((Number) list.get(2)).floatValue());
        this.d = c26.h(i, resources, ((Number) list.get(3)).floatValue());
        this.e = c26.h(i, resources, ((Number) list.get(4)).floatValue());
        this.f = c26.h(i, resources, ((Number) list.get(5)).floatValue());
        this.g = c26.h(i, resources, ((Number) list.get(6)).floatValue());
        this.h = c26.h(i, resources, ((Number) list.get(7)).floatValue());
        this.i = c26.h(i, resources, ((Number) list.get(8)).floatValue());
        this.j = c26.h(i, resources, ((Number) list.get(9)).floatValue());
        this.k = c26.h(i, resources, ((Number) list.get(10)).floatValue());
        this.l = c26.h(i, resources, ((Number) list.get(11)).floatValue());
    }
}
