package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.RatingCompat;
import androidx.paging.m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.navigationrail.NavigationRailView;
import ir.mservices.market.pika.connect.dialog.PikaConfirmDialogFragment;
import ir.mservices.market.pika.receive.dialog.MiuiTipDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.manager.serverUrl.AppServersModel$AppServersParseException;
import ir.mservices.market.version2.manager.serverUrl.a;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ServerUrlDTO;
import j$.util.Objects;
import j$.util.Optional;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes.dex */
public class ck4 implements zr7, rm1, z99, l51, ko1, h32, gb8, rs1, mt4, qt5, a49, a70, at5 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ck4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String A(dn7 dn7Var) {
        ck4 ck4Var = new ck4(19);
        dn7Var.a(ck4Var);
        return ((StringBuilder) ck4Var.b).toString();
    }

    @Override // defpackage.x39
    public boolean a() {
        ((o77) this.b).getClass();
        return false;
    }

    @Override // defpackage.ko1
    public boolean b(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (recyclerView.n.f()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.e()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.s0();
        return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.mt4
    public boolean c(ot4 ot4Var, MenuItem menuItem) {
        return false;
    }

    public xe2 d(final String str, final String str2, final Object obj) {
        js3.p(str, "status");
        js3.p(str2, "filter");
        return (xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.purchaseTransaction.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new PurchaseTransactionRepositoryImpl$getPurchaseTransaction$1$1(this.a, str, str2, obj, null), null);
            }
        }).a;
    }

    @Override // defpackage.zr7
    public r61 e(r61 r61Var) {
        return r61Var instanceof h37 ? r61Var : new tc(-((fk4) this.b).k(), r61Var);
    }

    @Override // defpackage.ko1
    public float f() {
        float f;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (recyclerView.n.f()) {
            f = recyclerView.z0;
        } else {
            if (!recyclerView.n.e()) {
                return 0.0f;
            }
            f = recyclerView.y0;
        }
        return -f;
    }

    public void g() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.x39
    public dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.b).h(j, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.l51
    public Object i(Object obj) {
        return Optional.ofNullable(((l51) this.b).i((j77) obj));
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ((d27) this.b).i(false);
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.rs1
    public boolean m(bs1 bs1Var) {
        Object objA;
        js3.p(bs1Var, "downloadInfo");
        try {
            objA = Boolean.valueOf(((xl5) this.b).a.h((es1) bs1Var, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR));
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = Boolean.FALSE;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Override // defpackage.ko1
    public void n() {
        ((RecyclerView) this.b).s0();
    }

    @Override // defpackage.mt4
    public void o(ot4 ot4Var) {
        qn8 qn8Var = (qn8) this.b;
        Window.Callback callback = qn8Var.r;
        if (qn8Var.q.a.s()) {
            callback.onPanelClosed(108, ot4Var);
        } else if (callback.onPreparePanel(0, null, ot4Var)) {
            callback.onMenuOpened(108, ot4Var);
        }
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 3:
                ((MiuiTipDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
            default:
                ((PikaConfirmDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 3:
                ((MiuiTipDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
            default:
                ((PikaConfirmDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
        }
    }

    @Override // defpackage.a70
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((ju2) this.b).onConnectionFailed(connectionResult);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        ServerUrlDTO serverUrlDTO = (ServerUrlDTO) obj;
        kp7 kp7Var = (kp7) this.b;
        Objects.toString(serverUrlDTO);
        try {
            a aVar = kp7Var.m;
            qs qsVarB = qs.b(serverUrlDTO, aVar.a.fallbackServerUrl);
            if (!aVar.a.equals(qsVarB)) {
                aVar.a = qsVarB;
                aVar.a(qsVarB);
                t32.b().g(new rs());
            }
            kp7Var.i(true);
        } catch (AppServersModel$AppServersParseException e) {
            lw.g(e, "App servers are not correct", null);
            kp7Var.i(false);
        }
    }

    @Override // defpackage.x39
    public dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.b).q(j, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.b).r(dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((o77) this.b).s(dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        if9 if9Var = lf9Var.a;
        no3 no3VarG = if9Var.g(519);
        no3 no3VarG2 = if9Var.g(128);
        NavigationRailView navigationRailView = (NavigationRailView) this.b;
        Boolean bool = navigationRailView.k;
        if (bool != null ? bool.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            aa9Var.b += no3VarG.b;
        }
        Boolean bool2 = navigationRailView.l;
        if (bool2 != null ? bool2.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            aa9Var.d += no3VarG.d;
        }
        Boolean bool3 = navigationRailView.m;
        if (bool3 != null ? bool3.booleanValue() : navigationRailView.getFitsSystemWindows()) {
            if (o37.o(view)) {
                aa9Var.a = Math.max(no3VarG.c, no3VarG2.c) + aa9Var.a;
            } else {
                aa9Var.a = Math.max(no3VarG.a, no3VarG2.a) + aa9Var.a;
            }
        }
        view.setPaddingRelative(aa9Var.a, aa9Var.b, aa9Var.c, aa9Var.d);
        return lf9Var;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (((Integer) this.b) != null) {
                    str = "value=" + ((Integer) this.b);
                } else {
                    str = "value not initialized yet";
                }
                return bl4.y(sb, str, ')');
            case 19:
                return ((StringBuilder) this.b).toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, Bitmap bitmap) {
        Integer num = (Integer) MediaMetadataCompat.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(o40.y("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void v(long j, String str) {
        Integer num = (Integer) MediaMetadataCompat.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(o40.y("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j);
    }

    public void w(String str, RatingCompat ratingCompat) {
        Object obj;
        float f = ratingCompat.b;
        int i = ratingCompat.a;
        Integer num = (Integer) MediaMetadataCompat.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(o40.y("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.b;
        if (ratingCompat.c != null) {
            obj = ratingCompat.c;
        } else {
            if (ratingCompat.c()) {
                switch (i) {
                    case 1:
                        ratingCompat.c = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        ratingCompat.c = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat.c = Rating.newStarRating(i, ratingCompat.b());
                        break;
                    case 6:
                        if (i != 6 || !ratingCompat.c()) {
                            f = -1.0f;
                        }
                        ratingCompat.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                ratingCompat.c = Rating.newUnratedRating(i);
            }
            obj = ratingCompat.c;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public void x(String str, String str2) {
        Integer num = (Integer) MediaMetadataCompat.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(o40.y("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public void y(CharSequence charSequence, String str) {
        Integer num = (Integer) MediaMetadataCompat.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(o40.y("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.b).putCharSequence(str, charSequence);
    }

    public void z() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new pe0(2, viewFindViewById));
    }

    public /* synthetic */ ck4(int i, boolean z) {
        this.a = i;
    }

    public ck4(e05 e05Var) {
        this.a = 4;
        js3.p(e05Var, "movieBookmarkService");
        this.b = e05Var;
    }

    public ck4(c75 c75Var) {
        this.a = 5;
        js3.p(c75Var, "movieService");
        this.b = c75Var;
    }

    public ck4(zn6 zn6Var) {
        this.a = 11;
        js3.p(zn6Var, "purchaseTransactionService");
        this.b = zn6Var;
    }

    public ck4(y57 y57Var) {
        this.a = 14;
        js3.p(y57Var, "service");
        this.b = y57Var;
    }

    public ck4(xl5 xl5Var) {
        this.a = 18;
        js3.p(xl5Var, "nene");
        this.b = xl5Var;
    }

    public ck4(int i) {
        Object sl3Var;
        this.a = i;
        switch (i) {
            case 10:
                if (Build.VERSION.SDK_INT >= 28) {
                    sl3Var = new u96(3);
                } else {
                    sl3Var = new sl3(15);
                }
                this.b = sl3Var;
                break;
            case 19:
                this.b = new StringBuilder();
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public ck4(float f, float f2, dl dlVar) {
        el ut4Var;
        this.a = 23;
        int[] iArr = y39.a;
        if (dlVar != null) {
            ut4Var = new xg5(f, f2, dlVar);
        } else {
            ut4Var = new ut4(f, f2);
        }
        this.b = new o77(ut4Var);
    }
}
