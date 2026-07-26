package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData$Justification;
import com.airbnb.lottie.parser.moshi.a;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements c39 {
    public static final wq1 a = new wq1();
    public static final nc2 b = nc2.w("t", ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.c39
    public final Object m(a aVar, float f) {
        int i;
        boolean z;
        aVar.P0();
        String strT = null;
        DocumentData$Justification documentData$Justification = DocumentData$Justification.a;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        DocumentData$Justification documentData$Justification2 = documentData$Justification;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zB = true;
        String strT2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.hasNext()) {
            switch (aVar.k(b)) {
                case 0:
                    strT = aVar.t();
                    break;
                case 1:
                    strT2 = aVar.t();
                    break;
                case 2:
                    i = iA2;
                    z = zB;
                    fNextDouble = (float) aVar.nextDouble();
                    iA2 = i;
                    zB = z;
                    break;
                case 3:
                    PointF pointF3 = pointF;
                    int i2 = iA2;
                    z = zB;
                    int iNextInt2 = aVar.nextInt();
                    documentData$Justification2 = (iNextInt2 > 2 || iNextInt2 < 0) ? documentData$Justification : DocumentData$Justification.values()[iNextInt2];
                    iA2 = i2;
                    pointF = pointF3;
                    zB = z;
                    break;
                case 4:
                    iNextInt = aVar.nextInt();
                    break;
                case 5:
                    i = iA2;
                    z = zB;
                    fNextDouble2 = (float) aVar.nextDouble();
                    iA2 = i;
                    zB = z;
                    break;
                case 6:
                    i = iA2;
                    z = zB;
                    fNextDouble3 = (float) aVar.nextDouble();
                    iA2 = i;
                    zB = z;
                    break;
                case 7:
                    iA = sw3.a(aVar);
                    break;
                case 8:
                    iA2 = sw3.a(aVar);
                    break;
                case 9:
                    i = iA2;
                    z = zB;
                    fNextDouble4 = (float) aVar.nextDouble();
                    iA2 = i;
                    zB = z;
                    break;
                case 10:
                    zB = aVar.b();
                    break;
                case 11:
                    aVar.c1();
                    i = iA2;
                    z = zB;
                    pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.W0();
                    iA2 = i;
                    zB = z;
                    break;
                case 12:
                    aVar.c1();
                    pointF2 = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.W0();
                    documentData$Justification = documentData$Justification;
                    pointF = pointF;
                    break;
                default:
                    aVar.u();
                    aVar.z();
                    break;
            }
        }
        aVar.t0();
        vq1 vq1Var = new vq1();
        vq1Var.a = strT;
        vq1Var.b = strT2;
        vq1Var.c = fNextDouble;
        vq1Var.d = documentData$Justification2;
        vq1Var.e = iNextInt;
        vq1Var.f = fNextDouble2;
        vq1Var.g = fNextDouble3;
        vq1Var.h = iA;
        vq1Var.i = iA2;
        vq1Var.j = fNextDouble4;
        vq1Var.k = zB;
        vq1Var.l = pointF;
        vq1Var.m = pointF2;
        return vq1Var;
    }
}
