package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kn6 implements vq5 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final xa2 g = new xa2(t61.p(t61.o(fn6.class, new xx(1))), "key");
    public static final xa2 h = new xa2(t61.p(t61.o(fn6.class, new xx(2))), AppMeasurementSdk.ConditionalUserProperty.VALUE);
    public static final dv3 i = new dv3(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final uq5 d;
    public final ln6 e = new ln6(this);

    public kn6(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, uq5 uq5Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = uq5Var;
    }

    public static int g(xa2 xa2Var) {
        fn6 fn6Var = (fn6) ((Annotation) xa2Var.b.get(fn6.class));
        if (fn6Var != null) {
            return ((xx) fn6Var).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.vq5
    public final vq5 a(xa2 xa2Var, Object obj) {
        c(xa2Var, obj, true);
        return this;
    }

    public final void b(xa2 xa2Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        fn6 fn6Var = (fn6) ((Annotation) xa2Var.b.get(fn6.class));
        if (fn6Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        h(((xx) fn6Var).a << 3);
        h(i2);
    }

    public final void c(xa2 xa2Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(xa2Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(xa2Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, xa2Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            h((g(xa2Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            h((g(xa2Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            fn6 fn6Var = (fn6) ((Annotation) xa2Var.b.get(fn6.class));
            if (fn6Var == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            h(((xx) fn6Var).a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(xa2Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(xa2Var) << 3) | 2);
            h(bArr.length);
            this.a.write(bArr);
            return;
        }
        uq5 uq5Var = (uq5) this.b.get(obj.getClass());
        if (uq5Var != null) {
            f(uq5Var, xa2Var, obj, z);
            return;
        }
        y29 y29Var = (y29) this.c.get(obj.getClass());
        if (y29Var != null) {
            ln6 ln6Var = this.e;
            ln6Var.a = false;
            ln6Var.c = xa2Var;
            ln6Var.b = z;
            y29Var.a(obj, ln6Var);
            return;
        }
        if (obj instanceof en6) {
            b(xa2Var, ((en6) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(xa2Var, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, xa2Var, obj, z);
        }
    }

    @Override // defpackage.vq5
    public final vq5 d(xa2 xa2Var, int i2) {
        b(xa2Var, i2, true);
        return this;
    }

    @Override // defpackage.vq5
    public final vq5 e(xa2 xa2Var, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        fn6 fn6Var = (fn6) ((Annotation) xa2Var.b.get(fn6.class));
        if (fn6Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        h(((xx) fn6Var).a << 3);
        i(j);
        return this;
    }

    public final void f(uq5 uq5Var, xa2 xa2Var, Object obj, boolean z) throws IOException {
        a54 a54Var = new a54();
        a54Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = a54Var;
            try {
                uq5Var.a(obj, this);
                this.a = outputStream;
                long j = a54Var.a;
                a54Var.close();
                if (z && j == 0) {
                    return;
                }
                h((g(xa2Var) << 3) | 2);
                i(j);
                uq5Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                a54Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
