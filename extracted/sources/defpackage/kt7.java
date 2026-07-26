package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.activity.ShareActivity;
import ir.mservices.market.version2.webapi.responsedto.ShareIntentDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kt7 implements gb8, h32 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ShareActivity c;

    public /* synthetic */ kt7(Intent intent, String str, ShareActivity shareActivity) {
        this.a = intent;
        this.b = str;
        this.c = shareActivity;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = ShareActivity.M;
        Uri uri = Uri.parse("myket://search/?query=".concat(this.b));
        Intent intent = this.a;
        intent.setData(uri);
        ShareActivity shareActivity = this.c;
        shareActivity.startActivity(intent);
        shareActivity.finish();
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        ShareIntentDto shareIntentDto = (ShareIntentDto) obj;
        int i = ShareActivity.M;
        String intent = shareIntentDto.getIntent();
        Intent intent2 = this.a;
        if (intent != null && !f88.n0(intent)) {
            intent2.setData(Uri.parse(Uri.decode(shareIntentDto.getIntent())));
        } else if (shareIntentDto.getExplicitListResponse() != null) {
            intent2.setAction("ir.mservices.market.ACTION_APPLICATION_LIST").putExtra("BUNDLE_KEY_APPLICATION_LIST", shareIntentDto.getExplicitListResponse());
        } else {
            intent2.setData(Uri.parse("myket://search/?query=".concat(this.b)));
        }
        ShareActivity shareActivity = this.c;
        shareActivity.startActivity(intent2);
        shareActivity.finish();
    }
}
