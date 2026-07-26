package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* JADX INFO: loaded from: classes.dex */
public final class vf8 {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public vf8(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lu6.TextAppearance);
        this.l = typedArrayObtainStyledAttributes.getDimension(lu6.TextAppearance_android_textSize, 0.0f);
        this.k = ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColor);
        ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColorHint);
        ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColorLink);
        this.d = typedArrayObtainStyledAttributes.getInt(lu6.TextAppearance_android_textStyle, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(lu6.TextAppearance_android_typeface, 1);
        int i2 = lu6.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : lu6.TextAppearance_android_fontFamily;
        this.m = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(lu6.TextAppearance_textAllCaps, false);
        this.a = ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_shadowColor);
        this.f = typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowDx, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowDy, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, yt6.MaterialTextAppearance);
        this.i = typedArrayObtainStyledAttributes2.hasValue(yt6.MaterialTextAppearance_android_letterSpacing);
        this.j = typedArrayObtainStyledAttributes2.getFloat(yt6.MaterialTextAppearance_android_letterSpacing, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = yt6.MaterialTextAppearance_fontVariationSettings;
            this.c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i3) ? i3 : yt6.MaterialTextAppearance_android_fontVariationSettings);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.p;
        int i = this.d;
        if (typeface == null && (str = this.b) != null) {
            this.p = Typeface.create(str, i);
        }
        if (this.p == null) {
            int i2 = this.e;
            if (i2 == 1) {
                this.p = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.p = Typeface.SERIF;
            } else if (i2 != 3) {
                this.p = Typeface.DEFAULT;
            } else {
                this.p = Typeface.MONOSPACE;
            }
            this.p = Typeface.create(this.p, i);
        }
    }

    public final void b(Context context, c77 c77Var) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            c77Var.g(this.p, true);
            return;
        }
        try {
            jg jgVar = new jg(this, c77Var);
            ThreadLocal threadLocal = b77.a;
            if (context.isRestricted()) {
                jgVar.d(-4);
            } else {
                b77.c(context, i, new TypedValue(), 0, jgVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            c77Var.f(1);
        } catch (Exception unused2) {
            this.n = true;
            c77Var.f(-3);
        }
    }

    public final boolean c(Context context) throws Exception {
        Context context2;
        Typeface typefaceC;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = b77.a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceC = null;
            } else {
                context2 = context;
                typefaceC = b77.c(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceC != null) {
                this.p = typefaceC;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), gu6.FontFamily);
                            string = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderSystemFontFamily);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.p = typefaceCreate2;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, c77 c77Var) {
        e(context, textPaint, c77Var);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, c77 c77Var) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new uf8(this, context, textPaint, c77Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceN = zc.n(context.getResources().getConfiguration(), typeface);
        if (typefaceN != null) {
            typeface = typefaceN;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
