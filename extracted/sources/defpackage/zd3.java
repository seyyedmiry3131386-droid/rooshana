package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class zd3 implements bp2 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public zd3(qa6 qa6Var, tu6 tu6Var) {
        this.b = qa6Var;
        this.c = tu6Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws Throwable {
        ErrorCode errorCode;
        Throwable th;
        switch (this.a) {
            case 0:
                ae3 ae3Var = (ae3) this.c;
                de3 de3Var = (de3) this.b;
                ErrorCode errorCode2 = ErrorCode.e;
                IOException e = null;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    errorCode = errorCode2;
                }
                if (!de3Var.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (de3Var.b(false, this));
                errorCode = ErrorCode.c;
                try {
                    try {
                        ae3Var.b(errorCode, ErrorCode.h, null);
                    } catch (IOException e3) {
                        e = e3;
                        ErrorCode errorCode3 = ErrorCode.d;
                        ae3Var.b(errorCode3, errorCode3, e);
                    }
                    gh9.b(de3Var);
                    return tx8.a;
                } catch (Throwable th4) {
                    th = th4;
                }
                errorCode = errorCode2;
                ae3Var.b(errorCode, errorCode2, e);
                gh9.b(de3Var);
                throw th;
            default:
                ((qa6) this.b).invoke(Integer.valueOf(((tu6) this.c).b));
                return tx8.a;
        }
    }

    public zd3(ae3 ae3Var, de3 de3Var) {
        this.c = ae3Var;
        this.b = de3Var;
    }
}
