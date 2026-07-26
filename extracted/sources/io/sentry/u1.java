package io.sentry;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.f09;
import defpackage.js3;
import io.sentry.clientreport.DiscardReason;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u1 implements w1, io.sentry.util.d, w3, io.sentry.transport.f, g4, z3 {
    public final /* synthetic */ int a;

    public /* synthetic */ u1(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo h(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    @Override // io.sentry.w3
    public void a(i6 i6Var) {
    }

    @Override // io.sentry.transport.f
    public long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.d
    public Object c() {
        long j = 0;
        int i = 0;
        switch (this.a) {
            case 1:
                return b6.empty();
            case 2:
                return b6.empty();
            case 4:
                return new j4();
            case 5:
                byte[] bArr = new byte[8];
                io.sentry.util.i.a().b(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                while (i < 8) {
                    long j2 = (j << 8) | ((long) (bArr[i] & 255));
                    i++;
                    j = j2;
                }
                char[] cArr = new char[16];
                io.sentry.util.m.a(cArr, j);
                return new String(cArr);
            case 7:
                return new FrameMetricsAggregator();
            case 16:
                try {
                    return Build.MODEL.split(" ", -1)[0];
                } catch (Throwable unused) {
                    SentryLevel sentryLevel = SentryLevel.DEBUG;
                    return null;
                }
            case 19:
                return new Timer(true);
            case 25:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (DiscardReason discardReason : DiscardReason.values()) {
                    for (DataCategory dataCategory : DataCategory.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(discardReason.getReason(), dataCategory.getCategory()), new AtomicLong(0L));
                    }
                }
                return DesugarCollections.unmodifiableMap(concurrentHashMap);
            default:
                return io.sentry.config.a.x();
        }
    }

    @Override // io.sentry.g4
    public void d(b6 b6Var) {
        AutoClosableReentrantLock autoClosableReentrantLock = io.sentry.android.core.f1.b;
    }

    @Override // io.sentry.w1
    public Object e() {
        return null;
    }

    public Object f(Context context) {
        String string;
        switch (this.a) {
            case 11:
                return io.sentry.android.core.i0.b(context);
            case 12:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 13:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    return string;
                } catch (Throwable unused2) {
                    return null;
                }
            case 14:
                return io.sentry.android.core.i0.a(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.z3
    public void g(a1 a1Var) {
        switch (this.a) {
            case 24:
                js3.p(a1Var, "it");
                a1Var.l(io.sentry.protocol.v.b);
                break;
            default:
                a1Var.F(new f09(25, a1Var));
                break;
        }
    }
}
