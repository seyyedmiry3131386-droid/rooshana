package com.microsoft.clarity.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.microsoft.clarity.a.J;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.jobs.UploadSessionJob;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.telemetry.ErrorType;
import com.microsoft.clarity.q.l;
import defpackage.dy3;
import defpackage.js3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.XorWowRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final DynamicConfig a;
    public final h0 b;
    public final JobScheduler c;
    public final ComponentName d;

    public a(Context context, DynamicConfig dynamicConfig, h0 h0Var) {
        js3.p(context, "context");
        js3.p(dynamicConfig, "dynamicConfig");
        this.a = dynamicConfig;
        this.b = h0Var;
        boolean z = Build.VERSION.SDK_INT >= 34;
        Object systemService = context.getSystemService("jobscheduler");
        js3.n(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobSchedulerForNamespace = (JobScheduler) systemService;
        if (z) {
            jobSchedulerForNamespace = jobSchedulerForNamespace.forNamespace("com.microsoft.clarity");
            js3.o(jobSchedulerForNamespace, "default.forNamespace(SCHEDULER_NAMESPACE)");
        }
        this.c = jobSchedulerForNamespace;
        this.d = new ComponentName(context, (Class<?>) UploadSessionJob.class);
    }

    public final void a(String str, String str2) {
        js3.p(str, "projectId");
        js3.p(str2, "sessionId");
        int iHashCode = str2.concat("_fallback").hashCode();
        int iD = dy3.D(new XorWowRandom(iHashCode, iHashCode >> 31), J.a);
        PersistableBundle persistableBundleA = a(str, str2, true);
        JobInfo pendingJob = this.c.getPendingJob(iD);
        if (pendingJob != null) {
            if (!pendingJob.getExtras().containsKey("clarity_project_id")) {
                l.e("Failed to cancel fallback job with id '" + iD + "' for session '" + str2 + "' as it's not a Clarity job.");
                return;
            }
            this.c.cancel(iD);
        }
        if (a(iD, persistableBundleA, 600000L) != 1) {
            l.e("Failed to schedule a fallback job with id '" + iD + "' for session '" + str2 + "'.");
            return;
        }
        LogLevel logLevel = l.a;
        l.d("(Re)scheduled a fallback job with id '" + iD + "' for session '" + str2 + "' successfully.");
    }

    public final void b(String str, String str2) {
        js3.p(str, "projectId");
        js3.p(str2, "sessionId");
        int iHashCode = str2.hashCode();
        int iD = dy3.D(new XorWowRandom(iHashCode, iHashCode >> 31), J.a);
        if (this.c.getPendingJob(iD) != null) {
            LogLevel logLevel = l.a;
            l.d("Scheduling upload session '" + str2 + "' job skipped as there's a pending/running one with the same id.");
            return;
        }
        if (a(iD, a(str, str2, false), 0L) != 1) {
            l.e("Failed to schedule a session upload job with id '" + iD + "' for session '" + str2 + "'.");
            return;
        }
        LogLevel logLevel2 = l.a;
        l.d("Scheduled a session upload job with id '" + iD + "' for session '" + str2 + "' successfully.");
    }

    public final void a(long j) {
        List<JobInfo> allPendingJobs = this.c.getAllPendingJobs();
        js3.o(allPendingJobs, "scheduler.allPendingJobs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : allPendingJobs) {
            JobInfo jobInfo = (JobInfo) obj;
            js3.o(jobInfo, "it");
            if (jobInfo.getExtras().containsKey("clarity_project_id") && jobInfo.getExtras().getLong("clarity_enqueue_timestamp") < j) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.cancel(((JobInfo) it.next()).getId());
        }
    }

    public final int a(int i, PersistableBundle persistableBundle, long j) {
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(i, this.d).setRequiresBatteryNotLow(true).setMinimumLatency(j).setRequiredNetworkType(this.a.getAllowMeteredNetwork() ? 1 : 2);
        if (persistableBundle != null) {
            requiredNetworkType.setExtras(persistableBundle);
        }
        try {
            return this.c.schedule(requiredNetworkType.build());
        } catch (Exception e) {
            h0 h0Var = this.b;
            if (h0Var == null) {
                return 0;
            }
            h0Var.a(e, ErrorType.JobScheduling, null);
            return 0;
        }
    }

    public final PersistableBundle a(String str, String str2, boolean z) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("clarity_project_id", str);
        persistableBundle.putLong("clarity_enqueue_timestamp", System.currentTimeMillis());
        if (str2 != null) {
            persistableBundle.putString("clarity_session_id", str2);
        }
        Long networkMaxDailyDataInMB = this.a.getNetworkMaxDailyDataInMB();
        if (networkMaxDailyDataInMB != null) {
            persistableBundle.putLong("clarity_max_daily_network_usage_mb", networkMaxDailyDataInMB.longValue());
        }
        if (z) {
            persistableBundle.putBoolean("clarity_is_fallback", true);
        }
        persistableBundle.putString("clarity_log_level", l.a.name());
        return persistableBundle;
    }

    public final void a(String str) {
        js3.p(str, "projectId");
        int iD = dy3.D(new XorWowRandom(-1807994727, -1), J.a);
        if (this.c.getPendingJob(iD) != null) {
            l.d("Scheduling sweeper job skipped as it's already pending.");
            return;
        }
        if (a(iD, a(str, (String) null, false), 0L) == 1) {
            LogLevel logLevel = l.a;
            l.d("Scheduled a sweeper job with id '" + iD + "' successfully.");
            return;
        }
        l.e("Failed to schedule a sweeper job with id '" + iD + "'.");
    }
}
