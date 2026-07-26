package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class es7 implements c39 {
    public static final es7 a = new es7();
    public static final nc2 b = nc2.w(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME, "v", "i", "o");

    @Override // defpackage.c39
    public final Object m(a aVar, float f) {
        if (aVar.d() == JsonReader$Token.a) {
            aVar.c1();
        }
        aVar.P0();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zB = false;
        while (aVar.hasNext()) {
            int iK = aVar.k(b);
            if (iK == 0) {
                zB = aVar.b();
            } else if (iK == 1) {
                arrayListC = sw3.c(aVar, f);
            } else if (iK == 2) {
                arrayListC2 = sw3.c(aVar, f);
            } else if (iK != 3) {
                aVar.u();
                aVar.z();
            } else {
                arrayListC3 = sw3.c(aVar, f);
            }
        }
        aVar.t0();
        if (aVar.d() == JsonReader$Token.b) {
            aVar.W0();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new ds7(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new j81(aw4.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), aw4.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zB) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new j81(aw4.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), aw4.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new ds7(pointF, zB, arrayList);
    }
}
