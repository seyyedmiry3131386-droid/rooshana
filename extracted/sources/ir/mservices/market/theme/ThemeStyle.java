package ir.mservices.market.theme;

import defpackage.bp2;
import defpackage.dq6;
import defpackage.eq6;
import defpackage.mw7;
import defpackage.r22;
import defpackage.rs6;
import defpackage.yq6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ThemeStyle {
    public static final ThemeStyle g;
    public static final ThemeStyle h;
    public static final ThemeStyle i;
    public static final ThemeStyle j;
    public static final ThemeStyle k;
    public static final ThemeStyle l;
    public static final ThemeStyle m;
    public static final ThemeStyle n;
    public static final /* synthetic */ ThemeStyle[] o;
    public static final /* synthetic */ r22 p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final bp2 f;

    static {
        ThemeStyle themeStyle = new ThemeStyle("DEFAULT", 0, rs6.theme_style_default, eq6.style_color_default, eq6.style_color_default_movie, yq6.ic_theme_style_myket, rs6.theme_style_default_description);
        g = themeStyle;
        int i2 = rs6.theme_style_pinky;
        int i3 = eq6.style_color_pinky;
        ThemeStyle themeStyle2 = new ThemeStyle("PINKY", 1, i2, i3, i3, yq6.ic_theme_style_pinky, rs6.theme_style_pinky_description);
        h = themeStyle2;
        int i4 = rs6.theme_style_violet;
        int i5 = eq6.style_color_violet;
        ThemeStyle themeStyle3 = new ThemeStyle("VIOLET", 2, i4, i5, i5, yq6.ic_theme_style_violet, rs6.theme_style_violet_description);
        i = themeStyle3;
        int i6 = rs6.theme_style_red;
        int i7 = eq6.style_color_red;
        ThemeStyle themeStyle4 = new ThemeStyle("RED", 3, i6, i7, i7, yq6.ic_theme_style_red, rs6.theme_style_red_description);
        j = themeStyle4;
        int i8 = rs6.theme_style_cobalt;
        int i9 = eq6.style_color_cobalt;
        ThemeStyle themeStyle5 = new ThemeStyle("COBALT", 4, i8, i9, i9, yq6.ic_theme_style_cobalt, rs6.theme_style_cobalt_description);
        k = themeStyle5;
        int i10 = rs6.theme_style_jungle;
        int i11 = eq6.style_color_jungle;
        ThemeStyle themeStyle6 = new ThemeStyle("JUNGLE", 5, i10, i11, i11, yq6.ic_theme_style_jungle, rs6.theme_style_jungle_description);
        l = themeStyle6;
        int i12 = rs6.theme_style_aqua;
        int i13 = eq6.style_color_aqua;
        ThemeStyle themeStyle7 = new ThemeStyle("AQUA", 6, i12, i13, i13, yq6.ic_theme_style_aqua, rs6.theme_style_aqua_description);
        m = themeStyle7;
        int i14 = rs6.theme_style_orange;
        int i15 = eq6.style_color_orange;
        ThemeStyle themeStyle8 = new ThemeStyle("ORANGE", 7, i14, i15, i15, yq6.ic_theme_style_orange, rs6.theme_style_orange_description);
        n = themeStyle8;
        int i16 = rs6.theme_style_device_fit;
        int i17 = dq6.material_dynamic_primary40;
        ThemeStyle[] themeStyleArr = {themeStyle, themeStyle2, themeStyle3, themeStyle4, themeStyle5, themeStyle6, themeStyle7, themeStyle8, new ThemeStyle("DEVICE_DEFAULT", 8, i16, i17, i17, yq6.ic_theme_style_phone_default, rs6.theme_style_device_fit_description, new mw7(11))};
        o = themeStyleArr;
        p = a.a(themeStyleArr);
    }

    public ThemeStyle(String str, int i2, int i3, int i4, int i5, int i6, int i7, bp2 bp2Var) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = i6;
        this.e = i7;
        this.f = bp2Var;
    }

    public static ThemeStyle valueOf(String str) {
        return (ThemeStyle) Enum.valueOf(ThemeStyle.class, str);
    }

    public static ThemeStyle[] values() {
        return (ThemeStyle[]) o.clone();
    }

    public /* synthetic */ ThemeStyle(String str, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(str, i2, i3, i4, i5, i6, i7, new mw7(12));
    }
}
