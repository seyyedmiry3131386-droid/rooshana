package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class du3 extends JobServiceEngine {
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public du3(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.b = new Object();
        this.a = jobIntentService;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final cu3 b() {
        synchronized (this.b) {
            try {
                JobParameters jobParameters = this.c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                return new cu3(this, jobWorkItemDequeueWork);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        yt3 yt3Var = this.a.c;
        if (yt3Var != null) {
            yt3Var.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
