package defpackage;

import com.google.gson.Strictness;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public class uw3 implements Closeable, Flushable {
    public static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] m = new String[128];
    public static final String[] n;
    public final Writer a;
    public int[] b;
    public int c;
    public sj2 d;
    public String e;
    public String f;
    public boolean g;
    public Strictness h;
    public boolean i;
    public String j;
    public boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public uw3(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.h = Strictness.b;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        D(sj2.d);
    }

    public final void D(sj2 sj2Var) {
        Objects.requireNonNull(sj2Var);
        this.d = sj2Var;
        this.f = ",";
        if (sj2Var.c) {
            this.e = ": ";
            if (sj2Var.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        this.g = this.d.a.isEmpty() && this.d.b.isEmpty();
    }

    public final void I(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.h = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.uw3.n
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.uw3.m
        L9:
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw3.J(java.lang.String):void");
    }

    public void K(double d) throws IOException {
        l0();
        if (this.h == Strictness.a || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void P(long j) throws IOException {
        l0();
        b();
        this.a.write(Long.toString(j));
    }

    public void P0() throws IOException {
        l0();
        b();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 3;
        this.a.write(123);
    }

    public void R(Number number) throws IOException {
        if (number == null) {
            u();
            return;
        }
        l0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.h != Strictness.a) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        b();
        this.a.append((CharSequence) string);
    }

    public void U(String str) throws IOException {
        if (str == null) {
            u();
            return;
        }
        l0();
        b();
        J(str);
    }

    public void W0() throws IOException {
        d(']', 1, 2);
    }

    public final void b() throws IOException {
        int iY = y();
        if (iY == 1) {
            this.b[this.c - 1] = 2;
            k();
            return;
        }
        Writer writer = this.a;
        if (iY == 2) {
            writer.append((CharSequence) this.f);
            k();
        } else {
            if (iY == 4) {
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            if (iY != 6) {
                if (iY != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.h != Strictness.a) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.b[this.c - 1] = 7;
        }
    }

    public void c1() throws IOException {
        l0();
        b();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 1;
        this.a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final void d(char c, int i, int i2) throws IOException {
        int iY = y();
        if (iY != i2 && iY != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.c--;
        if (iY == i2) {
            k();
        }
        this.a.write(c);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iY = y();
        if (iY != 3 && iY != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.j = str;
    }

    public final void k() throws IOException {
        if (this.g) {
            return;
        }
        String str = this.d.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d.b);
        }
    }

    public void k0(boolean z) throws IOException {
        l0();
        b();
        this.a.write(z ? "true" : "false");
    }

    public final void l0() throws IOException {
        if (this.j != null) {
            int iY = y();
            if (iY == 5) {
                this.a.write(this.f);
            } else if (iY != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            k();
            this.b[this.c - 1] = 4;
            J(this.j);
            this.j = null;
        }
    }

    public void t0() throws IOException {
        d('}', 3, 5);
    }

    public uw3 u() throws IOException {
        if (this.j != null) {
            if (!this.k) {
                this.j = null;
                return this;
            }
            l0();
        }
        b();
        this.a.write(Ssh2PublicKeyAlgorithmName.NULL);
        return this;
    }

    public final int y() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
