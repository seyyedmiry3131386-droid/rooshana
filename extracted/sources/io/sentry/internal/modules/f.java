package io.sentry.internal.modules;

import android.content.Context;
import defpackage.kb8;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.u0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {
    public final /* synthetic */ int e = 1;
    public final Object f;

    public f(List list, u0 u0Var) {
        super(u0Var);
        this.f = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        int i = this.e;
        u0 u0Var = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            u0Var.i(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapC = c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapC;
                        }
                    } catch (Throwable th) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                    break;
                } catch (IOException e) {
                    u0Var.f(SentryLevel.INFO, "Access to resources failed.", e);
                } catch (SecurityException e2) {
                    u0Var.f(SentryLevel.INFO, "Access to resources denied.", e2);
                }
                return treeMap;
            case 1:
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapC2 = c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapC2;
                    } catch (Throwable th3) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            break;
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    u0Var.i(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e3) {
                    u0Var.f(SentryLevel.ERROR, "Error extracting modules.", e3);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map mapA = ((a) it.next()).a();
                    if (mapA != null) {
                        treeMap3.putAll(mapA);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u0 u0Var) {
        super(u0Var);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f = io.sentry.config.a.e(classLoader);
    }

    public f(Context context, SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions.getLogger());
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        try {
            sentryAndroidOptions.getExecutorService().submit(new kb8(16, this));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "AssetsModulesLoader submit failed", th);
        }
    }
}
