package org.checkerframework.checker.units.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Prefix {
    public static final /* synthetic */ Prefix[] a = {new Prefix("yotta", 0), new Prefix("zetta", 1), new Prefix("exa", 2), new Prefix("peta", 3), new Prefix("tera", 4), new Prefix("giga", 5), new Prefix("mega", 6), new Prefix("kilo", 7), new Prefix("hecto", 8), new Prefix("deca", 9), new Prefix("one", 10), new Prefix("deci", 11), new Prefix("centi", 12), new Prefix("milli", 13), new Prefix("micro", 14), new Prefix("nano", 15), new Prefix("pico", 16), new Prefix("femto", 17), new Prefix("atto", 18), new Prefix("zepto", 19), new Prefix("yocto", 20)};

    /* JADX INFO: Fake field, exist only in values array */
    Prefix EF5;

    public static Prefix valueOf(String str) {
        return (Prefix) Enum.valueOf(Prefix.class, str);
    }

    public static Prefix[] values() {
        return (Prefix[]) a.clone();
    }
}
