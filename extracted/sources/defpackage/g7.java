package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.contentcapture.b;
import androidx.fragment.app.d;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.session.a;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.microsoft.clarity.k.G;
import io.sentry.android.core.t0;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.download.DownloadDataModel;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g7(kn2 kn2Var, View view, Rect rect) {
        this.a = 15;
        this.b = view;
        this.c = rect;
    }

    private final void a() {
        y45 y45Var;
        rv5 rv5Var = (rv5) this.b;
        qn6 qn6Var = (qn6) this.c;
        if (rv5Var.b != rv5.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (rv5Var) {
            y45Var = rv5Var.a;
            rv5Var.a = null;
            rv5Var.b = qn6Var;
        }
        y45Var.getClass();
    }

    private final void b() {
        d44 d44Var = (d44) this.b;
        qn6 qn6Var = (qn6) this.c;
        synchronized (d44Var) {
            try {
                if (d44Var.b == null) {
                    d44Var.a.add(qn6Var);
                } else {
                    d44Var.b.add(qn6Var.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        boolean z2 = true;
        int i = 0;
        zIsAllFileExist = false;
        boolean zIsAllFileExist = false;
        switch (this.a) {
            case 0:
                BaseContentActivity baseContentActivity = (BaseContentActivity) this.b;
                MaterialToolbar materialToolbar = (MaterialToolbar) this.c;
                if (baseContentActivity.isFinishing() || baseContentActivity.isDestroyed()) {
                    return;
                }
                int childCount = materialToolbar.getChildCount();
                while (i < childCount) {
                    View childAt = materialToolbar.getChildAt(i);
                    if (childAt instanceof ImageButton) {
                        ((ImageButton) childAt).setBackground(y97.x());
                        return;
                    }
                    i++;
                }
                return;
            case 1:
                zc.e((b) this.b, (LongSparseArray) this.c);
                return;
            case 2:
                ym ymVar = (ym) this.b;
                Runnable runnable = (Runnable) this.c;
                ymVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    ymVar.b();
                }
            case 3:
                Context context = (Context) this.b;
                b11 b11Var = (b11) this.c;
                fz.a = (AudioManager) context.getSystemService("audio");
                b11Var.d();
                return;
            case 4:
                n00 n00Var = (n00) this.b;
                String str = (String) this.c;
                b62 b62Var = n00Var.c;
                String str2 = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1012, new sc1(beVarA0, str, 0));
                return;
            case 5:
                yb ybVar = (yb) this.b;
                Object objApply = ((u52) this.c).apply(ybVar.f);
                ybVar.f = objApply;
                b50 b50Var = new b50(ybVar, objApply, 1);
                wd8 wd8Var = (wd8) ybVar.c;
                if (wd8Var.a.getLooper().getThread().isAlive()) {
                    wd8Var.c(b50Var);
                    return;
                }
                return;
            case 6:
                ComponentActivity componentActivity = (ComponentActivity) this.b;
                ws5 ws5Var = (ws5) this.c;
                int i2 = ComponentActivity.u;
                componentActivity.a.a(new wx0(ws5Var, componentActivity, 0));
                return;
            case 7:
                a();
                return;
            case 8:
                b();
                return;
            case 9:
                e91 e91Var = (e91) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(e91Var.c);
                StrictMode.ThreadPolicy threadPolicy = e91Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 10:
                g gVar = (g) this.b;
                String str3 = (String) this.c;
                TextInputLayout textInputLayout = gVar.a;
                SimpleDateFormat simpleDateFormat = gVar.c;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(context2.getString(ft6.mtrl_picker_invalid_format) + "\n" + String.format(context2.getString(ft6.mtrl_picker_invalid_format_use), str3.replace(' ', (char) 160)) + "\n" + String.format(context2.getString(ft6.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(e29.h().getTimeInMillis())).replace(' ', (char) 160)));
                gVar.a();
                return;
            case 11:
                qm5 qm5Var = (qm5) this.b;
                o00 o00Var = (o00) this.c;
                n00 n00Var2 = ((qm4) qm5Var.b).f1;
                Handler handler = n00Var2.b;
                if (handler != null) {
                    handler.post(new k00(n00Var2, o00Var, i));
                    return;
                }
                return;
            case 12:
                he1 he1Var = (he1) this.b;
                androidx.media3.common.b bVar = (androidx.media3.common.b) this.c;
                ie1 ie1Var = he1Var.d;
                if (ie1Var.o == 0 || he1Var.c) {
                    return;
                }
                Looper looper = ie1Var.s;
                looper.getClass();
                he1Var.b = ie1Var.b(looper, he1Var.a, bVar, false);
                ie1Var.m.add(he1Var);
                return;
            case 13:
                ze1 ze1Var = (ze1) this.b;
                Uri uri = (Uri) this.c;
                ze1Var.i = false;
                ze1Var.f(uri);
                return;
            case 14:
                p28 p28Var = (p28) this.b;
                p28 p28Var2 = (p28) this.c;
                d dVar = p28Var.c;
                d dVar2 = p28Var2.c;
                in2 in2Var = dn2.a;
                js3.p(dVar, "inFragment");
                js3.p(dVar2, "outFragment");
                return;
            case 15:
                kn2.j((Rect) this.c, (View) this.b);
                return;
            case 16:
                androidx.fragment.app.b bVar2 = (androidx.fragment.app.b) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                js3.p(viewGroup, "$container");
                Iterator it = bVar2.c.iterator();
                while (it.hasNext()) {
                    p28 p28Var3 = (p28) ((jh1) it.next()).b;
                    View view = p28Var3.c.J;
                    if (view != null) {
                        p28Var3.a.a(view, viewGroup);
                    }
                }
                return;
            case 17:
                ((ii1) ((qq4) this.b).b).g.a((w59) this.c);
                return;
            case 18:
                Callable callable = (Callable) this.b;
                bj1 bj1Var = (bj1) ((ca7) this.c).b;
                try {
                    bj1Var.j(callable.call());
                    return;
                } catch (Exception e) {
                    bj1Var.k(e);
                    return;
                }
            case 19:
                pp1 pp1Var = (pp1) this.b;
                if (!((ArrayDeque) pp1Var.d).offer((Runnable) this.c)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                pp1Var.a();
                return;
            case 20:
                e62 e62Var = (e62) this.b;
                k62 k62Var = (k62) this.c;
                int i3 = e62Var.H - k62Var.a;
                e62Var.H = i3;
                if (k62Var.c) {
                    e62Var.I = k62Var.d;
                    e62Var.J = true;
                }
                if (i3 == 0) {
                    bm8 bm8Var = ((ta6) k62Var.e).a;
                    if (!e62Var.k0.a.p() && bm8Var.p()) {
                        e62Var.l0 = -1;
                        e62Var.m0 = 0L;
                    }
                    if (!bm8Var.p()) {
                        List listAsList = Arrays.asList(((sg6) bm8Var).k);
                        vy2.s(listAsList.size() == e62Var.p.size());
                        for (int i4 = 0; i4 < listAsList.size(); i4++) {
                            ((d62) e62Var.p.get(i4)).c = (bm8) listAsList.get(i4);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (e62Var.J) {
                        if (((ta6) k62Var.e).b.equals(e62Var.k0.b) && ((ta6) k62Var.e).d == e62Var.k0.s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (bm8Var.p() || ((ta6) k62Var.e).b.b()) {
                                j2 = ((ta6) k62Var.e).d;
                            } else {
                                ta6 ta6Var = (ta6) k62Var.e;
                                ks4 ks4Var = ta6Var.b;
                                long j3 = ta6Var.d;
                                Object obj = ks4Var.a;
                                yl8 yl8Var = e62Var.o;
                                bm8Var.g(obj, yl8Var);
                                j2 = j3 + yl8Var.e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    e62Var.J = false;
                    e62Var.a1((ta6) k62Var.e, 1, z, e62Var.I, j, -1, false);
                    return;
                }
                return;
            case 21:
                ((b92) this.b).a((Intent) this.c);
                return;
            case 22:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                cf8 cf8Var = (cf8) this.c;
                t15 t15Var = FirebaseMessaging.l;
                try {
                    cf8Var.b(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    cf8Var.a(e2);
                    return;
                }
            case 23:
                String str4 = (String) this.b;
                Violation violation = (Violation) this.c;
                t0.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str4), violation);
                throw violation;
            case 24:
                G.b((WebView) this.b, (G) this.c);
                return;
            case 25:
                ((ze1) ((a03) ((x03) this.b).c.b).b.d.get(((zz2) this.c).m)).e(true);
                return;
            case 26:
                zh3 zh3Var = (zh3) this.b;
                cf8 cf8Var2 = (cf8) this.c;
                try {
                    cf8Var2.b(zh3Var.b());
                    return;
                } catch (Exception e3) {
                    cf8Var2.a(e3);
                    return;
                }
            case 27:
                zo3 zo3Var = (zo3) this.b;
                PendingInstall pendingInstall = (PendingInstall) this.c;
                if (zo3Var.c == null) {
                    zo3Var.i(pendingInstall);
                    lw.g(null, "Could not consume an install because activity==null", null);
                    return;
                }
                AppDownloadInfo appDownloadInfoI = zo3Var.k.i(pendingInstall.getPackageName(), null);
                if (!(appDownloadInfoI != null ? appDownloadInfoI.getForceUpdate() : false)) {
                    Integer numP = zo3Var.j.p(pendingInstall.getPackageName());
                    if (numP != null && numP.intValue() >= pendingInstall.getVersionCode()) {
                        z2 = false;
                    }
                    if (!z2) {
                        zo3Var.i(pendingInstall);
                        return;
                    }
                }
                try {
                    AppDownloadInfo appDownloadInfoI2 = zo3Var.j.a.i(pendingInstall.getPackageName(), Integer.valueOf(pendingInstall.getVersionCode()));
                    if (appDownloadInfoI2 != null) {
                        zIsAllFileExist = appDownloadInfoI2.isAllFileExist();
                        break;
                    }
                } catch (IOException e4) {
                    lw.g(e4, "InstallConsumer isApkFileExist() failed!!", "PackageName: " + pendingInstall.getPackageName());
                }
                if (zIsAllFileExist) {
                    sb7.p("AddDownload", "Install apk", zo3Var.c(pendingInstall));
                    if (!zo3Var.j.J(pendingInstall.getVersionCode(), pendingInstall.getPackageName()) || zo3Var.j.I(pendingInstall.getVersionCode(), pendingInstall.getPackageName())) {
                        zo3Var.d(pendingInstall);
                        return;
                    } else {
                        zo3Var.g = pendingInstall;
                        zo3Var.i.a(zo3Var.j.x(pendingInstall.getPackageName(), Integer.valueOf(pendingInstall.getVersionCode()), pendingInstall.getTitle(), pendingInstall.getIconPath(), Boolean.FALSE));
                        return;
                    }
                }
                sb7.p("AddDownload", "Apk file is not exist, reset download", zo3Var.c(pendingInstall));
                AppDownloadInfo appDownloadInfoI3 = zo3Var.k.i(pendingInstall.getPackageName(), null);
                if (appDownloadInfoI3 != null) {
                    DownloadDataModel downloadDataModel = new DownloadDataModel(appDownloadInfoI3.getPackageName(), appDownloadInfoI3.getTag());
                    zo3Var.k.v(appDownloadInfoI3.getPackageName());
                    zo3Var.k.f(downloadDataModel);
                }
                zo3Var.i(pendingInstall);
                return;
            case 28:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i5 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                a aVar = (a) this.b;
                nc2 nc2Var = new nc2(aVar.a, (MediaSessionCompat$Token) this.c);
                aVar.i = nc2Var;
                no4 no4Var = aVar.e;
                Handler handler2 = aVar.b.e;
                if (!((Set) nc2Var.c).add(no4Var)) {
                    t0.m("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler2 == null) {
                    handler2 = new Handler();
                }
                no4Var.j(handler2);
                androidx.media3.session.legacy.a aVar2 = (androidx.media3.session.legacy.a) nc2Var.b;
                MediaController mediaController = aVar2.a;
                hn4 hn4Var = no4Var.a;
                hn4Var.getClass();
                mediaController.registerCallback(hn4Var, handler2);
                synchronized (aVar2.b) {
                    yf3 yf3VarA = aVar2.e.a();
                    if (yf3VarA != null) {
                        in4 in4Var = new in4(no4Var);
                        aVar2.d.put(no4Var, in4Var);
                        no4Var.c = in4Var;
                        try {
                            yf3VarA.X(in4Var);
                            no4Var.i(13, null, null);
                        } catch (RemoteException | SecurityException e5) {
                            t0.e("MediaControllerCompat", "Dead object in registerCallback.", e5);
                        }
                    } else {
                        no4Var.c = null;
                        aVar2.c.add(no4Var);
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ g7(p28 p28Var, p28 p28Var2, androidx.fragment.app.b bVar) {
        this.a = 14;
        this.b = p28Var;
        this.c = p28Var2;
    }

    public /* synthetic */ g7(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
