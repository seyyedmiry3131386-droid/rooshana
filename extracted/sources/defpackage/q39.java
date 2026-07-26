package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q39 extends h39 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public o39 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public q39() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        o39 o39Var = new o39();
        o39Var.c = null;
        o39Var.d = j;
        o39Var.b = new n39();
        this.b = o39Var;
    }

    public static q39 a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            q39 q39Var = new q39();
            ThreadLocal threadLocal = b77.a;
            q39Var.a = resources.getDrawable(i, theme);
            return q39Var;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            q39 q39Var2 = new q39();
            q39Var2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
            return q39Var2;
        } catch (IOException e) {
            t0.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            t0.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o39 o39Var = this.b;
        Bitmap bitmap = o39Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != o39Var.f.getHeight()) {
            o39Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            o39Var.k = true;
        }
        if (this.f) {
            o39 o39Var2 = this.b;
            if (o39Var2.k || o39Var2.g != o39Var2.c || o39Var2.h != o39Var2.d || o39Var2.j != o39Var2.e || o39Var2.i != o39Var2.b.getRootAlpha()) {
                o39 o39Var3 = this.b;
                o39Var3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(o39Var3.f);
                n39 n39Var = o39Var3.b;
                n39Var.a(n39Var.g, n39.p, canvas2, iMin, iMin2);
                o39 o39Var4 = this.b;
                o39Var4.g = o39Var4.c;
                o39Var4.h = o39Var4.d;
                o39Var4.i = o39Var4.b.getRootAlpha();
                o39Var4.j = o39Var4.e;
                o39Var4.k = false;
            }
        } else {
            o39 o39Var5 = this.b;
            o39Var5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(o39Var5.f);
            n39 n39Var2 = o39Var5.b;
            n39Var2.a(n39Var2.g, n39.p, canvas3, iMin, iMin2);
        }
        o39 o39Var6 = this.b;
        if (o39Var6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (o39Var6.l == null) {
                Paint paint2 = new Paint();
                o39Var6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            o39Var6.l.setAlpha(o39Var6.b.getRootAlpha());
            o39Var6.l.setColorFilter(colorFilter);
            paint = o39Var6.l;
        }
        canvas.drawBitmap(o39Var6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new p39(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o39 o39Var = this.b;
        if (o39Var == null) {
            return false;
        }
        n39 n39Var = o39Var.b;
        if (n39Var.n == null) {
            n39Var.n = Boolean.valueOf(n39Var.g.a());
        }
        if (n39Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            o39 o39Var = this.b;
            o39 o39Var2 = new o39();
            o39Var2.c = null;
            o39Var2.d = j;
            if (o39Var != null) {
                o39Var2.a = o39Var.a;
                n39 n39Var = new n39(o39Var.b);
                o39Var2.b = n39Var;
                if (o39Var.b.e != null) {
                    n39Var.e = new Paint(o39Var.b.e);
                }
                if (o39Var.b.d != null) {
                    o39Var2.b.d = new Paint(o39Var.b.d);
                }
                o39Var2.c = o39Var.c;
                o39Var2.d = o39Var.d;
                o39Var2.e = o39Var.e;
            }
            this.b = o39Var2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o39 o39Var = this.b;
        ColorStateList colorStateList = o39Var.c;
        if (colorStateList == null || (mode = o39Var.d) == null) {
            z = false;
        } else {
            this.c = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        n39 n39Var = o39Var.b;
        if (n39Var.n == null) {
            n39Var.n = Boolean.valueOf(n39Var.g.a());
        }
        if (n39Var.n.booleanValue()) {
            boolean zB = o39Var.b.g.b(iArr);
            o39Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            yh0.K(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o39 o39Var = this.b;
        if (o39Var.c != colorStateList) {
            o39Var.c = colorStateList;
            this.c = b(colorStateList, o39Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o39 o39Var = this.b;
        if (o39Var.d != mode) {
            o39Var.d = mode;
            this.c = b(o39Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o39 o39Var = this.b;
        o39Var.b = new n39();
        TypedArray typedArrayK = a27.k(resources, theme, attributeSet, at2.a);
        o39 o39Var2 = this.b;
        n39 n39Var = o39Var2.b;
        int iF = a27.f(typedArrayK, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (iF == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iF != 5) {
            if (iF != 9) {
                switch (iF) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        o39Var2.d = mode;
        ColorStateList colorStateListD = a27.d(typedArrayK, xmlPullParser, theme);
        if (colorStateListD != null) {
            o39Var2.c = colorStateListD;
        }
        boolean z = o39Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayK.getBoolean(5, z);
        }
        o39Var2.e = z;
        float f = n39Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayK.getFloat(7, f);
        }
        n39Var.j = f;
        float f2 = n39Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayK.getFloat(8, f2);
        }
        n39Var.k = f2;
        if (n39Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            n39Var.h = typedArrayK.getDimension(3, n39Var.h);
            int i6 = 2;
            float dimension = typedArrayK.getDimension(2, n39Var.i);
            n39Var.i = dimension;
            if (n39Var.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = n39Var.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayK.getFloat(4, alpha);
                }
                n39Var.setAlpha(alpha);
                String string = typedArrayK.getString(0);
                if (string != null) {
                    n39Var.m = string;
                    n39Var.o.put(string, n39Var);
                }
                typedArrayK.recycle();
                o39Var.a = getChangingConfigurations();
                int i7 = 1;
                o39Var.k = true;
                o39 o39Var3 = this.b;
                n39 n39Var2 = o39Var3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k39 k39Var = n39Var2.g;
                wv wvVar = n39Var2.o;
                arrayDeque.push(k39Var);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == i6) {
                        String name = xmlPullParser.getName();
                        k39 k39Var2 = (k39) arrayDeque.peek();
                        if (k39Var2 != null) {
                            ArrayList arrayList = k39Var2.b;
                            i = depth;
                            if ("path".equals(name)) {
                                j39 j39Var = new j39();
                                j39Var.e = 0.0f;
                                j39Var.g = 1.0f;
                                j39Var.h = 1.0f;
                                j39Var.i = 0.0f;
                                j39Var.j = 1.0f;
                                j39Var.k = 0.0f;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                j39Var.l = cap2;
                                Paint.Join join2 = Paint.Join.MITER;
                                j39Var.m = join2;
                                j39Var.n = 4.0f;
                                TypedArray typedArrayK2 = a27.k(resources, theme, attributeSet, at2.c);
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    String string2 = typedArrayK2.getString(0);
                                    if (string2 != null) {
                                        j39Var.b = string2;
                                    }
                                    String string3 = typedArrayK2.getString(2);
                                    if (string3 != null) {
                                        j39Var.a = wq2.o(string3);
                                    }
                                    j39Var.f = a27.e(typedArrayK2, xmlPullParser, theme, "fillColor", 1);
                                    float f3 = j39Var.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                        f3 = typedArrayK2.getFloat(12, f3);
                                    }
                                    j39Var.h = f3;
                                    int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayK2.getInt(8, -1) : -1;
                                    Paint.Cap cap3 = j39Var.l;
                                    if (i8 == 0) {
                                        cap = cap2;
                                    } else if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                    j39Var.l = cap;
                                    int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayK2.getInt(9, -1) : -1;
                                    Paint.Join join3 = j39Var.m;
                                    if (i9 == 0) {
                                        join = join2;
                                    } else if (i9 != 1) {
                                        join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                    j39Var.m = join;
                                    float f4 = j39Var.n;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                        f4 = typedArrayK2.getFloat(10, f4);
                                    }
                                    j39Var.n = f4;
                                    j39Var.d = a27.e(typedArrayK2, xmlPullParser, theme, "strokeColor", 3);
                                    float f5 = j39Var.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                        f5 = typedArrayK2.getFloat(11, f5);
                                    }
                                    j39Var.g = f5;
                                    float f6 = j39Var.e;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                        f6 = typedArrayK2.getFloat(4, f6);
                                    }
                                    j39Var.e = f6;
                                    float f7 = j39Var.j;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                        f7 = typedArrayK2.getFloat(6, f7);
                                    }
                                    j39Var.j = f7;
                                    float f8 = j39Var.k;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                        f8 = typedArrayK2.getFloat(7, f8);
                                    }
                                    j39Var.k = f8;
                                    float f9 = j39Var.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                        f9 = typedArrayK2.getFloat(5, f9);
                                    }
                                    j39Var.i = f9;
                                    int i10 = j39Var.c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                        i10 = typedArrayK2.getInt(13, i10);
                                    }
                                    j39Var.c = i10;
                                }
                                typedArrayK2.recycle();
                                arrayList.add(j39Var);
                                if (j39Var.getPathName() != null) {
                                    wvVar.put(j39Var.getPathName(), j39Var);
                                }
                                o39Var3.a = o39Var3.a;
                                i4 = 1;
                                z2 = false;
                            } else {
                                if ("clip-path".equals(name)) {
                                    i39 i39Var = new i39();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray typedArrayK3 = a27.k(resources, theme, attributeSet, at2.d);
                                        String string4 = typedArrayK3.getString(0);
                                        if (string4 != null) {
                                            i39Var.b = string4;
                                        }
                                        String string5 = typedArrayK3.getString(1);
                                        if (string5 != null) {
                                            i39Var.a = wq2.o(string5);
                                        }
                                        i39Var.c = !a27.j(xmlPullParser, "fillType") ? 0 : typedArrayK3.getInt(2, 0);
                                        typedArrayK3.recycle();
                                    }
                                    arrayList.add(i39Var);
                                    if (i39Var.getPathName() != null) {
                                        wvVar.put(i39Var.getPathName(), i39Var);
                                    }
                                    o39Var3.a = o39Var3.a;
                                } else if ("group".equals(name)) {
                                    k39 k39Var3 = new k39();
                                    TypedArray typedArrayK4 = a27.k(resources, theme, attributeSet, at2.b);
                                    float f10 = k39Var3.c;
                                    if (a27.j(xmlPullParser, "rotation")) {
                                        f10 = typedArrayK4.getFloat(5, f10);
                                    }
                                    k39Var3.c = f10;
                                    i4 = 1;
                                    k39Var3.d = typedArrayK4.getFloat(1, k39Var3.d);
                                    k39Var3.e = typedArrayK4.getFloat(2, k39Var3.e);
                                    float f11 = k39Var3.f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f11 = typedArrayK4.getFloat(3, f11);
                                    }
                                    k39Var3.f = f11;
                                    float f12 = k39Var3.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f12 = typedArrayK4.getFloat(4, f12);
                                    }
                                    k39Var3.g = f12;
                                    float f13 = k39Var3.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f13 = typedArrayK4.getFloat(6, f13);
                                    }
                                    k39Var3.h = f13;
                                    float f14 = k39Var3.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f14 = typedArrayK4.getFloat(7, f14);
                                    }
                                    k39Var3.i = f14;
                                    String string6 = typedArrayK4.getString(0);
                                    if (string6 != null) {
                                        k39Var3.k = string6;
                                    }
                                    k39Var3.c();
                                    typedArrayK4.recycle();
                                    arrayList.add(k39Var3);
                                    arrayDeque.push(k39Var3);
                                    if (k39Var3.getGroupName() != null) {
                                        wvVar.put(k39Var3.getGroupName(), k39Var3);
                                    }
                                    o39Var3.a = o39Var3.a;
                                }
                                i4 = 1;
                            }
                        } else {
                            i = depth;
                            i4 = 1;
                        }
                        i3 = i4;
                        i2 = 3;
                    } else {
                        i = depth;
                        i2 = i5;
                        i3 = 1;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i2;
                    i7 = i3;
                    depth = i;
                    i6 = 2;
                }
                if (!z2) {
                    this.c = b(o39Var.c, o39Var.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q39(o39 o39Var) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = o39Var;
        this.c = b(o39Var.c, o39Var.d);
    }
}
