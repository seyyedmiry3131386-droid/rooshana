package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak4 implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        return new float[]{yk.a(fArr[0], fArr2[0], f), yk.a(fArr[1], fArr2[1], f), yk.a(fArr[2], fArr2[2], f), yk.a(fArr[3], fArr2[3], f), yk.a(fArr[4], fArr2[4], f), yk.a(fArr[5], fArr2[5], f), yk.a(fArr[6], fArr2[6], f), yk.a(fArr[7], fArr2[7], f)};
    }
}
