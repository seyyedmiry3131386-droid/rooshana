package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.im8;
import defpackage.pg;
import defpackage.rk8;
import defpackage.x11;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final yb a;
    public final pg b;
    public boolean c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.b();
        }
        pg pgVar = this.b;
        if (pgVar != null) {
            pgVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        yb ybVar = this.a;
        if (ybVar != null) {
            return ybVar.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yb ybVar = this.a;
        if (ybVar != null) {
            return ybVar.l();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x11 x11Var;
        pg pgVar = this.b;
        if (pgVar == null || (x11Var = (x11) pgVar.d) == null) {
            return null;
        }
        return (ColorStateList) x11Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x11 x11Var;
        pg pgVar = this.b;
        if (pgVar == null || (x11Var = (x11) pgVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) x11Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.q(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        pg pgVar = this.b;
        if (pgVar != null) {
            pgVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        pg pgVar = this.b;
        if (pgVar != null && drawable != null && !this.c) {
            pgVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (pgVar != null) {
            pgVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) pgVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(pgVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        pg pgVar = this.b;
        if (pgVar != null) {
            pgVar.u(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        pg pgVar = this.b;
        if (pgVar != null) {
            pgVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.y(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        pg pgVar = this.b;
        if (pgVar != null) {
            if (((x11) pgVar.d) == null) {
                pgVar.d = new x11();
            }
            x11 x11Var = (x11) pgVar.d;
            x11Var.c = colorStateList;
            x11Var.b = true;
            pgVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        pg pgVar = this.b;
        if (pgVar != null) {
            if (((x11) pgVar.d) == null) {
                pgVar.d = new x11();
            }
            x11 x11Var = (x11) pgVar.d;
            x11Var.d = mode;
            x11Var.a = true;
            pgVar.b();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        im8.a(context);
        this.c = false;
        rk8.a(this, getContext());
        yb ybVar = new yb(this);
        this.a = ybVar;
        ybVar.n(attributeSet, i);
        pg pgVar = new pg(this);
        this.b = pgVar;
        pgVar.q(attributeSet, i);
    }
}
