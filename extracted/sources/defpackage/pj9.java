package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.media3.common.b;
import androidx.paging.m;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.download.app.DownloadRecyclerListFragment;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.version2.fragments.content.CropContentFragment;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.version2.model.BindHistoryModel;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.ui.recycler.holder.a;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.MyketProgressState;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class pj9 implements rm1, fu4, ay4, gb8, wj4, lm0, p71, ap8, z95, ys2, u59 {
    public static pj9 b;
    public static final cr2 c = new cr2(1);
    public static final pj9 d = new pj9();
    public Object a;

    public /* synthetic */ pj9(Object obj) {
        this.a = obj;
    }

    public static synchronized pj9 A(Context context) {
        String strE;
        pj9 pj9Var = b;
        if (pj9Var != null) {
            return pj9Var;
        }
        pj9 pj9Var2 = new pj9();
        e68 e68VarA = e68.a(context);
        pj9Var2.a = e68VarA;
        e68VarA.b();
        String strE2 = e68VarA.e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strE2) && (strE = e68VarA.e(e68.f("googleSignInOptions", strE2))) != null) {
            try {
                GoogleSignInOptions.u(strE);
            } catch (JSONException unused) {
            }
        }
        b = pj9Var2;
        return pj9Var2;
    }

    public static View x(Context context, int i, int i2) throws RemoteCreator$RemoteCreatorException {
        pj9 pj9Var = d;
        try {
            zaaa zaaaVar = new zaaa(1, i, i2, null);
            return (View) dr5.q0(((xi9) pj9Var.s(context)).p0(new dr5(context), zaaaVar));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42 + String.valueOf(i2).length());
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator$RemoteCreatorException(sb.toString(), e);
        }
    }

    public static synchronized pj9 y(Context context) {
        return A(context.getApplicationContext());
    }

    @Override // defpackage.jl0
    public void b() {
        CropContentFragment cropContentFragment = (CropContentFragment) this.a;
        int i = CropContentFragment.c1;
        if (cropContentFragment.J0.g() instanceof ProgressDialogFragment) {
            cropContentFragment.J0.q();
        }
        hh2 hh2Var = new hh2(cropContentFragment.F(), cropContentFragment.L(rs6.crop_image_failed));
        hh2Var.G();
        hh2.H(hh2Var);
        pk5.a(cropContentFragment.J0);
        t32.b().j(new s71(null, false, cropContentFragment.b1.c));
    }

    @Override // defpackage.ys2
    public w57 build() {
        w57 w57Var = (w57) this.a;
        return w57Var != null ? w57Var : new w57();
    }

    @Override // defpackage.ay4
    public void c() {
        ((AppReviewsFragment) this.a).S1();
        fw0.c("_all_reviews");
    }

    @Override // defpackage.fu4
    public void d(ot4 ot4Var, boolean z) {
        kn knVar;
        ln lnVar = (ln) this.a;
        ot4 ot4VarK = ot4Var.k();
        int i = 0;
        boolean z2 = ot4VarK != ot4Var;
        if (z2) {
            ot4Var = ot4VarK;
        }
        kn[] knVarArr = lnVar.M;
        int length = knVarArr != null ? knVarArr.length : 0;
        while (true) {
            if (i < length) {
                knVar = knVarArr[i];
                if (knVar != null && knVar.h == ot4Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                knVar = null;
                break;
            }
        }
        if (knVar != null) {
            if (!z2) {
                lnVar.s(knVar, z);
            } else {
                lnVar.q(knVar.a, knVar, ot4VarK);
                lnVar.s(knVar, true);
            }
        }
    }

    @Override // defpackage.ay4
    public void e() {
        ((AppReviewsFragment) this.a).S1();
        fw0.e("_all_reviews");
    }

    @Override // defpackage.z95
    public void f(View view, a aVar, MultiSelectRecyclerData multiSelectRecyclerData) {
        js3.p(multiSelectRecyclerData, "recyclerData");
        DownloadRecyclerListFragment downloadRecyclerListFragment = (DownloadRecyclerListFragment) this.a;
        int i = DownloadRecyclerListFragment.j1;
        downloadRecyclerListFragment.R1().u(multiSelectRecyclerData);
    }

    @Override // defpackage.u59
    public void g() {
        cn4 cn4Var = (cn4) this.a;
        Surface surface = cn4Var.u1;
        if (surface != null) {
            n00 n00Var = cn4Var.g1;
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new q59(n00Var, surface, SystemClock.elapsedRealtime()));
            }
            cn4Var.x1 = true;
        }
    }

    @Override // defpackage.lm0
    public void h(Typeface typeface) {
        qu0 qu0Var = (qu0) this.a;
        if (qu0Var.t(typeface)) {
            qu0Var.l(false);
        }
    }

    @Override // defpackage.u59
    public void i() {
        cn4 cn4Var = (cn4) this.a;
        if (cn4Var.u1 != null) {
            cn4Var.M0(0, 1);
        }
    }

    @Override // defpackage.u59
    public void j() {
        h62 h62Var = ((cn4) this.a).H;
        if (h62Var != null) {
            h62Var.a();
        }
    }

    public void k(ps0 ps0Var, dp2 dp2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (!linkedHashMap.containsKey(ps0Var)) {
            linkedHashMap.put(ps0Var, new n79(ps0Var, dp2Var));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + ps0Var.b() + '.').toString());
    }

    @Override // defpackage.fu4
    public boolean l(ot4 ot4Var) {
        Window.Callback callback;
        ln lnVar = (ln) this.a;
        if (ot4Var != ot4Var.k() || !lnVar.G || (callback = lnVar.l.getCallback()) == null || lnVar.R) {
            return true;
        }
        callback.onMenuOpened(108, ot4Var);
        return true;
    }

    public z7 m() {
        Collection collectionValues = ((LinkedHashMap) this.a).values();
        js3.p(collectionValues, "initializers");
        n79[] n79VarArr = (n79[]) collectionValues.toArray(new n79[0]);
        return new z7((n79[]) Arrays.copyOf(n79VarArr, n79VarArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String n(androidx.media3.common.b r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L27
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L27
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.util.Locale r2 = defpackage.j29.y()
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L29
        L27:
            r0 = r3
            goto L4a
        L29:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L4a
        L4a:
            java.lang.String r8 = r7.o(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.u(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L64
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L63
            r1 = r3
        L63:
            r8 = r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj9.n(androidx.media3.common.b):java.lang.String");
    }

    public String o(b bVar) {
        Resources resources = (Resources) this.a;
        int i = bVar.f;
        int i2 = bVar.f;
        String string = (i & 2) != 0 ? resources.getString(bt6.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = u(string, resources.getString(bt6.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = u(string, resources.getString(bt6.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? u(string, resources.getString(bt6.exo_track_role_closed_captions)) : string;
    }

    @Override // defpackage.rm1
    public void onCancel() {
        AlertBottomDialogFragment alertBottomDialogFragment = (AlertBottomDialogFragment) this.a;
        alertBottomDialogFragment.b1 = true;
        alertBottomDialogFragment.R0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.rm1
    public void onCommit() {
        AlertBottomDialogFragment alertBottomDialogFragment = (AlertBottomDialogFragment) this.a;
        if (!alertBottomDialogFragment.i1.f) {
            alertBottomDialogFragment.e1.setStateCommit(MyketProgressState.c);
        }
        alertBottomDialogFragment.R0(DialogResult.a, new Bundle());
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        BindAutoCompleteView bindAutoCompleteView = (BindAutoCompleteView) this.a;
        int i = BindAutoCompleteView.u;
        ArrayList arrayList = new ArrayList();
        for (BindHistoryModel bindHistoryModel : (List) obj) {
            if (bindHistoryModel != null && !TextUtils.isEmpty(bindHistoryModel.a())) {
                arrayList.add(bindHistoryModel.a());
            }
        }
        bindAutoCompleteView.setAdapter(new nb0(bindAutoCompleteView, bindAutoCompleteView.getContext(), js6.simple_list_item_bind, (String[]) arrayList.toArray(new String[arrayList.size()])));
    }

    public void p(CancellationException cancellationException) {
        zb5 zb5Var = (zb5) this.a;
        int i = zb5Var.c;
        nm0[] nm0VarArr = new nm0[i];
        for (int i2 = 0; i2 < i; i2++) {
            nm0VarArr[i2] = ((z31) zb5Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            nm0VarArr[i3].n(cancellationException);
        }
        if (zb5Var.c == 0) {
            return;
        }
        un3.c("uncancelled requests present");
    }

    public xe2 q(final String str, final BaseAccountUsersViewModel baseAccountUsersViewModel) {
        js3.p(str, "accountKey");
        return (xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.social.users.following.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new AccountFollowingRepositoryImpl$getFollowing$1$1(this.a, str, baseAccountUsersViewModel, null), null);
            }
        }).a;
    }

    public xi9 r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof xi9 ? (xi9) iInterfaceQueryLocalInterface : new xi9(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator", 0);
    }

    public Object s(Context context) throws RemoteCreator$RemoteCreatorException {
        Context contextCreatePackageContext;
        if (((xi9) this.a) == null) {
            rq4.n(context);
            int i = lu2.e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreator$RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.a = r((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreator$RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreator$RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (xi9) this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String t(androidx.media3.common.b r19) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj9.t(androidx.media3.common.b):java.lang.String");
    }

    public String u(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.a).getString(bt6.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void v(Class cls, vi4 vi4Var) {
        ((HashMap) this.a).put(cls, vi4Var);
    }

    public void w() {
        zb5 zb5Var = (zb5) this.a;
        uq3 uq3VarZ = ok4.Z(0, zb5Var.c);
        int i = uq3VarZ.a;
        int i2 = uq3VarZ.b;
        if (i <= i2) {
            while (true) {
                ((z31) zb5Var.a[i]).b.resumeWith(tx8.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        zb5Var.h();
    }

    public synchronized void z() {
        e68 e68Var = (e68) this.a;
        ReentrantLock reentrantLock = e68Var.a;
        reentrantLock.lock();
        try {
            e68Var.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public pj9(gh2 gh2Var) {
        js3.p(gh2Var, "followingAccountService");
        this.a = gh2Var;
    }

    public pj9(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pj9(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            xu[][] r3 = new defpackage.xu[r1][]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L73
            r8 = r23[r5]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L24
            if (r8 == r2) goto L2d
            if (r8 == r10) goto L2b
            if (r8 == r9) goto L26
            r9 = 4
            if (r8 == r9) goto L24
            r9 = 5
            if (r8 == r9) goto L24
            r12 = r7
            goto L2f
        L24:
            r12 = r9
            goto L2f
        L26:
            if (r6 != r2) goto L2d
            goto L2b
        L29:
            r12 = r6
            goto L2f
        L2b:
            r6 = r10
            goto L29
        L2d:
            r6 = r2
            goto L29
        L2f:
            r7 = r25[r5]
            int r8 = r5 + 1
            r9 = r25[r8]
            r13 = r0[r5]
            r14 = r0[r8]
            int r11 = r7.length
            int r11 = r11 / r10
            int r15 = r7.length
            int r15 = r15 % r10
            int r10 = r15 + r11
            xu[] r11 = new defpackage.xu[r10]
            r15 = r4
        L42:
            if (r15 >= r10) goto L6c
            int r16 = r15 * 2
            r17 = r11
            xu r11 = new xu
            r18 = r15
            r15 = r7[r16]
            int r19 = r16 + 1
            r20 = r16
            r16 = r7[r19]
            r20 = r9[r20]
            r19 = r9[r19]
            r21 = r19
            r19 = r17
            r17 = r20
            r20 = r18
            r18 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r19[r20] = r11
            int r15 = r20 + 1
            r11 = r19
            goto L42
        L6c:
            r19 = r11
            r3[r5] = r19
            r5 = r8
            r7 = r12
            goto Le
        L73:
            r5 = r22
            r5.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj9.<init>(int[], float[], float[][]):void");
    }

    public pj9(int i) {
        bv4 bv4Var;
        switch (i) {
            case 10:
                this.a = new zb5(0, new z31[16]);
                break;
            case 23:
                this.a = new LinkedHashMap();
                break;
            case 27:
                this.a = new HashMap();
                break;
            default:
                try {
                    bv4Var = (bv4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    bv4Var = c;
                }
                bv4[] bv4VarArr = {cr2.b, bv4Var};
                wg4 wg4Var = new wg4();
                wg4Var.a = bv4VarArr;
                Charset charset = tr3.a;
                this.a = wg4Var;
                break;
        }
    }

    @Override // defpackage.u59
    public void a(w59 w59Var) {
    }
}
