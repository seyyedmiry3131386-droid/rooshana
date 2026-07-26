package ir.mservices.market.core;

import defpackage.dr6;
import defpackage.hh2;
import defpackage.r22;
import defpackage.ws6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Font$FontStyle {
    public static final Font$FontStyle e;
    public static final /* synthetic */ Font$FontStyle[] f;
    public static final /* synthetic */ r22 g;
    public final hh2 a;
    public final hh2 b;
    public final hh2 c;
    public final int d;

    static {
        Font$FontStyle font$FontStyle = new Font$FontStyle("DEFAULT", 0, new hh2(dr6.vazir_regular), new hh2(dr6.vazir_medium), new hh2(dr6.vazir_semi_bold), ws6.font_style_vazir);
        e = font$FontStyle;
        Font$FontStyle[] font$FontStyleArr = {font$FontStyle, new Font$FontStyle("DORNA", 1, new hh2(dr6.dorna_regular), new hh2(dr6.dorna_medium), new hh2(dr6.dorna_semi_bold), ws6.font_style_dorna), new Font$FontStyle("GOHAR", 2, new hh2(dr6.gohar_regular), new hh2(dr6.gohar_medium), new hh2(dr6.gohar_semi_bold), ws6.font_style_gohar), new Font$FontStyle("VIRGOUL", 3, new hh2(dr6.virgoul_regular), new hh2(dr6.virgoul_medium), new hh2(dr6.virgoul_semi_bold), ws6.font_style_virgoul)};
        f = font$FontStyleArr;
        g = kotlin.enums.a.a(font$FontStyleArr);
    }

    public Font$FontStyle(String str, int i, hh2 hh2Var, hh2 hh2Var2, hh2 hh2Var3, int i2) {
        this.a = hh2Var;
        this.b = hh2Var2;
        this.c = hh2Var3;
        this.d = i2;
    }

    public static Font$FontStyle valueOf(String str) {
        return (Font$FontStyle) Enum.valueOf(Font$FontStyle.class, str);
    }

    public static Font$FontStyle[] values() {
        return (Font$FontStyle[]) f.clone();
    }
}
