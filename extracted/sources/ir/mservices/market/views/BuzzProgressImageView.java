package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.b77;
import defpackage.bu6;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.q39;
import defpackage.qi0;
import defpackage.sj8;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public final class BuzzProgressImageView extends FrameLayout {
    public qi0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzProgressImageView(Context context) {
        super(context);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = qi0.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qi0 qi0Var = (qi0) fa1.c(layoutInflaterFrom, js6.buzz_progress_image_view, this, true);
        js3.o(qi0Var, "inflate(...)");
        setBinding(qi0Var);
    }

    public static /* synthetic */ void setImage$default(BuzzProgressImageView buzzProgressImageView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        buzzProgressImageView.setImage(i, z);
    }

    private final void setImageBackground(boolean z) {
        getBinding().v.setBackground(z ? y97.x() : y97.w(sj8.b().N));
    }

    public final boolean a() {
        return getBinding().v.getVisibility() == 0;
    }

    public final qi0 getBinding() {
        qi0 qi0Var = this.a;
        if (qi0Var != null) {
            return qi0Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void setBinding(qi0 qi0Var) {
        js3.p(qi0Var, "<set-?>");
        this.a = qi0Var;
    }

    public final void setColor(int i) {
        Drawable drawable = getBinding().v.getDrawable();
        if (drawable != null) {
            getBinding().v.setImageDrawable(null);
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
            getBinding().v.setImageDrawable(drawable);
        }
    }

    public final void setImage(int i, boolean z) {
        Drawable drawable;
        ImageView imageView = getBinding().v;
        Resources resources = getResources();
        js3.o(resources, "getResources(...)");
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.SRC_ATOP));
        imageView.setImageDrawable(drawable);
        setImageBackground(z);
    }

    public static /* synthetic */ void setImage$default(BuzzProgressImageView buzzProgressImageView, Drawable drawable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        buzzProgressImageView.setImage(drawable, z);
    }

    public static /* synthetic */ void setImage$default(BuzzProgressImageView buzzProgressImageView, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        buzzProgressImageView.setImage(bitmap, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = qi0.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qi0 qi0Var = (qi0) fa1.c(layoutInflaterFrom, js6.buzz_progress_image_view, this, true);
        js3.o(qi0Var, "inflate(...)");
        setBinding(qi0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.BuzzProgressImageView);
        js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_imagePadding, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_imagePaddingBottom, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_imagePaddingLeft, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_imagePaddingRight, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_imagePaddingTop, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.BuzzProgressImageView_progressSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (dimensionPixelSize6 != 0) {
            getBinding().v.setMinimumHeight(dimensionPixelSize6);
            getBinding().v.setMinimumWidth(dimensionPixelSize6);
            getBinding().v.getLayoutParams().height = dimensionPixelSize6;
            getBinding().v.getLayoutParams().width = dimensionPixelSize6;
        }
        if (dimensionPixelSize != 0) {
            getBinding().v.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            getBinding().v.setPadding(dimensionPixelSize3, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize2);
        }
    }

    public final void setImage(Drawable drawable, boolean z) {
        js3.p(drawable, "image");
        getBinding().v.setImageDrawable(drawable);
        setImageBackground(z);
    }

    public final void setImage(Bitmap bitmap, boolean z) {
        js3.p(bitmap, "image");
        getBinding().v.setImageBitmap(bitmap);
        setImageBackground(z);
    }
}
