package com.microsoft.clarity.g;

import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.bp2;
import defpackage.f88;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends Lambda implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ H b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(int i, H h) {
        super(0);
        this.a = i;
        this.b = h;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws RemoteException {
        if (this.a == 0) {
            ReferrerDetails installReferrer = this.b.a.getInstallReferrer();
            String installReferrer2 = installReferrer.getInstallReferrer();
            String str = installReferrer2 == null ? "" : installReferrer2;
            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
            long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
            long referrerClickTimestampServerSeconds = installReferrer.getReferrerClickTimestampServerSeconds();
            long installBeginTimestampServerSeconds = installReferrer.getInstallBeginTimestampServerSeconds();
            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
            String installVersion = installReferrer.getInstallVersion();
            String str2 = installVersion == null ? "" : installVersion;
            if (referrerClickTimestampSeconds != 0 && installBeginTimestampSeconds != 0 && !f88.n0(str)) {
                this.b.c.invoke(new T(str, referrerClickTimestampSeconds, installBeginTimestampSeconds, referrerClickTimestampServerSeconds, installBeginTimestampServerSeconds, googlePlayInstantParam, str2));
                this.b.a.endConnection();
                SharedPreferences.Editor editorEdit = this.b.b.edit();
                editorEdit.putBoolean("INSTALL_REFERRER_DETAILS_RETRIEVED", true);
                editorEdit.apply();
            }
        }
        return tx8.a;
    }
}
