package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mv3 {
    public static final nn3 a = ub1.c(b88.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final hw3 a(Number number) {
        return new uv3(number, false, null);
    }

    public static final hw3 b(String str) {
        return str == null ? yv3.INSTANCE : new uv3(str, true, null);
    }

    public static final hw3 c(kv3 kv3Var) {
        hw3 hw3Var = kv3Var instanceof hw3 ? (hw3) kv3Var : null;
        if (hw3Var != null) {
            return hw3Var;
        }
        throw new IllegalArgumentException("Element " + g27.a(kv3Var.getClass()) + " is not a JsonPrimitive");
    }

    public static final long d(hw3 hw3Var) {
        w78 w78Var = new w78(hw3Var.a());
        long jI = w78Var.i();
        if (w78Var.f() == 10) {
            return jI;
        }
        int i = w78Var.b;
        int i2 = i - 1;
        String str = w78Var.f;
        t0.t(w78Var, o40.y("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
