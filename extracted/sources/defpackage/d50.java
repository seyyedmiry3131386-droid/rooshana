package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState$State;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class d50 extends Drawable implements yg8 {
    public static final int n = mt6.Widget_MaterialComponents_Badge;
    public static final int o = vp6.badgeStyle;
    public final WeakReference a;
    public final fk4 b;
    public final zg8 c;
    public final Rect d;
    public final e50 e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public d50(Context context, BadgeState$State badgeState$State) {
        vf8 vf8Var;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        vj8.c(context, vj8.b, "Theme.MaterialComponents");
        this.d = new Rect();
        zg8 zg8Var = new zg8(this);
        this.c = zg8Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = zg8Var.a;
        textPaint.setTextAlign(align);
        e50 e50Var = new e50(context, badgeState$State);
        this.e = e50Var;
        boolean zG = g();
        BadgeState$State badgeState$State2 = e50Var.b;
        fk4 fk4Var = new fk4(as7.a(context, zG ? badgeState$State2.g.intValue() : badgeState$State2.e.intValue(), g() ? badgeState$State2.h.intValue() : badgeState$State2.f.intValue()).a());
        this.b = fk4Var;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && zg8Var.g != (vf8Var = new vf8(context2, badgeState$State2.d.intValue()))) {
            zg8Var.c(vf8Var, context2);
            textPaint.setColor(badgeState$State2.c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i = badgeState$State2.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.h = badgeState$State2.m;
        }
        zg8Var.e = true;
        k();
        invalidateSelf();
        zg8Var.e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.b.intValue());
        if (fk4Var.b.d != colorStateListValueOf) {
            fk4Var.s(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(badgeState$State2.t.booleanValue(), false);
    }

    @Override // defpackage.yg8
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y;
        float x;
        ViewParent parent;
        boolean z;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float f = (this.g - this.k) + y;
            float f2 = (this.f - this.j) + x;
            View view4 = (View) parent;
            float height = ((this.g + this.k) - view4.getHeight()) + y;
            float width = ((this.f + this.j) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.g = Math.abs(f) + this.g;
            }
            if (f2 < 0.0f) {
                this.f = Math.abs(f2) + this.f;
            }
            if (height > 0.0f) {
                this.g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        e50 e50Var = this.e;
        BadgeState$State badgeState$State = e50Var.b;
        BadgeState$State badgeState$State2 = e50Var.b;
        String str = badgeState$State.j;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i = this.h;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(badgeState$State2.n).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State2.n, context.getString(ft6.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), Marker.ANY_NON_NULL_MARKER);
        }
        int i2 = badgeState$State.l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(ft6.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        e50 e50Var = this.e;
        BadgeState$State badgeState$State = e50Var.b;
        BadgeState$State badgeState$State2 = e50Var.b;
        if (badgeState$State.j != null) {
            CharSequence charSequence = badgeState$State.o;
            return charSequence != null ? charSequence : e50Var.b.j;
        }
        if (!h()) {
            return badgeState$State2.p;
        }
        if (badgeState$State2.q == 0 || (context = (Context) this.a.get()) == null) {
            return null;
        }
        int i = this.h;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(badgeState$State2.q, f(), Integer.valueOf(f())) : context.getString(badgeState$State2.r, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        zg8 zg8Var = this.c;
        zg8Var.a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(strC, this.f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), zg8Var.a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.e.b.j != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        BadgeState$State badgeState$State = this.e.b;
        return badgeState$State.j == null && badgeState$State.k != -1;
    }

    public final void i() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        e50 e50Var = this.e;
        this.b.setShapeAppearanceModel(as7.a(context, zG ? e50Var.b.g.intValue() : e50Var.b.e.intValue(), g() ? e50Var.b.h.intValue() : e50Var.b.f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[PHI: r13
      0x0112: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00de, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d50.k():void");
    }

    @Override // android.graphics.drawable.Drawable, defpackage.yg8
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        e50 e50Var = this.e;
        e50Var.a.i = i;
        e50Var.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
