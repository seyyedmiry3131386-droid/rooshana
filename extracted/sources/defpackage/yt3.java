package defpackage;

import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class yt3 extends AsyncTask {
    public final /* synthetic */ JobIntentService a;

    public yt3(JobIntentService jobIntentService) {
        this.a = jobIntentService;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        bu3 bu3VarB;
        while (true) {
            JobIntentService jobIntentService = this.a;
            du3 du3Var = jobIntentService.a;
            if (du3Var != null) {
                bu3VarB = du3Var.b();
            } else {
                synchronized (jobIntentService.e) {
                    try {
                        bu3VarB = jobIntentService.e.size() > 0 ? (bu3) jobIntentService.e.remove(0) : null;
                    } finally {
                    }
                }
            }
            if (bu3VarB == null) {
                return null;
            }
            JobIntentService jobIntentService2 = this.a;
            bu3VarB.getIntent();
            jobIntentService2.b();
            bu3VarB.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.c();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.c();
    }
}
