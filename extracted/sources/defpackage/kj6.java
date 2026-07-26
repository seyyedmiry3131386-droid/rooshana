package defpackage;

import androidx.datastore.preferences.PreferencesProto$Value$ValueCase;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.datastore.preferences.protobuf.f;

/* JADX INFO: loaded from: classes.dex */
public final class kj6 extends f {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final kj6 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile k26 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        kj6 kj6Var = new kj6();
        DEFAULT_INSTANCE = kj6Var;
        f.j(kj6.class, kj6Var);
    }

    public static jj6 D() {
        return (jj6) ((er2) DEFAULT_INSTANCE.c(GeneratedMessageLite$MethodToInvoke.e));
    }

    public static void l(kj6 kj6Var, long j) {
        kj6Var.valueCase_ = 4;
        kj6Var.value_ = Long.valueOf(j);
    }

    public static void m(kj6 kj6Var, String str) {
        kj6Var.getClass();
        kj6Var.valueCase_ = 5;
        kj6Var.value_ = str;
    }

    public static void n(kj6 kj6Var, ij6 ij6Var) {
        kj6Var.getClass();
        kj6Var.value_ = ij6Var;
        kj6Var.valueCase_ = 6;
    }

    public static void o(kj6 kj6Var, double d) {
        kj6Var.valueCase_ = 7;
        kj6Var.value_ = Double.valueOf(d);
    }

    public static void p(kj6 kj6Var, ByteString byteString) {
        kj6Var.getClass();
        kj6Var.valueCase_ = 8;
        kj6Var.value_ = byteString;
    }

    public static void q(kj6 kj6Var, boolean z) {
        kj6Var.valueCase_ = 1;
        kj6Var.value_ = Boolean.valueOf(z);
    }

    public static void r(kj6 kj6Var, float f) {
        kj6Var.valueCase_ = 2;
        kj6Var.value_ = Float.valueOf(f);
    }

    public static void s(kj6 kj6Var, int i) {
        kj6Var.valueCase_ = 3;
        kj6Var.value_ = Integer.valueOf(i);
    }

    public static kj6 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final ij6 B() {
        return this.valueCase_ == 6 ? (ij6) this.value_ : ij6.m();
    }

    public final PreferencesProto$Value$ValueCase C() {
        switch (this.valueCase_) {
            case 0:
                return PreferencesProto$Value$ValueCase.i;
            case 1:
                return PreferencesProto$Value$ValueCase.a;
            case 2:
                return PreferencesProto$Value$ValueCase.b;
            case 3:
                return PreferencesProto$Value$ValueCase.c;
            case 4:
                return PreferencesProto$Value$ValueCase.d;
            case 5:
                return PreferencesProto$Value$ValueCase.e;
            case 6:
                return PreferencesProto$Value$ValueCase.f;
            case 7:
                return PreferencesProto$Value$ValueCase.g;
            case 8:
                return PreferencesProto$Value$ValueCase.h;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object c(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        k26 gr2Var;
        switch (generatedMessageLite$MethodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iv6(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", ij6.class});
            case 3:
                return new kj6();
            case 4:
                return new jj6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                k26 k26Var = PARSER;
                if (k26Var != null) {
                    return k26Var;
                }
                synchronized (kj6.class) {
                    try {
                        gr2Var = PARSER;
                        if (gr2Var == null) {
                            gr2Var = new gr2();
                            PARSER = gr2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return gr2Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ByteString u() {
        return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.b;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
