package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.tabs.b;
import com.google.common.collect.ImmutableList;
import com.google.firebase.encoders.EncodingException;
import io.sentry.android.core.t0;
import ir.mservices.market.app.appList.AppListRecyclerListFragment;
import ir.mservices.market.app.bookmark.BookmarkContentFragment;
import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment;
import ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData;
import ir.mservices.market.app.bookmark.ui.recycler.a;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.search.BaseSearchFragment;
import ir.mservices.market.common.search.BaseSearchViewModel;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.feedback.FeedbackTransactionFragment;
import ir.mservices.market.feedback.FeedbackTransactionViewModel;
import ir.mservices.market.feedback.data.TransactionData;
import ir.mservices.market.feedback.recycler.FeedbackTransactionData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import ir.mservices.market.setting.fontStyle.ui.FontAction;
import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;
import ir.mservices.market.setting.fontStyle.ui.FontStyleItemData;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AlertButtonComponentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AlertDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.AppIconView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v4 implements h32, wt5, og5, r7, fe8, d4, ly0, qq5, zh1, yp2, q94, jb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qq5
    public Object a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    j27 j27Var = m27.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + m27.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + m27.b(constructor) + "' with no args", e3.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return ly8.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException(bl4.t(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e4);
                }
        }
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        return (hd1) this.b;
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.b;
        int i = BottomSheetDragHandleView.m;
        return bottomSheetDragHandleView.c();
    }

    @Override // defpackage.jb0
    public long c(long j) {
        ud2 ud2Var = (ud2) this.b;
        return j29.j((j * ((long) ud2Var.e)) / 1000000, 0L, ud2Var.j - 1);
    }

    public tn0 d(wv8 wv8Var) throws IOException {
        un0 un0Var = (un0) this.b;
        URL url = (URL) wv8Var.b;
        if (Log.isLoggable(wn5.O("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(un0Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) wv8Var.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ql4 ql4Var = un0Var.a;
                    h20 h20Var = (h20) wv8Var.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    gv3 gv3Var = (gv3) ql4Var.b;
                    tw3 tw3Var = new tw3(bufferedWriter, gv3Var.a, gv3Var.b, gv3Var.c, gv3Var.d);
                    tw3Var.f(h20Var);
                    tw3Var.h();
                    tw3Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(wn5.O("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    wn5.x("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    wn5.x("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new tn0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new tn0(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            tn0 tn0Var = new tn0(responseCode, (URL) null, t20.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return tn0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            wn5.G("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new tn0(ErrorDTO.CODE_ACCESS_DENIED, (URL) null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            wn5.G("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new tn0(500, (URL) null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            wn5.G("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new tn0(500, (URL) null, 0L);
        } catch (IOException e4) {
            e = e4;
            wn5.G("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new tn0(ErrorDTO.CODE_ACCESS_DENIED, (URL) null, 0L);
        }
    }

    public boolean e(ca7 ca7Var, int i, Bundle bundle) {
        c41 b41Var;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((co3) ca7Var.b).e();
                Parcelable parcelable = (Parcelable) ((co3) ca7Var.b).g();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                t0.n("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        co3 co3Var = (co3) ca7Var.b;
        ClipData clipData = new ClipData(co3Var.c(), new ClipData.Item(co3Var.d()));
        if (i2 >= 31) {
            b41Var = new b41(clipData, 2);
        } else {
            d41 d41Var = new d41();
            d41Var.b = clipData;
            d41Var.c = 2;
            b41Var = d41Var;
        }
        b41Var.a(co3Var.f());
        b41Var.setExtras(bundle);
        return q69.m(appCompatEditText, b41Var.build()) == null;
    }

    @Override // defpackage.zh1
    public List f(int i, yo8 yo8Var, int[] iArr) {
        vh1 vh1Var = (vh1) this.b;
        lj3 lj3VarM = ImmutableList.m();
        for (int i2 = 0; i2 < yo8Var.a; i2++) {
            lj3VarM.O(new sh1(i, yo8Var, i2, vh1Var, iArr[i2]));
        }
        return lj3VarM.S();
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        Intent intent;
        ArrayList<String> stringArrayListExtra;
        BaseSearchFragment baseSearchFragment = (BaseSearchFragment) this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = BaseSearchFragment.q1;
        js3.p(activityResult, "it");
        if (activityResult.a != -1 || (intent = activityResult.b) == null || (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) == null) {
            return;
        }
        String str = stringArrayListExtra.get(0);
        BaseSearchViewModel baseSearchViewModelS1 = baseSearchFragment.S1();
        SearchAction.OpenSearchBoxAction openSearchBoxAction = new SearchAction.OpenSearchBoxAction(true);
        js3.m(str);
        baseSearchViewModelS1.r(openSearchBoxAction, new SearchAction.UpdateSearchStateAction(new SearchState.Result(str, "Voice")));
        baseSearchFragment.c2();
        rn6 rn6Var = baseSearchFragment.j1;
        if (rn6Var != null) {
            ((ee) rn6Var.b).b("search_voice", "query", str);
        } else {
            js3.V("searchAnalytics");
            throw null;
        }
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        return this.b;
    }

    @Override // defpackage.fe8
    public void i(b bVar, int i) {
        BookmarkContentFragment bookmarkContentFragment = (BookmarkContentFragment) this.b;
        int i2 = BookmarkContentFragment.X0;
        BookmarkType bookmarkType = (BookmarkType) bookmarkContentFragment.j1().x.get(i);
        js3.p(bookmarkType, "position");
        String string = bookmarkContentFragment.K().getString(bookmarkType.a);
        js3.o(string, "getString(...)");
        bVar.b(sa7.q(string));
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 19:
                ((eb6) obj).i((ly) this.b);
                break;
            case 20:
                ((eb6) obj).v((m81) this.b);
                break;
            case 21:
                ((eb6) obj).C(((b62) this.b).a.P);
                break;
            case 22:
                ((eb6) obj).P((jv4) this.b);
                break;
            default:
                ((eb6) obj).a((w59) this.b);
                break;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h32 h32Var = (h32) obj;
                ErrorDTO errorDTO = (ErrorDTO) serializable;
                if (h32Var != null) {
                    h32Var.j(errorDTO);
                }
                break;
            default:
                InAppPurchaseActivity inAppPurchaseActivity = (InAppPurchaseActivity) obj;
                ErrorDTO errorDTO2 = (ErrorDTO) serializable;
                ok3 ok3Var = InAppPurchaseActivity.A0;
                if (inAppPurchaseActivity.z0.c() instanceof ProgressDialogFragment) {
                    inAppPurchaseActivity.q();
                }
                Intent intent = new Intent();
                intent.putExtra("RESPONSE_CODE", 6);
                t32.b().g(new qk3(intent, inAppPurchaseActivity.Y, "Payment Config"));
                if (errorDTO2.getCode() != 2 && errorDTO2.getCode() != -1) {
                    String str = "http(" + errorDTO2.getHttpStatus() + ")";
                    vp7 vp7Var = inAppPurchaseActivity.y0;
                    String str2 = inAppPurchaseActivity.Y;
                    String str3 = inAppPurchaseActivity.V;
                    String str4 = inAppPurchaseActivity.W;
                    String str5 = inAppPurchaseActivity.X;
                    String messageCode = errorDTO2.getMessageCode();
                    String host = errorDTO2.getHost();
                    int i2 = inAppPurchaseActivity.Z;
                    vp7Var.getClass();
                    js3.p(messageCode, "result");
                    js3.p(str, "message");
                    js3.p(host, "host");
                    vp7Var.j0(str2, bl4.q(i2, "getInAppPaymentConfig(", ")"), sl3.q(kotlin.collections.b.N(new Pair("sku", String.valueOf(str3)), new Pair("type", String.valueOf(str4)), new Pair("developerPayload", String.valueOf(str5)))), messageCode, str, host);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                AppBookmarkRecyclerListFragment appBookmarkRecyclerListFragment = (AppBookmarkRecyclerListFragment) obj2;
                a aVar = (a) qg5Var;
                BookmarkApplicationData bookmarkApplicationData = (BookmarkApplicationData) obj;
                int i2 = AppBookmarkRecyclerListFragment.j1;
                js3.p(view, "<unused var>");
                js3.p(aVar, "viewHolder");
                js3.p(bookmarkApplicationData, "recyclerData");
                DownloadSummeryApplicationDto downloadSummeryApplicationDto = bookmarkApplicationData.j;
                js3.p(downloadSummeryApplicationDto, "app");
                String iconPath = downloadSummeryApplicationDto.getIconPath();
                js3.o(iconPath, "getIconPath(...)");
                String title = downloadSummeryApplicationDto.getTitle();
                js3.o(title, "getTitle(...)");
                String packageName = downloadSummeryApplicationDto.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, downloadSummeryApplicationDto.getTagline(), null, null, null, 232, null), downloadSummeryApplicationDto.getInstallCallbackUrl(), downloadSummeryApplicationDto.getClickCallback());
                c63 c63Var = aVar.B;
                if (c63Var == null) {
                    js3.V("binding");
                    throw null;
                }
                AppIconView appIconView = c63Var.v.w;
                js3.o(appIconView, "appIcon");
                String packageName2 = downloadSummeryApplicationDto.getPackageName();
                js3.o(packageName2, "getPackageName(...)");
                Tracker tracker = new Tracker("bookmark", null, "verticalList");
                boolean z = appBookmarkRecyclerListFragment.s1().b(appIconView.getDrawable()) != null;
                String refId = downloadSummeryApplicationDto.getRefId();
                js3.o(refId, "getRefId(...)");
                pk5.f(appBookmarkRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, downloadSummeryApplicationDto.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                return;
            case 5:
                ir.mservices.market.app.detail.ui.recycler.b bVar = (ir.mservices.market.app.detail.ui.recycler.b) qg5Var;
                AppDownloadData appDownloadData = (AppDownloadData) obj;
                js3.p(view, "view");
                js3.p(bVar, "viewHolder");
                js3.p(appDownloadData, "recyclerData");
                ((ir.mservices.market.app.detail.ui.recycler.b) obj2).x.m(view, bVar, appDownloadData);
                return;
            case 6:
                AppListRecyclerListFragment appListRecyclerListFragment = (AppListRecyclerListFragment) obj2;
                ir.mservices.market.app.common.recycler.a aVar2 = (ir.mservices.market.app.common.recycler.a) qg5Var;
                AppData appData = (AppData) obj;
                int i3 = AppListRecyclerListFragment.k1;
                js3.p(view, "<unused var>");
                js3.p(aVar2, "viewHolder");
                js3.p(appData, "recyclerData");
                ApplicationDTO applicationDTO = appData.c;
                String packageName3 = applicationDTO.getPackageName();
                js3.o(packageName3, "getPackageName(...)");
                Tracker tracker2 = new Tracker(CommonDataKt.HOME_MOVIE_TYPE_LIST, "Application List", "verticalList");
                boolean z2 = appListRecyclerListFragment.s1().b(aVar2.x().getDrawable()) != null;
                String refId2 = applicationDTO.getRefId();
                js3.o(refId2, "getRefId(...)");
                String callbackUrl = applicationDTO.getCallbackUrl();
                String iconPath2 = applicationDTO.getIconPath();
                js3.o(iconPath2, "getIconPath(...)");
                String title2 = applicationDTO.getTitle();
                js3.o(title2, "getTitle(...)");
                String packageName4 = applicationDTO.getPackageName();
                js3.o(packageName4, "getPackageName(...)");
                NavIntentDirections.AppDetail appDetail = new NavIntentDirections.AppDetail(new hp(packageName3, false, tracker2, z2, null, refId2, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName4, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null));
                am2 am2Var = appListRecyclerListFragment.J0;
                aVar2.x();
                pk5.f(am2Var, appDetail);
                return;
            case 7:
                h hVar = (h) obj2;
                h hVar2 = (h) qg5Var;
                AppVideoShotData appVideoShotData = (AppVideoShotData) obj;
                js3.p(view, "view");
                js3.p(hVar2, "viewHolder");
                js3.p(appVideoShotData, "recyclerData");
                fa3 fa3Var = hVar.z;
                if (fa3Var == null) {
                    js3.V("binding");
                    throw null;
                }
                fa3Var.v.callOnClick();
                og5 og5Var = hVar.w;
                if (og5Var != null) {
                    og5Var.m(view, hVar2, appVideoShotData);
                    return;
                }
                return;
            case 25:
                FeedbackTransactionData feedbackTransactionData = (FeedbackTransactionData) obj;
                int i4 = FeedbackTransactionFragment.Z0;
                js3.p(view, "<unused var>");
                js3.p((la2) qg5Var, "<unused var>");
                js3.p(feedbackTransactionData, "recyclerData");
                FeedbackTransactionViewModel feedbackTransactionViewModel = (FeedbackTransactionViewModel) ((FeedbackTransactionFragment) obj2).Y0.getValue();
                PurchaseTransactionDTO purchaseTransactionDTO = feedbackTransactionData.a;
                js3.p(purchaseTransactionDTO, "data");
                l lVar = feedbackTransactionViewModel.v;
                TransactionData transactionData = new TransactionData(purchaseTransactionDTO.getTitle(), purchaseTransactionDTO.getOrderDateTime(), purchaseTransactionDTO.getIconUrl(), purchaseTransactionDTO.getPrice(), purchaseTransactionDTO.getType(), purchaseTransactionDTO.getOrderId(), purchaseTransactionDTO.getPackageName());
                lVar.getClass();
                lVar.p(null, transactionData);
                return;
            default:
                FontStyleItemData fontStyleItemData = (FontStyleItemData) obj;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.setting.fontStyle.ui.a) qg5Var, "<unused var>");
                js3.p(fontStyleItemData, "recyclerData");
                ((FontStyleViewModel) ((FontStyleDialogFragment) obj2).k1.getValue()).r(new FontAction.SelectFont(fontStyleItemData.a));
                return;
        }
    }

    @Override // defpackage.wt5
    public void n(String str) {
        switch (this.a) {
            case 1:
                ((AlertBottomDialogFragment) this.b).R0(DialogResult.b, new Bundle());
                break;
            case 2:
                AlertButtonComponentDialogFragment alertButtonComponentDialogFragment = (AlertButtonComponentDialogFragment) this.b;
                Bundle bundle = new Bundle();
                bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                alertButtonComponentDialogFragment.N0(DialogResult.b, bundle);
                break;
            default:
                AlertDialogFragment alertDialogFragment = (AlertDialogFragment) this.b;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                alertDialogFragment.N0(DialogResult.b, bundle2);
                break;
        }
    }
}
