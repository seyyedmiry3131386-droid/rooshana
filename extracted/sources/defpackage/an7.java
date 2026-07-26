package defpackage;

import androidx.compose.ui.semantics.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class an7 {
    public static final float a;
    public static final float b;
    public static final g c = new g("SelectionHandleInfo");

    static {
        float f = 25;
        a = f;
        b = f;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
