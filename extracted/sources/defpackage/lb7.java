package defpackage;

import android.os.Build;
import android.view.View;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class lb7 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final long a(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = lq8.c;
        return jFloatToRawIntBits;
    }

    public static k30 d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new k30(aq3.j(view));
        }
        return null;
    }

    public static final ll e(zh8 zh8Var) {
        ll llVar = zh8Var.a;
        long j = zh8Var.b;
        llVar.getClass();
        return llVar.subSequence(zi8.g(j), zi8.f(j));
    }

    public static final ll f(zh8 zh8Var, int i) {
        ll llVar = zh8Var.a;
        ll llVar2 = zh8Var.a;
        long j = zh8Var.b;
        int iF = zi8.f(j);
        int iF2 = zi8.f(j);
        int length = iF2 + i;
        if (((i ^ length) & (iF2 ^ length)) < 0) {
            length = llVar2.b.length();
        }
        return llVar.subSequence(iF, Math.min(length, llVar2.b.length()));
    }

    public static final ll g(zh8 zh8Var, int i) {
        ll llVar = zh8Var.a;
        long j = zh8Var.b;
        int iG = zi8.g(j);
        int i2 = iG - i;
        if (((iG ^ i2) & (i ^ iG)) < 0) {
            i2 = 0;
        }
        return llVar.subSequence(Math.max(0, i2), zi8.g(j));
    }

    public static boolean h(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static String i(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final void j(String str) {
        js3.p(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void k(String str) {
        js3.p(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void l(String str) {
        js3.p(str, "message");
        throw new NoSuchElementException(str);
    }

    public static String m(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(n(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(n(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String n(Object obj) {
        if (obj == null) {
            return Ssh2PublicKeyAlgorithmName.NULL;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strZ = bl4.z(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strZ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strZ.length() + 8 + name2.length() + 1);
            o40.I(SimpleComparison.LESS_THAN_OPERATION, strZ, " threw ", name2, sb);
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
            return sb.toString();
        }
    }

    public jv4 b(mv4 mv4Var) {
        ByteBuffer byteBuffer = mv4Var.e;
        byteBuffer.getClass();
        vy2.j(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return c(mv4Var, byteBuffer);
    }

    public abstract jv4 c(mv4 mv4Var, ByteBuffer byteBuffer);
}
