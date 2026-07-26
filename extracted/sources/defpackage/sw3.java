package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class sw3 {
    public static final nc2 a = nc2.w("x", "y");

    public static int a(a aVar) {
        aVar.c1();
        int iNextDouble = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (aVar.nextDouble() * 255.0d);
        while (aVar.hasNext()) {
            aVar.z();
        }
        aVar.W0();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(a aVar, float f) {
        int iOrdinal = aVar.d().ordinal();
        if (iOrdinal == 0) {
            aVar.c1();
            float fNextDouble = (float) aVar.nextDouble();
            float fNextDouble2 = (float) aVar.nextDouble();
            while (aVar.d() != JsonReader$Token.b) {
                aVar.z();
            }
            aVar.W0();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + aVar.d());
            }
            float fNextDouble3 = (float) aVar.nextDouble();
            float fNextDouble4 = (float) aVar.nextDouble();
            while (aVar.hasNext()) {
                aVar.z();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        aVar.P0();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (aVar.hasNext()) {
            int iK = aVar.k(a);
            if (iK == 0) {
                fD = d(aVar);
            } else if (iK != 1) {
                aVar.u();
                aVar.z();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.t0();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(a aVar, float f) {
        ArrayList arrayList = new ArrayList();
        aVar.c1();
        while (aVar.d() == JsonReader$Token.a) {
            aVar.c1();
            arrayList.add(b(aVar, f));
            aVar.W0();
        }
        aVar.W0();
        return arrayList;
    }

    public static float d(a aVar) {
        JsonReader$Token jsonReader$TokenD = aVar.d();
        int iOrdinal = jsonReader$TokenD.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) aVar.nextDouble();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + jsonReader$TokenD);
        }
        aVar.c1();
        float fNextDouble = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.z();
        }
        aVar.W0();
        return fNextDouble;
    }
}
