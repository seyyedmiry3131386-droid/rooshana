package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData$Justification;

/* JADX INFO: loaded from: classes.dex */
public final class vq1 {
    public String a;
    public String b;
    public float c;
    public DocumentData$Justification d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int iOrdinal = ((this.d.ordinal() + (((int) (rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
