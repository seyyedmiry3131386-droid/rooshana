package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class pv3 extends qt8 {
    public static final pv3 a = new pv3();

    private pv3() {
    }

    public static lv3 d(mw3 mw3Var, JsonToken jsonToken) throws IOException {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return new iw3(mw3Var.t());
        }
        if (iOrdinal == 6) {
            return new iw3(new LazilyParsedNumber(mw3Var.t()));
        }
        if (iOrdinal == 7) {
            return new iw3(Boolean.valueOf(mw3Var.D()));
        }
        if (iOrdinal == 8) {
            mw3Var.J();
            return zv3.a;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    public static void e(uw3 uw3Var, lv3 lv3Var) throws IOException {
        if (lv3Var == null || (lv3Var instanceof zv3)) {
            uw3Var.u();
            return;
        }
        boolean z = lv3Var instanceof iw3;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + lv3Var);
            }
            iw3 iw3Var = (iw3) lv3Var;
            Serializable serializable = iw3Var.a;
            if (serializable instanceof Number) {
                uw3Var.R(iw3Var.c());
                return;
            } else if (serializable instanceof Boolean) {
                uw3Var.k0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(iw3Var.d()));
                return;
            } else {
                uw3Var.U(iw3Var.d());
                return;
            }
        }
        boolean z2 = lv3Var instanceof vu3;
        if (z2) {
            uw3Var.c1();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + lv3Var);
            }
            Iterator it = ((vu3) lv3Var).a.iterator();
            while (it.hasNext()) {
                e(uw3Var, (lv3) it.next());
            }
            uw3Var.W0();
            return;
        }
        boolean z3 = lv3Var instanceof dw3;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + lv3Var.getClass());
        }
        uw3Var.P0();
        if (!z3) {
            throw new IllegalStateException("Not a JSON Object: " + lv3Var);
        }
        Iterator it2 = ((f84) ((dw3) lv3Var).a.entrySet()).iterator();
        while (((e84) it2).hasNext()) {
            g84 g84VarB = ((e84) it2).b();
            uw3Var.g((String) g84VarB.getKey());
            e(uw3Var, (lv3) g84VarB.getValue());
        }
        uw3Var.t0();
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        lv3 vu3Var;
        lv3 vu3Var2;
        JsonToken jsonTokenR = mw3Var.R();
        int iOrdinal = jsonTokenR.ordinal();
        if (iOrdinal == 0) {
            mw3Var.c1();
            vu3Var = new vu3();
        } else if (iOrdinal != 2) {
            vu3Var = null;
        } else {
            mw3Var.P0();
            vu3Var = new dw3();
        }
        if (vu3Var == null) {
            return d(mw3Var, jsonTokenR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (mw3Var.hasNext()) {
                String strM0 = vu3Var instanceof dw3 ? mw3Var.m0() : null;
                JsonToken jsonTokenR2 = mw3Var.R();
                int iOrdinal2 = jsonTokenR2.ordinal();
                if (iOrdinal2 == 0) {
                    mw3Var.c1();
                    vu3Var2 = new vu3();
                } else if (iOrdinal2 != 2) {
                    vu3Var2 = null;
                } else {
                    mw3Var.P0();
                    vu3Var2 = new dw3();
                }
                boolean z = vu3Var2 != null;
                if (vu3Var2 == null) {
                    vu3Var2 = d(mw3Var, jsonTokenR2);
                }
                if (vu3Var instanceof vu3) {
                    ((vu3) vu3Var).a.add(vu3Var2);
                } else {
                    ((dw3) vu3Var).a.put(strM0, vu3Var2);
                }
                if (z) {
                    arrayDeque.addLast(vu3Var);
                    vu3Var = vu3Var2;
                }
            } else {
                if (vu3Var instanceof vu3) {
                    mw3Var.W0();
                } else {
                    mw3Var.t0();
                }
                if (arrayDeque.isEmpty()) {
                    return vu3Var;
                }
                vu3Var = (lv3) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.qt8
    public final /* bridge */ /* synthetic */ void c(uw3 uw3Var, Object obj) throws IOException {
        e(uw3Var, (lv3) obj);
    }
}
