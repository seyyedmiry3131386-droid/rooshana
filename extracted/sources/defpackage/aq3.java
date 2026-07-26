package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.graphics.colorspace.a;
import j$.util.function.DoubleUnaryOperator$CC;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.function.DoubleUnaryOperator;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq3 {
    public static Context a;
    public static Boolean b;
    public static Constructor c;

    public static void A(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void B(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean b(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean c(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final Bitmap f(int i, int i2, int i3, nv0 nv0Var) {
        Bitmap.Config config;
        ColorSpace rgb;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace colorSpaceQ;
        ColorSpace colorSpace;
        Bitmap.Config configV = fz.v(i3);
        if (js3.i(nv0Var, pv0.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (js3.i(nv0Var, pv0.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (js3.i(nv0Var, pv0.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (js3.i(nv0Var, pv0.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (js3.i(nv0Var, pv0.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (js3.i(nv0Var, pv0.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (js3.i(nv0Var, pv0.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (js3.i(nv0Var, pv0.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (js3.i(nv0Var, pv0.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (js3.i(nv0Var, pv0.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (js3.i(nv0Var, pv0.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (js3.i(nv0Var, pv0.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (js3.i(nv0Var, pv0.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (js3.i(nv0Var, pv0.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (js3.i(nv0Var, pv0.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!js3.i(nv0Var, pv0.n)) {
                if (Build.VERSION.SDK_INT >= 34 && (colorSpaceQ = i3.q(nv0Var)) != null) {
                    rgb = colorSpaceQ;
                    config = configV;
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
                }
                if (nv0Var instanceof a) {
                    String str = nv0Var.a;
                    a aVar = (a) nv0Var;
                    float[] fArrA = aVar.d.a();
                    gq8 gq8Var = aVar.g;
                    if (gq8Var != null) {
                        config = configV;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(gq8Var.b, gq8Var.c, gq8Var.d, gq8Var.e, gq8Var.f, gq8Var.g, gq8Var.a);
                    } else {
                        config = configV;
                        transferParameters = null;
                    }
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, aVar.h, fArrA, transferParameters);
                    } else {
                        float[] fArr = aVar.h;
                        final dp2 dp2Var = aVar.l;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ov0
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i5 = i4;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i4) {
                                }
                                return ((Number) dp2Var.invoke(Double.valueOf(d))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i5 = i4;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        };
                        final dp2 dp2Var2 = aVar.o;
                        final int i5 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ov0
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i52 = i5;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i5) {
                                }
                                return ((Number) dp2Var2.invoke(Double.valueOf(d))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i52 = i5;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        }, aVar.e, aVar.f);
                    }
                } else {
                    config = configV;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        config = configV;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
    }

    public static Notification.Builder g(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon h(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void i(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static AutofillId j(View view) {
        return view.getAutofillId();
    }

    public static float k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Object m(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = c;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            c = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static synchronized boolean n(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (wn5.R()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }

    public static final void o(re reVar, SparseArray sparseArray) {
        if (reVar.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueH = y32.h(sparseArray.get(iKeyAt));
            if (autofillValueH.isText()) {
                m30 m30Var = reVar.b;
                autofillValueH.getTextValue().toString();
                if (m30Var.a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueH.isDate()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueH.isList()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueH.isToggle()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    public static void q(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        PendingIntent activity2 = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            i3.v(activity2);
        } else {
            activity2.send();
        }
    }

    public static void r(MenuItem menuItem, char c2, int i) {
        menuItem.setAlphabeticShortcut(c2, i);
    }

    public static void s(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void t(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void u(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void v(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void w(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void x(MenuItem menuItem, char c2, int i) {
        menuItem.setNumericShortcut(c2, i);
    }

    public static void y(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void z(Notification.Builder builder) {
        builder.setShortcutId(null);
    }
}
