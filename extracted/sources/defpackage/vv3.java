package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class vv3 implements px3 {
    public static final vv3 a = new vv3();
    public static final bk6 b;

    static {
        xj6 xj6Var = xj6.j;
        if (f88.n0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((ch4) dk6.a.values()).iterator();
        while (((ah4) it).hasNext()) {
            px3 px3Var = (px3) ((yg4) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(px3Var.getDescriptor().a())) {
                throw new IllegalArgumentException(g88.O("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + g27.a(px3Var.getClass()).d() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        b = new bk6("kotlinx.serialization.json.JsonLiteral", xj6Var);
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        kv3 kv3VarM = ml9.h(cc1Var).m();
        if (kv3VarM instanceof uv3) {
            return (uv3) kv3VarM;
        }
        throw br9.i(-1, kv3VarM.toString(), "Unexpected JSON element, expected JsonLiteral, had " + g27.a(kv3VarM.getClass()));
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        uv3 uv3Var = (uv3) obj;
        js3.p(uv3Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String str = uv3Var.c;
        ml9.g(q12Var);
        if (uv3Var.a) {
            q12Var.C(str);
            return;
        }
        no7 no7Var = uv3Var.b;
        if (no7Var != null) {
            q12Var.m(no7Var).C(str);
            return;
        }
        js3.p(str, "<this>");
        Long lB0 = m88.b0(10, str);
        if (lB0 != null) {
            q12Var.A(lB0.longValue());
            return;
        }
        tw8 tw8VarM = o27.m(str);
        if (tw8VarM != null) {
            q12Var.m(xw8.b).A(tw8VarM.a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = l88.Q(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            q12Var.h(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            q12Var.l(bool.booleanValue());
        } else {
            q12Var.C(str);
        }
    }
}
