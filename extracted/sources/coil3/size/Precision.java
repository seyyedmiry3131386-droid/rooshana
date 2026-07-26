package coil3.size;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Precision {
    public static final Precision a;
    public static final Precision b;
    public static final /* synthetic */ Precision[] c;

    static {
        Precision precision = new Precision("EXACT", 0);
        a = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        b = precision2;
        Precision[] precisionArr = {precision, precision2};
        c = precisionArr;
        a.a(precisionArr);
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) c.clone();
    }
}
