package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fg7 extends tt9 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable C(int i, h26 h26Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(h26Var.r()));
        }
        if (i == 1) {
            return Boolean.valueOf(h26Var.x() == 1);
        }
        if (i == 2) {
            return E(h26Var);
        }
        if (i != 3) {
            if (i == 8) {
                return D(h26Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(h26Var.r()));
                h26Var.K(2);
                return date;
            }
            int iB = h26Var.B();
            ArrayList arrayList = new ArrayList(iB);
            for (int i2 = 0; i2 < iB; i2++) {
                Serializable serializableC = C(h26Var.x(), h26Var);
                if (serializableC != null) {
                    arrayList.add(serializableC);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strE = E(h26Var);
            int iX = h26Var.x();
            if (iX == 9) {
                return map;
            }
            Serializable serializableC2 = C(iX, h26Var);
            if (serializableC2 != null) {
                map.put(strE, serializableC2);
            }
        }
    }

    public static HashMap D(h26 h26Var) {
        int iB = h26Var.B();
        HashMap map = new HashMap(iB);
        for (int i = 0; i < iB; i++) {
            String strE = E(h26Var);
            Serializable serializableC = C(h26Var.x(), h26Var);
            if (serializableC != null) {
                map.put(strE, serializableC);
            }
        }
        return map;
    }

    public static String E(h26 h26Var) {
        int iD = h26Var.D();
        int i = h26Var.b;
        h26Var.K(iD);
        return new String(h26Var.a, i, iD);
    }
}
