package defpackage;

import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg3 implements wa1, h32, gb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IbexFragment b;

    public /* synthetic */ zg3(IbexFragment ibexFragment, int i) {
        this.a = i;
        this.b = ibexFragment;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = this.a;
        IbexFragment ibexFragment = this.b;
        int i2 = IbexFragment.r1;
        switch (i) {
            case 1:
                ibexFragment.t1();
                break;
            default:
                ibexFragment.t1();
                break;
        }
    }

    @Override // defpackage.wa1
    public xa1 k() {
        aj0 aj0Var = this.b.m1;
        df1 df1Var = new df1((String) aj0Var.e, aj0Var.b, aj0Var.c, (nc2) aj0Var.d);
        nc2 nc2Var = df1Var.i;
        synchronized (nc2Var) {
            nc2Var.c = null;
            ((HashMap) nc2Var.b).put("SourceChannel", LinkDTO.LINK_TYPE_MYKET_INTENT);
        }
        return df1Var;
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        ApplicationFullDto applicationFullDto = (ApplicationFullDto) obj;
        int i = IbexFragment.r1;
        VideoShotDto videoshot = applicationFullDto.getVideoshot();
        IbexFragment ibexFragment = this.b;
        if (videoshot == null) {
            ibexFragment.t1();
            return;
        }
        String videoUrl = applicationFullDto.getVideoshot().getVideoUrl();
        if (videoUrl != null && !f88.n0(videoUrl)) {
            ibexFragment.w1(applicationFullDto.getVideoshot().getVideoUrl(), applicationFullDto.getTitle());
            return;
        }
        String aparatId = applicationFullDto.getVideoshot().getAparatId();
        if (aparatId == null || f88.n0(aparatId)) {
            ibexFragment.t1();
        } else {
            ibexFragment.v1(applicationFullDto.getVideoshot().getAparatId(), applicationFullDto.getTitle());
        }
    }
}
