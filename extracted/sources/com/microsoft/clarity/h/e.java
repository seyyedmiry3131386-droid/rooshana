package com.microsoft.clarity.h;

import android.app.job.JobParameters;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.jobs.UploadSessionJob;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Lambda implements bp2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ UploadSessionJob b;
    public final /* synthetic */ JobParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Ref$ObjectRef ref$ObjectRef, UploadSessionJob uploadSessionJob, JobParameters jobParameters) {
        super(0);
        this.a = ref$ObjectRef;
        this.b = uploadSessionJob;
        this.c = jobParameters;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        h0 h0Var = (h0) this.a.a;
        if (h0Var != null) {
            h0Var.a();
        }
        this.b.jobFinished(this.c, false);
        return tx8.a;
    }
}
