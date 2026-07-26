package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Closeable, Flushable {
    public static final String[] i = new String[128];
    public final Writer a;
    public int[] b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public final boolean h;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            i[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 6;
        this.e = ":";
        this.h = true;
        this.a = writer;
    }

    public final void D() throws IOException {
        if (this.g != null) {
            int iU = u();
            if (iU == 5) {
                this.a.write(44);
            } else if (iU != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            g();
            this.b[this.c - 1] = 4;
            y(this.g);
            this.g = null;
        }
    }

    public final void b() throws IOException {
        int iU = u();
        if (iU == 1) {
            this.b[this.c - 1] = 2;
            g();
            return;
        }
        Writer writer = this.a;
        if (iU == 2) {
            writer.append(',');
            g();
        } else {
            if (iU == 4) {
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            if (iU != 6) {
                if (iU != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.b[this.c - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final void d(char c, int i2, int i3) throws IOException {
        int iU = u();
        if (iU != i3 && iU != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.g != null) {
            throw new IllegalStateException("Dangling name: " + this.g);
        }
        this.c--;
        if (iU == i3) {
            g();
        }
        this.a.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void g() throws IOException {
        if (this.d == null) {
            return;
        }
        Writer writer = this.a;
        writer.write(10);
        int i2 = this.c;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(this.d);
        }
    }

    public final void k() throws IOException {
        if (this.g != null) {
            if (!this.h) {
                this.g = null;
                return;
            }
            D();
        }
        b();
        this.a.write(Ssh2PublicKeyAlgorithmName.NULL);
    }

    public final int u() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            java.io.Writer r0 = r7.a
            r1 = 34
            r0.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L3a
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            java.lang.String[] r6 = io.sentry.vendor.gson.stream.b.i
            r5 = r6[r5]
            if (r5 != 0) goto L2b
            goto L37
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L37
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L32
            int r6 = r3 - r4
            r0.write(r8, r4, r6)
        L32:
            r0.write(r5)
            int r4 = r3 + 1
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            if (r4 >= r2) goto L40
            int r2 = r2 - r4
            r0.write(r8, r4, r2)
        L40:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.b.y(java.lang.String):void");
    }
}
