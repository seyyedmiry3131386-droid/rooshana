package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.d30;
import defpackage.es8;
import defpackage.g7;
import defpackage.gk6;
import defpackage.up4;
import defpackage.v24;
import defpackage.wv8;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        es8.b(getApplicationContext());
        wv8 wv8VarA = d30.a();
        wv8VarA.L(string);
        wv8VarA.d = gk6.b(i);
        if (string2 != null) {
            wv8VarA.b = Base64.decode(string2, 0);
        }
        v24 v24Var = es8.a().d;
        ((Executor) v24Var.e).execute(new up4(v24Var, wv8VarA.l(), i2, new g7(this, jobParameters, 28)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
