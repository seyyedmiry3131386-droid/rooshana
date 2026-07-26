package defpackage;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding;

/* JADX INFO: loaded from: classes.dex */
public final class wt1 {
    public static final wt1 b = new wt1(2);
    public static final wt1 c = new wt1(0);
    public static final wt1 d;
    public static final wt1 e;
    public static final wt1 f;
    public static final pv5 g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        wt1 wt1Var = new wt1(1);
        d = wt1Var;
        e = new wt1(3);
        f = wt1Var;
        g = pv5.a(wt1Var, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ wt1(int i) {
        this.a = i;
    }

    public final DownsampleStrategy$SampleSizeRounding a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return b(i, i2, i3, i4) == 1.0f ? DownsampleStrategy$SampleSizeRounding.b : b.a(i, i2, i3, i4);
            case 1:
                return DownsampleStrategy$SampleSizeRounding.b;
            case 2:
                return h ? DownsampleStrategy$SampleSizeRounding.b : DownsampleStrategy$SampleSizeRounding.a;
            default:
                return DownsampleStrategy$SampleSizeRounding.b;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
