package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ko {
    public final TextView a;
    public x11 b;
    public x11 c;
    public x11 d;
    public x11 e;
    public x11 f;
    public x11 g;
    public x11 h;
    public final so i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ko(TextView textView) {
        this.a = textView;
        this.i = new so(textView);
    }

    public static x11 c(Context context, pn pnVar, int i) {
        ColorStateList colorStateListI;
        synchronized (pnVar) {
            colorStateListI = pnVar.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        x11 x11Var = new x11();
        x11Var.b = true;
        x11Var.c = colorStateListI;
        return x11Var;
    }

    public final void a(Drawable drawable, x11 x11Var) {
        if (drawable == null || x11Var == null) {
            return;
        }
        pn.e(drawable, x11Var, this.a.getDrawableState());
    }

    public final void b() {
        x11 x11Var = this.b;
        TextView textView = this.a;
        if (x11Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        x11 x11Var = this.h;
        if (x11Var != null) {
            return (ColorStateList) x11Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        x11 x11Var = this.h;
        if (x11Var != null) {
            return (PorterDuff.Mode) x11Var.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lu6.TextAppearance);
        sk6 sk6Var = new sk6(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(lu6.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(lu6.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(lu6.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(lu6.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, sk6Var);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(lu6.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(lu6.TextAppearance_fontVariationSettings)) != null) {
            io.d(textView, string);
        }
        sk6Var.G();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        so soVar = this.i;
        if (soVar.j()) {
            DisplayMetrics displayMetrics = soVar.j.getResources().getDisplayMetrics();
            soVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (soVar.h()) {
                soVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        so soVar = this.i;
        if (soVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = soVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                soVar.f = so.b(iArrCopyOf);
                if (!soVar.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                soVar.g = false;
            }
            if (soVar.h()) {
                soVar.a();
            }
        }
    }

    public final void j(int i) {
        so soVar = this.i;
        if (soVar.j()) {
            if (i == 0) {
                soVar.a = 0;
                soVar.d = -1.0f;
                soVar.e = -1.0f;
                soVar.c = -1.0f;
                soVar.f = new int[0];
                soVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(rm7.n(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = soVar.j.getResources().getDisplayMetrics();
            soVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (soVar.h()) {
                soVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new x11();
        }
        x11 x11Var = this.h;
        x11Var.c = colorStateList;
        x11Var.b = colorStateList != null;
        this.b = x11Var;
        this.c = x11Var;
        this.d = x11Var;
        this.e = x11Var;
        this.f = x11Var;
        this.g = x11Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new x11();
        }
        x11 x11Var = this.h;
        x11Var.d = mode;
        x11Var.a = mode != null;
        this.b = x11Var;
        this.c = x11Var;
        this.d = x11Var;
        this.e = x11Var;
        this.f = x11Var;
        this.g = x11Var;
    }

    public final void m(Context context, sk6 sk6Var) {
        String string;
        int i = lu6.TextAppearance_android_textStyle;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) sk6Var.c;
        this.j = typedArray.getInt(i, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(lu6.TextAppearance_android_textFontWeight, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(lu6.TextAppearance_android_fontFamily) && !typedArray.hasValue(lu6.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(lu6.TextAppearance_android_typeface)) {
                this.m = false;
                int i5 = typedArray.getInt(lu6.TextAppearance_android_typeface, 1);
                if (i5 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i6 = typedArray.hasValue(lu6.TextAppearance_fontFamily) ? lu6.TextAppearance_fontFamily : lu6.TextAppearance_android_fontFamily;
        int i7 = this.k;
        int i8 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceX = sk6Var.x(i6, this.j, new eo(this, i7, i8, new WeakReference(this.a)));
                if (typefaceX != null) {
                    if (i3 < 28 || this.k == -1) {
                        this.l = typefaceX;
                    } else {
                        this.l = jo.a(Typeface.create(typefaceX, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = jo.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
