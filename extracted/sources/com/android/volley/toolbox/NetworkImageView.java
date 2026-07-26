package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.gi3;

/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    public String a;
    public int b;
    public Drawable c;
    public Bitmap d;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z;
        boolean z2;
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z = getLayoutParams().width == -2;
            z2 = getLayoutParams().height == -2;
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = z && z2;
        if (width == 0 && height == 0 && !z3) {
            return;
        }
        if (!TextUtils.isEmpty(this.a)) {
            throw null;
        }
        int i = this.b;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.b = 0;
        this.c = null;
        this.d = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.b = 0;
        this.d = null;
        this.c = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.d = null;
        this.c = null;
        this.b = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
    }

    public void setErrorImageDrawable(Drawable drawable) {
    }

    public void setErrorImageResId(int i) {
    }

    public void setImageUrl(String str, gi3 gi3Var) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        this.a = str;
        a();
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
