package defpackage;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import androidx.media3.common.PlaybackException;
import androidx.media3.database.DatabaseIOException;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.update.common.manager.b;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.model.InActiveAppUpdateModel;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.AppStorageRequestDTO;
import ir.mservices.market.version2.webapi.requestdto.ApplicationSkusRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixPaymentRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.myket.vpn.state.Command;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class vp7 implements wk0, c18, gb8, cb8 {
    public static vp7 f;
    public static final String[] g = {"id", "key", "metadata"};
    public static final ol3 h = new ol3(8);
    public static final vx8 i = new vx8(2);
    public static final a88 j = new a88("_root_");
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public vp7(b bVar, InActiveAppUpdateModel inActiveAppUpdateModel, om0 om0Var, String str) {
        this.a = 18;
        this.c = bVar;
        this.d = inActiveAppUpdateModel;
        this.e = om0Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ir.mservices.market.app.home.data.HomeVideoListDto R(ir.mservices.market.app.home.data.HomeVideoListDto r12, boolean r13) {
        /*
            java.util.List r0 = r12.getIgnoreConditions()
            ir.mservices.market.version2.ui.recycler.filter.GeneralFilter r0 = ir.mservices.market.version2.ui.recycler.filter.a.a(r0)
            r1 = 0
            if (r0 == 0) goto L46
            java.util.List r2 = r12.getVideos()
            if (r2 == 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r2.next()
            r5 = r4
            ir.mservices.market.version2.webapi.responsedto.VideoRowDto r5 = (ir.mservices.market.version2.webapi.responsedto.VideoRowDto) r5
            ir.mservices.market.app.common.recycler.FilteredAppNestedData r6 = new ir.mservices.market.app.common.recycler.FilteredAppNestedData
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r5 = r5.getApplication()
            r6.<init>(r5)
            boolean r5 = r0.u(r6)
            if (r5 != 0) goto L1a
            r3.add(r4)
            goto L1a
        L3a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L44
            if (r13 != 0) goto L43
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 != 0) goto L4a
        L46:
            java.util.List r3 = r12.getVideos()
        L4a:
            ir.mservices.market.app.home.data.HomeVideoListDto r4 = new ir.mservices.market.app.home.data.HomeVideoListDto
            java.lang.String r5 = r12.getTitle()
            boolean r6 = r12.getEol()
            java.lang.String r7 = r12.getMode()
            if (r3 == 0) goto L5e
            java.util.ArrayList r1 = kotlin.collections.a.Q0(r3)
        L5e:
            r8 = r1
            java.lang.String r9 = r12.getAnalyticsName()
            ir.mservices.market.app.detail.data.AdInfoDto r10 = r12.getAdInfoDTO()
            java.util.List r11 = r12.getIgnoreConditions()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp7.R(ir.mservices.market.app.home.data.HomeVideoListDto, boolean):ir.mservices.market.app.home.data.HomeVideoListDto");
    }

    public static synchronized vp7 T() {
        try {
            if (f == null) {
                f = new vp7(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public static int c0(int i2, String str, String str2) {
        if (str == null) {
            return 5;
        }
        try {
            if (str.length() != 0 && str2 != null && str2.length() != 0) {
                if (i2 == 3) {
                    return !ql3.e(str2) ? 5 : 0;
                }
                return 3;
            }
            return 5;
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            return 6;
        }
    }

    public static void t0(vp7 vp7Var, uv6 uv6Var, xv6 xv6Var, uv6 uv6Var2, int i2) {
        ca7 ca7Var;
        if ((i2 & 1) != 0) {
            uv6Var = null;
        }
        if ((i2 & 2) != 0) {
            xv6Var = null;
        }
        if ((i2 & 4) != 0) {
            uv6Var2 = null;
        }
        vp7Var.getClass();
        TimeZone timeZone = ih9.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) vp7Var.B()).isShutdown();
        synchronized (vp7Var) {
            if (xv6Var != null) {
                try {
                    if (!((ArrayDeque) vp7Var.d).remove(xv6Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (uv6Var2 != null) {
                uv6Var2.b.decrementAndGet();
                if (!((ArrayDeque) vp7Var.c).remove(uv6Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (uv6Var != null) {
                ((ArrayDeque) vp7Var.e).add(uv6Var);
                uv6 uv6VarD = vp7Var.D(uv6Var.c.b.a.d);
                if (uv6VarD != null) {
                    uv6Var.b = uv6VarD.b;
                }
            }
            if ((xv6Var != null || uv6Var2 != null) && (zIsShutdown || ((ArrayDeque) vp7Var.c).isEmpty())) {
                ((ArrayDeque) vp7Var.d).isEmpty();
            }
            if (zIsShutdown) {
                List listP0 = a.P0((ArrayDeque) vp7Var.e);
                ((ArrayDeque) vp7Var.e).clear();
                ca7Var = new ca7(listP0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) vp7Var.e).iterator();
                js3.o(it, "iterator(...)");
                while (it.hasNext()) {
                    uv6 uv6Var3 = (uv6) it.next();
                    if (((ArrayDeque) vp7Var.c).size() >= 64) {
                        break;
                    }
                    if (uv6Var3.b.get() < 5) {
                        it.remove();
                        uv6Var3.b.incrementAndGet();
                        arrayList.add(uv6Var3);
                        ((ArrayDeque) vp7Var.c).add(uv6Var3);
                    }
                }
                ca7Var = new ca7(arrayList);
            }
        }
        int size = ((List) ca7Var.b).size();
        for (int i3 = 0; i3 < size; i3++) {
            uv6 uv6Var4 = (uv6) ((List) ca7Var.b).get(i3);
            if (uv6Var4 != uv6Var) {
                xv6 xv6Var2 = uv6Var4.c;
            }
            if (zIsShutdown) {
                uv6Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                xv6 xv6Var3 = uv6Var4.c;
                xv6Var3.h(interruptedIOException);
                uv6Var4.a.l(xv6Var3, interruptedIOException);
            } else {
                ExecutorService executorServiceB = vp7Var.B();
                uv6Var4.getClass();
                xv6 xv6Var4 = uv6Var4.c;
                js3.p(xv6Var4.a.a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceB).execute(uv6Var4);
                    } catch (Throwable th2) {
                        vp7 vp7Var2 = xv6Var4.a.a;
                        vp7Var2.getClass();
                        t0(vp7Var2, null, null, uv6Var4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    xv6 xv6Var5 = uv6Var4.c;
                    xv6Var5.h(interruptedIOException2);
                    uv6Var4.a.l(xv6Var5, interruptedIOException2);
                    vp7 vp7Var3 = xv6Var4.a.a;
                    vp7Var3.getClass();
                    t0(vp7Var3, null, null, uv6Var4, 3);
                }
            }
        }
    }

    public void A(String str, String str2, String str3, String str4, String str5, String str6) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        dp3 dp3Var = (dp3) this.e;
        if (dp3Var == null) {
            js3.V("installManager");
            throw null;
        }
        Integer numP = dp3Var.p(str);
        SpixPaymentRequestDto spixPaymentRequestDto = new SpixPaymentRequestDto(str, numP != null ? numP.intValue() : -1, str2, (String) this.b, str3, str4, str5, str6);
        c5 c5Var = (c5) this.d;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        String strA = c5Var.a();
        c5 c5Var2 = (c5) this.d;
        if (c5Var2 == null) {
            js3.V("accountManager");
            throw null;
        }
        SpixRequestDto spixRequestDto = new SpixRequestDto(new SpixUserRequestDto(strA, c5Var2.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C()), spixPaymentRequestDto);
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.m("payment", spixRequestDto);
        } else {
            js3.V("generalService");
            throw null;
        }
    }

    public void A0(String str) {
        kb9 kb9Var = (kb9) this.d;
        Context context = (Context) this.b;
        if (str == null) {
            ((lb9) kb9Var).getClass();
            str = ((tb9) ub9.b.a.getValue()).a();
        }
        ((lb9) kb9Var).getClass();
        js3.p(str, "type");
        lb9.a(context, new Command.Stop(str));
    }

    public synchronized ExecutorService B() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.b) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = ih9.b + " Dispatcher";
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new hh9(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.b;
            js3.m(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void B0(co5 co5Var) {
        vi4 vi4Var = (vi4) ((Map) this.e).get(co5Var.getClass());
        if (vi4Var != null) {
            vi4Var.a(this, co5Var);
        } else {
            C0(co5Var);
        }
    }

    public androidx.fragment.app.d C(String str) {
        h hVar = (h) ((HashMap) this.c).get(str);
        if (hVar != null) {
            return hVar.c;
        }
        return null;
    }

    public void C0(co5 co5Var) {
        co5 co5Var2 = co5Var.b;
        while (co5Var2 != null) {
            co5 co5Var3 = co5Var2.e;
            co5Var2.a(this);
            co5Var2 = co5Var3;
        }
    }

    public uv6 D(String str) {
        Iterator it = ((ArrayDeque) this.c).iterator();
        js3.o(it, "iterator(...)");
        while (it.hasNext()) {
            uv6 uv6Var = (uv6) it.next();
            if (js3.i(uv6Var.c.b.a.d, str)) {
                return uv6Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.e).iterator();
        js3.o(it2, "iterator(...)");
        while (it2.hasNext()) {
            uv6 uv6Var2 = (uv6) it2.next();
            if (js3.i(uv6Var2.c.b.a.d, str)) {
                return uv6Var2;
            }
        }
        return null;
    }

    public androidx.fragment.app.d E(String str) {
        for (h hVar : ((HashMap) this.c).values()) {
            if (hVar != null) {
                androidx.fragment.app.d dVarE = hVar.c;
                if (!str.equals(dVarE.f)) {
                    dVarE = dVarE.x.c.E(str);
                }
                if (dVarE != null) {
                    return dVarE;
                }
            }
        }
        return null;
    }

    public void F(o11 o11Var) {
        xq4 xq4Var = (xq4) ((WeakReference) this.e).get();
        if (xq4Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            n11 n11Var = (n11) o11Var.c.poll();
            if (n11Var == null) {
                o11Var.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            o11 o11Var2 = o11Var;
            j29.a0(xq4Var.l, new lo4(xq4Var, P(o11Var.a), new ma0(this, n11Var, atomicBoolean2, o11Var2, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            o11Var = o11Var2;
        }
    }

    public void G(final hq4 hq4Var) {
        synchronized (this.b) {
            try {
                o11 o11Var = (o11) ((wv) this.d).get(hq4Var);
                if (o11Var == null) {
                    return;
                }
                final cb6 cb6Var = o11Var.g;
                o11Var.g = cb6.b;
                o11Var.c.add(new n11() { // from class: l11
                    @Override // defpackage.n11
                    public final n94 run() {
                        xq4 xq4Var = (xq4) ((WeakReference) this.a.e).get();
                        if (xq4Var != null) {
                            xq4Var.q(hq4Var, cb6Var);
                        }
                        return ij3.b;
                    }
                });
                if (o11Var.f) {
                    return;
                }
                o11Var.f = true;
                F(o11Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle H(int i2) {
        try {
            if (!(i2 <= 3)) {
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 1);
                return bundle;
            }
            if (I().d()) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 0);
                bundle2.putInt("RESPONSE_LOGIN", 4);
                bundle2.putString("RESPONSE_USER_ID", (String) I().h.j);
                return bundle2;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 0);
            bundle3.putInt("RESPONSE_LOGIN", 5);
            Intent intent = new Intent();
            intent.setData(Uri.parse("myket://login"));
            intent.setAction("ir.myket.intent.action.LOGIN");
            bundle3.putParcelable("RESPONSE_LOGIN_INTENT", intent);
            return bundle3;
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("RESPONSE_CODE", 3);
            return bundle4;
        }
    }

    public c5 I() {
        c5 c5Var = (c5) this.b;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }

    public ArrayList J() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : ((HashMap) this.c).values()) {
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public ArrayList K() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : ((HashMap) this.c).values()) {
            if (hVar != null) {
                arrayList.add(hVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public void L(int i2, String str, dp2 dp2Var) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        try {
            if (i2 > 3) {
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 1);
                dp2Var.invoke(bundle);
                return;
            }
            if (str != null && !f88.n0(str)) {
                dp3 dp3Var = (dp3) this.c;
                if (dp3Var == null) {
                    js3.V("installManager");
                    throw null;
                }
                Integer numP = dp3Var.p(str);
                if (numP == null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("RESPONSE_CODE", 2);
                    dp2Var.invoke(bundle2);
                    return;
                } else {
                    c cVar = (c) this.d;
                    if (cVar != null) {
                        cVar.k(str, numP, new ur4(dp2Var, numP, 9), new ie5(0, dp2Var));
                        return;
                    } else {
                        js3.V("appService");
                        throw null;
                    }
                }
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 2);
            dp2Var.invoke(bundle3);
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("RESPONSE_CODE", 3);
            dp2Var.invoke(bundle4);
        }
    }

    public cb6 M(hq4 hq4Var) {
        synchronized (this.b) {
            try {
                o11 o11Var = (o11) ((wv) this.d).get(hq4Var);
                if (o11Var == null) {
                    return null;
                }
                return o11Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle N(int i2, String str, String str2, String str3, String str4) {
        int i3;
        Handler handler;
        Context context;
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    if (i2 != 3) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("RESPONSE_CODE", 3);
                        bundle.putString("RESPONSE_MESSAGE", "wrong-api-version");
                        return bundle;
                    }
                    if (!ql3.e(str3)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("RESPONSE_CODE", 5);
                        bundle2.putString("RESPONSE_MESSAGE", "wrong-iab-type");
                        return bundle2;
                    }
                    Intent intent = new Intent();
                    intent.setData(Uri.parse("myket://billing"));
                    intent.setAction("ir.myket.intent.action.PAY");
                    intent.setPackage(NearbyRepository.SERVICE_ID);
                    intent.putExtra("PACKAGE_NAME", str);
                    intent.putExtra("SKU", str2);
                    intent.putExtra("ITEM_TYPE", str3);
                    intent.putExtra("DEVELOPER_PAYLOAD", str4);
                    if (((fw4) this.e) == null) {
                        js3.V("miuiUtils");
                        throw null;
                    }
                    if (fw4.e()) {
                        try {
                            context = (Context) this.b;
                        } catch (Exception unused) {
                            i3 = -1;
                        }
                        if (context == null) {
                            js3.V("context");
                            throw null;
                        }
                        i3 = context.getPackageManager().getPackageInfo(str, 0).versionCode;
                        ok3 ok3Var = InAppPurchaseActivity.A0;
                        ok3Var.a = true;
                        ok3Var.b = str;
                        ok3Var.c = i3;
                        synchronized (zk8.class) {
                            handler = zk8.a;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                zk8.a = handler;
                            }
                        }
                        lw.f(null, null, handler.postDelayed(ok3Var, 3000L));
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("RESPONSE_CODE", 0);
                    bundle3.putString("RESPONSE_MESSAGE", "ok");
                    bundle3.putParcelable("BUY_INTENT", intent);
                    return bundle3;
                }
            } catch (Exception e) {
                Class<?> cls = e.getClass();
                e.getMessage();
                cls.toString();
                Bundle bundle4 = new Bundle();
                bundle4.putInt("RESPONSE_CODE", 6);
                bundle4.putString("RESPONSE_MESSAGE", "exception(" + e.getMessage() + ")");
                return bundle4;
            }
        }
        Bundle bundle5 = new Bundle();
        bundle5.putInt("RESPONSE_CODE", 5);
        bundle5.putString("RESPONSE_MESSAGE", "wrong-input");
        return bundle5;
    }

    public ImmutableList O() {
        ImmutableList immutableListN;
        synchronized (this.b) {
            immutableListN = ImmutableList.n(((wv) this.c).values());
        }
        return immutableListN;
    }

    public hq4 P(Object obj) {
        hq4 hq4Var;
        synchronized (this.b) {
            hq4Var = (hq4) ((wv) this.c).get(obj);
        }
        return hq4Var;
    }

    public synchronized ArrayList Q(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (p95 p95Var : (ArrayList) this.b) {
            if (!arrayList.contains(p95Var.b) && p95Var.a.isAssignableFrom(cls)) {
                arrayList.add(p95Var.b);
            }
        }
        return arrayList;
    }

    public List S() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public PlaybackException U(hq4 hq4Var) {
        synchronized (this.b) {
            try {
                return ((o11) ((wv) this.d).get(hq4Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public he6 V(hq4 hq4Var) {
        synchronized (this.b) {
            try {
                return ((o11) ((wv) this.d).get(hq4Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void W(int i2, String str, String str2, sp2 sp2Var) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    if (i2 != 3) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("RESPONSE_CODE", 3);
                        sp2Var.g(bundle, "", "wrong-api-version", ApplicationStateDto.STATE_NONE);
                        return;
                    }
                    if (!ql3.e(str2)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("RESPONSE_CODE", 5);
                        sp2Var.g(bundle2, "", "wrong-iab-type", ApplicationStateDto.STATE_NONE);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    c5 c5Var = (c5) this.d;
                    if (c5Var == null) {
                        js3.V("accountManager");
                        throw null;
                    }
                    String strA = c5Var.a();
                    js3.o(strA, "getAccountId(...)");
                    c cVar = (c) this.c;
                    if (cVar != null) {
                        cVar.p(str, strA, str2, null, new pe5(bundle3, sp2Var, 0), new pe5(bundle3, sp2Var, 1));
                        return;
                    } else {
                        js3.V("appService");
                        throw null;
                    }
                }
            } catch (Exception e) {
                Class<?> cls = e.getClass();
                e.getMessage();
                cls.toString();
                Bundle bundle4 = new Bundle();
                bundle4.putInt("RESPONSE_CODE", 6);
                sp2Var.g(bundle4, "-EXCEPTION", o40.y("exception(", e.getMessage(), ")"), ApplicationStateDto.STATE_NONE);
                return;
            }
        }
        Bundle bundle5 = new Bundle();
        bundle5.putInt("RESPONSE_CODE", 5);
        sp2Var.g(bundle5, "", "wrong-input", ApplicationStateDto.STATE_NONE);
    }

    public eo5 X(hq4 hq4Var) {
        o11 o11Var;
        synchronized (this.b) {
            o11Var = (o11) ((wv) this.d).get(hq4Var);
        }
        if (o11Var != null) {
            return o11Var.b;
        }
        return null;
    }

    public void Y(int i2, String str, String str2, Bundle bundle, sp2 sp2Var) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        try {
            Objects.toString(bundle);
            ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("ITEM_ID_LIST") : null;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && stringArrayList != null && !stringArrayList.isEmpty()) {
                for (String str3 : stringArrayList) {
                    js3.m(str3);
                    if (!f88.n0(str3)) {
                        if (i2 != 3) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("RESPONSE_CODE", 3);
                            sp2Var.g(bundle2, "", "wrong-api-version", ApplicationStateDto.STATE_NONE);
                            return;
                        } else if (!ql3.e(str2)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("RESPONSE_CODE", 5);
                            sp2Var.g(bundle3, "", "wrong-iab-type", ApplicationStateDto.STATE_NONE);
                            return;
                        } else {
                            Bundle bundle4 = new Bundle();
                            c cVar = (c) this.c;
                            if (cVar != null) {
                                cVar.n(str, new ApplicationSkusRequestDto(stringArrayList, str2, Boolean.FALSE), new pe5(bundle4, sp2Var, 2), new pe5(bundle4, sp2Var, 3));
                                return;
                            } else {
                                js3.V("appService");
                                throw null;
                            }
                        }
                    }
                }
            }
            Bundle bundle5 = new Bundle();
            bundle5.putInt("RESPONSE_CODE", 5);
            sp2Var.g(bundle5, "", "wrong-input", ApplicationStateDto.STATE_NONE);
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            Bundle bundle6 = new Bundle();
            bundle6.putInt("RESPONSE_CODE", 6);
            sp2Var.g(bundle6, "-EXCEPTION", o40.y("exception(", e.getMessage(), ")"), ApplicationStateDto.STATE_NONE);
        }
    }

    public boolean Z(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.d).booleanValue();
    }

    @Override // defpackage.wk0
    public void a(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((h48) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                b0(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    p(writableDatabase, (vk0) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.d).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public boolean a0(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    @Override // defpackage.wk0
    public void b(vk0 vk0Var, boolean z) {
        int i2 = vk0Var.a;
        SparseArray sparseArray = (SparseArray) this.d;
        if (z) {
            sparseArray.delete(i2);
        } else {
            sparseArray.put(i2, null);
        }
    }

    public void b0(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.b;
        str.getClass();
        p49.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    @Override // defpackage.c18
    public t18 c() {
        return (zg1) this.d;
    }

    @Override // defpackage.cb8
    public /* synthetic */ ta8 d(byte[] bArr, int i2, int i3) {
        return rm7.e(this, bArr, i3);
    }

    public boolean d0(hq4 hq4Var) {
        boolean z;
        synchronized (this.b) {
            z = ((wv) this.d).get(hq4Var) != null;
        }
        return z;
    }

    @Override // defpackage.wk0
    public void e(vk0 vk0Var) {
        ((SparseArray) this.d).put(vk0Var.a, vk0Var);
    }

    public boolean e0(hq4 hq4Var, int i2) {
        o11 o11Var;
        synchronized (this.b) {
            o11Var = (o11) ((wv) this.d).get(hq4Var);
        }
        xq4 xq4Var = (xq4) ((WeakReference) this.e).get();
        return o11Var != null && o11Var.e.a(i2) && xq4Var != null && xq4Var.t.o0().a(i2);
    }

    @Override // defpackage.wk0
    public boolean f() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((h48) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return p49.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public boolean f0(hq4 hq4Var, int i2) {
        o11 o11Var;
        synchronized (this.b) {
            o11Var = (o11) ((wv) this.d).get(hq4Var);
        }
        if (o11Var == null) {
            return false;
        }
        xp7 xp7Var = o11Var.d;
        xp7Var.getClass();
        boolean z = false;
        vy2.i("Use contains(Command) for custom command", i2 != 0);
        Iterator<E> it = xp7Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((wp7) it.next()).a == i2) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // defpackage.wk0
    public void g(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((h48) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                try {
                    vk0 vk0Var = (vk0) sparseArray.valueAt(i2);
                    if (vk0Var == null) {
                        int iKeyAt = sparseArray.keyAt(i2);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        p(writableDatabase, vk0Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public boolean g0(hq4 hq4Var, wp7 wp7Var) {
        o11 o11Var;
        synchronized (this.b) {
            o11Var = (o11) ((wv) this.d).get(hq4Var);
        }
        if (o11Var == null) {
            return false;
        }
        ImmutableSet immutableSet = o11Var.d.a;
        wp7Var.getClass();
        return immutableSet.contains(wp7Var);
    }

    @Override // defpackage.wk0
    public void h(long j2) {
        String hexString = Long.toHexString(j2);
        this.b = hexString;
        this.e = dw1.n("ExoPlayerCacheIndex", hexString);
    }

    public int h0() {
        return ((h28) this.d).a.length();
    }

    @Override // defpackage.wk0
    public void i(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        h48 h48Var = (h48) this.c;
        vy2.s(((SparseArray) this.d).size() == 0);
        try {
            SQLiteDatabase readableDatabase = h48Var.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (p49.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = h48Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    b0(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = h48Var.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, g, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i2 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new vk0(i2, string, on.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i2, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    public void i0(int i2, String str, dp2 dp2Var) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        try {
            if (i2 > 3) {
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 1);
                dp2Var.invoke(bundle);
                return;
            }
            if (str != null && !f88.n0(str)) {
                if (!I().d()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("RESPONSE_CODE", 2);
                    bundle2.putInt("RESPONSE_LOGIN", 5);
                    dp2Var.invoke(bundle2);
                    return;
                }
                ct ctVar = (ct) this.e;
                if (ctVar != null) {
                    ctVar.g(str, new je5(dp2Var, this, 1), new ie5(2, dp2Var));
                    return;
                } else {
                    js3.V("appStorageService");
                    throw null;
                }
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 2);
            dp2Var.invoke(bundle3);
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("RESPONSE_CODE", 3);
            dp2Var.invoke(bundle4);
        }
    }

    @Override // defpackage.c18
    public by7 j() {
        return (yg1) this.e;
    }

    public void j0(String str, String str2, String str3, String str4, String str5, String str6) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        if (Thread.currentThread().getId() == zk8.b) {
            A(str, str2, str3, str4, str5, str6);
            return;
        }
        l46 l46Var = new l46(this, str, str2, str3, str4, str5, str6);
        Void[] voidArr = new Void[0];
        while (true) {
            try {
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // defpackage.wk0
    public void k() throws DatabaseIOException {
        h48 h48Var = (h48) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = h48Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i2 = p49.a;
                try {
                    String str2 = j29.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void k0(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        js3.p(str, "suffix");
        js3.p(str4, "message");
        js3.p(str5, "host");
        if (!(((String) this.b).equals("RECEIVER") && i3 == 0) && (!sl3.B(i3) || str.equals("NO_REPORT"))) {
            return;
        }
        j0(str2, "consumePurchases".concat(str), sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("purchaseToken", String.valueOf(str3)))), sl3.n(i3), str4, str5);
    }

    public synchronized void l(sx3 sx3Var, i22 i22Var) {
        r6 r6Var = (r6) ((HashMap) this.c).put(sx3Var, new r6(sx3Var, i22Var, (ReferenceQueue) this.d));
        if (r6Var != null) {
            r6Var.c = null;
            r6Var.clear();
        }
    }

    public void l0(int i2, String str, String str2, String str3, String str4, Bundle bundle, String str5) {
        js3.p(str5, "message");
        bundle.toString();
        if (sl3.o(bundle)) {
            j0(str, "getBuyIntent", sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("sku", String.valueOf(str2)), new Pair("type", String.valueOf(str3)), new Pair("developerPayload", String.valueOf(str4)))), sl3.n(bundle.getInt("RESPONSE_CODE")), str5, ApplicationStateDto.STATE_NONE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    @Override // defpackage.cb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(byte[] r41, int r42, int r43, defpackage.bb8 r44, defpackage.n31 r45) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp7.m(byte[], int, int, bb8, n31):void");
    }

    public void m0(int i2, String str, String str2, String str3, String str4, Bundle bundle, String str5) {
        js3.p(str5, "message");
        bundle.toString();
        if (sl3.o(bundle)) {
            j0(str, "getBuyIntentV2", sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("sku", String.valueOf(str2)), new Pair("type", String.valueOf(str3)), new Pair("developerPayload", String.valueOf(str4)))), sl3.n(bundle.getInt("RESPONSE_CODE")), str5, ApplicationStateDto.STATE_NONE);
        }
    }

    public void n(Object obj, hq4 hq4Var, xp7 xp7Var, cb6 cb6Var) {
        synchronized (this.b) {
            try {
                hq4 hq4VarP = P(obj);
                if (hq4VarP == null) {
                    ((wv) this.c).put(obj, hq4Var);
                    ((wv) this.d).put(hq4Var, new o11(obj, new eo5(), xp7Var, cb6Var));
                } else {
                    o11 o11Var = (o11) ((wv) this.d).get(hq4VarP);
                    vy2.t(o11Var);
                    o11Var.d = xp7Var;
                    o11Var.e = cb6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n0(String str, int i2, String str2, String str3, String str4, Bundle bundle, String str5, String str6) {
        js3.p(str, "suffix");
        js3.p(bundle, "result");
        js3.p(str5, "message");
        js3.p(str6, "host");
        bundle.toString();
        if (!sl3.o(bundle) || str.equals("NO_REPORT")) {
            return;
        }
        j0(str2, "getPurchases".concat(str), sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("type", String.valueOf(str3)), new Pair("continuationToken", String.valueOf(str4)))), sl3.n(bundle.getInt("RESPONSE_CODE")), str5, str6);
    }

    public void o(androidx.fragment.app.d dVar) {
        if (((ArrayList) this.b).contains(dVar)) {
            throw new IllegalStateException("Fragment already added: " + dVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(dVar);
        }
        dVar.l = true;
    }

    public void o0(String str, int i2, String str2, String str3, Bundle bundle, Bundle bundle2, String str4, String str5) {
        js3.p(str, "suffix");
        js3.p(bundle2, "result");
        js3.p(str4, "message");
        js3.p(str5, "host");
        bundle2.toString();
        if (!sl3.o(bundle2) || str.equals("NO_REPORT")) {
            return;
        }
        j0(str2, "getSkuDetails".concat(str), sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("type", String.valueOf(str3)), new Pair("skusBundle", String.valueOf(bundle)))), sl3.n(bundle2.getInt("RESPONSE_CODE")), str4, str5);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        Object value;
        ArrayList arrayListQ0;
        switch (this.a) {
            case 18:
                l lVar = ((b) this.c).c;
                InActiveAppUpdateModel inActiveAppUpdateModel = (InActiveAppUpdateModel) this.d;
                String str = (String) this.b;
                do {
                    value = lVar.getValue();
                    Collection collection = (List) value;
                    if (collection == null) {
                        collection = EmptyList.a;
                    }
                    arrayListQ0 = a.Q0(collection);
                    Iterator it = arrayListQ0.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (!js3.i(((InActiveAppUpdateModel) it.next()).a(), str)) {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        arrayListQ0.set(i2, inActiveAppUpdateModel);
                    } else {
                        arrayListQ0.add(inActiveAppUpdateModel);
                    }
                } while (!lVar.n(value, arrayListQ0));
                ((om0) this.e).resumeWith(new bk3(inActiveAppUpdateModel.a(), null, inActiveAppUpdateModel.b()));
                break;
            default:
                ApplicationFullDto applicationFullDto = (ApplicationFullDto) obj;
                co6 co6Var = (co6) this.e;
                AppDownloadFlowStatus appDownloadFlowStatusD = co6Var.m.d(applicationFullDto.getPackageName(), applicationFullDto.getVersion().getCode(), applicationFullDto.getVersion().isIncompatible(), applicationFullDto.getForceUpdate());
                if (appDownloadFlowStatusD == AppDownloadFlowStatus.b || appDownloadFlowStatusD == AppDownloadFlowStatus.c) {
                    ir.mservices.market.version2.manager.a aVar = co6Var.m;
                    String str2 = (String) this.b;
                    if (str2 == null || f88.n0(str2)) {
                        str2 = "NotificationDownload";
                    }
                    DownloadDataModel downloadDataModel = new DownloadDataModel(applicationFullDto, "other", str2, null, null);
                    aVar.getClass();
                    aVar.b(null, downloadDataModel, false);
                }
                js8.q((Context) this.c, (Uri) this.d, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
                break;
        }
    }

    public void p(SQLiteDatabase sQLiteDatabase, vk0 vk0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        on.b(vk0Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(vk0Var.a));
        contentValues.put("key", vk0Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public void p0(int i2, int i3, String str, String str2, String str3) {
        js3.p(str3, "message");
        if (!sl3.B(i3) || js3.i(str2, "subs")) {
            return;
        }
        j0(str, "isBillingSupported", sl3.q(kotlin.collections.b.N(new Pair("apiVersion", String.valueOf(i2)), new Pair("type", String.valueOf(str2)))), sl3.n(i3), str3, ApplicationStateDto.STATE_NONE);
    }

    public void q(hq4 hq4Var, int i2, n11 n11Var) {
        synchronized (this.b) {
            try {
                o11 o11Var = (o11) ((wv) this.d).get(hq4Var);
                if (o11Var != null) {
                    cb6 cb6Var = o11Var.g;
                    cb6Var.getClass();
                    xe1 xe1Var = new xe1(5);
                    xe1Var.b(cb6Var.a);
                    xe1Var.a(i2);
                    o11Var.g = new cb6(xe1Var.h());
                    o11Var.c.add(n11Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q0(h hVar) {
        androidx.fragment.app.d dVar = hVar.c;
        String str = dVar.f;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(dVar.f, hVar);
        if (dVar.F) {
            if (dVar.E) {
                ((yl2) this.e).e(dVar);
            } else {
                ((yl2) this.e).g(dVar);
            }
            dVar.F = false;
        }
        if (g.N(2)) {
            dVar.toString();
        }
    }

    public synchronized void r(Class cls, Class cls2, bx4 bx4Var) {
        p95 p95Var = new p95(cls, cls2, bx4Var);
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(arrayList.size(), p95Var);
    }

    public void r0(h hVar) {
        HashMap map = (HashMap) this.c;
        androidx.fragment.app.d dVar = hVar.c;
        if (dVar.E) {
            ((yl2) this.e).g(dVar);
        }
        if (map.get(dVar.f) == hVar && ((h) map.put(dVar.f, null)) != null && g.N(2)) {
            dVar.toString();
        }
    }

    @Override // defpackage.cb8
    public /* synthetic */ void reset() {
    }

    public void s(co5 co5Var) {
        if (co5Var.e != null) {
            z();
            ((h28) this.d).a('\n');
        }
    }

    public void s0(ha9 ha9Var, qp2 qp2Var) {
        synchronized (((rl3) this.e)) {
            if (ha9Var != null) {
                try {
                    this.d = ha9Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            qp2Var.invoke((oz2) this.b, (oz2) this.c);
        }
    }

    public synchronized ax4 t(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                p95 p95Var = (p95) it.next();
                if (((HashSet) this.d).contains(p95Var)) {
                    z = true;
                } else {
                    if (!p95Var.a.isAssignableFrom(cls) || !p95Var.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.d).add(p95Var);
                        arrayList.add(p95Var.c.a(this));
                        ((HashSet) this.d).remove(p95Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                ol3 ol3Var = (ol3) this.c;
                wv8 wv8Var = (wv8) this.e;
                ol3Var.getClass();
                return new sw(arrayList, wv8Var, 2);
            }
            if (arrayList.size() == 1) {
                return (ax4) arrayList.get(0);
            }
            if (z) {
                return i;
            }
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.d).clear();
            throw th;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                String string = ((Socket) this.b).toString();
                js3.o(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public synchronized ArrayList u(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (p95 p95Var : (ArrayList) this.b) {
                if (!((HashSet) this.d).contains(p95Var) && p95Var.a.isAssignableFrom(cls)) {
                    ((HashSet) this.d).add(p95Var);
                    arrayList.add(p95Var.c.a(this));
                    ((HashSet) this.d).remove(p95Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public synchronized ArrayList u0() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            p95 p95Var = (p95) it.next();
            if (p95Var.a.isAssignableFrom(ot2.class) && p95Var.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(p95Var.c);
            }
        }
        return arrayList;
    }

    public void v(r6 r6Var) {
        g67 g67Var;
        synchronized (this) {
            ((HashMap) this.c).remove(r6Var.a);
            if (r6Var.b && (g67Var = r6Var.c) != null) {
                ((com.bumptech.glide.load.engine.b) this.e).e(r6Var.a, new i22(g67Var, true, false, r6Var.a, (com.bumptech.glide.load.engine.b) this.e));
            }
        }
    }

    public void v0(hq4 hq4Var) {
        synchronized (this.b) {
            try {
                o11 o11Var = (o11) ((wv) this.d).remove(hq4Var);
                if (o11Var == null) {
                    return;
                }
                ((wv) this.c).remove(o11Var.a);
                o11Var.b.d();
                xq4 xq4Var = (xq4) ((WeakReference) this.e).get();
                if (xq4Var == null || xq4Var.j()) {
                    return;
                }
                j29.a0(xq4Var.l, new k11(xq4Var, hq4Var, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(int i2, String str, String str2, sp2 sp2Var) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    if (i2 != 3) {
                        sp2Var.g(3, "", "wrong-api-version", ApplicationStateDto.STATE_NONE);
                        return;
                    }
                    c cVar = (c) this.c;
                    if (cVar != null) {
                        cVar.h(str, str2, new oe5(sp2Var), new oe5(sp2Var));
                        return;
                    } else {
                        js3.V("appService");
                        throw null;
                    }
                }
            } catch (Exception e) {
                Class<?> cls = e.getClass();
                e.getMessage();
                cls.toString();
                sp2Var.g(6, "-EXCEPTION", o40.y("exception(", e.getMessage(), ")"), ApplicationStateDto.STATE_NONE);
                return;
            }
        }
        sp2Var.g(5, "", "wrong-input", ApplicationStateDto.STATE_NONE);
    }

    public synchronized ArrayList w0(fb9 fb9Var) {
        ArrayList arrayListU0;
        arrayListU0 = u0();
        r(ot2.class, InputStream.class, fb9Var);
        return arrayListU0;
    }

    public void x(lf7 lf7Var) {
        String str = lf7Var.b;
        pa2 pa2Var = ((mz3) this.b).d;
        pa2Var.getClass();
        zp3[] zp3VarArr = (zp3[]) ((ConcurrentHashMap) pa2Var.b).values().toArray(new zp3[0]);
        ArrayList arrayList = new ArrayList();
        for (zp3 zp3Var : zp3VarArr) {
            if (zp3Var instanceof pf7) {
                arrayList.add(zp3Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pf7) it.next()).c.remove(str);
        }
        ((ConcurrentHashMap) this.d).remove(str);
    }

    public void x0(int i2, dp2 dp2Var, String str, String str2) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        try {
            if (i2 > 3) {
                Bundle bundle = new Bundle();
                bundle.putInt("RESPONSE_CODE", 1);
                dp2Var.invoke(bundle);
                return;
            }
            if (str != null && !f88.n0(str) && str2 != null && !f88.n0(str2)) {
                if (!I().d()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("RESPONSE_CODE", 2);
                    bundle2.putInt("RESPONSE_LOGIN", 5);
                    dp2Var.invoke(bundle2);
                    return;
                }
                ct ctVar = (ct) this.e;
                if (ctVar != null) {
                    ctVar.h(str, new AppStorageRequestDTO(str2), new je5(dp2Var, this, 0), new ie5(1, dp2Var));
                    return;
                } else {
                    js3.V("appStorageService");
                    throw null;
                }
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 2);
            dp2Var.invoke(bundle3);
        } catch (Exception e) {
            Class<?> cls = e.getClass();
            e.getMessage();
            cls.toString();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("RESPONSE_CODE", 3);
            dp2Var.invoke(bundle4);
        }
    }

    public void y(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((fw7) this.c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                y(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public Bundle y0(Bundle bundle, String str) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void z() {
        h28 h28Var = (h28) this.d;
        StringBuilder sb = h28Var.a;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        h28Var.a('\n');
    }

    public void z0(co5 co5Var, int i2) {
        Class<?> cls = co5Var.getClass();
        rb4 rb4Var = (rb4) this.b;
        bd0 bd0VarJ = ((r79) rb4Var.f).j(cls);
        if (bd0VarJ != null) {
            Object objA = bd0VarJ.a(rb4Var, (xg5) this.c);
            h28 h28Var = (h28) this.d;
            h28.c(h28Var, objA, i2, h28Var.a.length());
        }
    }

    public /* synthetic */ vp7(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public vp7(k09 k09Var, ir.mservices.market.version2.manager.d dVar, ec9 ec9Var, Context context) {
        this.a = 21;
        js3.p(k09Var, "uriService");
        js3.p(dVar, "movieProgressManager");
        js3.p(ec9Var, "vpnUtils");
        this.b = k09Var;
        this.c = dVar;
        this.d = ec9Var;
        this.e = context;
    }

    public vp7(Context context, iq0 iq0Var, kb9 kb9Var, hq0 hq0Var) {
        this.a = 9;
        js3.p(iq0Var, "cheetahService");
        js3.p(kb9Var, "vpnController");
        js3.p(hq0Var, "cheetahOnGoingNotification");
        this.b = context;
        this.c = iq0Var;
        this.d = kb9Var;
        this.e = hq0Var;
    }

    public vp7(bj bjVar, bj bjVar2, bj bjVar3, TextRangeUnits textRangeUnits) {
        this.a = 8;
        this.b = bjVar;
        this.c = bjVar2;
        this.d = bjVar3;
        this.e = textRangeUnits;
    }

    public vp7(Context context, zb3 zb3Var, d04 d04Var, ir.mservices.market.core.notification.a aVar) {
        this.a = 17;
        js3.p(zb3Var, "homeService");
        js3.p(d04Var, "languageHelper");
        js3.p(aVar, "notificationController");
        this.b = context;
        this.c = zb3Var;
        this.d = d04Var;
        this.e = aVar;
    }

    public vp7(String str, String str2) {
        this.a = 4;
        this.b = str2;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        gu guVar = w91Var.a;
        this.c = (d) w91Var.S.get();
        this.d = (c5) w91Var.L.get();
        this.e = (dp3) w91Var.v.get();
    }

    public vp7(vp7 vp7Var) {
        this.a = 26;
        ArrayList arrayList = (ArrayList) vp7Var.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) vp7Var.e;
        LinkedHashSet linkedHashSet2 = yq1.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(yq1.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        this.d = new ol3(14);
        this.e = (ArrayList) vp7Var.d;
        ArrayList arrayList3 = (ArrayList) vp7Var.c;
        this.c = arrayList3;
        new xn3(new nc2(10, arrayList3, Collections.EMPTY_MAP, false));
    }

    public vp7(mz3 mz3Var) {
        this.a = 5;
        this.b = mz3Var;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        js3.o(setNewSetFromMap, "newSetFromMap(...)");
        this.c = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        a88 a88Var = j;
        lf7 lf7Var = new lf7(a88Var, "_root_", null, mz3Var, 8);
        this.e = lf7Var;
        setNewSetFromMap.add(a88Var);
        concurrentHashMap.put("_root_", lf7Var);
    }

    public vp7(wv8 wv8Var) {
        this.a = 2;
        this.b = new ArrayList();
        this.d = new HashSet();
        this.e = wv8Var;
        this.c = h;
    }

    public vp7(Socket socket) {
        this.a = 12;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new zg1(this);
        this.e = new yg1(this);
    }

    public vp7(rb4 rb4Var, xg5 xg5Var, h28 h28Var, Map map, av avVar) {
        this.a = 19;
        this.b = rb4Var;
        this.c = xg5Var;
        this.d = h28Var;
        this.e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public vp7(fp5 fp5Var) {
        ArrayList arrayList;
        int i2;
        Bundle bundle;
        int i3;
        ArrayList arrayList2;
        Bundle bundle2;
        int i4;
        this.a = 24;
        new ArrayList();
        this.e = new Bundle();
        this.d = fp5Var;
        Context context = fp5Var.a;
        ArrayList arrayList3 = fp5Var.z;
        ArrayList arrayList4 = fp5Var.c;
        ArrayList arrayList5 = fp5Var.d;
        this.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = aq3.g(context, fp5Var.v);
        } else {
            this.c = new Notification.Builder(context);
        }
        Notification notification = fp5Var.y;
        ?? r10 = 0;
        ((Notification.Builder) this.c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fp5Var.e).setContentText(fp5Var.f).setContentInfo(null).setContentIntent(fp5Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(fp5Var.i).setProgress(fp5Var.n, fp5Var.o, fp5Var.p);
        Notification.Builder builder = (Notification.Builder) this.c;
        IconCompat iconCompat = fp5Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.c).setSubText(null).setUsesChronometer(fp5Var.l).setPriority(fp5Var.j);
        for (zo5 zo5Var : fp5Var.b) {
            if (zo5Var.b == null && (i4 = zo5Var.e) != 0) {
                zo5Var.b = IconCompat.b(r10, "", i4);
            }
            IconCompat iconCompat2 = zo5Var.b;
            boolean z = zo5Var.c;
            Bundle bundle3 = zo5Var.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != 0 ? iconCompat2.f(r10) : r10, zo5Var.f, zo5Var.g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                jr9.w(builder2, z);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                ul.H(builder2);
            }
            if (i5 >= 29) {
                te.O(builder2);
            }
            if (i5 >= 31) {
                zc.r(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", zo5Var.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            r10 = 0;
        }
        Bundle bundle4 = fp5Var.s;
        if (bundle4 != null) {
            ((Bundle) this.e).putAll(bundle4);
        }
        int i6 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.c).setShowWhen(fp5Var.k);
        ((Notification.Builder) this.c).setLocalOnly(fp5Var.r);
        ((Notification.Builder) this.c).setGroup(fp5Var.q);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(false);
        ((Notification.Builder) this.c).setCategory(null);
        ((Notification.Builder) this.c).setColor(fp5Var.t);
        ((Notification.Builder) this.c).setVisibility(fp5Var.u);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (i6 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw bl4.o(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    zv zvVar = new zv(arrayList3.size() + arrayList2.size());
                    zvVar.addAll(arrayList2);
                    zvVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(zvVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it2.next());
            }
        }
        if (arrayList5.size() > 0) {
            if (fp5Var.s == null) {
                fp5Var.s = new Bundle();
            }
            Bundle bundle5 = fp5Var.s.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList5.size()) {
                String string = Integer.toString(i7);
                zo5 zo5Var2 = (zo5) arrayList5.get(i7);
                Bundle bundle8 = new Bundle();
                if (zo5Var2.b == null && (i3 = zo5Var2.e) != 0) {
                    zo5Var2.b = IconCompat.b(null, "", i3);
                }
                IconCompat iconCompat3 = zo5Var2.b;
                Bundle bundle9 = zo5Var2.a;
                ArrayList arrayList6 = arrayList4;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", zo5Var2.f);
                bundle8.putParcelable("actionIntent", zo5Var2.g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", zo5Var2.c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", zo5Var2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i7++;
                arrayList4 = arrayList6;
            }
            arrayList = arrayList4;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (fp5Var.s == null) {
                fp5Var.s = new Bundle();
            }
            fp5Var.s.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList4;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            ((Notification.Builder) this.c).setExtras(fp5Var.s);
            jr9.z((Notification.Builder) this.c);
        }
        if (i8 >= 26) {
            aq3.s((Notification.Builder) this.c);
            aq3.y((Notification.Builder) this.c);
            aq3.z((Notification.Builder) this.c);
            aq3.A((Notification.Builder) this.c);
            aq3.u((Notification.Builder) this.c);
            if (!TextUtils.isEmpty(fp5Var.v)) {
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw bl4.o(it3);
            }
        }
        if (i8 >= 29) {
            te.J((Notification.Builder) this.c, fp5Var.x);
            te.N((Notification.Builder) this.c);
        }
        if (i8 >= 31 && (i2 = fp5Var.w) != 0) {
            zc.s((Notification.Builder) this.c, i2);
        }
        if (i8 >= 36) {
            r3.j((Notification.Builder) this.c);
        }
    }

    public vp7(xq4 xq4Var) {
        this.a = 11;
        this.c = new wv(0);
        this.d = new wv(0);
        this.b = new Object();
        this.e = new WeakReference(xq4Var);
    }

    public vp7(Typeface typeface, ov4 ov4Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.a = 20;
        this.e = typeface;
        this.b = ov4Var;
        this.d = new qv4(1024);
        int iA = ov4Var.a(6);
        if (iA != 0) {
            int i6 = iA + ov4Var.a;
            i2 = ((ByteBuffer) ov4Var.d).getInt(((ByteBuffer) ov4Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.c = new char[i2 * 2];
        int iA2 = ov4Var.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + ov4Var.a;
            i3 = ((ByteBuffer) ov4Var.d).getInt(((ByteBuffer) ov4Var.d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            lv8 lv8Var = new lv8(this, i8);
            nv4 nv4VarB = lv8Var.b();
            int iA3 = nv4VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) nv4VarB.d).getInt(iA3 + nv4VarB.a) : 0, (char[]) this.c, i8 * 2);
            nv4 nv4VarB2 = lv8Var.b();
            int iA4 = nv4VarB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + nv4VarB2.a;
                i4 = ((ByteBuffer) nv4VarB2.d).getInt(((ByteBuffer) nv4VarB2.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            wu8.j("invalid metadata codepoint length", i4 > 0);
            qv4 qv4Var = (qv4) this.d;
            nv4 nv4VarB3 = lv8Var.b();
            int iA5 = nv4VarB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + nv4VarB3.a;
                i5 = ((ByteBuffer) nv4VarB3.d).getInt(((ByteBuffer) nv4VarB3.d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            qv4Var.a(lv8Var, 0, i5 - 1);
        }
    }

    public vp7(ca7 ca7Var) {
        this.a = 16;
        this.b = new oz2();
        this.c = new oz2();
        this.e = new rl3();
    }

    public vp7(int i2) {
        this.a = i2;
        switch (i2) {
            case 3:
                w91 w91Var = (w91) ApplicationLauncher.o.b();
                this.b = w91Var.a.a;
                this.c = (c) w91Var.l0.get();
                this.d = (c5) w91Var.L.get();
                this.e = (fw4) w91Var.M.get();
                break;
            case 7:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new p6(0));
                this.c = new HashMap();
                this.d = new ReferenceQueue();
                this.b = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new q6(0, this));
                break;
            case 10:
                break;
            case 13:
                this.b = new ci6(10);
                this.c = new fw7(0);
                this.d = new ArrayList();
                this.e = new HashSet();
                break;
            case 14:
                this.e = new ArrayDeque();
                this.c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 15:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 22:
                if (zk8.b <= 0) {
                    zk8.b = Looper.getMainLooper().getThread().getId();
                }
                lw.f(null, null, Thread.currentThread().getId() == zk8.b);
                w91 w91Var2 = (w91) ApplicationLauncher.o.b();
                this.b = (c5) w91Var2.L.get();
                this.c = (dp3) w91Var2.v.get();
                this.d = (c) w91Var2.l0.get();
                this.e = (ct) w91Var2.y0.get();
                break;
            case 25:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = yq1.p;
                break;
            case 27:
                this.b = new h26();
                this.c = new h26();
                this.d = new f76();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public vp7(List list, hh5 hh5Var, hh2 hh2Var, hh5 hh5Var2) {
        this.a = 23;
        this.b = list != null ? ImmutableList.n(list) : ImmutableList.q();
        this.c = hh5Var;
        this.d = hh2Var;
        this.e = hh5Var2;
    }

    public vp7(h48 h48Var) {
        this.a = 1;
        this.c = h48Var;
        this.d = new SparseArray();
    }

    public vp7(zo8 zo8Var, boolean[] zArr) {
        this.a = 28;
        this.b = zo8Var;
        this.c = zArr;
        int i2 = zo8Var.a;
        this.d = new boolean[i2];
        this.e = new boolean[i2];
    }
}
