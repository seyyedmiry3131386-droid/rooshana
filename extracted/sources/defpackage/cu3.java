package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class cu3 implements bu3 {
    public final JobWorkItem a;
    public final /* synthetic */ du3 b;

    public cu3(du3 du3Var, JobWorkItem jobWorkItem) {
        this.b = du3Var;
        this.a = jobWorkItem;
    }

    @Override // defpackage.bu3
    public final void a() {
        synchronized (this.b.b) {
            try {
                JobParameters jobParameters = this.b.c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bu3
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
