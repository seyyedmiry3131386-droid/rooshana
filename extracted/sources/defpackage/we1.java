package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class we1 implements iy2, jy2 {
    public final d24 a;
    public final Context b;
    public final qn6 c;
    public final Set d;
    public final Executor e;

    public we1(Context context, String str, Set set, qn6 qn6Var, Executor executor) {
        this.a = new d24(new qy0(context, str, 1));
        this.d = set;
        this.e = executor;
        this.c = qn6Var;
        this.b = context;
    }

    public final synchronized HeartBeatInfo$HeartBeat a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ky2 ky2Var = (ky2) this.a.get();
        if (!ky2Var.i(jCurrentTimeMillis)) {
            return HeartBeatInfo$HeartBeat.NONE;
        }
        ky2Var.g();
        return HeartBeatInfo$HeartBeat.GLOBAL;
    }

    public final ox9 b() {
        if (Build.VERSION.SDK_INT >= 24 ? jr9.v(this.b) : true) {
            return z67.c(this.e, new ve1(this, 0));
        }
        return z67.g("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            z67.g(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? jr9.v(this.b) : true) {
            z67.c(this.e, new ve1(this, 1));
        } else {
            z67.g(null);
        }
    }
}
