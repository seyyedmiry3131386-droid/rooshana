package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.Request$Priority;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.common.util.concurrent.e;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import ir.mservices.market.version2.webapi.requestdto.FcmTokenRegisterDto;
import ir.mservices.market.version2.webapi.requestdto.SpixDownloadType;
import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import ir.mservices.market.version2.webapi.responsedto.VerifyResultDTO;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.b;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkServer4xxException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkServer5xxException;
import nene.downloadmanager.exceptions.downloadfail.NeneSignNotMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u4 implements gb8, q94, zh1, h32, gr4, tt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u4(be beVar, da4 da4Var, op4 op4Var, IOException iOException, boolean z) {
        this.a = 1;
        this.b = beVar;
        this.c = da4Var;
        this.d = op4Var;
        this.e = iOException;
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        hr4 hr4Var = (hr4) this.b;
        wp7 wp7Var = (wp7) this.c;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.e;
        xq4 xq4Var = hr4Var.g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        n94 n94VarN = xq4Var.n(hq4Var, wp7Var, bundle);
        if (resultReceiver != null) {
            ((ij3) n94VarN).e(new lo4(n94VarN, resultReceiver, 10), e.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    @Override // defpackage.zh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List f(int r17, defpackage.yo8 r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4.f(int, yo8, int[]):java.util.List");
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((ce) obj).I((be) this.b, (da4) this.c, (op4) this.d, (IOException) this.e);
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) throws NoSuchAlgorithmException, IOException {
        js1 js1Var = (js1) this.b;
        String str = (String) this.c;
        t0 t0Var = (t0) this.d;
        bs1 bs1Var = (bs1) this.e;
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        ps1 ps1Var = js1Var.r;
        if (errorDTO.getCode() == 400 && errorDTO.getMessageCode().equalsIgnoreCase(ErrorDTO.MESSAGE_CODE_SIGN_NOT_MATCHED)) {
            t32 t32VarB = t32.b();
            os1 os1Var = new os1();
            os1Var.a = str;
            t32VarB.g(os1Var);
            t0Var.D(Pair.create(null, new NeneSignNotMatchedException(ps1Var.e.getString(rs6.download_status_failed))));
            return;
        }
        NeneNetworkException neneNetworkExceptionC = NeneNetworkException.c(-1, null, "Failed to fetch download URL: " + errorDTO.getMessageCode());
        if ((neneNetworkExceptionC instanceof NeneNetworkServer4xxException) || (neneNetworkExceptionC instanceof NeneNetworkServer5xxException)) {
            ps1Var.w(bs1Var, SpixDownloadType.PRE, neneNetworkExceptionC.getMessage(), null);
        }
        t0Var.D(Pair.create(null, neneNetworkExceptionC));
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        Object objA;
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                c5 c5Var = (c5) obj5;
                String str = (String) obj3;
                String str2 = (String) obj4;
                s2 s2Var = (s2) obj2;
                VerifyResultDTO verifyResultDTO = (VerifyResultDTO) obj;
                z4 z4Var = c5Var.h;
                int i2 = (!TextUtils.isEmpty((String) z4Var.e) ? 1 : 0) + (!TextUtils.isEmpty((String) z4Var.g) ? 1 : 0) + (!TextUtils.isEmpty((String) z4Var.f) ? 1 : 0);
                Pattern pattern = ul1.a;
                js3.p(str, "email");
                String str3 = ul1.a.matcher(str).matches() ? BindInfoDTO.BIND_TYPE_EMAIL : BindInfoDTO.BIND_TYPE_PHONE;
                StringBuilder sbN = t61.n("type:", str3, ", new accountId: ");
                sbN.append(verifyResultDTO.getAccountId());
                sb7.p("MyketService", "Bind", sbN.toString());
                z4Var.k(verifyResultDTO.getAccountInfo());
                x4 x4Var = new x4(str3, i2, (!TextUtils.isEmpty((String) z4Var.e) ? 1 : 0) + (!TextUtils.isEmpty((String) z4Var.g) ? 1 : 0) + (1 ^ (TextUtils.isEmpty((String) z4Var.f) ? 1 : 0)), str2);
                if (!TextUtils.isEmpty(verifyResultDTO.getAccountId())) {
                    c5Var.h(verifyResultDTO.getAccountId(), verifyResultDTO.getAccountKey(), verifyResultDTO.getPublicUserId());
                    c5Var.d.b("");
                }
                t32.b().g(x4Var);
                t32.b().g(new a5());
                s2Var.onSuccess(verifyResultDTO);
                return;
            default:
                go6 go6Var = (go6) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                String str4 = (String) obj3;
                Context context = (Context) obj2;
                String str5 = (String) obj;
                lw.b("push registration token must not be null or empty", "Retry number " + go6.h, TextUtils.isEmpty(str5));
                sb7.p("Firebase", "Successfully retrieve Token", "retry count: " + go6.h);
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                try {
                    jSONObject.put("empty_token", TextUtils.isEmpty(str5));
                } catch (JSONException e) {
                    lw.g(e, "RegisterFCMToken json parse error", null);
                }
                go6.h = 0;
                try {
                    objA = Build.VERSION.RELEASE;
                    if (objA == null) {
                        objA = "";
                    }
                } catch (Throwable th) {
                    objA = b.a(th);
                }
                if (Result.a(objA) != null) {
                    objA = "";
                }
                String str6 = (String) objA;
                String packageName = context.getPackageName();
                String strA = wq2.A();
                String strV = xq2.v(context);
                try {
                    mw3 mw3Var = new mw3(new StringReader(jSONObject.toString()));
                    lv3 lv3VarA = gu9.A(mw3Var);
                    lv3VarA.getClass();
                    if (!(lv3VarA instanceof zv3) && mw3Var.R() != JsonToken.j) {
                        throw new JsonSyntaxException("Did not consume the entire document.");
                    }
                    FcmTokenRegisterDto fcmTokenRegisterDto = new FcmTokenRegisterDto(str5, AppMeasurement.FCM_ORIGIN, str4, str6, packageName, strA, strV, lv3VarA);
                    eo6 eo6Var = new eo6(go6Var);
                    ur4 ur4Var = new ur4(go6Var, str5, 12);
                    lu7 lu7Var = go6Var.c;
                    String str7 = lu7.j0;
                    if (lu7Var.f(str7, "").equalsIgnoreCase(str5)) {
                        return;
                    }
                    boolean zB = go6Var.c.b(lu7.i0, true);
                    op5 op5Var = go6Var.d;
                    op5Var.getClass();
                    xv2 xv2Var = new xv2(1, op5Var.createRequestUrl("onesignal", zB ? "newRegister" : "register", null, op5Var.getCommonQueryParam()), fcmTokenRegisterDto, Request$Priority.b, false, null, op5Var.createVolleyErrorListener(eo6Var), op5Var.createVolleySuccessListener(ur4Var, eo6Var), false);
                    xv2Var.p = op5Var.getHeaders(new HashMap());
                    xv2Var.w = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.version2.services.NotificationService$registerFcmToken$gsonRequest$1$1
                    }.getType();
                    op5Var.performRequest(xv2Var, eo6Var);
                    go6Var.c.i(str7, str5);
                    return;
                } catch (MalformedJsonException e2) {
                    e = e2;
                    throw new JsonSyntaxException(e);
                } catch (IOException e3) {
                    throw new JsonIOException(e3);
                } catch (NumberFormatException e4) {
                    e = e4;
                    throw new JsonSyntaxException(e);
                }
        }
    }

    public /* synthetic */ u4(go6 go6Var, JSONObject jSONObject, String str, Context context) {
        this.a = 5;
        this.b = go6Var;
        this.d = jSONObject;
        this.c = str;
        this.e = context;
    }

    public /* synthetic */ u4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
