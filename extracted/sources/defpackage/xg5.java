package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.paging.m;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.sqlite.driver.a;
import defpackage.dc0;
import defpackage.xg5;
import io.sentry.android.core.t0;
import ir.mservices.market.app.detail.data.RecommendationDto;
import ir.mservices.market.app.recommended.data.ApplicationListDto;
import ir.mservices.market.app.update.common.manager.b;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.login.ui.PinLoginDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PaymentRetryBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment;
import ir.mservices.market.views.MyketProgressState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xg5 implements hl0, rm1, cl6, nb7, el, ov5, bt9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xg5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ir.mservices.market.app.recommended.data.ApplicationListDto a(ir.mservices.market.app.recommended.data.ApplicationListDto r6, boolean r7, boolean r8) {
        /*
            java.util.List r0 = r6.getIgnoreConditions()
            ir.mservices.market.version2.ui.recycler.filter.GeneralFilter r0 = ir.mservices.market.version2.ui.recycler.filter.a.a(r0)
            if (r0 == 0) goto L3f
            java.util.List r1 = r6.getList()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            r4 = r3
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r4 = (ir.mservices.market.version2.webapi.responsedto.ApplicationDTO) r4
            ir.mservices.market.app.common.recycler.FilteredAppNestedData r5 = new ir.mservices.market.app.common.recycler.FilteredAppNestedData
            r5.<init>(r4)
            boolean r4 = r0.u(r5)
            if (r4 != 0) goto L17
            r2.add(r3)
            goto L17
        L33:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3d
            if (r7 != 0) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 != 0) goto L43
        L3f:
            java.util.List r2 = r6.getList()
        L43:
            if (r8 == 0) goto L52
            int r7 = r2.size()
            r0 = 3
            if (r7 <= r0) goto L4d
            r7 = r0
        L4d:
            r0 = 0
            java.util.List r2 = r2.subList(r0, r7)
        L52:
            if (r8 != 0) goto L59
            boolean r7 = r6.getEol()
            goto L5a
        L59:
            r7 = 1
        L5a:
            java.util.List r6 = r6.getIgnoreConditions()
            ir.mservices.market.app.recommended.data.ApplicationListDto r8 = new ir.mservices.market.app.recommended.data.ApplicationListDto
            r8.<init>(r2, r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg5.a(ir.mservices.market.app.recommended.data.ApplicationListDto, boolean, boolean):ir.mservices.market.app.recommended.data.ApplicationListDto");
    }

    @Override // defpackage.hl0
    public void b(g77 g77Var) {
        ((rq7) this.b).k(g77Var);
    }

    public xe2 c(final RecommendationDto recommendationDto, final String str, final String str2, final boolean z, final Object obj) {
        js3.p(str, "packageName");
        js3.p(str2, "type");
        return (xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.recommended.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                dc0 dc0Var;
                xg5 xg5Var = this;
                String str3 = str;
                String str4 = str2;
                Object obj2 = obj;
                boolean z2 = z;
                RecommendedRepositoryImpl$getRecommendedApps$1$1 recommendedRepositoryImpl$getRecommendedApps$1$1 = new RecommendedRepositoryImpl$getRecommendedApps$1$1(xg5Var, str3, str4, obj2, z2, null);
                RecommendationDto recommendationDto2 = recommendationDto;
                if (recommendationDto2 != null) {
                    ApplicationListDto applicationListDtoA = xg5.a(new ApplicationListDto(recommendationDto2.getApplications(), recommendationDto2.getEol(), recommendationDto2.getIgnoreConditions()), !recommendationDto2.getEol(), z2);
                    applicationListDtoA.getList();
                    dc0Var = new dc0(recommendationDto2.getApplications().size(), 9, applicationListDtoA);
                } else {
                    dc0Var = null;
                }
                return new ir.mservices.market.model.paging.a(recommendedRepositoryImpl$getRecommendedApps$1$1, dc0Var);
            }
        }).a;
    }

    @Override // defpackage.nb7
    public mb7 d(String str) {
        js3.p(str, "fileName");
        dc8 dc8Var = (dc8) this.b;
        String databaseName = dc8Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                throw new IllegalArgumentException(o40.y("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested.").toString());
            }
        } else if (!databaseName.equals(str) && !f88.E0('/', databaseName, databaseName).equals(f88.E0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + dc8Var.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new a(dc8Var.p0());
    }

    @Override // defpackage.cl6
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            t0.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // defpackage.ov5
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.b)) {
            ((ByteBuffer) this.b).position(0);
            messageDigest.update(((ByteBuffer) this.b).putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.el
    public be2 get(int i) {
        return ((le2[]) this.b)[i];
    }

    @Override // defpackage.nb7
    public boolean h() {
        return true;
    }

    public void i(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        linkedHashMap.put(lowerCase, br9.E(str));
    }

    @Override // defpackage.hl0
    public void l(xv6 xv6Var, IOException iOException) {
        ((rq7) this.b).l(iOException);
    }

    @Override // defpackage.bt9
    public boolean o(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((bt9[]) this.b)[i].o(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 3:
                ((PaymentRetryBottomDialogFragment) this.b).R0(DialogResult.b, new Bundle());
                break;
            case 4:
                break;
            default:
                SendReplyBottomDialogFragment sendReplyBottomDialogFragment = (SendReplyBottomDialogFragment) this.b;
                sendReplyBottomDialogFragment.R0(DialogResult.b, new Bundle());
                sendReplyBottomDialogFragment.z0();
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 3:
                ((PaymentRetryBottomDialogFragment) this.b).R0(DialogResult.a, new Bundle());
                return;
            case 4:
                ((PinLoginDialogFragment) this.b).g1();
                return;
            default:
                SendReplyBottomDialogFragment sendReplyBottomDialogFragment = (SendReplyBottomDialogFragment) this.b;
                bi5 bi5Var = sendReplyBottomDialogFragment.i1;
                if (sendReplyBottomDialogFragment.h1 == null) {
                    js3.V("commentAnalytics");
                    throw null;
                }
                String str = ((ao7) bi5Var.getValue()).a;
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("review_send_reply" + str);
                clickEventBuilder.a();
                bo7 bo7Var = sendReplyBottomDialogFragment.k1;
                js3.m(bo7Var);
                String strValueOf = String.valueOf(bo7Var.v.getText());
                bo7 bo7Var2 = sendReplyBottomDialogFragment.k1;
                js3.m(bo7Var2);
                bo7Var2.w.setStateCommit(MyketProgressState.c);
                ((CommentViewModel) sendReplyBottomDialogFragment.j1.getValue()).f(((ao7) bi5Var.getValue()).b, ((ao7) bi5Var.getValue()).c, strValueOf);
                return;
        }
    }

    @Override // defpackage.bt9
    public ht9 p(Class cls) {
        for (int i = 0; i < 2; i++) {
            bt9 bt9Var = ((bt9[]) this.b)[i];
            if (bt9Var.o(cls)) {
                return bt9Var.p(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public xg5(b bVar) {
        this.a = 15;
        js3.p(bVar, "inActiveAppUpdateManager");
        this.b = bVar;
    }

    public xg5(int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.b = new SparseArray();
                break;
            case 17:
                this.b = ByteBuffer.allocate(4);
                break;
            default:
                this.b = new HashMap(3);
                break;
        }
    }

    public xg5(bh5 bh5Var) {
        this.a = 0;
        js3.p(bh5Var, "service");
        this.b = bh5Var;
    }

    public xg5(p17 p17Var) {
        this.a = 7;
        js3.p(p17Var, "reelsHomeService");
        this.b = p17Var;
    }

    public xg5(z68 z68Var) {
        this.a = 12;
        js3.p(z68Var, "streamersService");
        this.b = z68Var;
    }

    public xg5(ly6 ly6Var) {
        this.a = 6;
        js3.p(ly6Var, "service");
        this.b = ly6Var;
    }

    public xg5(dc8 dc8Var) {
        this.a = 13;
        js3.p(dc8Var, "openHelper");
        this.b = dc8Var;
    }

    public xg5(rm5 rm5Var) {
        this.a = 1;
        Map map = rm5Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kotlin.collections.a.Q0((Collection) entry.getValue()));
        }
        this.b = linkedHashMap;
    }

    private final void e() {
    }

    public xg5(float f, float f2, dl dlVar) {
        this.a = 16;
        int iB = dlVar.b();
        le2[] le2VarArr = new le2[iB];
        for (int i = 0; i < iB; i++) {
            le2VarArr[i] = new le2(f, f2, dlVar.a(i));
        }
        this.b = le2VarArr;
    }
}
