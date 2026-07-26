package defpackage;

import android.content.Context;
import ir.mservices.market.version2.webapi.responsedto.AparatVideoDTO;
import ir.mservices.market.views.MyketVideoView;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gg5 implements gb8, h32 {
    public final /* synthetic */ MyketVideoView a;

    public /* synthetic */ gg5(MyketVideoView myketVideoView) {
        this.a = myketVideoView;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = MyketVideoView.C;
        MyketVideoView myketVideoView = this.a;
        Context context = myketVideoView.getContext();
        hh2 hh2Var = new hh2(context, context != null ? context.getString(rs6.video_not_found) : null);
        hh2Var.G();
        hh2.H(hh2Var);
        myketVideoView.i();
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        int i = MyketVideoView.C;
        String file_link = ((AparatVideoDTO) obj).getVideo().getFile_link();
        MyketVideoView myketVideoView = this.a;
        myketVideoView.r = file_link;
        if (file_link != null && file_link.length() != 0) {
            String str = myketVideoView.r;
            if (str != null) {
                myketVideoView.h(str);
                return;
            }
            return;
        }
        Context context = myketVideoView.getContext();
        hh2 hh2Var = new hh2(context, context != null ? context.getString(rs6.video_not_found) : null);
        hh2Var.G();
        hh2.H(hh2Var);
        myketVideoView.i();
        lw.g(null, "MyketVideoView aparat url is null or empty, aparatId=" + myketVideoView.s, null);
    }
}
