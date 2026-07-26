package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.paging.m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.zab;
import com.google.android.material.navigation.NavigationView;
import defpackage.dc0;
import defpackage.hl5;
import io.sentry.android.core.t0;
import ir.mservices.market.app.packages.data.PackageDto;
import ir.mservices.market.login.ui.UnbindAllLoginDialogFragment;
import ir.mservices.market.pika.receive.dialog.PikaInstallFailedDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.services.b;
import ir.mservices.market.version2.webapi.requestdto.UnbindAllRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.MyketProgressState;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class hl5 implements mt4, rm1, dq2, h32, va8, q37 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ hl5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ir.mservices.market.app.packages.data.PackageDto e(ir.mservices.market.app.packages.data.PackageDto r9, boolean r10) {
        /*
            java.util.List r0 = r9.getIgnoreConditions()
            ir.mservices.market.version2.ui.recycler.filter.GeneralFilter r0 = ir.mservices.market.version2.ui.recycler.filter.a.a(r0)
            if (r0 == 0) goto L44
            java.util.List r1 = r9.getAppList()
            r2 = 0
            if (r1 == 0) goto L3f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r1.next()
            r5 = r4
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r5 = (ir.mservices.market.version2.webapi.responsedto.ApplicationDTO) r5
            ir.mservices.market.app.common.recycler.FilteredAppNestedData r6 = new ir.mservices.market.app.common.recycler.FilteredAppNestedData
            r6.<init>(r5)
            boolean r5 = r0.u(r6)
            if (r5 != 0) goto L1a
            r3.add(r4)
            goto L1a
        L36:
            if (r10 == 0) goto L3e
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 != 0) goto L42
            goto L44
        L42:
            r5 = r2
            goto L49
        L44:
            java.util.List r2 = r9.getAppList()
            goto L42
        L49:
            ir.mservices.market.app.packages.data.PackageDto r3 = new ir.mservices.market.app.packages.data.PackageDto
            java.lang.String r4 = r9.getTitle()
            boolean r6 = r9.getEol()
            java.lang.String r7 = r9.getShareText()
            java.util.List r8 = r9.getIgnoreConditions()
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl5.e(ir.mservices.market.app.packages.data.PackageDto, boolean):ir.mservices.market.app.packages.data.PackageDto");
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public long a(long j) {
        fi1 fi1Var = (fi1) this.b;
        fi1Var.getClass();
        if (e49.b(j) <= 0.0f || e49.c(j) <= 0.0f) {
            rn3.b("maximumVelocity should be a positive value. You specified=" + ((Object) e49.g(j)));
        }
        return j97.a(((f49) fi1Var.b).b(e49.b(j)), ((f49) fi1Var.c).b(e49.c(j)));
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                cf8 cf8Var = (cf8) obj2;
                si9 si9Var = (si9) ((uh9) obj).getService();
                zab zabVar = (zab) this.b;
                si9Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(si9Var.p);
                di9.b(parcelObtain, zabVar);
                try {
                    si9Var.o.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    cf8Var.b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            default:
                vo4 vo4Var = new vo4(21, (cf8) obj2);
                ((yn9) this.b).a((zm9) obj, vo4Var);
                return;
        }
    }

    public synchronized m67 b(Class cls) {
        int size = ((ArrayList) this.b).size();
        for (int i = 0; i < size; i++) {
            n67 n67Var = (n67) ((ArrayList) this.b).get(i);
            if (n67Var.a.isAssignableFrom(cls)) {
                return n67Var.b;
            }
        }
        return null;
    }

    @Override // defpackage.mt4
    public boolean c(ot4 ot4Var, MenuItem menuItem) {
        ((NavigationView) this.b).getClass();
        return false;
    }

    public boolean d(String str) {
        String strK = k(str);
        return "1".equals(strK) || Boolean.parseBoolean(strK);
    }

    public Integer f(String str) {
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strK));
        } catch (NumberFormatException unused) {
            t0.m("NotificationParams", "Couldn't parse value of " + q(str) + "(" + strK + ") into an int");
            return null;
        }
    }

    public JSONArray g(String str) {
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        try {
            return new JSONArray(strK);
        } catch (JSONException unused) {
            t0.m("NotificationParams", "Malformed JSON for key " + q(str) + ": " + strK + ", falling back to default");
            return null;
        }
    }

    public xe2 h(final PackageDto packageDto, final String str, final String str2, final Object obj, boolean z) {
        js3.p(str, "packageKey");
        return (xe2) new m(gu9.o(z), new bp2() { // from class: ir.mservices.market.app.packages.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                PackageRepositoryImpl$getPackages$1$1 packageRepositoryImpl$getPackages$1$1 = new PackageRepositoryImpl$getPackages$1$1(null, this, obj, str, str2);
                PackageDto packageDto2 = packageDto;
                dc0 dc0Var = null;
                if (packageDto2 != null) {
                    PackageDto packageDtoE = hl5.e(packageDto2, !packageDto2.getEol());
                    if (packageDtoE.getAppList() != null) {
                        List<ApplicationDTO> appList = packageDto2.getAppList();
                        dc0Var = new dc0(appList != null ? appList.size() : 0, 9, packageDtoE);
                    }
                }
                return new ir.mservices.market.model.paging.a(packageRepositoryImpl$getPackages$1$1, dc0Var);
            }
        }).a;
    }

    public String i(String str, Resources resources, String str2) {
        String[] strArr;
        String strK = k(str2);
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        String strK2 = k(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strK2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strK2, "string", str);
        if (identifier == 0) {
            t0.m("NotificationParams", q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayG = g(str2.concat("_loc_args"));
        if (jSONArrayG == null) {
            strArr = null;
        } else {
            int length = jSONArrayG.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayG.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            t0.n("NotificationParams", "Missing format argument for " + q(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        Objects.toString((ErrorDTO) serializable);
        ((kp7) this.b).i(false);
    }

    public String k(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle n() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 3:
                PikaInstallFailedDialogFragment pikaInstallFailedDialogFragment = (PikaInstallFailedDialogFragment) this.b;
                pikaInstallFailedDialogFragment.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                pikaInstallFailedDialogFragment.N0(DialogResult.b, bundle);
                break;
            default:
                ((UnbindAllLoginDialogFragment) this.b).R0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 3:
                return;
            default:
                UnbindAllLoginDialogFragment unbindAllLoginDialogFragment = (UnbindAllLoginDialogFragment) this.b;
                unbindAllLoginDialogFragment.T0();
                tn2 tn2Var = unbindAllLoginDialogFragment.o1;
                js3.m(tn2Var);
                tn2Var.v.setStateCommit(MyketProgressState.c);
                tn2 tn2Var2 = unbindAllLoginDialogFragment.o1;
                js3.m(tn2Var2);
                tn2Var2.w.setVisibility(4);
                lu7 lu7Var = unbindAllLoginDialogFragment.n1;
                if (lu7Var == null) {
                    js3.V("sharedPreferencesProxy");
                    throw null;
                }
                String strF = lu7Var.f(lu7.j0, null);
                if (strF == null) {
                    strF = "NOT_FOUND";
                }
                jx8 jx8Var = new jx8(unbindAllLoginDialogFragment);
                jx8 jx8Var2 = new jx8(unbindAllLoginDialogFragment);
                c5 c5Var = unbindAllLoginDialogFragment.m1;
                if (c5Var == null) {
                    js3.V("accountManager");
                    throw null;
                }
                if (c5Var == null) {
                    js3.V("accountManager");
                    throw null;
                }
                ((b) c5Var.c.get()).j(c5Var.a(), wq2.y(c5Var.g), new UnbindAllRequestDto(strF), new j2(c5Var, jx8Var, 1), jx8Var2);
                return;
        }
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
        ((Boolean[]) this.b)[0] = Boolean.FALSE;
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        ((Boolean[]) this.b)[0] = (Boolean) obj;
    }

    public void p(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public /* synthetic */ hl5(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ hl5(bo9 bo9Var, yn9 yn9Var) {
        this.a = 20;
        this.b = yn9Var;
    }

    public hl5(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new av(13);
                break;
            case 17:
                this.b = new fi1();
                break;
            case 21:
                this.b = new HashMap();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public hl5(ry5 ry5Var) {
        this.a = 2;
        js3.p(ry5Var, "service");
        this.b = ry5Var;
    }

    public hl5(s19 s19Var) {
        this.a = 16;
        js3.p(s19Var, "service");
        this.b = s19Var;
    }

    public hl5(View view) {
        this.a = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            j18 j18Var = new j18(17, view);
            j18Var.c = view;
            this.b = j18Var;
            return;
        }
        this.b = new ck4(17, view);
    }

    private final void m() {
    }

    public hl5(Bundle bundle) {
        this.a = 1;
        this.b = new Bundle(bundle);
    }

    public hl5(WindowInsetsController windowInsetsController) {
        this.a = 10;
        j18 j18Var = new j18(17, null);
        j18Var.d = windowInsetsController;
        this.b = j18Var;
    }

    @Override // defpackage.mt4
    public void o(ot4 ot4Var) {
    }

    public hl5(hh9 hh9Var) {
        this.a = 13;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hh9Var);
    }
}
