package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o29 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static o29 d;
    public final ql3 a;

    public o29(ql3 ql3Var) {
        this.a = ql3Var;
    }

    public final boolean a(x20 x20Var) {
        if (TextUtils.isEmpty(x20Var.c)) {
            return true;
        }
        long j = x20Var.f + x20Var.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
