package com.microsoft.clarity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.a.C0042a;
import com.microsoft.clarity.a.C0043b;
import com.microsoft.clarity.a.C0044c;
import com.microsoft.clarity.a.C0045d;
import com.microsoft.clarity.models.ApplicationFramework;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.q.l;
import defpackage.bp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import defpackage.o27;
import defpackage.qp2;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class ClarityConfig {
    private ApplicationFramework applicationFramework;
    private qp2 customSignalsCallback;
    private boolean frozen;
    private LogLevel logLevel;
    private final String projectId;
    private String userId;

    public ClarityConfig(String str, String str2, LogLevel logLevel, ApplicationFramework applicationFramework, qp2 qp2Var) {
        js3.p(str, "projectId");
        js3.p(logLevel, "logLevel");
        js3.p(applicationFramework, "applicationFramework");
        this.projectId = str;
        this.userId = str2;
        this.logLevel = logLevel;
        this.applicationFramework = applicationFramework;
        this.customSignalsCallback = qp2Var;
    }

    private final void setProperty(bp2 bp2Var) {
        if (this.frozen) {
            l.c("Clarity config cannot be modified after initialization.");
        } else {
            bp2Var.invoke();
        }
    }

    public final void freeze$sdk_prodRelease() {
        this.frozen = true;
    }

    public final ApplicationFramework getApplicationFramework() {
        return this.applicationFramework;
    }

    public final qp2 getCustomSignalsCallback() {
        return this.customSignalsCallback;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isCordova$sdk_prodRelease() {
        return this.applicationFramework == ApplicationFramework.Cordova;
    }

    public final boolean isIonic$sdk_prodRelease() {
        return this.applicationFramework == ApplicationFramework.Ionic;
    }

    public final boolean isReactNative$sdk_prodRelease() {
        return this.applicationFramework == ApplicationFramework.ReactNative;
    }

    public final boolean isValidProjectId$sdk_prodRelease() {
        if (!f88.n0(this.projectId)) {
            String str = this.projectId;
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        break;
                    }
                    i++;
                } else if (m88.b0(36, this.projectId) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isValidUserId$sdk_prodRelease() {
        String str;
        if (this.userId != null && (!f88.n0(r0)) && (str = this.userId) != null) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    String str2 = this.userId;
                    if ((str2 != null ? o27.l(36, str2) : null) != null) {
                        return true;
                    }
                } else {
                    if (Character.isUpperCase(str.charAt(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final void setApplicationFramework(ApplicationFramework applicationFramework) {
        js3.p(applicationFramework, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        setProperty(new C0042a(this, applicationFramework));
    }

    public final void setCustomSignalsCallback(qp2 qp2Var) {
        setProperty(new C0043b(this, qp2Var));
    }

    public final void setLogLevel(LogLevel logLevel) {
        js3.p(logLevel, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        setProperty(new C0044c(this, logLevel));
    }

    public final void setUserId(String str) {
        setProperty(new C0045d(this, str));
    }

    public String toString() {
        return "[ProjectId: " + this.projectId + ", UserId: " + this.userId + ", LogLevel: " + this.logLevel + ", ApplicationFramework: " + this.applicationFramework + ", ]";
    }

    public /* synthetic */ ClarityConfig(String str, String str2, LogLevel logLevel, ApplicationFramework applicationFramework, qp2 qp2Var, int i, yd1 yd1Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? LogLevel.None : logLevel, (i & 8) != 0 ? ApplicationFramework.Native : applicationFramework, (i & 16) != 0 ? null : qp2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClarityConfig(String str) {
        this(str, null, null, null, null, 28, null);
        js3.p(str, "projectId");
    }
}
