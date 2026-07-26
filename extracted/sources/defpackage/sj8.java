package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.BlendedColor;
import ir.mservices.market.theme.MyketColor;
import ir.mservices.market.theme.NeutralVariantBlendedColor;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.theme.ThemeStyle;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.myket.theme.common.colors.models.UiMode;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class sj8 implements pz3 {
    public static Resources b;
    public static ThemeData c;
    public static ThemeData d;
    public static ThemeData e;
    public static final Object a = a.b(LazyThreadSafetyMode.a, new i30(new sj8(), 18));
    public static ThemeStyle f = ThemeStyle.g;
    public static ThemeMode g = ThemeMode.a;

    public static boolean a() {
        Configuration configuration;
        if (Build.VERSION.SDK_INT >= 28) {
            Resources resources = b;
            Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
            if (numValueOf != null && numValueOf.intValue() == 32) {
                return true;
            }
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 19);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(11, 6);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            if (!calendar.after(calendar3) || !calendar.before(calendar2)) {
                return true;
            }
        }
        return false;
    }

    public static final ThemeData b() {
        ThemeData themeDataD = c;
        if (themeDataD == null) {
            int iOrdinal = g.ordinal();
            if (iOrdinal == 0) {
                themeDataD = d(f);
                e = themeDataD;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                themeDataD = c(f);
                d = themeDataD;
            }
            c = themeDataD;
        }
        return themeDataD;
    }

    public static final ThemeData c(ThemeStyle themeStyle) {
        js3.p(themeStyle, "themeStyle");
        ThemeData themeData = d;
        if (themeData != null) {
            if (themeStyle != f) {
                themeData = null;
            }
            if (themeData != null) {
                return themeData;
            }
        }
        Resources resources = b;
        if (resources == null) {
            resources = ApplicationLauncher.o.getApplicationContext().getResources();
        }
        js3.m(resources);
        MyketColor myketColor = new MyketColor(themeStyle.b, themeStyle.c, resources);
        ThemeMode themeMode = ThemeMode.b;
        BlendedColor blendedColor = myketColor.a;
        int i = blendedColor.e;
        int i2 = blendedColor.k;
        int i3 = blendedColor.l;
        int i4 = blendedColor.f;
        int i5 = blendedColor.b;
        BlendedColor blendedColor2 = myketColor.b;
        int i6 = blendedColor2.e;
        int i7 = blendedColor2.k;
        NeutralVariantBlendedColor neutralVariantBlendedColor = myketColor.f;
        int i8 = neutralVariantBlendedColor.h;
        BlendedColor blendedColor3 = myketColor.e;
        int i9 = blendedColor3.b;
        int i10 = blendedColor3.e;
        int i11 = blendedColor3.i;
        int i12 = neutralVariantBlendedColor.g;
        int i13 = blendedColor3.j;
        int i14 = neutralVariantBlendedColor.c;
        int i15 = blendedColor3.l;
        AlphaColor alphaColor = myketColor.h;
        int i16 = alphaColor.c;
        int i17 = neutralVariantBlendedColor.e;
        int i18 = blendedColor3.g;
        BlendedColor blendedColor4 = myketColor.c;
        int i19 = blendedColor4.g;
        int i20 = blendedColor4.k;
        int i21 = blendedColor4.b;
        BlendedColor blendedColor5 = myketColor.d;
        int i22 = blendedColor5.g;
        int i23 = blendedColor5.k;
        int i24 = blendedColor5.b;
        int i25 = blendedColor2.a;
        int i26 = blendedColor2.j;
        int color = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(164 & 255), Integer.valueOf(i8 & 16777215)}, 2)));
        int i27 = blendedColor.b;
        AlphaColor alphaColor2 = myketColor.g;
        int i28 = alphaColor2.g;
        int i29 = eq6.night_mode_app_primary;
        ThreadLocal threadLocal = b77.a;
        int color2 = resources.getColor(i29, null);
        int color3 = resources.getColor(eq6.night_mode_app_primary, null);
        AlphaColor alphaColor3 = myketColor.g;
        return new ThemeData(themeMode, myketColor, i, i2, i2, i3, i2, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i11, i18, i19, i20, i21, i22, i23, i24, i25, i26, i8, color, i27, myketColor.h, alphaColor2, i28, color2, color3, alphaColor3.b, new Ripple(Integer.valueOf(alphaColor.d), alphaColor3.d, alphaColor.c), blendedColor3.l, blendedColor3.k, blendedColor3.f, neutralVariantBlendedColor.h);
    }

    public static final ThemeData d(ThemeStyle themeStyle) {
        js3.p(themeStyle, "themeStyle");
        ThemeData themeData = e;
        if (themeData != null) {
            if (themeStyle != f) {
                themeData = null;
            }
            if (themeData != null) {
                return themeData;
            }
        }
        Resources resources = b;
        if (resources == null) {
            resources = ApplicationLauncher.o.getApplicationContext().getResources();
        }
        js3.m(resources);
        MyketColor myketColor = new MyketColor(themeStyle.b, themeStyle.c, resources);
        ThemeMode themeMode = ThemeMode.a;
        BlendedColor blendedColor = myketColor.a;
        int i = blendedColor.h;
        BlendedColor blendedColor2 = myketColor.e;
        int i2 = blendedColor2.a;
        int i3 = blendedColor.b;
        int i4 = blendedColor.a;
        int i5 = blendedColor.c;
        int i6 = blendedColor.i;
        BlendedColor blendedColor3 = myketColor.b;
        int i7 = blendedColor3.h;
        NeutralVariantBlendedColor neutralVariantBlendedColor = myketColor.f;
        int i8 = neutralVariantBlendedColor.a;
        int i9 = blendedColor2.l;
        int i10 = blendedColor2.h;
        int i11 = blendedColor2.e;
        int i12 = neutralVariantBlendedColor.b;
        int i13 = blendedColor2.b;
        int i14 = neutralVariantBlendedColor.f;
        AlphaColor alphaColor = myketColor.g;
        int i15 = alphaColor.c;
        int i16 = neutralVariantBlendedColor.d;
        int i17 = blendedColor2.d;
        int i18 = blendedColor2.f;
        BlendedColor blendedColor4 = myketColor.c;
        int i19 = blendedColor4.h;
        int i20 = blendedColor4.a;
        int i21 = blendedColor4.i;
        BlendedColor blendedColor5 = myketColor.d;
        int i22 = blendedColor5.h;
        int i23 = blendedColor5.a;
        int i24 = blendedColor5.i;
        int i25 = blendedColor3.k;
        int i26 = blendedColor3.a;
        int color = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(164 & 255), Integer.valueOf(i8 & 16777215)}, 2)));
        int i27 = blendedColor.k;
        AlphaColor alphaColor2 = myketColor.g;
        int i28 = alphaColor2.g;
        int i29 = eq6.light_mode_app_primary;
        ThreadLocal threadLocal = b77.a;
        return new ThemeData(themeMode, myketColor, i, i2, i3, i4, i5, i, i6, i7, i2, i8, i9, i10, i11, i12, i13, i14, i2, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i8, color, i27, myketColor.h, alphaColor2, i28, resources.getColor(i29, null), resources.getColor(eq6.light_mode_app_primary, null), alphaColor.b, new Ripple(null, myketColor.h.d, alphaColor.c), blendedColor2.a, blendedColor2.b, blendedColor2.h, neutralVariantBlendedColor.a);
    }

    public static final String e() {
        switch (f.ordinal()) {
            case 1:
                return "pinky";
            case 2:
                return "violet";
            case 3:
                return "red";
            case 4:
                return "cobalt";
            case 5:
                return "jungle";
            case 6:
                return "aqua";
            case 7:
                return "orange";
            default:
                return "default";
        }
    }

    public static final String f() {
        return rj8.a[g.ordinal()] == 2 ? "night" : "default";
    }

    public static final void g(Resources resources, String str, ThemeStyle themeStyle) {
        js3.p(resources, "resources");
        js3.p(str, "nightMode");
        js3.p(themeStyle, "themeStyle");
        b = resources;
        ThemeMode themeMode = a() ? ThemeMode.b : ThemeMode.a;
        i(str);
        j(themeStyle);
        if (!str.equalsIgnoreCase("auto") || g == themeMode) {
            return;
        }
        t32.b().g(new k04(0, 0));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [c24, java.lang.Object] */
    public static final void h(ThemeMode themeMode) {
        g = themeMode;
        c = null;
        ir.myket.persistent.datasource.a aVar = (ir.myket.persistent.datasource.a) a.getValue();
        String strF = f();
        js3.p(aVar, "<this>");
        aVar.i.b(aVar, ir.myket.persistent.datasource.a.n[8], (strF.equals("night") ? UiMode.a : UiMode.b).name());
    }

    public static void i(String str) {
        js3.p(str, "nightMode");
        int iHashCode = str.hashCode();
        if (iHashCode == 3551) {
            if (str.equals("on")) {
                h(ThemeMode.b);
            }
        } else if (iHashCode == 109935) {
            if (str.equals("off")) {
                h(ThemeMode.a);
            }
        } else if (iHashCode == 3005871 && str.equals("auto")) {
            h(a() ? ThemeMode.b : ThemeMode.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [c24, java.lang.Object] */
    public static void j(ThemeStyle themeStyle) {
        js3.p(themeStyle, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        f = themeStyle;
        c = null;
        d = null;
        e = null;
        ir.myket.persistent.datasource.a aVar = (ir.myket.persistent.datasource.a) a.getValue();
        String strE = e();
        js3.p(aVar, "<this>");
        String upperCase = strE.toUpperCase(Locale.ROOT);
        js3.o(upperCase, "toUpperCase(...)");
        aVar.h.b(aVar, ir.myket.persistent.datasource.a.n[7], upperCase);
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
