package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.firebase.installations.a;
import defpackage.ad2;
import defpackage.mn9;
import defpackage.rq4;
import defpackage.wn9;
import defpackage.xc2;
import defpackage.yo9;
import defpackage.z67;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final yo9 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsentStatus {
        public static final /* synthetic */ ConsentStatus[] a = {new ConsentStatus("GRANTED", 0), new ConsentStatus("DENIED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentStatus EF5;

        public static ConsentStatus valueOf(String str) {
            return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
        }

        public static ConsentStatus[] values() {
            return (ConsentStatus[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsentType {
        public static final /* synthetic */ ConsentType[] a = {new ConsentType("AD_STORAGE", 0), new ConsentType("ANALYTICS_STORAGE", 1), new ConsentType("AD_USER_DATA", 2), new ConsentType("AD_PERSONALIZATION", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentType EF5;

        public static ConsentType valueOf(String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        public static ConsentType[] values() {
            return (ConsentType[]) a.clone();
        }
    }

    public FirebaseAnalytics(yo9 yo9Var) {
        rq4.n(yo9Var);
        this.a = yo9Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(yo9.e(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        yo9 yo9VarE = yo9.e(context, bundle);
        if (yo9VarE == null) {
            return null;
        }
        return new mn9(yo9VarE);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = a.m;
            xc2 xc2VarC = xc2.c();
            xc2VarC.a();
            return (String) z67.b(((a) xc2VarC.d.get(ad2.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity2, String str, String str2) {
        zzdf zzdfVarU = zzdf.u(activity2);
        yo9 yo9Var = this.a;
        yo9Var.getClass();
        yo9Var.c(new wn9(yo9Var, zzdfVarU, str, str2));
    }
}
