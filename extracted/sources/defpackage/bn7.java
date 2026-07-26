package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn7 {
    public static final al a = new al(Float.NaN, Float.NaN);
    public static final mt8 b = new mt8(new vd7(20), new vd7(21));
    public static final long c;
    public static final o38 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new o38(new nr5(jFloatToRawIntBits));
    }
}
