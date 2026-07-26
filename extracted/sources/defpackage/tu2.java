package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements c39, oq8, z39, qy1 {
    public int a;

    public /* synthetic */ tu2(int i) {
        this.a = i;
    }

    @Override // defpackage.x39
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.qy1
    public int b(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.qy1
    public int c(Context context, String str) {
        return this.a;
    }

    @Override // defpackage.oq8
    public void d(Canvas canvas, Paint paint, RectF rectF) {
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // defpackage.z39
    public int k() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // defpackage.c39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(com.airbnb.lottie.parser.moshi.a r21, float r22) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu2.m(com.airbnb.lottie.parser.moshi.a, float):java.lang.Object");
    }

    @Override // defpackage.z39
    public int p() {
        return 0;
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return j < ((long) this.a) * 1000000 ? dlVar : dlVar2;
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return dlVar3;
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((long) k()) * 1000000;
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return dlVar3;
    }
}
