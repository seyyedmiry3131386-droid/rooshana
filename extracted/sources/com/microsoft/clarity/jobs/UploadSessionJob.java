package com.microsoft.clarity.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import com.microsoft.clarity.b.a;
import com.microsoft.clarity.g.L;
import com.microsoft.clarity.g.X;
import com.microsoft.clarity.g.a0;
import com.microsoft.clarity.g.b0;
import com.microsoft.clarity.h.c;
import com.microsoft.clarity.h.e;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.models.telemetry.ErrorType;
import com.microsoft.clarity.n.d;
import com.microsoft.clarity.q.l;
import defpackage.js3;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadSessionJob extends JobService {
    public static final /* synthetic */ int a = 0;

    public static final void a(UploadSessionJob uploadSessionJob, String str, PersistableBundle persistableBundle) {
        a0 a0Var;
        uploadSessionJob.getClass();
        String string = persistableBundle.getString("clarity_session_id");
        boolean z = persistableBundle.getBoolean("clarity_is_fallback");
        Object obj = a.a;
        Context applicationContext = uploadSessionJob.getApplicationContext();
        js3.o(applicationContext, "applicationContext");
        L lA = a.a(applicationContext, persistableBundle.containsKey("clarity_max_daily_network_usage_mb") ? Long.valueOf(persistableBundle.getLong("clarity_max_daily_network_usage_mb", 0L)) : null);
        Context applicationContext2 = uploadSessionJob.getApplicationContext();
        js3.o(applicationContext2, "applicationContext");
        js3.p(str, "projectId");
        js3.p(lA, "networkUsageTracker");
        synchronized (a.a) {
            try {
                if (a.j == null) {
                    a.j = new a0(applicationContext2, lA, str);
                }
                a0Var = a.j;
                js3.m(a0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (string == null) {
            l.d("Upload job started for all sessions.");
            a0Var.a(!z);
            return;
        }
        LogLevel logLevel = l.a;
        l.d("Upload job started for session '" + string + "'.");
        boolean z2 = z ^ true;
        SessionMetadata sessionMetadataA = ((d) a0Var.e).a(string);
        if (sessionMetadataA == null) {
            return;
        }
        try {
            String sessionId = sessionMetadataA.getSessionId();
            a0.a(sessionId, new X(a0Var, sessionMetadataA, sessionId, z2));
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                return;
            }
            a0Var.c.a(e, ErrorType.UploadSession, null);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters != null ? jobParameters.getExtras() : null;
        String string = extras != null ? extras.getString("clarity_project_id") : null;
        if (string == null) {
            jobFinished(jobParameters, false);
            return false;
        }
        b0 b0VarA = a.a();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        b0VarA.a(new c(this, extras, ref$ObjectRef, string), new com.microsoft.clarity.h.d(ref$ObjectRef), new e(ref$ObjectRef, this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
