package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 implements hv3, cc1, tz0 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final pu3 c;
    public final String d;
    public final bv3 e;

    public u0(pu3 pu3Var, String str) {
        this.c = pu3Var;
        this.d = str;
        this.e = pu3Var.a;
    }

    @Override // defpackage.tz0
    public final boolean A(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return G(R(no7Var, i));
    }

    @Override // defpackage.cc1
    public final byte B() {
        return H(T());
    }

    @Override // defpackage.cc1
    public final short C() {
        return O(T());
    }

    @Override // defpackage.cc1
    public final float D() {
        return K(T());
    }

    @Override // defpackage.tz0
    public final long E(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return N(R(no7Var, i));
    }

    @Override // defpackage.cc1
    public final double F() {
        return J(T());
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of boolean at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            nn3 nn3Var = mv3.a;
            String strA = hw3Var.a();
            String[] strArr = y78.a;
            js3.p(strA, "<this>");
            Boolean bool = strA.equalsIgnoreCase("true") ? Boolean.TRUE : strA.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            W(hw3Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "boolean", str);
            throw null;
        }
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of byte at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            long jD = mv3.d(hw3Var);
            Byte bValueOf = (-128 > jD || jD > 127) ? null : Byte.valueOf((byte) jD);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            W(hw3Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of char at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            String strA = hw3Var.a();
            js3.p(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "char", str);
            throw null;
        }
    }

    public final double J(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of double at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            nn3 nn3Var = mv3.a;
            double d = Double.parseDouble(hw3Var.a());
            bv3 bv3Var = this.c.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String string = u().toString();
            js3.p(string, "output");
            throw br9.j(-1, br9.R(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of float at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            nn3 nn3Var = mv3.a;
            float f = Float.parseFloat(hw3Var.a());
            bv3 bv3Var = this.c.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String string = u().toString();
            js3.p(string, "output");
            throw br9.j(-1, br9.R(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "float", str);
            throw null;
        }
    }

    public final cc1 L(Object obj, no7 no7Var) {
        String str = (String) obj;
        js3.p(str, "tag");
        js3.p(no7Var, "inlineDescriptor");
        if (!o78.a(no7Var)) {
            this.a.add(str);
            return this;
        }
        kv3 kv3VarD = d(str);
        String strA = no7Var.a();
        if (kv3VarD instanceof hw3) {
            String strA2 = ((hw3) kv3VarD).a();
            pu3 pu3Var = this.c;
            js3.p(pu3Var, "json");
            js3.p(strA2, "source");
            return new iv3(new w78(strA2), pu3Var);
        }
        throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of " + strA + " at element: " + V(str));
    }

    public final int M(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of int at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            long jD = mv3.d(hw3Var);
            Integer numValueOf = (-2147483648L > jD || jD > 2147483647L) ? null : Integer.valueOf((int) jD);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            W(hw3Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "int", str);
            throw null;
        }
    }

    public final long N(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (kv3VarD instanceof hw3) {
            hw3 hw3Var = (hw3) kv3VarD;
            try {
                return mv3.d(hw3Var);
            } catch (IllegalArgumentException unused) {
                W(hw3Var, "long", str);
                throw null;
            }
        }
        throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of long at element: " + V(str));
    }

    public final short O(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of short at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        try {
            long jD = mv3.d(hw3Var);
            Short shValueOf = (-32768 > jD || jD > 32767) ? null : Short.valueOf((short) jD);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            W(hw3Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(hw3Var, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        if (!(kv3VarD instanceof hw3)) {
            throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of string at element: " + V(str));
        }
        hw3 hw3Var = (hw3) kv3VarD;
        if (!(hw3Var instanceof uv3)) {
            StringBuilder sbN = t61.n("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbN.append(V(str));
            throw br9.i(-1, u().toString(), sbN.toString());
        }
        uv3 uv3Var = (uv3) hw3Var;
        if (uv3Var.a || this.c.a.c) {
            return uv3Var.c;
        }
        StringBuilder sbN2 = t61.n("String literal for key '", str, "' should be quoted at element: ");
        sbN2.append(V(str));
        sbN2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw br9.i(-1, u().toString(), sbN2.toString());
    }

    public String Q(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return no7Var.f(i);
    }

    public final String R(no7 no7Var, int i) {
        js3.p(no7Var, "<this>");
        String strQ = Q(no7Var, i);
        js3.p(strQ, "nestedName");
        return strQ;
    }

    public abstract kv3 S();

    public final Object T() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(br9.y(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String U() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : a.t0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        js3.p(str, "currentTag");
        return U() + '.' + str;
    }

    public final void W(hw3 hw3Var, String str, String str2) {
        throw br9.i(-1, u().toString(), "Failed to parse literal '" + hw3Var + "' as " + (m88.Z(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + V(str2));
    }

    public void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
    }

    @Override // defpackage.tz0
    public final rb4 b() {
        return this.c.b;
    }

    @Override // defpackage.cc1
    public tz0 c(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        kv3 kv3VarU = u();
        o37 kind = no7Var.getKind();
        boolean zI = js3.i(kind, g98.c);
        pu3 pu3Var = this.c;
        if (zI || (kind instanceof ph6)) {
            String strA = no7Var.a();
            if (kv3VarU instanceof uu3) {
                return new ow3(pu3Var, (uu3) kv3VarU);
            }
            throw br9.i(-1, kv3VarU.toString(), "Expected " + g27.a(uu3.class).d() + ", but had " + g27.a(kv3VarU.getClass()).d() + " as the serialized body of " + strA + " at element: " + U());
        }
        if (!js3.i(kind, g98.d)) {
            String strA2 = no7Var.a();
            if (kv3VarU instanceof cw3) {
                return new nw3(pu3Var, (cw3) kv3VarU, this.d, 8);
            }
            throw br9.i(-1, kv3VarU.toString(), "Expected " + g27.a(cw3.class).d() + ", but had " + g27.a(kv3VarU.getClass()).d() + " as the serialized body of " + strA2 + " at element: " + U());
        }
        no7 no7VarB = ln2.b(no7Var.h(0), pu3Var.b);
        o37 kind2 = no7VarB.getKind();
        if (!(kind2 instanceof yj6) && !js3.i(kind2, ro7.b)) {
            throw br9.h(no7VarB);
        }
        String strA3 = no7Var.a();
        if (kv3VarU instanceof cw3) {
            return new pw3(pu3Var, (cw3) kv3VarU);
        }
        throw br9.i(-1, kv3VarU.toString(), "Expected " + g27.a(cw3.class).d() + ", but had " + g27.a(kv3VarU.getClass()).d() + " as the serialized body of " + strA3 + " at element: " + U());
    }

    public abstract kv3 d(String str);

    @Override // defpackage.cc1
    public final Object e(px3 px3Var) {
        js3.p(px3Var, "deserializer");
        if (!(px3Var instanceof y1)) {
            return px3Var.deserialize(this);
        }
        pu3 pu3Var = this.c;
        bv3 bv3Var = pu3Var.a;
        y1 y1Var = (y1) px3Var;
        String strM = is3.m(pu3Var, y1Var.getDescriptor());
        kv3 kv3VarU = u();
        String strA = y1Var.getDescriptor().a();
        if (!(kv3VarU instanceof cw3)) {
            throw br9.i(-1, kv3VarU.toString(), "Expected " + g27.a(cw3.class).d() + ", but had " + g27.a(kv3VarU.getClass()).d() + " as the serialized body of " + strA + " at element: " + U());
        }
        cw3 cw3Var = (cw3) kv3VarU;
        kv3 kv3Var = (kv3) cw3Var.get(strM);
        String strA2 = null;
        if (kv3Var != null) {
            hw3 hw3VarC = mv3.c(kv3Var);
            if (!(hw3VarC instanceof yv3)) {
                strA2 = hw3VarC.a();
            }
        }
        try {
            return uy6.l(pu3Var, strM, cw3Var, js3.y((y1) px3Var, this, strA2));
        } catch (SerializationException e) {
            String message = e.getMessage();
            js3.m(message);
            throw br9.i(-1, cw3Var.toString(), message);
        }
    }

    @Override // defpackage.tz0
    public final cc1 f(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return L(R(vj6Var, i), vj6Var.h(i));
    }

    @Override // defpackage.cc1
    public final boolean g() {
        return G(T());
    }

    @Override // defpackage.cc1
    public final char h() {
        return I(T());
    }

    @Override // defpackage.tz0
    public final double j(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return J(R(vj6Var, i));
    }

    @Override // defpackage.tz0
    public final char k(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return I(R(vj6Var, i));
    }

    @Override // defpackage.tz0
    public final float l(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return K(R(vj6Var, i));
    }

    @Override // defpackage.hv3
    public final kv3 m() {
        return u();
    }

    @Override // defpackage.tz0
    public final byte n(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return H(R(vj6Var, i));
    }

    @Override // defpackage.tz0
    public final String o(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return P(R(no7Var, i));
    }

    @Override // defpackage.cc1
    public final int p() {
        return M(T());
    }

    @Override // defpackage.tz0
    public final short q(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return O(R(vj6Var, i));
    }

    @Override // defpackage.cc1
    public final cc1 r(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        if (a.v0(this.a) != null) {
            return L(T(), no7Var);
        }
        return new jw3(this.c, S(), this.d).r(no7Var);
    }

    @Override // defpackage.tz0
    public final Object s(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "deserializer");
        this.a.add(R(no7Var, i));
        js3.p(px3Var, "deserializer");
        Object objE = e(px3Var);
        if (!this.b) {
            T();
        }
        this.b = false;
        return objE;
    }

    @Override // defpackage.tz0
    public final int t(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return M(R(no7Var, i));
    }

    public final kv3 u() {
        kv3 kv3VarD;
        String str = (String) a.v0(this.a);
        return (str == null || (kv3VarD = d(str)) == null) ? S() : kv3VarD;
    }

    @Override // defpackage.cc1
    public final String v() {
        return P(T());
    }

    @Override // defpackage.cc1
    public final int w(no7 no7Var) {
        js3.p(no7Var, "enumDescriptor");
        String str = (String) T();
        js3.p(str, "tag");
        kv3 kv3VarD = d(str);
        String strA = no7Var.a();
        if (kv3VarD instanceof hw3) {
            return bt2.A(no7Var, this.c, ((hw3) kv3VarD).a(), "");
        }
        throw br9.i(-1, kv3VarD.toString(), "Expected " + g27.a(hw3.class).d() + ", but had " + g27.a(kv3VarD.getClass()).d() + " as the serialized body of " + strA + " at element: " + V(str));
    }

    @Override // defpackage.cc1
    public final long x() {
        return N(T());
    }

    @Override // defpackage.cc1
    public boolean y() {
        return !(u() instanceof yv3);
    }

    @Override // defpackage.tz0
    public final Object z(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "deserializer");
        this.a.add(R(no7Var, i));
        Object objE = (px3Var.getDescriptor().c() || y()) ? e(px3Var) : null;
        if (!this.b) {
            T();
        }
        this.b = false;
        return objE;
    }
}
