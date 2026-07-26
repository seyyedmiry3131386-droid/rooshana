package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1 implements px3 {
    public px3 a(tz0 tz0Var, String str) {
        rb4 rb4VarB = tz0Var.b();
        zw3 zw3VarC = c();
        rb4VarB.getClass();
        js3.p(zw3VarC, "baseClass");
        Map map = (Map) ((Map) rb4VarB.e).get(zw3VarC);
        px3 px3Var = map != null ? (px3) map.get(str) : null;
        if (!(px3Var instanceof px3)) {
            px3Var = null;
        }
        if (px3Var != null) {
            return px3Var;
        }
        Object obj = ((Map) rb4VarB.f).get(zw3VarC);
        dp2 dp2Var = wu8.C(1, obj) ? (dp2) obj : null;
        if (dp2Var != null) {
            return (px3) dp2Var.invoke(str);
        }
        return null;
    }

    public px3 b(q12 q12Var, Object obj) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        rb4 rb4VarB = q12Var.b();
        zw3 zw3VarC = c();
        rb4VarB.getClass();
        js3.p(zw3VarC, "baseClass");
        if (((ps0) zw3VarC).e(obj)) {
            Map map = (Map) ((Map) rb4VarB.c).get(zw3VarC);
            px3 px3Var = map != null ? (px3) map.get(g27.a(obj.getClass())) : null;
            px3 px3Var2 = px3Var instanceof px3 ? px3Var : null;
            if (px3Var2 != null) {
                return px3Var2;
            }
            Object obj2 = ((Map) rb4VarB.d).get(zw3VarC);
            dp2 dp2Var = wu8.C(1, obj2) ? (dp2) obj2 : null;
            if (dp2Var != null) {
                return (px3) dp2Var.invoke(obj);
            }
        }
        return null;
    }

    public abstract zw3 c();

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 descriptor = getDescriptor();
        tz0 tz0VarC = cc1Var.c(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object objS = null;
        while (true) {
            int i = tz0VarC.i(getDescriptor());
            if (i == -1) {
                if (objS != null) {
                    tz0VarC.a(descriptor);
                    return objS;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.a)).toString());
            }
            if (i == 0) {
                ref$ObjectRef.a = tz0VarC.o(getDescriptor(), i);
            } else {
                if (i != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) ref$ObjectRef.a;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(i);
                    throw new SerializationException(sb.toString());
                }
                Object obj = ref$ObjectRef.a;
                if (obj == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                ref$ObjectRef.a = obj;
                objS = tz0VarC.s(getDescriptor(), i, js3.y(this, tz0VarC, (String) obj), null);
            }
        }
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        px3 px3VarZ = js3.z(this, q12Var, obj);
        no7 descriptor = getDescriptor();
        uz0 uz0VarC = q12Var.c(descriptor);
        uz0VarC.w(getDescriptor(), 0, px3VarZ.getDescriptor().a());
        uz0VarC.o(getDescriptor(), 1, px3VarZ, obj);
        uz0VarC.a(descriptor);
    }
}
