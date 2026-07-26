package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.paging.l;
import androidx.paging.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.gms.common.internal.TelemetryData;
import io.sentry.android.core.t0;
import ir.mservices.market.app.suggest.search.ui.SuggestListFragment;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.pika.home.dialog.NeedPermissionDialog;
import ir.mservices.market.pika.home.dialog.PikaPermissionBottomDialog;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PushNotifTextDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.TrackingConfigDTO;
import ir.mservices.market.versionNote.ui.VersionNoteDialogFragment;
import ir.mservices.market.views.FastDownloadView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class t15 implements m45, h32, rm1, pz2, rs1, s82, gb8, q37, tt5 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public synchronized void a() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        cf8 cf8Var = (cf8) obj2;
        ui9 ui9Var = (ui9) ((aj9) obj).getService();
        TelemetryData telemetryData = (TelemetryData) this.b;
        ui9Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(ui9Var.p);
        di9.b(parcelObtain, telemetryData);
        try {
            ui9Var.o.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            cf8Var.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public void b(xb xbVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = xbVar.a;
        if (i == 1) {
            recyclerView.n.Z(xbVar.b, xbVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.n.c0(xbVar.b, xbVar.d);
        } else if (i == 4) {
            recyclerView.n.d0(xbVar.b, xbVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.n.b0(xbVar.b, xbVar.d);
        }
    }

    @Override // defpackage.m45
    public void c() {
        if (((MovieDetailRecyclerListFragment) this.b).j1 != null) {
            fw0.c("movie_detail_reviews");
        } else {
            js3.V("commentAnalytics");
            throw null;
        }
    }

    @Override // defpackage.pz2
    public void d(ja9 ja9Var) {
        ca7 ca7Var = ((l) this.b).f;
        ca7Var.getClass();
        ((vp7) ca7Var.b).s0(ja9Var instanceof ha9 ? (ha9) ja9Var : null, new g8(7, ja9Var));
    }

    @Override // defpackage.m45
    public void e() {
        if (((MovieDetailRecyclerListFragment) this.b).j1 != null) {
            fw0.e("movie_detail_reviews");
        } else {
            js3.V("commentAnalytics");
            throw null;
        }
    }

    public o f(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.f.o();
        int i2 = 0;
        o oVar = null;
        while (true) {
            if (i2 >= iO) {
                break;
            }
            o oVarO = RecyclerView.O(recyclerView.f.n(i2));
            if (oVarO != null && !oVarO.i() && oVarO.c == i) {
                if (!((ArrayList) recyclerView.f.e).contains(oVarO.a)) {
                    oVar = oVarO;
                    break;
                }
                oVar = oVarO;
            }
            i2++;
        }
        if (oVar == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f.e).contains(oVar.a)) {
            return oVar;
        }
        boolean z = RecyclerView.Z0;
        return null;
    }

    public xe2 g(ExtensionPointDto extensionPointDto) {
        js3.p(extensionPointDto, "extensionPointDto");
        return (xe2) new m(gu9.B(), new xv3(extensionPointDto, this, 23)).a;
    }

    public xe2 h(ExtensionPointDto extensionPointDto, String str) {
        js3.p(extensionPointDto, "extensionPointDto");
        return (xe2) new m(gu9.B(), new f8(extensionPointDto, this, str, 21)).a;
    }

    public void i(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.f.o();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iO; i6++) {
            View viewN = recyclerView.f.n(i6);
            o oVarO = RecyclerView.O(viewN);
            if (oVarO != null && !oVarO.p() && (i4 = oVarO.c) >= i && i4 < i5) {
                oVarO.a(2);
                if (obj == null) {
                    oVarO.a(1024);
                } else if ((1024 & oVarO.j) == 0) {
                    if (oVarO.k == null) {
                        ArrayList arrayList = new ArrayList();
                        oVarO.k = arrayList;
                        oVarO.l = DesugarCollections.unmodifiableList(arrayList);
                    }
                    oVarO.k.add(obj);
                }
                ((RecyclerView.LayoutParams) viewN.getLayoutParams()).c = true;
            }
        }
        androidx.recyclerview.widget.l lVar = recyclerView.c;
        ArrayList arrayList2 = lVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList2.get(size);
            if (oVar != null && (i3 = oVar.c) >= i && i3 < i5) {
                oVar.a(2);
                lVar.h(size);
            }
        }
        recyclerView.I0 = true;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        Objects.toString((ErrorDTO) serializable);
        ((t0) this.b).D(new ce5(257, null, null));
    }

    public void k(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.f.o();
        for (int i3 = 0; i3 < iO; i3++) {
            o oVarO = RecyclerView.O(recyclerView.f.n(i3));
            if (oVarO != null && !oVarO.p() && oVarO.c >= i) {
                if (RecyclerView.a1) {
                    oVarO.toString();
                }
                oVarO.m(i2, false);
                recyclerView.E0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            if (oVar != null && oVar.c >= i) {
                if (RecyclerView.a1) {
                    oVar.toString();
                }
                oVar.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.H0 = true;
    }

    public void l(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.f.o();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iO; i11++) {
            o oVarO = RecyclerView.O(recyclerView.f.n(i11));
            if (oVarO != null && (i9 = oVarO.c) >= i4 && i9 <= i3) {
                if (RecyclerView.a1) {
                    oVarO.toString();
                }
                if (oVarO.c == i) {
                    oVarO.m(i2 - i, false);
                } else {
                    oVarO.m(i5, false);
                }
                recyclerView.E0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = (o) arrayList.get(i12);
            if (oVar != null && (i8 = oVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    oVar.m(i2 - i, false);
                } else {
                    oVar.m(i10, false);
                }
                if (RecyclerView.a1) {
                    oVar.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.H0 = true;
    }

    @Override // defpackage.rs1
    public boolean m(bs1 bs1Var) {
        Object objA;
        js3.p(bs1Var, "downloadInfo");
        try {
            ((xl5) this.b).a.f((es1) bs1Var);
            if (eq.n(bs1Var)) {
                String strY = y97.y(bs1Var);
                if (strY == null) {
                    strY = "";
                }
                zb2.f(new File(strY));
            }
            objA = Boolean.TRUE;
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = Boolean.FALSE;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        Bundle bundle;
        dw1.y("search_google_install");
        FragmentActivity fragmentActivityF = ((SuggestListFragment) this.b).F();
        du duVar = (du) ((w91) ApplicationLauncher.o.b()).B0.get();
        if (r82Var == null || (bundle = r82Var.k) == null) {
            return;
        }
        String string = bundle.getString("refId");
        String string2 = bundle.getString("BUNDLE_KEY_CALLBACK_URL");
        String string3 = bundle.getString("installCallbackUrl");
        String string4 = bundle.getString("BUNDLE_KEY_DOWNLOAD_REF");
        if (duVar == null) {
            js3.V("appUtils");
            throw null;
        }
        if (string == null || f88.n0(string)) {
            string = "ListDownloadButton";
        }
        duVar.a(r82Var, fragmentActivityF, string, string2, string3, string4);
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 2:
                ((NeedPermissionDialog) this.b).R0(DialogResult.b, new Bundle());
                break;
            case 5:
                ((PikaPermissionBottomDialog) this.b).R0(DialogResult.b, new Bundle());
                break;
            case 7:
                break;
            default:
                ((VersionNoteDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 2:
                ((NeedPermissionDialog) this.b).R0(DialogResult.a, new Bundle());
                break;
            case 5:
                ((PikaPermissionBottomDialog) this.b).R0(DialogResult.a, new Bundle());
                break;
            case 7:
                ((PushNotifTextDialogFragment) this.b).F().finish();
                break;
        }
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 15:
                TrackingConfigDTO trackingConfigDTO = (TrackingConfigDTO) obj;
                Objects.toString(trackingConfigDTO);
                pp8 pp8Var = (pp8) this.b;
                wl5 wl5Var = pp8Var.m;
                boolean zShouldReportDownloadFailReason = trackingConfigDTO.shouldReportDownloadFailReason();
                wl5Var.b = zShouldReportDownloadFailReason;
                wl5Var.a.j(lu7.U, zShouldReportDownloadFailReason);
                wl5 wl5Var2 = pp8Var.m;
                int downloadFailReasonSampleRateInMillion = trackingConfigDTO.getDownloadFailReasonSampleRateInMillion();
                wl5Var2.getClass();
                if (downloadFailReasonSampleRateInMillion < 0 || downloadFailReasonSampleRateInMillion > 1000000) {
                    wl5Var2.c = 0;
                } else {
                    wl5Var2.c = downloadFailReasonSampleRateInMillion;
                }
                wl5Var2.a.g(wl5Var2.c, lu7.V);
                pp8Var.d.j(lu7.A0, trackingConfigDTO.isShowDownloadVpnHint());
                pp8Var.d.g(trackingConfigDTO.getClaritySampleRate(), lu7.B0);
                pp8Var.d.g(trackingConfigDTO.getAppSpeedControlSampleRate(), lu7.C0);
                pp8Var.d.g(trackingConfigDTO.getAppSpeedControlTimeLimit(), lu7.D0);
                pp8Var.d.g(trackingConfigDTO.getMovieSpeedControlSampleRate(), lu7.E0);
                pp8Var.d.g(trackingConfigDTO.getMovieSpeedControlTimeLimit(), lu7.F0);
                pp8Var.i(true);
                break;
            default:
                ((bo9) this.b).getClass();
                break;
        }
    }

    public ir9 q(nc2 nc2Var, AndroidComposeView androidComposeView) {
        int i;
        long jG;
        long j;
        boolean z;
        ue4 ue4Var = (ue4) this.b;
        List list = (List) nc2Var.c;
        ue4 ue4Var2 = new ue4(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            ch6 ch6Var = (ch6) list.get(i2);
            long j2 = ch6Var.a;
            bh6 bh6Var = (bh6) ue4Var.d(j2);
            if (bh6Var == null) {
                i = i2;
                j = ch6Var.b;
                jG = ch6Var.d;
                z = false;
            } else {
                long j3 = bh6Var.a;
                boolean z2 = bh6Var.c;
                i = i2;
                jG = androidComposeView.G(bh6Var.b);
                j = j3;
                z = z2;
            }
            long j4 = ch6Var.a;
            List list2 = list;
            int i3 = size;
            ue4Var2.i(j4, new ah6(j4, ch6Var.b, ch6Var.d, ch6Var.e, ch6Var.f, j, jG, z, ch6Var.g, ch6Var.i, ch6Var.j, ch6Var.k));
            boolean z3 = ch6Var.e;
            if (z3) {
                ue4Var.i(j2, new bh6(ch6Var.b, ch6Var.c, z3));
            } else {
                ue4Var.j(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new ir9(ue4Var2, nc2Var);
    }

    public Object r() {
        fr9 fr9Var = (fr9) this.b;
        ContentResolver contentResolver = fr9Var.a;
        Uri uri = fr9Var.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                t0.m("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, fr9.j, null, null, null);
            try {
                if (cursorQuery == null) {
                    t0.m("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map wvVar = count <= 256 ? new wv(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    wvVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return wvVar;
                }
                t0.m("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e) {
            t0.n("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public t15(oj7 oj7Var) {
        this.a = 16;
        js3.p(oj7Var, "searchService");
        this.b = oj7Var;
    }

    public t15(Context context) {
        boolean zIsEmpty;
        this.a = 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                a();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public t15(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new LinkedHashMap();
                break;
            case 18:
                break;
            default:
                this.b = new ue4((Object) null);
                break;
        }
    }

    private final void o() {
    }

    private final void p() {
    }
}
