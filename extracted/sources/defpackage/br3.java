package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.GrabberResponseDto;
import ir.mservices.market.version2.webapi.responsedto.MyketStarterIntentDto;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class br3 implements gb8, ms5, ak5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchContentActivity b;

    public /* synthetic */ br3(LaunchContentActivity launchContentActivity, int i) {
        this.a = i;
        this.b = launchContentActivity;
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        int i = this.a;
        LaunchContentActivity launchContentActivity = this.b;
        switch (i) {
            case 0:
                GrabberResponseDto grabberResponseDto = (GrabberResponseDto) obj;
                sb7.p("Grabber", "Response", grabberResponseDto.toString());
                ArrayList arrayList = new ArrayList();
                if (Boolean.TRUE == grabberResponseDto.getExcludeMyket()) {
                    arrayList.add(NearbyRepository.SERVICE_ID);
                }
                js8.r(launchContentActivity, grabberResponseDto.getIntent(), grabberResponseDto.getTargetPackage(), arrayList);
                break;
            default:
                MyketStarterIntentDto myketStarterIntentDto = (MyketStarterIntentDto) obj;
                int i2 = LaunchContentActivity.B1;
                launchContentActivity.getClass();
                if (!TextUtils.isEmpty(myketStarterIntentDto.getIntent())) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(myketStarterIntentDto.getIntent()));
                    launchContentActivity.startActivity(intent);
                }
                String userSource = myketStarterIntentDto.getUserSource();
                if (!TextUtils.isEmpty(userSource)) {
                    if (userSource.length() > 36) {
                        launchContentActivity.G0.c("user_source", userSource.substring(0, 36));
                    } else {
                        launchContentActivity.G0.c("user_source", userSource);
                    }
                }
                launchContentActivity.B0.j(lu7.R, true);
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i = LaunchContentActivity.B1;
        this.b.p1 = lf9Var.a.g(1).b;
        return lf9Var;
    }
}
