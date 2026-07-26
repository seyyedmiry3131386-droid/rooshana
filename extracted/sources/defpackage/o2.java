package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Request$Priority;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.services.a;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o2 {
    private static final String ALPHA_SERVER_AUTH_KEY = "authkey";
    private static final String ALPHA_SERVER_AUTH_VALUE = "bXlrZXQtYWx0X059RSt5KC0qPi94Wy4zPXFodXI9aE5dVTE=";
    private static final String LANGUAGE = "lang";
    private static final String STYLE = "style";
    private static final String TAG = "MyketAbstractService";
    private static final String THEME = "theme";
    private static final String URL_PATH_AUTHORIZE = "authorize";
    private static final String URL_SERVICE = "devices";
    private static final String URL_SERVICE_V1 = "v1/devices";
    public static final String V1 = "v1/";
    public static final String V2 = "v2/";
    public c5 accountManager;
    public i10 authorizationManager;
    public Context context;
    public qu2 googleUtils;
    public d04 languageHelper;
    public fw4 miuiUtils;
    public x57 requestProxy;
    public bp7 serverMonitor;
    private final hq7 setAuthDataUseCase = (hq7) bt2.y(hq7.class);
    public lu7 sharedPreferencesProxy;
    private static vv2 gson = new vv2();
    private static boolean authorizeInProgress = false;
    private static int authorizeCount = 0;

    public z57 createRequestUrl(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        return createRequestUrl(str, str2, map, map2, false);
    }

    public wv2 createVolleyErrorListener(h32 h32Var) {
        return new l2(this, h32Var);
    }

    public <R> zv2 createVolleySuccessListener(gb8 gb8Var, h32 h32Var) {
        return createVolleySuccessListener(gb8Var, h32Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.gb8 r10) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2.f(gb8):void");
    }

    public void getAuthorizeData(gb8 gb8Var) {
        f(gb8Var);
    }

    public Map<String, String> getCommonQueryParam(Map<String, String> map) {
        put(map, LANGUAGE, getLanguage());
        put(map, THEME, sj8.f());
        put(map, STYLE, sj8.e());
        return map;
    }

    public Map<String, String> getHeaders(Map<String, String> map) {
        map.put("Authorization", this.authorizationManager.a());
        map.put("Myket-Version", String.valueOf(1028));
        map.put("Myket-PackageName", NearbyRepository.SERVICE_ID);
        map.put("Platform", LinkDTO.LINK_TYPE_MYKET_INTENT);
        map.put("X-Device-Type", yq2.c0(this.context));
        map.put("X-Child-Mode", this.sharedPreferencesProxy.b(lu7.z0, false) ? "on" : "off");
        String strC = this.googleUtils.c();
        if (!TextUtils.isEmpty(strC)) {
            map.put("X-Google-Ad-Id", strC);
        }
        map.put("Myket-SessionId", ApplicationLauncher.o.c());
        return map;
    }

    public String getLanguage() {
        return this.languageHelper.b();
    }

    public void performAuthorize(gb8 gb8Var, h32 h32Var) {
        performRequest(new xv2(0, new z57(""), null, Request$Priority.d, true, null, createVolleyErrorListener(h32Var), createVolleySuccessListener(gb8Var, h32Var), false), h32Var);
    }

    public void performRequest(xv2 xv2Var, h32 h32Var) {
        performRequest(xv2Var, false, h32Var);
    }

    public void put(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    public z57 createRequestUrl(String str, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
        String str3;
        if (z) {
            str3 = this.serverMonitor.b;
        } else {
            bp7 bp7Var = this.serverMonitor;
            dp7 dp7Var = (dp7) bp7Var.e.get(str);
            str3 = dp7Var == null ? bp7Var.d.h : dp7Var.h;
        }
        return new z57(str3, str, str2, map, map2, true, true);
    }

    public <R> zv2 createVolleySuccessListener(gb8 gb8Var, h32 h32Var, boolean z) {
        return new k2(this, z, h32Var, gb8Var);
    }

    public void performRequest(xv2 xv2Var, boolean z, h32 h32Var) {
        lw.f("Url: " + xv2Var.c, "performRequest() called in another thread", Looper.myLooper() == Looper.getMainLooper());
        if (z) {
            x57 x57Var = this.requestProxy;
            String strH = xv2Var.h();
            l37 l37Var = x57Var.a;
            if (l37Var != null) {
                ((nv) l37Var.f).e(strH);
            }
        }
        if (authorizeInProgress) {
            LinkedList linkedList = this.requestProxy.c;
            linkedList.add(xv2Var);
            linkedList.size();
        } else {
            if (!TextUtils.isEmpty(this.authorizationManager.a()) && !TextUtils.isEmpty(this.accountManager.a())) {
                lw.f(null, "queue is not empty", this.requestProxy.c.size() == 0);
                this.requestProxy.a.a(xv2Var);
                return;
            }
            authorizeInProgress = true;
            LinkedList linkedList2 = this.requestProxy.c;
            linkedList2.add(xv2Var);
            linkedList2.size();
            authorizeCount++;
            f(new a(this));
        }
    }

    public Map<String, String> getCommonQueryParam() {
        return getCommonQueryParam(new HashMap());
    }
}
