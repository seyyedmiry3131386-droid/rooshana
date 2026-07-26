package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.bumptech.glide.a;
import ir.mservices.market.receivers.InAppBillingReceiver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class fv implements dv, b18, jb0, r12, v61, q41, pc7, x72, h82, t57 {
    public final /* synthetic */ int a;

    public /* synthetic */ fv(int i) {
        this.a = i;
    }

    public static long A(dc0 dc0Var) {
        Throwable cause = (IOException) dc0Var.c;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i = DataSourceException.b;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((dc0Var.b - 1) * 1000, 5000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(defpackage.f02 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.B(f02, android.text.Editable, int, int, boolean):boolean");
    }

    public static ByteString C(byte[] bArr) {
        ByteString byteString = ByteString.d;
        int length = bArr.length;
        wq2.m(bArr.length, 0, length);
        return new ByteString(ew.D0(bArr, 0, length));
    }

    public static g74 D(List list) {
        return new g74(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    public static final Intent i(String str, String str2, Bundle bundle) {
        int i = InAppBillingReceiver.c;
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction(str2);
        intent.putExtras(bundle);
        return intent;
    }

    public static final gr0 j(fv fvVar, String str) {
        gr0 gr0Var = new gr0(str);
        gr0.d.put(str, gr0Var);
        return gr0Var;
    }

    public static final float n(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final void p(List list, StringBuilder sb) {
        sq3 sq3VarY = ok4.Y(2, ok4.Z(0, list.size()));
        int i = sq3VarY.a;
        int i2 = sq3VarY.b;
        int i3 = sq3VarY.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static ByteString r(String str) {
        int i;
        char cCharAt;
        js3.p(str, "<this>");
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArrCopyOf[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArrCopyOf[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                        js3.o(bArrCopyOf, "copyOf(...)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new ByteString(bArrCopyOf);
        }
        return null;
    }

    public static ByteString u(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (ja1.f(str.charAt(i2 + 1)) + (ja1.f(str.charAt(i2)) << 4));
        }
        return new ByteString(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r5 = java.lang.Float.parseFloat(r6.substring(0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r3 != r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r6 = r6.substring(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return new defpackage.r70(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.r70 v(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            goto L38
        L8:
            int r0 = r6.length()
            int r2 = r0 + (-1)
            r3 = r2
        Lf:
            r4 = -1
            if (r3 <= r4) goto L38
            char r4 = r6.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 == 0) goto L35
            int r4 = r3 + 1
            r5 = 0
            java.lang.String r5 = r6.substring(r5, r4)     // Catch: java.lang.NumberFormatException -> L38
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L38
            if (r3 != r2) goto L2b
            r6 = r1
            goto L2f
        L2b:
            java.lang.String r6 = r6.substring(r4, r0)     // Catch: java.lang.NumberFormatException -> L38
        L2f:
            r70 r0 = new r70     // Catch: java.lang.NumberFormatException -> L38
            r0.<init>(r6, r5)     // Catch: java.lang.NumberFormatException -> L38
            return r0
        L35:
            int r3 = r3 + (-1)
            goto Lf
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.v(java.lang.String):r70");
    }

    public static ByteString w(String str) {
        js3.p(str, "<this>");
        byte[] bytes = str.getBytes(zp0.a);
        js3.o(bytes, "getBytes(...)");
        ByteString byteString = new ByteString(bytes);
        byteString.c = str;
        return byteString;
    }

    public static ca4 y(ba4 ba4Var, dc0 dc0Var) {
        IOException iOException = (IOException) dc0Var.c;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).e;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && ba4Var.a - ba4Var.b > 1) {
            return new ca4(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.t57
    public s57 a(a aVar, t54 t54Var, v57 v57Var, Context context) {
        return new mt2(aVar, t54Var, v57Var, context);
    }

    @Override // defpackage.pc7
    public boolean b() {
        return true;
    }

    @Override // defpackage.q41
    public long d(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = ae7.a;
            return jFloatToRawIntBits;
        }
        float f = ml9.f(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        int i2 = ae7.a;
        return jFloatToRawIntBits2;
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.pc7
    public int g(long j) {
        return 0;
    }

    @Override // defpackage.pc7
    public int h(hh2 hh2Var, fc1 fc1Var, int i) {
        fc1Var.b = 4;
        return -4;
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.a) {
            jv.b(iArr, iArr2, false);
        } else {
            jv.c(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.x72
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.h82
    public void m(Object obj) {
        ((List) obj).clear();
    }

    @Override // defpackage.x72
    public cp8 o(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r12
    public boolean s(Object obj, File file, sv5 sv5Var) throws Throwable {
        try {
            lj0.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.x72
    public void t(kl7 kl7Var) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }

    public synchronized gr0 x(String str) {
        gr0 gr0Var;
        String strConcat;
        try {
            js3.p(str, "javaName");
            LinkedHashMap linkedHashMap = gr0.d;
            gr0Var = (gr0) linkedHashMap.get(str);
            if (gr0Var == null) {
                if (m88.Z(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    js3.o(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (m88.Z(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    js3.o(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gr0Var = (gr0) linkedHashMap.get(strConcat);
                if (gr0Var == null) {
                    gr0Var = new gr0(str);
                }
                linkedHashMap.put(str, gr0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gr0Var;
    }

    public int z(int i) {
        return i == 7 ? 6 : 3;
    }

    public fv(cv cvVar) {
        this.a = 28;
    }

    public fv() {
        this.a = 13;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // defpackage.pc7
    public void f() {
    }

    @Override // defpackage.jb0
    public long c(long j) {
        return j;
    }
}
