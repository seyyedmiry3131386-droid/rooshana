package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.i;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.state.ToggleableState;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ir.myket.network.model.ErrorDto;
import ir.myket.player.domain.models.PlayerMovieData;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.net.ssl.SSLHandshakeException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.SerializationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class js3 implements s12, yl7 {
    public static final float[] a = new float[91];
    public static final yg2 b = new yg2(15);
    public static final dv3 c = new dv3(2);
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;

    public static final float A(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final y97 B(Throwable th) {
        j77 j77Var;
        String lowerCase;
        String strA;
        Uri uri;
        String scheme;
        p(th, "throwable");
        if (th instanceof NullPointerException) {
            return new rp5();
        }
        if (th instanceof SerializationException) {
            return new yu3();
        }
        if (!(th instanceof HttpException)) {
            return th instanceof SocketTimeoutException ? new f18() : th instanceof SSLHandshakeException ? new tb7() : th instanceof IOException ? new hg3() : new qo5();
        }
        HttpException httpException = (HttpException) th;
        try {
            h77 h77Var = httpException.b;
            int i = httpException.a;
            String str = null;
            if (300 <= i && i < 400) {
                List listC = br9.C("http", "https");
                if (h77Var == null || (strA = h77Var.a.f.a("location")) == null || (uri = Uri.parse(strA)) == null || (scheme = uri.getScheme()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = scheme.toLowerCase(Locale.ROOT);
                    o(lowerCase, "toLowerCase(...)");
                }
                if (!a.h0(listC, lowerCase)) {
                    return new to5(i);
                }
            }
            String strK = (h77Var == null || (j77Var = h77Var.c) == null) ? null : j77Var.k();
            if (strK != null && !f88.n0(strK)) {
                str = strK;
            }
            if (str == null) {
                return new z02();
            }
            ou3 ou3Var = pu3.d;
            ou3Var.getClass();
            ErrorDto errorDto = (ErrorDto) ou3Var.a(ErrorDto.Companion.serializer(), str);
            p(errorDto, "<this>");
            return new je3(new ke3(errorDto.getMessageCode(), errorDto.getCode(), i, errorDto.getTranslatedMessage(), 112));
        } catch (Throwable unused) {
            return new yu3();
        }
    }

    public static final boolean C(e71 e71Var) {
        wt3 wt3Var = (wt3) e71Var.getCoroutineContext().r0(th0.n);
        if (wt3Var != null) {
            return wt3Var.b();
        }
        return true;
    }

    public static final boolean D(long j) {
        return (j & 2) != 0;
    }

    public static final boolean E(long j) {
        return (j & 1) != 0;
    }

    public static boolean F(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final hx4 G(hx4 hx4Var, rp2 rp2Var) {
        return hx4Var.d(new y04(rp2Var));
    }

    public static byte[] L(int i, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(rm7.n(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static final int M(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public static byte[] N(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long O(int i, InputStream inputStream) throws IOException {
        byte[] bArrL = L(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrL[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final Object P(Object obj) {
        return obj instanceof rx0 ? b.a(((rx0) obj).a) : obj;
    }

    public static final void Q(Object[] objArr, int i, int i2) {
        p(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final vq3 R(sy6 sy6Var) {
        return new vq3(Math.round(sy6Var.a), Math.round(sy6Var.b), Math.round(sy6Var.c), Math.round(sy6Var.d));
    }

    public static void S(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void T(String str, zw3 zw3Var) {
        String string;
        p(zw3Var, "baseClass");
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        ps0 ps0Var = (ps0) zw3Var;
        sb.append(ps0Var.d());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = rm7.m('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbT = rm7.t("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            o40.I(str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '", sbT);
            sbT.append(ps0Var.d());
            sbT.append("' has to be sealed and '@Serializable'.");
            string = sbT.toString();
        }
        throw new SerializationException(string);
    }

    public static void U() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void V(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(o40.y("lateinit property ", str, " has not been initialized"));
        S(uninitializedPropertyAccessException, js3.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static final hx4 W(ToggleableState toggleableState, ab5 ab5Var, boolean z, v97 v97Var, bp2 bp2Var) {
        return new ks8(toggleableState, ab5Var, z, v97Var, bp2Var);
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final e51 a(w61 w61Var) {
        if (w61Var.r0(th0.n) == null) {
            w61Var = w61Var.l0(kotlinx.coroutines.a.a());
        }
        return new e51(w61Var);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        Z(byteArrayOutputStream, i, 2);
    }

    public static final void b(hx4 hx4Var, xc6 xc6Var, PlayerMovieData playerMovieData, dp2 dp2Var, dl5 dl5Var, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        p(xc6Var, "playerConfig");
        p(playerMovieData, "playerMovieData");
        p(dl5Var, "navigationStateManager");
        qz0Var.c0(-1597911651);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(xc6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(playerMovieData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? qz0Var.f(dl5Var) : qz0Var.h(dl5Var) ? 16384 : 8192;
        }
        if (qz0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) qz0Var.j(e.b);
            i iVar = uj8.a;
            Object objJ = qz0Var.j(iVar);
            m(objJ);
            long j = ((tj8) objJ).l;
            ka7 ka7Var = la7.a;
            ex4 ex4Var = ex4.b;
            hx4 hx4VarF = rq4.f(ex4Var, j, ka7Var);
            cb7 cb7VarA = bb7.a(tt3.a, eq.m, qz0Var, 54);
            long j2 = qz0Var.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarF);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cb7VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            hx4 hx4VarL = androidx.compose.foundation.layout.b.l(ex4Var, ml9.q(hq6.action_button_width_landscape, qz0Var));
            int i4 = br6.player_ic_share;
            int i5 = i2 & 7168;
            boolean zH = qz0Var.h(playerMovieData) | (i5 == 2048) | qz0Var.h(context);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (zH || objM == obj) {
                objM = new fy(playerMovieData, dp2Var, context, 1);
                qz0Var.l0(objM);
            }
            tv8.a(hx4VarL, i4, (bp2) objM, qz0Var, 0);
            hx4 hx4VarL2 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.d(ex4Var, ml9.q(hq6.icon_size_small, qz0Var)), ml9.q(hq6.size_1, qz0Var));
            Object objJ2 = qz0Var.j(iVar);
            m(objJ2);
            int i6 = i2;
            tt3.i(hx4VarL2, 0.0f, ((tj8) objJ2).r, qz0Var, 0, 2);
            int i7 = br6.player_ic_settings;
            boolean z = ((i6 & 112) == 32) | ((i6 & 57344) == 16384 || ((i6 & 32768) != 0 && qz0Var.h(dl5Var)));
            Object objM2 = qz0Var.M();
            if (z || objM2 == obj) {
                objM2 = new xv3(dl5Var, xc6Var, 1);
                qz0Var.l0(objM2);
            }
            tv8.a(hx4VarL, i7, (bp2) objM2, qz0Var, 0);
            hx4 hx4VarL3 = androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.b.d(ex4Var, ml9.q(hq6.icon_size_small, qz0Var)), ml9.q(hq6.size_1, qz0Var));
            Object objJ3 = qz0Var.j(iVar);
            m(objJ3);
            tt3.i(hx4VarL3, 0.0f, ((tj8) objJ3).r, qz0Var, 0, 2);
            int i8 = br6.player_ic_lock;
            boolean z2 = i5 == 2048;
            Object objM3 = qz0Var.M();
            if (z2 || objM3 == obj) {
                objM3 = new ba(5, dp2Var);
                qz0Var.l0(objM3);
            }
            tv8.a(hx4VarL, i8, (bp2) objM3, qz0Var, 0);
            qz0Var.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new y5(hx4Var2, xc6Var, playerMovieData, dp2Var, dl5Var, i, 4);
        }
    }

    public static final e51 c() {
        ub8 ub8VarA = a27.a();
        ug1 ug1Var = up1.a;
        return new e51(bt2.L(ub8VarA, sg4.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.hx4 r14, java.lang.String r15, final defpackage.pj3 r16, defpackage.bp2 r17, androidx.compose.material3.n r18, defpackage.rp2 r19, defpackage.qz0 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js3.d(hx4, java.lang.String, pj3, bp2, androidx.compose.material3.n, rp2, qz0, int, int):void");
    }

    public static final String g(Object[] objArr, int i, int i2, q1 q1Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == q1Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        o(string, "toString(...)");
        return string;
    }

    public static boolean h(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean i(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void j(e71 e71Var, CancellationException cancellationException) {
        wt3 wt3Var = (wt3) e71Var.getCoroutineContext().r0(th0.n);
        if (wt3Var != null) {
            wt3Var.g(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e71Var).toString());
        }
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        S(nullPointerException, js3.class.getName());
        throw nullPointerException;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        S(nullPointerException, js3.class.getName());
        throw nullPointerException;
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        S(nullPointerException, js3.class.getName());
        throw nullPointerException;
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = js3.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sbT = rm7.t("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbT.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbT.toString());
            S(nullPointerException, js3.class.getName());
            throw nullPointerException;
        }
    }

    public static void q(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbR = rm7.r(i, "radix ", " was not in valid range ");
            sbR.append(new uq3(2, 36, 1));
            throw new IllegalArgumentException(sbR.toString());
        }
    }

    public static int r(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int s(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final int t(long j, long j2) {
        boolean zE = E(j);
        if (zE != E(j2)) {
            return zE ? -1 : 1;
        }
        return (Math.min(A(j), A(j2)) >= 0.0f && D(j) != D(j2)) ? D(j) ? -1 : 1 : (int) Math.signum(A(j) - A(j2));
    }

    public static byte[] u(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final Object v(qp2 qp2Var, g51 g51Var) {
        mf7 mf7Var = new mf7(g51Var, g51Var.getContext());
        Object objU = b47.u(mf7Var, true, mf7Var, qp2Var);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    public static final boolean x(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final px3 y(y1 y1Var, tz0 tz0Var, String str) {
        p(y1Var, "<this>");
        px3 px3VarA = y1Var.a(tz0Var, str);
        if (px3VarA != null) {
            return px3VarA;
        }
        T(str, y1Var.c());
        throw null;
    }

    public static final px3 z(y1 y1Var, q12 q12Var, Object obj) {
        p(y1Var, "<this>");
        p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        px3 px3VarB = y1Var.b(q12Var, obj);
        if (px3VarB != null) {
            return px3VarB;
        }
        ps0 ps0VarA = g27.a(obj.getClass());
        zw3 zw3VarC = y1Var.c();
        p(zw3VarC, "baseClass");
        String strD = ps0VarA.d();
        if (strD == null) {
            strD = String.valueOf(ps0VarA);
        }
        T(strD, zw3VarC);
        throw null;
    }

    public abstract int H(int i);

    public abstract int K(int i);

    public abstract void X(ByteBuffer byteBuffer);

    public abstract void Y(byte[] bArr, int i, int i2);

    @Override // defpackage.yl7
    public int e(int i) {
        int iH = H(i);
        if (iH == -1 || H(iH) == -1) {
            return -1;
        }
        return iH;
    }

    @Override // defpackage.yl7
    public int f(int i) {
        int iK = K(i);
        if (iK == -1 || K(iK) == -1) {
            return -1;
        }
        return iK;
    }

    @Override // defpackage.yl7
    public int k(int i) {
        return K(i);
    }

    @Override // defpackage.yl7
    public int l(int i) {
        return H(i);
    }

    public abstract Map w();

    public void J() {
    }

    public void I(FloatingActionButton floatingActionButton) {
    }
}
