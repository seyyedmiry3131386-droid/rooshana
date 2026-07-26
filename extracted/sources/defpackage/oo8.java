package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class oo8 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final z21 b;
    public final on c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final mo8 h;
    public final wv e = new wv(0);
    public boolean g = false;

    public oo8(FirebaseMessaging firebaseMessaging, z21 z21Var, mo8 mo8Var, on onVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = z21Var;
        this.h = mo8Var;
        this.c = onVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(ox9 ox9Var) throws IOException {
        try {
            z67.b(ox9Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        on onVar = this.c;
        a(onVar.i(onVar.w(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        on onVar = this.c;
        a(onVar.i(onVar.w(strA, "/topics/" + str, bundle)));
    }

    public final void d(ko8 ko8Var) {
        synchronized (this.e) {
            try {
                String str = ko8Var.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    cf8 cf8Var = (cf8) arrayDeque.poll();
                    if (cf8Var != null) {
                        cf8Var.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void e(boolean z) {
        this.g = z;
    }

    public final boolean f() throws IOException {
        ko8 ko8VarA;
        while (true) {
            synchronized (this) {
                try {
                    ko8VarA = this.h.a();
                    if (ko8VarA == null) {
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = ko8VarA.b;
                String str2 = ko8VarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                    }
                } else if (str.equals("S")) {
                    b(str2);
                }
                this.h.c(ko8VarA);
                d(ko8VarA);
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    t0.d("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                t0.d("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
    }

    public final void g(long j2) {
        this.f.schedule(new qo8(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        e(true);
    }
}
