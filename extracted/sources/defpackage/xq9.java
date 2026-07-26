package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.t0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq9 extends ei9 implements qx9 {
    public static final /* synthetic */ int p = 0;
    public final int o;

    public xq9(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        rq4.i(bArr.length == 25);
        this.o = Arrays.hashCode(bArr);
    }

    public static byte[] q0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.qx9
    public final int c() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        kg3 kg3VarI;
        if (obj instanceof qx9) {
            try {
                qx9 qx9Var = (qx9) obj;
                if (qx9Var.c() == this.o && (kg3VarI = qx9Var.i()) != null) {
                    return Arrays.equals(p0(), (byte[]) dr5.q0(kg3VarI));
                }
            } catch (RemoteException e) {
                t0.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.o;
    }

    @Override // defpackage.qx9
    public final kg3 i() {
        return new dr5(p0());
    }

    @Override // defpackage.ei9
    public final boolean o0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            kg3 kg3VarI = i();
            parcel2.writeNoException();
            jm9.b(parcel2, kg3VarI);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.o);
        return true;
    }

    public abstract byte[] p0();
}
