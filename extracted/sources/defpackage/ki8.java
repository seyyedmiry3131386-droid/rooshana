package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData$Justification;

/* JADX INFO: loaded from: classes.dex */
public final class ki8 extends hh2 {
    public final /* synthetic */ xf4 e;
    public final /* synthetic */ hh2 f;
    public final /* synthetic */ vq1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki8(xf4 xf4Var, hh2 hh2Var, vq1 vq1Var) {
        super(12, (byte) 0);
        this.e = xf4Var;
        this.f = hh2Var;
        this.g = vq1Var;
    }

    @Override // defpackage.hh2
    public final Object B(xf4 xf4Var) {
        float f = xf4Var.a;
        float f2 = xf4Var.b;
        String str = ((vq1) xf4Var.c).a;
        String str2 = ((vq1) xf4Var.d).a;
        float f3 = xf4Var.e;
        float f4 = xf4Var.f;
        float f5 = xf4Var.g;
        xf4 xf4Var2 = this.e;
        xf4Var2.a = f;
        xf4Var2.b = f2;
        xf4Var2.c = str;
        xf4Var2.d = str2;
        xf4Var2.e = f3;
        xf4Var2.f = f4;
        xf4Var2.g = f5;
        String str3 = (String) this.f.B(xf4Var2);
        vq1 vq1Var = (vq1) (xf4Var.f == 1.0f ? xf4Var.d : xf4Var.c);
        String str4 = vq1Var.b;
        float f6 = vq1Var.c;
        DocumentData$Justification documentData$Justification = vq1Var.d;
        int i = vq1Var.e;
        float f7 = vq1Var.f;
        float f8 = vq1Var.g;
        int i2 = vq1Var.h;
        int i3 = vq1Var.i;
        float f9 = vq1Var.j;
        boolean z = vq1Var.k;
        PointF pointF = vq1Var.l;
        PointF pointF2 = vq1Var.m;
        vq1 vq1Var2 = this.g;
        vq1Var2.a = str3;
        vq1Var2.b = str4;
        vq1Var2.c = f6;
        vq1Var2.d = documentData$Justification;
        vq1Var2.e = i;
        vq1Var2.f = f7;
        vq1Var2.g = f8;
        vq1Var2.h = i2;
        vq1Var2.i = i3;
        vq1Var2.j = f9;
        vq1Var2.k = z;
        vq1Var2.l = pointF;
        vq1Var2.m = pointF2;
        return vq1Var2;
    }
}
