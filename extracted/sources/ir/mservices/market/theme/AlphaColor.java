package ir.mservices.market.theme;

import android.content.res.Resources;
import defpackage.c26;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaColor implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public AlphaColor(Resources resources, int i) {
        this.a = c26.e(i, 255, resources);
        this.b = c26.e(i, 0, resources);
        this.c = c26.e(i, 31, resources);
        this.d = c26.e(i, 41, resources);
        this.e = c26.e(i, 97, resources);
        this.f = c26.e(i, 128, resources);
        this.g = c26.e(i, 166, resources);
        this.h = c26.e(i, 204, resources);
    }
}
