package defpackage;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cr5 extends qt8 {
    public static final fq5 c = new fq5(1, ToNumberPolicy.a);
    public final vv2 a;
    public final om8 b;

    public cr5(vv2 vv2Var, om8 om8Var) {
        this.a = vv2Var;
        this.b = om8Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        JsonToken jsonTokenR = mw3Var.R();
        int iOrdinal = jsonTokenR.ordinal();
        if (iOrdinal == 0) {
            mw3Var.c1();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            mw3Var.P0();
            arrayList = new LinkedTreeMap();
        }
        if (arrayList == null) {
            return d(mw3Var, jsonTokenR);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (mw3Var.hasNext()) {
                String strM0 = arrayList instanceof Map ? mw3Var.m0() : null;
                JsonToken jsonTokenR2 = mw3Var.R();
                int iOrdinal2 = jsonTokenR2.ordinal();
                if (iOrdinal2 == 0) {
                    mw3Var.c1();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    mw3Var.P0();
                    arrayList2 = new LinkedTreeMap();
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(mw3Var, jsonTokenR2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    mw3Var.W0();
                } else {
                    mw3Var.t0();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (obj == null) {
            uw3Var.u();
            return;
        }
        Class<?> cls = obj.getClass();
        vv2 vv2Var = this.a;
        vv2Var.getClass();
        qt8 qt8VarD = vv2Var.d(TypeToken.get((Class) cls));
        if (!(qt8VarD instanceof cr5)) {
            qt8VarD.c(uw3Var, obj);
        } else {
            uw3Var.P0();
            uw3Var.t0();
        }
    }

    public final Serializable d(mw3 mw3Var, JsonToken jsonToken) throws IOException {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return mw3Var.t();
        }
        if (iOrdinal == 6) {
            return this.b.a(mw3Var);
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(mw3Var.D());
        }
        if (iOrdinal == 8) {
            mw3Var.J();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }
}
