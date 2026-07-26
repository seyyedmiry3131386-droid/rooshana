package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class es8 {
    public static volatile z91 e;
    public final wt0 a;
    public final wt0 b;
    public final df7 c;
    public final v24 d;

    public es8(wt0 wt0Var, wt0 wt0Var2, df7 df7Var, v24 v24Var, o77 o77Var) {
        this.a = wt0Var;
        this.b = wt0Var2;
        this.c = df7Var;
        this.d = v24Var;
        ((Executor) o77Var.a).execute(new kb8(5, o77Var));
    }

    public static es8 a() {
        z91 z91Var = e;
        if (z91Var != null) {
            return (es8) z91Var.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (es8.class) {
                try {
                    if (e == null) {
                        w5 w5Var = new w5();
                        context.getClass();
                        w5Var.a = context;
                        e = w5Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final ds8 c(n12 n12Var) {
        byte[] bytes;
        Set setUnmodifiableSet = n12Var != null ? DesugarCollections.unmodifiableSet(yj0.d) : Collections.singleton(new u12("proto"));
        wv8 wv8VarA = d30.a();
        n12Var.getClass();
        wv8VarA.c = "cct";
        yj0 yj0Var = (yj0) n12Var;
        String str = yj0Var.a;
        String str2 = yj0Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = dw1.o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        wv8VarA.b = bytes;
        return new ds8(setUnmodifiableSet, wv8VarA.l(), this);
    }
}
