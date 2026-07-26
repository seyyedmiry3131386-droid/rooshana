package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public class kw3 implements qv3, q12, uz0 {
    public final ArrayList a;
    public final pu3 b;
    public final dp2 c;
    public final bv3 d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    public kw3(pu3 pu3Var, dp2 dp2Var, char c) {
        this.a = new ArrayList();
        this.b = pu3Var;
        this.c = dp2Var;
        this.d = pu3Var.a;
    }

    @Override // defpackage.q12
    public final void A(long j) {
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.a(Long.valueOf(j)));
    }

    @Override // defpackage.uz0
    public final q12 B(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return H(J(vj6Var, i), vj6Var.h(i));
    }

    @Override // defpackage.q12
    public final void C(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String str2 = (String) K();
        js3.p(str2, "tag");
        L(str2, mv3.b(str));
    }

    @Override // defpackage.q12
    public final uz0 D(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return c(no7Var);
    }

    public final void E(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "serializer");
        this.a.add(J(no7Var, i));
        dw1.a(this, px3Var, obj);
    }

    public final void F(Object obj, double d) {
        String str = (String) obj;
        js3.p(str, "tag");
        L(str, mv3.a(Double.valueOf(d)));
        this.d.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d);
        String string = I().toString();
        js3.p(string, "output");
        throw new JsonEncodingException(br9.R(dValueOf, str, string));
    }

    public final void G(Object obj, float f) {
        String str = (String) obj;
        js3.p(str, "tag");
        L(str, mv3.a(Float.valueOf(f)));
        this.d.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        String string = I().toString();
        js3.p(string, "output");
        throw new JsonEncodingException(br9.R(fValueOf, str, string));
    }

    public final q12 H(Object obj, no7 no7Var) {
        String str = (String) obj;
        js3.p(str, "tag");
        js3.p(no7Var, "inlineDescriptor");
        if (o78.a(no7Var)) {
            return new v0(this, str);
        }
        if (no7Var.isInline() && no7Var.equals(mv3.a)) {
            return new v0(this, str, no7Var);
        }
        this.a.add(str);
        return this;
    }

    public kv3 I() {
        switch (this.g) {
            case 0:
                kv3 kv3Var = (kv3) this.h;
                if (kv3Var != null) {
                    return kv3Var;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new cw3((LinkedHashMap) this.h);
            default:
                return new uu3((ArrayList) this.h);
        }
    }

    public final String J(no7 no7Var, int i) {
        String strValueOf;
        js3.p(no7Var, "<this>");
        switch (this.g) {
            case 2:
                js3.p(no7Var, "descriptor");
                strValueOf = String.valueOf(i);
                break;
            default:
                js3.p(no7Var, "descriptor");
                pu3 pu3Var = this.b;
                js3.p(pu3Var, "json");
                bt2.I(pu3Var, no7Var);
                strValueOf = no7Var.f(i);
                break;
        }
        js3.p(strValueOf, "nestedName");
        return strValueOf;
    }

    public final Object K() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(br9.y(arrayList));
    }

    public void L(String str, kv3 kv3Var) {
        switch (this.g) {
            case 0:
                js3.p(str, "key");
                js3.p(kv3Var, "element");
                if (str != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((kv3) this.h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.h = kv3Var;
                this.c.invoke(kv3Var);
                return;
            case 1:
                js3.p(str, "key");
                js3.p(kv3Var, "element");
                ((LinkedHashMap) this.h).put(str, kv3Var);
                return;
            default:
                js3.p(str, "key");
                js3.p(kv3Var, "element");
                ((ArrayList) this.h).add(Integer.parseInt(str), kv3Var);
                return;
        }
    }

    @Override // defpackage.uz0
    public final void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        if (!this.a.isEmpty()) {
            K();
        }
        this.c.invoke(I());
    }

    @Override // defpackage.q12
    public final rb4 b() {
        return this.b.b;
    }

    @Override // defpackage.q12
    public final uz0 c(no7 no7Var) {
        kw3 kw3Var;
        js3.p(no7Var, "descriptor");
        dp2 nVar = a.v0(this.a) == null ? this.c : new n(1, this);
        o37 kind = no7Var.getKind();
        boolean zI = js3.i(kind, g98.c);
        pu3 pu3Var = this.b;
        if (zI || (kind instanceof ph6)) {
            kw3Var = new kw3(pu3Var, nVar, 2);
        } else if (js3.i(kind, g98.d)) {
            no7 no7VarB = ln2.b(no7Var.h(0), pu3Var.b);
            o37 kind2 = no7VarB.getKind();
            if (!(kind2 instanceof yj6) && !js3.i(kind2, ro7.b)) {
                throw br9.h(no7VarB);
            }
            js3.p(nVar, "nodeConsumer");
            qw3 qw3Var = new qw3(pu3Var, nVar, 1);
            qw3Var.j = true;
            kw3Var = qw3Var;
        } else {
            kw3Var = new kw3(pu3Var, nVar, 1);
        }
        String str = this.e;
        if (str != null) {
            if (kw3Var instanceof qw3) {
                qw3 qw3Var2 = (qw3) kw3Var;
                qw3Var2.L("key", mv3.b(str));
                String strA = this.f;
                if (strA == null) {
                    strA = no7Var.a();
                }
                qw3Var2.L(AppMeasurementSdk.ConditionalUserProperty.VALUE, mv3.b(strA));
            } else {
                String strA2 = this.f;
                if (strA2 == null) {
                    strA2 = no7Var.a();
                }
                kw3Var.L(str, mv3.b(strA2));
            }
            this.e = null;
            this.f = null;
        }
        return kw3Var;
    }

    @Override // defpackage.uz0
    public final void d(vj6 vj6Var, int i, double d) {
        js3.p(vj6Var, "descriptor");
        F(J(vj6Var, i), d);
    }

    @Override // defpackage.q12
    public final void e() {
        String str = (String) a.v0(this.a);
        if (str == null) {
            this.c.invoke(yv3.INSTANCE);
        } else {
            L(str, yv3.INSTANCE);
        }
    }

    @Override // defpackage.uz0
    public final boolean f(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this.d.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // defpackage.q12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.px3 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw3.g(px3, java.lang.Object):void");
    }

    @Override // defpackage.q12
    public final void h(double d) {
        F(K(), d);
    }

    @Override // defpackage.q12
    public final void i(short s) {
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.a(Short.valueOf(s)));
    }

    @Override // defpackage.uz0
    public final void j(no7 no7Var, int i, long j) {
        js3.p(no7Var, "descriptor");
        L(J(no7Var, i), mv3.a(Long.valueOf(j)));
    }

    @Override // defpackage.q12
    public final void k(byte b) {
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.a(Byte.valueOf(b)));
    }

    @Override // defpackage.q12
    public final void l(boolean z) {
        String str = (String) K();
        js3.p(str, "tag");
        Boolean boolValueOf = Boolean.valueOf(z);
        nn3 nn3Var = mv3.a;
        L(str, new uv3(boolValueOf, false, null));
    }

    @Override // defpackage.q12
    public final q12 m(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        if (a.v0(this.a) == null) {
            return new kw3(this.b, this.c, 0).m(no7Var);
        }
        if (this.e != null) {
            this.f = no7Var.a();
        }
        return H(K(), no7Var);
    }

    @Override // defpackage.uz0
    public final void n(no7 no7Var, int i, boolean z) {
        js3.p(no7Var, "descriptor");
        String strJ = J(no7Var, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        nn3 nn3Var = mv3.a;
        L(strJ, new uv3(boolValueOf, false, null));
    }

    @Override // defpackage.uz0
    public final void o(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "serializer");
        this.a.add(J(no7Var, i));
        g(px3Var, obj);
    }

    @Override // defpackage.q12
    public final void p(float f) {
        G(K(), f);
    }

    @Override // defpackage.uz0
    public final void q(vj6 vj6Var, int i, byte b) {
        js3.p(vj6Var, "descriptor");
        L(J(vj6Var, i), mv3.a(Byte.valueOf(b)));
    }

    @Override // defpackage.q12
    public final void r(char c) {
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.b(String.valueOf(c)));
    }

    @Override // defpackage.uz0
    public final void s(vj6 vj6Var, int i, float f) {
        js3.p(vj6Var, "descriptor");
        G(J(vj6Var, i), f);
    }

    @Override // defpackage.q12
    public final void t(no7 no7Var, int i) {
        js3.p(no7Var, "enumDescriptor");
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.b(no7Var.f(i)));
    }

    @Override // defpackage.uz0
    public final void u(vj6 vj6Var, int i, short s) {
        js3.p(vj6Var, "descriptor");
        L(J(vj6Var, i), mv3.a(Short.valueOf(s)));
    }

    @Override // defpackage.uz0
    public final void v(int i, int i2, no7 no7Var) {
        js3.p(no7Var, "descriptor");
        L(J(no7Var, i), mv3.a(Integer.valueOf(i2)));
    }

    @Override // defpackage.uz0
    public final void w(no7 no7Var, int i, String str) {
        js3.p(no7Var, "descriptor");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        L(J(no7Var, i), mv3.b(str));
    }

    @Override // defpackage.uz0
    public final void x(vj6 vj6Var, int i, char c) {
        js3.p(vj6Var, "descriptor");
        L(J(vj6Var, i), mv3.b(String.valueOf(c)));
    }

    @Override // defpackage.q12
    public final void y(int i) {
        String str = (String) K();
        js3.p(str, "tag");
        L(str, mv3.a(Integer.valueOf(i)));
    }

    @Override // defpackage.uz0
    public void z(no7 no7Var, int i, px3 px3Var, Object obj) {
        switch (this.g) {
            case 1:
                js3.p(no7Var, "descriptor");
                js3.p(px3Var, "serializer");
                if (obj != null || this.d.d) {
                    E(no7Var, i, px3Var, obj);
                }
                break;
            default:
                E(no7Var, i, px3Var, obj);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kw3(pu3 pu3Var, dp2 dp2Var, int i) {
        this(pu3Var, dp2Var, (char) 0);
        this.g = i;
        switch (i) {
            case 1:
                js3.p(pu3Var, "json");
                js3.p(dp2Var, "nodeConsumer");
                this(pu3Var, dp2Var, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                js3.p(pu3Var, "json");
                js3.p(dp2Var, "nodeConsumer");
                this(pu3Var, dp2Var, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                js3.p(pu3Var, "json");
                js3.p(dp2Var, "nodeConsumer");
                this.a.add("primitive");
                break;
        }
    }
}
