package defpackage;

import com.google.gson.JsonIOException;
import io.sentry.a1;
import io.sentry.protocol.v;
import io.sentry.util.d;
import io.sentry.util.k;
import io.sentry.z3;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k31 implements qq5, d, z3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ k31(v vVar, String str) {
        this.a = 5;
        this.b = str;
    }

    @Override // defpackage.qq5
    public Object a() {
        switch (this.a) {
            case 0:
                throw new JsonIOException(this.b);
            case 1:
                throw new JsonIOException(this.b);
            default:
                throw new JsonIOException(this.b);
        }
    }

    @Override // io.sentry.util.d
    public Object c() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 3:
                return str;
            default:
                Charset charset = k.a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        a1Var.y(this.b);
    }

    public /* synthetic */ k31(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
