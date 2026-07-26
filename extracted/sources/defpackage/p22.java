package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p22 implements bp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p22(int i, String str, q22 q22Var) {
        this.b = i;
        this.c = str;
        this.d = q22Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                String str = (String) this.c;
                q22 q22Var = (q22) this.d;
                int i = this.b;
                no7[] no7VarArr = new no7[i];
                for (int i2 = 0; i2 < i; i2++) {
                    no7VarArr[i2] = z27.d(str + '.' + q22Var.e[i2], g98.e, new no7[0]);
                }
                return no7VarArr;
            default:
                ae3 ae3Var = (ae3) this.c;
                try {
                    ae3Var.w.D(this.b, (ErrorCode) this.d);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.d;
                    ae3Var.b(errorCode, errorCode, e);
                }
                return tx8.a;
        }
    }

    public /* synthetic */ p22(ae3 ae3Var, int i, ErrorCode errorCode) {
        this.c = ae3Var;
        this.b = i;
        this.d = errorCode;
    }
}
