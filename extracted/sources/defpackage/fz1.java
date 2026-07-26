package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.android.core.t0;
import ir.mservices.market.app.common.data.DisplayMode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class fz1 implements wf0, l51, v61, f34, ly0, i87, b18, tf0, tl8, q37, dt5, fu4, p96, DisplayMode, os, dv {
    public static final fz1 l;
    public static final fz1 m;
    public final /* synthetic */ int a;
    public static final fz1 b = new fz1(1);
    public static final fz1 c = new fz1(2);
    public static final fz1 d = new fz1(3);
    public static final fz1 e = new fz1(4);
    public static final /* synthetic */ fz1 f = new fz1(5);
    public static final fz1 g = new fz1(6);
    public static final fz1 h = new fz1(7);
    public static final fz1 i = new fz1(8);
    public static final fz1 j = new fz1(9);
    public static final fz1 k = new fz1(10);
    public static final fz1 n = new fz1(12);
    public static final fz1 o = new fz1(14);
    public static final fz1 p = new fz1(16);
    public static final fz1 q = new fz1(17);
    public static final fz1 r = new fz1(18);
    public static final fz1 s = new fz1(19);
    public static final fz1 t = new fz1(20);
    public static final dg9 u = new dg9();
    public static final /* synthetic */ fz1 v = new fz1(22);
    public static final /* synthetic */ fz1 w = new fz1(23);

    static {
        int i2 = 11;
        l = new fz1(i2);
        m = new fz1(i2);
    }

    public /* synthetic */ fz1(int i2) {
        this.a = i2;
    }

    public static void p() {
        bl4.H("on", "player_ad_button_image", "movie_click");
    }

    public static Toast q(int i2, Context context, String str) {
        js3.p(context, "context");
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(resources.getDimension(qq6.radius_8));
        rm8 rm8Var = b67.b;
        if (rm8Var != null) {
            gradientDrawable.setColor(rm8Var.a);
        }
        linearLayout.setBackground(gradientDrawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(qq6.space_8);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(qq6.space_12);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTypeface(b77.b(context, dr6.vazir_regular));
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        rm8 rm8Var2 = b67.b;
        if (rm8Var2 != null) {
            textView.setTextColor(rm8Var2.b);
        }
        linearLayout.addView(textView);
        Toast toast = new Toast(context);
        toast.setView(linearLayout);
        toast.setDuration(i2);
        toast.setGravity(81, 0, resources.getDimensionPixelSize(qq6.space_16));
        return toast;
    }

    public static Toast r(Context context, int i2, int i3) {
        int i4 = (i3 & 8) != 0 ? 0 : 1;
        js3.p(context, "context");
        String string = context.getString(i2);
        js3.o(string, "getString(...)");
        return q(i4, context, string);
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        ((cf8) obj2).b(Boolean.TRUE);
    }

    @Override // defpackage.p96
    public wc4 b() {
        return new wc4(br9.B(new vc4(Locale.getDefault())));
    }

    @Override // defpackage.tl8
    public sl8 c() {
        return new sl8(rx4.a());
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.p96
    public Locale f(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (js3.i(localeForLanguageTag.toLanguageTag(), "und")) {
            t0.d("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // defpackage.wf0
    public Rect g(Activity activity2) throws Exception {
        Configuration configuration = activity2.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            js3.n(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            wf0.b0.getClass();
            t0.l(e2, vf0.b);
            return th0.d.g(activity2);
        }
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ int getHorizontalType() {
        return wp1.a(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public String getMode() {
        return "DigestedHorizontal3";
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        Object objG = o77Var.g(new so6(cd0.class, Executor.class));
        js3.o(objG, "get(...)");
        return tv8.o((Executor) objG);
    }

    @Override // defpackage.l51
    public Object i(Object obj) {
        ((j77) obj).close();
        return tx8.a;
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isDigested() {
        return wp1.b(this);
    }

    @Override // ir.mservices.market.app.common.data.DisplayMode
    public /* bridge */ boolean isMulti() {
        return wp1.c(this);
    }

    @Override // defpackage.os
    public String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            str = str.substring(1, str.length());
        }
        return str.charAt(str.length() - 1) == '/' ? dw1.l(str, 1, 0) : str;
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        jv.b(iArr, iArr2, false);
    }

    @Override // defpackage.fu4
    public boolean l(ot4 ot4Var) {
        return false;
    }

    public boolean m() {
        return this instanceof oi4;
    }

    @Override // defpackage.tf0
    public long n(vl1 vl1Var, int i2) {
        String str = ((ri8) vl1Var.e).a.a.b;
        return uy6.b(za7.e(i2, str), za7.d(i2, str));
    }

    public void o(float f2, float f3, float f4, us7 us7Var) {
        us7Var.d(f2, 0.0f);
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        t0.n("NearbyConnections", "Failed to start discovery.", exc);
    }

    public String toString() {
        switch (this.a) {
            case 19:
                int i2 = rx4.b;
                return "TimeSource(System.nanoTime())";
            case 29:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.f34
    public void a() {
    }

    @Override // defpackage.f34
    public void cancel() {
    }

    @Override // defpackage.fu4
    public void d(ot4 ot4Var, boolean z) {
    }
}
