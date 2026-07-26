package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.node.h;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.bumptech.glide.load.resource.bitmap.a;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.dockedtoolbar.DockedToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import io.sentry.android.core.t0;
import ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.AlertDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppSignNotMatchedDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.FastDownloadView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNullPointerException;
import kotlin.b;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 implements h32, rm1, z95, s82, f70, gb8, ta1, zq0, ms5, z99, b72, wh2, jo7, il0, i87 {
    public static volatile pt2 c;
    public static final jj0 d = new jj0(1);
    public static final pt2 e = new pt2(2, false);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ pt2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static pt2 v(int i, int i2, int i3) {
        return new pt2(4, AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // defpackage.b72
    public int a() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.b72
    public int b() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.ta1
    public void c() {
        switch (this.a) {
            case 13:
                break;
            default:
                ((a) this.b).d();
                break;
        }
    }

    @Override // defpackage.wh2
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.il0
    public void e(dl0 dl0Var, h77 h77Var) {
        om0 om0Var = (om0) this.b;
        if (!h77Var.a.q) {
            om0Var.resumeWith(b.a(new HttpException(h77Var)));
            return;
        }
        Object obj = h77Var.b;
        if (obj != null) {
            om0Var.resumeWith(obj);
            return;
        }
        w47 w47VarB1 = dl0Var.b1();
        w47VarB1.getClass();
        ps0 ps0VarA = g27.a(xs3.class);
        Object objCast = yh0.u(ps0VarA).cast(w47VarB1.e.e(ps0VarA));
        js3.m(objCast);
        xs3 xs3Var = (xs3) objCast;
        om0Var.resumeWith(b.a(new KotlinNullPointerException("Response from " + xs3Var.a.getName() + '.' + xs3Var.c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // defpackage.z95
    public void f(View view, ir.mservices.market.version2.ui.recycler.holder.a aVar, MultiSelectRecyclerData multiSelectRecyclerData) {
        js3.p(multiSelectRecyclerData, "recyclerData");
        AppBookmarkRecyclerListFragment appBookmarkRecyclerListFragment = (AppBookmarkRecyclerListFragment) this.b;
        int i = AppBookmarkRecyclerListFragment.j1;
        appBookmarkRecyclerListFragment.Q1().u(multiSelectRecyclerData);
    }

    @Override // defpackage.f70
    public void g(String str) {
        e70 e70Var = (e70) this.b;
        if (f88.n0(str)) {
            return;
        }
        int childCount = e70Var.y.getChildCount();
        for (int i = 0; i < childCount; i++) {
            e70Var.L(i, str);
        }
    }

    @Override // defpackage.b72
    public int h() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.ta1
    public Object i() {
        switch (this.a) {
            case 13:
                ByteBuffer byteBuffer = (ByteBuffer) this.b;
                byteBuffer.position(0);
                return byteBuffer;
            default:
                a aVar = (a) this.b;
                aVar.reset();
                return aVar;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        Objects.toString(errorDTO);
        sb7.p("MyketService", "Authorize failed", "error: " + errorDTO.getTranslatedMessage());
        o2.authorizeCount = o2.authorizeCount + (-1);
        o2.authorizeInProgress = false;
        o2 o2Var = (o2) this.b;
        LinkedList linkedList = new LinkedList(o2Var.requestProxy.c);
        o2Var.requestProxy.c.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            xv2 xv2Var = (xv2) it.next();
            if (!xv2Var.l()) {
                String translatedMessage = errorDTO.getTranslatedMessage();
                if (translatedMessage == null || f88.n0(translatedMessage)) {
                    translatedMessage = o2Var.context.getString(rs6.error_dto_default_message);
                }
                xv2Var.c(new VolleyError(translatedMessage));
            }
            it.remove();
        }
    }

    @Override // defpackage.b72
    public ViewGroup.LayoutParams k() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // defpackage.jo7
    public void l(ko7 ko7Var) {
        a03 a03Var = (a03) this.b;
        a03Var.q.l(a03Var);
    }

    @Override // defpackage.wh2
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e2) {
            t0.n("FontsProvider", "Unable to query the content provider", e2);
            return null;
        }
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        r82 r82Var2;
        String str;
        Bundle bundle;
        AppDetailFragment appDetailFragment = (AppDetailFragment) this.b;
        FragmentActivity fragmentActivityF = appDetailFragment.F();
        du duVar = (du) ((w91) ApplicationLauncher.o.b()).B0.get();
        if (r82Var == null || (bundle = r82Var.k) == null) {
            r82Var2 = r82Var;
        } else {
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
            r82Var2 = r82Var;
            duVar.a(r82Var2, fragmentActivityF, string, string2, string3, string4);
        }
        if (r82Var2 == null || (str = r82Var2.b) == null) {
            return;
        }
        ra3 ra3VarX1 = appDetailFragment.X1();
        String str2 = r82Var2.c;
        js3.o(str2, "getTitle(...)");
        ra3VarX1.c(str2, str);
    }

    @Override // defpackage.il0
    public void o(dl0 dl0Var, Throwable th) {
        ((om0) this.b).resumeWith(b.a(th));
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 5:
                AlertDialogFragment alertDialogFragment = (AlertDialogFragment) this.b;
                Bundle bundle = new Bundle();
                bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                alertDialogFragment.N0(DialogResult.b, bundle);
                break;
            default:
                ((AppSignNotMatchedDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 5:
                break;
            default:
                ((AppSignNotMatchedDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.gb8
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.b72
    public int p() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.b;
        lf9 lf9Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? lf9Var : null;
        if (!Objects.equals(collapsingToolbarLayout.E, lf9Var2)) {
            collapsingToolbarLayout.E = lf9Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return lf9Var.a.c();
    }

    public void r(h hVar) {
        if (!hVar.U()) {
            rn3.b("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.b).add(hVar);
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        DockedToolbarLayout dockedToolbarLayout = (DockedToolbarLayout) this.b;
        Boolean bool = dockedToolbarLayout.b;
        Boolean bool2 = dockedToolbarLayout.a;
        if (bool2 != null && bool != null && !bool2.booleanValue() && !bool.booleanValue()) {
            return lf9Var;
        }
        no3 no3VarG = lf9Var.a.g(655);
        int i = no3VarG.d;
        int i2 = no3VarG.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i3 = (DockedToolbarLayout.a(dockedToolbarLayout, layoutParams, 48) && bool2 == null && dockedToolbarLayout.getFitsSystemWindows()) ? i2 : 0;
        int i4 = (DockedToolbarLayout.a(dockedToolbarLayout, layoutParams, 80) && bool == null && dockedToolbarLayout.getFitsSystemWindows()) ? i : 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                i = 0;
            }
            i4 = i;
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                i2 = 0;
            }
            i3 = i2;
        }
        int i5 = aa9Var.b + i3;
        aa9Var.b = i5;
        int i6 = aa9Var.d + i4;
        aa9Var.d = i6;
        view.setPaddingRelative(aa9Var.a, i5, aa9Var.c, i6);
        return lf9Var;
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return ((SortedSet) this.b).toString();
            default:
                return super.toString();
        }
    }

    public Set u() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return setUnmodifiableSet;
    }

    public void x() {
        a03 a03Var = (a03) this.b;
        int i = a03Var.r - 1;
        a03Var.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (x03 x03Var : a03Var.t) {
            x03Var.w();
            i2 += x03Var.I.a;
        }
        yo8[] yo8VarArr = new yo8[i2];
        int i3 = 0;
        for (x03 x03Var2 : a03Var.t) {
            x03Var2.w();
            int i4 = x03Var2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                x03Var2.w();
                yo8VarArr[i3] = x03Var2.I.a(i5);
                i5++;
                i3++;
            }
        }
        a03Var.s = new zo8(yo8VarArr);
        a03Var.q.d(a03Var);
    }

    public boolean y(h hVar) {
        if (!hVar.U()) {
            rn3.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.b).remove(hVar);
    }

    public void z(es1 es1Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.b;
        tt1 tt1Var = (tt1) sparseArray.get(es1Var.a);
        if (tt1Var == null) {
            throw new IllegalArgumentException("downloadItem does not exist in container, " + es1Var);
        }
        sparseArray.remove(es1Var.a);
        if (z) {
            tt1Var.k = 300;
            tt1Var.b();
        }
    }

    public /* synthetic */ pt2(int i, boolean z) {
        this.a = i;
    }

    public pt2(wc5 wc5Var) {
        this.a = 24;
        js3.p(wc5Var, "myAccountService");
        this.b = wc5Var;
    }

    public pt2(InputStream inputStream, dr3 dr3Var) {
        this.a = 27;
        a aVar = new a(inputStream, dr3Var);
        this.b = aVar;
        aVar.mark(5242880);
    }

    public pt2(jt2 jt2Var) {
        this.a = 25;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(jt2Var.a));
    }

    public pt2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new HashMap();
                break;
            case 9:
                this.b = new AtomicInteger(0);
                break;
            case 16:
                js3.p(TimeUnit.MINUTES, "timeUnit");
                gf8 gf8Var = gf8.l;
                js3.p(gf8Var, "taskRunner");
                this.b = new lz1(gf8Var);
                break;
            case 18:
                this.b = new SortedSet(is3.b);
                break;
            case 29:
                pp1 pp1Var = new pp1(1);
                this.b = pp1Var;
                if (!pp1Var.b) {
                    if (pp1Var.c) {
                        xi6.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    pp1Var.b();
                    pp1Var.c = true;
                    break;
                }
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    private final void s() {
    }

    private final void w() {
    }

    public pt2(TextView textView) {
        this.a = 21;
        this.b = new p02(textView);
    }

    public pt2(Context context, Uri uri) {
        this.a = 23;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
