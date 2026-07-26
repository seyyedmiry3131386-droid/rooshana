package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mo8 {
    public static WeakReference d;
    public final SharedPreferences a;
    public rb4 b;
    public final ScheduledThreadPoolExecutor c;

    public mo8(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized ko8 a() {
        ko8 ko8Var;
        String strH = this.b.H();
        Pattern pattern = ko8.d;
        ko8Var = null;
        if (!TextUtils.isEmpty(strH)) {
            String[] strArrSplit = strH.split("!", -1);
            if (strArrSplit.length == 2) {
                ko8Var = new ko8(strArrSplit[0], strArrSplit[1]);
            }
        }
        return ko8Var;
    }

    public final synchronized void b() {
        this.b = rb4.m(this.a, this.c);
    }

    public final synchronized void c(ko8 ko8Var) {
        this.b.I(ko8Var.c);
    }
}
