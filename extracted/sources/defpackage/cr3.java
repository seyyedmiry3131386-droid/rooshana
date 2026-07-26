package defpackage;

import android.content.Context;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.pika.common.model.NearbyRepository;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cr3 implements h32, cu2 {
    public final /* synthetic */ LaunchContentActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ cr3(LaunchContentActivity launchContentActivity, String str) {
        this.a = launchContentActivity;
        this.b = str;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NearbyRepository.SERVICE_ID);
        js8.r(this.a, this.b, null, arrayList);
    }

    @Override // defpackage.cu2
    public void s(Context context, String str) {
        LaunchContentActivity launchContentActivity = this.a;
        launchContentActivity.B0.j(lu7.d0, false);
        launchContentActivity.H0.j(this.b, str, launchContentActivity, new br3(launchContentActivity, 3), new vj3(5));
    }
}
