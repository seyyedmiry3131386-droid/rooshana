package okhttp3.internal.publicsuffix;

import defpackage.bl4;
import defpackage.br9;
import defpackage.dx1;
import defpackage.f88;
import defpackage.fv;
import defpackage.ho7;
import defpackage.ix1;
import defpackage.js3;
import defpackage.mo7;
import defpackage.on;
import defpackage.sl3;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import okio.ByteString;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final ByteString b;
    public static final List c;
    public static final PublicSuffixDatabase d;
    public final on a;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        js3.o(bArrCopyOf, "copyOf(...)");
        b = new ByteString(bArrCopyOf);
        c = br9.B(Marker.ANY_MARKER);
        d = new PublicSuffixDatabase(new on(1));
    }

    public PublicSuffixDatabase(on onVar) {
        this.a = onVar;
    }

    public static List b(String str) {
        List listZ0 = f88.z0(str, new char[]{'.'});
        return js3.i(a.u0(listZ0), "") ? a.k0(listZ0) : listZ0;
    }

    public final String a(String str) {
        String strM;
        String strM2;
        String strM3;
        List listZ0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        js3.m(unicode);
        List listB = b(unicode);
        on onVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) onVar.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) onVar.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        onVar.t();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        onVar.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((ByteString) onVar.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(onVar.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) onVar.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i = 0; i < size3; i++) {
            ByteString byteString = ByteString.d;
            byteStringArr[i] = fv.w((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strM = null;
                break;
            }
            ByteString byteString2 = (ByteString) onVar.c;
            if (byteString2 == null) {
                js3.V("bytes");
                throw null;
            }
            strM = sl3.m(byteString2, byteStringArr, i2);
            if (strM != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                byteStringArr2[i3] = b;
                ByteString byteString3 = (ByteString) onVar.c;
                if (byteString3 == null) {
                    js3.V("bytes");
                    throw null;
                }
                strM2 = sl3.m(byteString3, byteStringArr2, i3);
                if (strM2 != null) {
                    break;
                }
            }
            strM2 = null;
        } else {
            strM2 = null;
        }
        if (strM2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                ByteString byteString4 = (ByteString) onVar.d;
                if (byteString4 == null) {
                    js3.V("exceptionBytes");
                    throw null;
                }
                strM3 = sl3.m(byteString4, byteStringArr, i5);
                if (strM3 != null) {
                    break;
                }
            }
            strM3 = null;
        } else {
            strM3 = null;
        }
        if (strM3 != null) {
            listZ0 = f88.z0("!".concat(strM3), new char[]{'.'});
        } else if (strM == null && strM2 == null) {
            listZ0 = c;
        } else {
            List listZ02 = strM != null ? f88.z0(strM, new char[]{'.'}) : EmptyList.a;
            listZ0 = strM2 != null ? f88.z0(strM2, new char[]{'.'}) : EmptyList.a;
            if (listZ02.size() > listZ0.size()) {
                listZ0 = listZ02;
            }
        }
        if (listB.size() == listZ0.size() && ((String) listZ0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listZ0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listZ0.size();
        } else {
            size = listB.size();
            size2 = listZ0.size() + 1;
        }
        int i6 = size - size2;
        ho7 ho7VarE0 = a.e0(b(str));
        if (i6 < 0) {
            throw new IllegalArgumentException(bl4.q(i6, "Requested element count ", " is less than zero.").toString());
        }
        if (i6 != 0) {
            ho7VarE0 = ho7VarE0 instanceof ix1 ? ((ix1) ho7VarE0).a(i6) : new dx1(ho7VarE0, i6);
        }
        return mo7.t(ho7VarE0, ".");
    }
}
