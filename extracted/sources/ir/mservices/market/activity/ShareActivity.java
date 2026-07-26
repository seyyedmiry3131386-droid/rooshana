package ir.mservices.market.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.volley.Request$Priority;
import com.google.gson.reflect.TypeToken;
import defpackage.ee;
import defpackage.f88;
import defpackage.fr3;
import defpackage.js3;
import defpackage.kt7;
import defpackage.m88;
import defpackage.rn6;
import defpackage.rs6;
import defpackage.xv2;
import ir.mservices.market.app.detail.update.InAppUpdateActivity;
import ir.mservices.market.common.comment.CommentActivity;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.activity.IbexActivity;
import ir.mservices.market.version2.webapi.requestdto.ShareRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ShareIntentDto;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareActivity extends Hilt_ShareActivity {
    public static final /* synthetic */ int M = 0;
    public rn6 K;
    public fr3 L;

    @Override // ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        String string;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (!"android.intent.action.SEND".equalsIgnoreCase(getIntent().getAction()) || stringExtra == null || f88.n0(stringExtra)) {
            rn6 rn6Var = this.K;
            if (rn6Var == null) {
                js3.V("searchAnalytics");
                throw null;
            }
            ((ee) rn6Var.b).b("search_with_myket", "type", "error");
            startActivity(new Intent(this, (Class<?>) LaunchContentActivity.class));
            finish();
            return;
        }
        if (m88.Z(stringExtra, "myket://" + getString(rs6.external_intent_filters_host_in_app_update), false)) {
            string = getString(rs6.external_intent_filters_host_in_app_update);
            js3.o(string, "getString(...)");
            intent = new Intent(this, (Class<?>) InAppUpdateActivity.class);
        } else {
            if (m88.Z(stringExtra, "myket://" + getString(rs6.external_intent_filters_host_comment), false)) {
                string = getString(rs6.external_intent_filters_host_comment);
                js3.o(string, "getString(...)");
                intent = new Intent(this, (Class<?>) CommentActivity.class);
            } else {
                if (m88.Z(stringExtra, "myket://" + getString(rs6.external_intent_filters_host_video), false)) {
                    string = getString(rs6.external_intent_filters_host_video);
                    js3.o(string, "getString(...)");
                    intent = new Intent(this, (Class<?>) IbexActivity.class);
                } else {
                    intent = new Intent(this, (Class<?>) LaunchContentActivity.class);
                    string = CommonDataKt.AD_LINK;
                }
            }
        }
        intent.setAction("android.intent.action.VIEW").addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE").setPackage(NearbyRepository.SERVICE_ID);
        if (m88.Z(stringExtra, "myket://", false) || m88.Z(stringExtra, "kelaket://", false)) {
            intent.setData(Uri.parse(stringExtra));
            rn6 rn6Var2 = this.K;
            if (rn6Var2 == null) {
                js3.V("searchAnalytics");
                throw null;
            }
            ((ee) rn6Var2.b).b("search_with_myket", "type", string);
            startActivity(intent);
            finish();
            return;
        }
        rn6 rn6Var3 = this.K;
        if (rn6Var3 == null) {
            js3.V("searchAnalytics");
            throw null;
        }
        ((ee) rn6Var3.b).b("search_with_myket", "type", "search");
        kt7 kt7Var = new kt7(intent, stringExtra, this);
        kt7 kt7Var2 = new kt7(intent, stringExtra, this);
        fr3 fr3Var = this.L;
        if (fr3Var == null) {
            js3.V("intentService");
            throw null;
        }
        ShareRequestDto shareRequestDto = new ShareRequestDto(stringExtra);
        xv2 xv2Var = new xv2(1, fr3Var.createRequestUrl("v1/intent", "share", null, fr3Var.getCommonQueryParam()), shareRequestDto, Request$Priority.b, false, this, fr3Var.createVolleyErrorListener(kt7Var2), fr3Var.createVolleySuccessListener(kt7Var, kt7Var2), false);
        xv2Var.p = fr3Var.getHeaders(new HashMap());
        xv2Var.w = new TypeToken<ShareIntentDto>() { // from class: ir.mservices.market.version2.services.IntentService$getShare$gsonRequest$1$1
        }.getType();
        fr3Var.performRequest(xv2Var, kt7Var2);
    }
}
