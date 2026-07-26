package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.datastore.preferences.protobuf.e;
import androidx.paging.m;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.d;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.fragments.dialog.AppInstallUnSuccessDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.views.FastDownloadView;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r79 implements gb8, fu4, rm1, s82, w67, ta8, z94, f82, ks2, rs1 {
    public static final xs8 c = new xs8();
    public static Class d;
    public static boolean e;
    public static Method f;
    public static boolean g;
    public static Method h;
    public static boolean i;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r79(int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    @Override // defpackage.ta8
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.jl0
    public void b() {
        ((CropContentFragment) this.b).a1.setVisibility(8);
    }

    @Override // defpackage.fu4
    public void d(ot4 ot4Var, boolean z) {
        ((ln) this.b).r(ot4Var);
    }

    @Override // defpackage.ta8
    public long e(int i2) {
        vy2.j(i2 == 0);
        return 0L;
    }

    @Override // defpackage.w67
    public g67 f(g67 g67Var, sv5 sv5Var) {
        Resources resources = (Resources) this.b;
        if (g67Var == null) {
            return null;
        }
        return new qc0(resources, g67Var);
    }

    @Override // defpackage.f82
    public Object g() {
        ry0 ry0Var = (ry0) this.b;
        return new d((it2) ry0Var.a, (it2) ry0Var.b, (it2) ry0Var.c, (it2) ry0Var.d, (b) ry0Var.e, (b) ry0Var.f, (wv8) ry0Var.g);
    }

    @Override // defpackage.ta8
    public List h(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public void i() {
        ((d01) this.b).getClass();
    }

    public bd0 j(Class cls) {
        return (bd0) ((Map) this.b).get(cls);
    }

    @Override // defpackage.ta8
    public int k() {
        return 1;
    }

    @Override // defpackage.fu4
    public boolean l(ot4 ot4Var) {
        Window.Callback callback = ((ln) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, ot4Var);
        return true;
    }

    @Override // defpackage.rs1
    public boolean m(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        k68 k68Var = (k68) this.b;
        es1 es1Var = (es1) bs1Var;
        String str = es1Var.c;
        js3.o(str, "getDestFilePath(...)");
        k68Var.a(str, k68.e);
        zb2.f(new File(es1Var.c));
        return true;
    }

    @Override // defpackage.s82
    public void n(FastDownloadView fastDownloadView, r82 r82Var) {
        dw1.y("update_recom_download");
        ((bn6) this.b).n(fastDownloadView, r82Var);
    }

    public k79 o(ps0 ps0Var) {
        o77 o77Var = (o77) this.b;
        String strB = ps0Var.b();
        if (strB != null) {
            return o77Var.u(ps0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.rm1
    public void onCancel() {
        AppInstallUnSuccessDialogFragment appInstallUnSuccessDialogFragment = (AppInstallUnSuccessDialogFragment) this.b;
        appInstallUnSuccessDialogFragment.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
        appInstallUnSuccessDialogFragment.N0(DialogResult.b, bundle);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 1:
                ((om0) obj2).resumeWith(new l99((String) obj));
                break;
            default:
                InboxInfoModel inboxInfoModel = (InboxInfoModel) obj;
                if (inboxInfoModel == null) {
                    int i3 = ul3.e;
                    break;
                } else {
                    ul3 ul3Var = (ul3) obj2;
                    ul3Var.getClass();
                    if (!inboxInfoModel.t()) {
                        inboxInfoModel.w();
                        ul3Var.c.z(inboxInfoModel, new pl3(ul3Var, inboxInfoModel, 0), new ql3(), ul3Var);
                        break;
                    }
                }
                break;
        }
    }

    public xe2 p(final String str, final BaseAccountUsersViewModel baseAccountUsersViewModel) {
        js3.p(str, "accountKey");
        return (xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.social.users.followers.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new AccountFollowersRepositoryImpl$getFollowers$1$1(this.a, str, baseAccountUsersViewModel, null), null);
            }
        }).a;
    }

    public void q() {
        ((tk2) this.b).v.U();
    }

    public ap1 r() {
        ap1 ap1Var;
        synchronized (((ArrayDeque) this.b)) {
            ap1Var = (ap1) ((ArrayDeque) this.b).poll();
        }
        return ap1Var == null ? new ap1() : ap1Var;
    }

    public void s(ap1 ap1Var) {
        synchronized (((ArrayDeque) this.b)) {
            try {
                if (((ArrayDeque) this.b).size() < 10) {
                    ((ArrayDeque) this.b).offer(ap1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ks2
    public void setVisibility(int i2) {
        ((View) this.b).setVisibility(i2);
    }

    public void t(int i2, int i3, Object obj) {
        ((a) this.b).h(i2, i3, obj);
    }

    public void u(int i2, int i3) {
        ((a) this.b).i(i2, i3);
    }

    public void v(int i2, int i3) {
        ((a) this.b).j(i2, i3);
    }

    public void w(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    public void x(int i2, Object obj, hf7 hf7Var) {
        e eVar = (e) this.b;
        eVar.s0(i2, 3);
        hf7Var.e((androidx.datastore.preferences.protobuf.a) obj, eVar.l);
        eVar.s0(i2, 4);
    }

    public r79(et1 et1Var) {
        this.a = 17;
        js3.p(et1Var, "service");
        this.b = et1Var;
    }

    public r79(fh2 fh2Var) {
        this.a = 2;
        js3.p(fh2Var, "followersAccountService");
        this.b = fh2Var;
    }

    public r79(Context context) {
        this.a = 22;
        this.b = new vr3(context);
    }

    public r79(e eVar) {
        this.a = 12;
        ur3.a(eVar, "output");
        this.b = eVar;
        eVar.l = this;
    }

    public r79(k68 k68Var) {
        this.a = 29;
        js3.p(k68Var, "storageUtils");
        this.b = k68Var;
    }

    public r79(u79 u79Var, q79 q79Var, l71 l71Var) {
        this.a = 0;
        js3.p(u79Var, "store");
        js3.p(q79Var, "factory");
        js3.p(l71Var, "defaultCreationExtras");
        this.b = new o77(u79Var, q79Var, l71Var);
    }

    public r79() {
        this.a = 16;
        this.b = new ArrayDeque();
    }

    public r79(ul3 ul3Var, String str) {
        this.a = 21;
        this.b = ul3Var;
    }

    @Override // defpackage.rm1
    public void onCommit() {
    }

    @Override // defpackage.ks2
    public void c(View view, ViewGroup viewGroup) {
    }
}
