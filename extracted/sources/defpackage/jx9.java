package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.a;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class jx9 implements yr3 {
    public static jx9 e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ jx9(Object obj, int i, Serializable serializable, Object obj2) {
        this.b = obj;
        this.a = i;
        this.c = serializable;
        this.d = obj2;
    }

    public static synchronized jx9 z(Context context) {
        try {
            if (e == null) {
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new oh5("MessengerIpcClient")));
                jx9 jx9Var = new jx9();
                jx9Var.d = new au9(jx9Var);
                jx9Var.a = 1;
                jx9Var.c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                jx9Var.b = context.getApplicationContext();
                e = jx9Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public synchronized ox9 A(kw9 kw9Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(kw9Var.toString());
            }
            if (!((au9) this.d).d(kw9Var)) {
                au9 au9Var = new au9(this);
                this.d = au9Var;
                au9Var.d(kw9Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kw9Var.b.a;
    }

    @Override // defpackage.yr3
    public void a(char c) throws IOException {
        byte[] bArr = (byte[]) this.c;
        if (c < 128) {
            if (bArr.length - this.a < 1) {
                g();
            }
            int i = this.a;
            this.a = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.a < 2) {
                g();
            }
            int i2 = this.a;
            int i3 = i2 + 1;
            this.a = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.a = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.a < 1) {
                g();
            }
            int i4 = this.a;
            this.a = i4 + 1;
            bArr[i4] = (byte) 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.a < 3) {
                g();
            }
            int i5 = this.a;
            int i6 = i5 + 1;
            this.a = i6;
            bArr[i5] = (byte) 224;
            int i7 = i5 + 2;
            this.a = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.a = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new JsonEncodingException(rm7.n(c, "Unexpected code point: "));
        }
        if (bArr.length - this.a < 4) {
            g();
        }
        int i8 = this.a;
        int i9 = i8 + 1;
        this.a = i9;
        bArr[i8] = (byte) 240;
        int i10 = i8 + 2;
        this.a = i10;
        bArr[i9] = (byte) 128;
        int i11 = i8 + 3;
        this.a = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.a = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    public rn6 b() {
        rq4.h("Must set register function", ((q37) this.b) != null);
        rq4.h("Must set unregister function", ((q37) this.c) != null);
        rq4.h("Must set holder", ((x41) this.d) != null);
        o94 o94Var = (o94) ((x41) this.d).b;
        rq4.o(o94Var, "Key must not be null");
        return new rn6(new cf0(this, (x41) this.d, this.a), new bn6(20, this, o94Var, false), 1);
    }

    public void c(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.d;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            js3.o(cArrCopyOf, "copyOf(...)");
            this.d = cArrCopyOf;
        }
    }

    @Override // defpackage.yr3
    public void d(String str) throws IOException {
        byte b;
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        c(0, str.length() + 2);
        char[] cArr = (char[]) this.d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            byte[] bArr = y78.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    c(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr2 = y78.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.d)[length2] = cCharAt;
                        length2 = i3;
                    } else {
                        if (b == 1) {
                            String str2 = y78.a[cCharAt];
                            js3.m(str2);
                            c(length2, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.d, length2);
                            length2 = str2.length() + length2;
                        } else {
                            char[] cArr2 = (char[]) this.d;
                            cArr2[length2] = '\\';
                            cArr2[length2 + 1] = (char) b;
                            length2 += 2;
                        }
                    }
                }
                c(length2, 1);
                char[] cArr3 = (char[]) this.d;
                cArr3[length2] = '\"';
                y(cArr3, length2 + 1);
                g();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        y(cArr, length + 2);
        g();
    }

    @Override // defpackage.yr3
    public void e(String str) throws IOException {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        int length = str.length();
        c(0, length);
        str.getChars(0, length, (char[]) this.d, 0);
        y((char[]) this.d, length);
    }

    public wi5 f(int i, wi5 wi5Var, wi5 wi5Var2, boolean z) {
        fj5 fj5Var = (fj5) this.b;
        m28 m28Var = (m28) this.c;
        wi5 wi5VarF = (wi5) m28Var.c(i);
        if (wi5Var2 != null) {
            if (js3.i(wi5VarF, wi5Var2) && js3.i(wi5VarF.c, wi5Var2.c)) {
                return wi5VarF;
            }
            wi5VarF = null;
        } else if (wi5VarF != null) {
            return wi5VarF;
        }
        if (z) {
            Iterator it = ((u21) mo7.p(new w0(3, m28Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    wi5VarF = null;
                    break;
                }
                wi5 wi5Var3 = (wi5) it.next();
                wi5VarF = (!(wi5Var3 instanceof fj5) || wi5Var3.equals(wi5Var)) ? null : ((fj5) wi5Var3).g.f(i, fj5Var, wi5Var2, true);
                if (wi5VarF != null) {
                    break;
                }
            }
        }
        if (wi5VarF != null) {
            return wi5VarF;
        }
        fj5 fj5Var2 = fj5Var.c;
        if (fj5Var2 == null || fj5Var2.equals(wi5Var)) {
            return null;
        }
        fj5 fj5Var3 = fj5Var.c;
        js3.m(fj5Var3);
        return fj5Var3.g.f(i, fj5Var, wi5Var2, z);
    }

    public void g() throws IOException {
        ((ByteArrayOutputStream) this.b).write((byte[]) this.c, 0, this.a);
        this.a = 0;
    }

    public int h() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public int i() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : xg.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int j() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : xg.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public vi5 k(vi5 vi5Var, pa2 pa2Var, boolean z, wi5 wi5Var) {
        vi5 vi5VarM;
        fj5 fj5Var = (fj5) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = fj5Var.iterator();
        while (true) {
            gj5 gj5Var = (gj5) it;
            if (!gj5Var.hasNext()) {
                break;
            }
            wi5 wi5Var2 = (wi5) gj5Var.next();
            vi5VarM = js3.i(wi5Var2, wi5Var) ? null : wi5Var2.f(pa2Var);
            if (vi5VarM != null) {
                arrayList.add(vi5VarM);
            }
        }
        vi5 vi5Var2 = (vi5) a.w0(arrayList);
        fj5 fj5Var2 = fj5Var.c;
        if (fj5Var2 != null && z && !fj5Var2.equals(wi5Var)) {
            vi5VarM = fj5Var2.m(pa2Var, fj5Var);
        }
        return (vi5) a.w0(ew.J0(new vi5[]{vi5Var, vi5Var2, vi5VarM}));
    }

    public Looper l() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    vy2.s(this.a == 0 && ((HandlerThread) this.d) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.c = ((HandlerThread) this.d).getLooper();
                }
                this.a++;
                looper = (Looper) this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void m() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                vy2.s(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void o(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            da9.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(te.W(i)));
        }
    }

    public void p(long j) {
        ((Paint) this.b).setColor(gu9.E(j));
    }

    public void q(tc0 tc0Var) {
        this.d = tc0Var;
        ((Paint) this.b).setColorFilter(tc0Var != null ? tc0Var.a : null);
    }

    public void r(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public void s(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void t(int i) {
        fj5 fj5Var = (fj5) this.b;
        if (i != fj5Var.b.a) {
            this.a = i;
            this.d = null;
        } else {
            throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + fj5Var).toString());
        }
    }

    public void u(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void v(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void w(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    @Override // defpackage.yr3
    public void writeLong(long j) throws IOException {
        e(String.valueOf(j));
    }

    public void x(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void y(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.c;
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            StringBuilder sbR = rm7.r(i, "count > string.length: ", " > ");
            sbR.append(cArr.length);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.a < 1) {
                    g();
                }
                int i3 = this.a;
                int i4 = i3 + 1;
                this.a = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.a;
                        this.a = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.a < 2) {
                        g();
                    }
                    int i6 = this.a;
                    int i7 = i6 + 1;
                    this.a = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.a = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.a < 3) {
                        g();
                    }
                    int i8 = this.a;
                    int i9 = i8 + 1;
                    this.a = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.a = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.a = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.a < 1) {
                            g();
                        }
                        int i12 = this.a;
                        this.a = i12 + 1;
                        bArr[i12] = (byte) 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.a < 4) {
                            g();
                        }
                        int i14 = this.a;
                        int i15 = i14 + 1;
                        this.a = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.a = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.a = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.a = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public jx9(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public jx9(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.d = bArr;
    }
}
