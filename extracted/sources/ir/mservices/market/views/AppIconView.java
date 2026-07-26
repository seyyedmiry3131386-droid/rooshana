package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bu6;
import defpackage.f57;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.na7;
import defpackage.ne5;
import defpackage.p57;
import defpackage.pq6;
import defpackage.t61;
import defpackage.uv1;
import defpackage.x80;
import defpackage.yq6;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class AppIconView extends AppCompatImageView {
    public int d;
    public Bitmap e;
    public Bitmap f;
    public boolean g;
    public p57 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        this.g = true;
        setScaleType(ImageView.ScaleType.FIT_XY);
        setAdjustViewBounds(true);
        if (attributeSet == null) {
            this.i = getResources().getDimensionPixelSize(pq6.default_image_corner_radius);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.AppIconView);
        js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.AppIconView_app_corner, getResources().getDimensionPixelSize(pq6.default_image_corner_radius));
        typedArrayObtainStyledAttributes.recycle();
        this.i = dimensionPixelSize;
    }

    public static /* synthetic */ void setImageUrl$default(AppIconView appIconView, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        appIconView.setImageUrl(str, str2, z);
    }

    public final f57 c(String str, String str2) {
        f57 f57VarH;
        f57 f57Var;
        f57 f57Var2;
        if (str == null || f88.n0(str)) {
            lw.g(null, "url is empty", null);
            str = "empty_url";
        }
        try {
            f57VarH = com.bumptech.glide.a.f(this).q(new ne5(str, str2));
            js3.m(f57VarH);
        } catch (Exception unused) {
            f57VarH = t61.h(str, str2, com.bumptech.glide.a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
        x80 x80VarG = f57VarH.L(this.h).G(new na7(this.i));
        js3.o(x80VarG, "transform(...)");
        f57 f57Var3 = (f57) x80VarG;
        if (this.e != null) {
            x80 x80VarL = f57Var3.l(new BitmapDrawable(getResources(), this.e));
            js3.m(x80VarL);
            f57Var = (f57) x80VarL;
        } else {
            x80 x80VarK = f57Var3.k(this.d);
            js3.m(x80VarK);
            f57Var = (f57) x80VarK;
        }
        if (this.f != null) {
            x80 x80VarX = f57Var.x(new BitmapDrawable(getResources(), this.f));
            js3.m(x80VarX);
            f57Var2 = (f57) x80VarX;
        } else {
            x80 x80VarW = f57Var.w();
            js3.m(x80VarW);
            f57Var2 = (f57) x80VarW;
        }
        if (this.g) {
            f57 f57VarW = f57Var2.W(uv1.b());
            js3.m(f57VarW);
            return f57VarW;
        }
        x80 x80VarH = f57Var2.h();
        js3.m(x80VarH);
        return (f57) x80VarH;
    }

    public final int getCornerRadius() {
        return this.i;
    }

    public final Bitmap getDefaultImageDrawable() {
        return this.f;
    }

    public final Bitmap getErrorImageDrawable() {
        return this.e;
    }

    public final int getErrorImageResId() {
        return this.d;
    }

    public final p57 getRequestListener() {
        return this.h;
    }

    public final boolean getShouldAnimate() {
        return this.g;
    }

    public final void setCornerRadius(int i) {
        this.i = i;
    }

    public final void setDefaultImageDrawable(Bitmap bitmap) {
        this.f = bitmap;
    }

    public final void setErrorImageDrawable(Bitmap bitmap) {
        this.e = bitmap;
    }

    public final void setErrorImageResId(int i) {
        this.d = i;
    }

    public final void setImageUrl(String str) {
        setImageUrl$default(this, str, null, false, 6, null);
    }

    public final void setRequestListener(p57 p57Var) {
        this.h = p57Var;
    }

    public final void setShouldAnimate(boolean z) {
        this.g = z;
    }

    public final void setImageUrl(String str, String str2) {
        setImageUrl$default(this, str, str2, false, 4, null);
    }

    public final void setImageUrl(String str, String str2, boolean z) {
        if (str != null && str.length() != 0) {
            f57 f57VarC = c(str, str2);
            if (z) {
                f57VarC.V(c(str, null)).P(this);
                return;
            } else {
                f57VarC.P(this);
                return;
            }
        }
        setImageResource(yq6.icon);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppIconView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
