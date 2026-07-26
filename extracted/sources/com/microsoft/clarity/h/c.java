package com.microsoft.clarity.h;

import android.content.Context;
import android.os.PersistableBundle;
import com.microsoft.clarity.jobs.UploadSessionJob;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.q.l;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements bp2 {
    public final /* synthetic */ UploadSessionJob a;
    public final /* synthetic */ PersistableBundle b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UploadSessionJob uploadSessionJob, PersistableBundle persistableBundle, Ref$ObjectRef ref$ObjectRef, String str) {
        super(0);
        this.a = uploadSessionJob;
        this.b = persistableBundle;
        this.c = ref$ObjectRef;
        this.d = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        UploadSessionJob uploadSessionJob = this.a;
        PersistableBundle persistableBundle = this.b;
        int i = UploadSessionJob.a;
        uploadSessionJob.getClass();
        LogLevel logLevel = l.a;
        String string = persistableBundle.getString("clarity_log_level", ApplicationStateDto.STATE_NONE);
        js3.o(string, "extras.getString(JOB_LOG…_KEY, LogLevel.None.name)");
        LogLevel logLevelValueOf = LogLevel.valueOf(string);
        js3.p(logLevelValueOf, "<set-?>");
        l.a = logLevelValueOf;
        Ref$ObjectRef ref$ObjectRef = this.c;
        Object obj = com.microsoft.clarity.b.a.a;
        Context applicationContext = this.a.getApplicationContext();
        js3.o(applicationContext, "applicationContext");
        ref$ObjectRef.a = com.microsoft.clarity.b.a.b(applicationContext, this.d);
        UploadSessionJob.a(this.a, this.d, this.b);
        return tx8.a;
    }
}
