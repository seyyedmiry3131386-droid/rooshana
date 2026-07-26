package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ea7 {
    public final Context a;
    public int b;
    public float[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public float[] l;
    public int m;
    public int n;
    public boolean o;
    public int p;

    public ea7(Context context) {
        this.a = context;
        Resources resources = context.getResources();
        this.b = sj8.b().c;
        this.c = new float[8];
        this.h = resources.getDimensionPixelSize(pq6.round_drawable_default_border_width);
        this.i = sj8.b().c;
        this.j = true;
        this.k = sj8.b().u;
        this.l = new float[8];
        this.m = resources.getDimensionPixelSize(pq6.round_drawable_default_border_width);
        this.n = sj8.b().u;
        this.o = true;
        this.p = sj8.b().O.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(pq6.round_drawable_default_border_radius);
        this.d = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.g = dimensionPixelSize;
        b();
        float f = dimensionPixelSize;
        float f2 = dimensionPixelSize;
        float f3 = dimensionPixelSize;
        float f4 = dimensionPixelSize;
        this.l = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public final StateListDrawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(this.h, this.i);
        gradientDrawable.setCornerRadii(this.c);
        boolean z = this.j;
        Context context = this.a;
        gradientDrawable.setColor(z ? this.b : ContextCompat.getColor(context, eq6.transparent));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(this.m, this.n);
        gradientDrawable2.setCornerRadii(this.l);
        gradientDrawable2.setColor(this.o ? this.k : ContextCompat.getColor(context, eq6.transparent));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, y97.A(this.c, this.p)});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842919}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, layerDrawable);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        return stateListDrawable;
    }

    public final void b() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.f;
        this.c = new float[]{i, i, i2, i2, i3, i3, i4, i4};
    }

    public final void c(int i) {
        this.d = i;
        this.e = i;
        this.f = i;
        this.g = i;
        b();
    }

    public final void d(int i) {
        float f = i;
        float f2 = i;
        float f3 = i;
        float f4 = i;
        this.l = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }
}
