package defpackage;

import ir.mservices.market.version2.webapi.requestdto.SpixDownloadRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ks1 extends t0 {
    public final /* synthetic */ SpixUserRequestDto f;
    public final /* synthetic */ SpixDownloadRequestDto g;
    public final /* synthetic */ ps1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(ps1 ps1Var, SpixUserRequestDto spixUserRequestDto, SpixDownloadRequestDto spixDownloadRequestDto) {
        super(2);
        this.h = ps1Var;
        this.f = spixUserRequestDto;
        this.g = spixDownloadRequestDto;
    }

    @Override // defpackage.t0
    public final void o(t0 t0Var, Object[] objArr) {
        this.h.q.m("download", new SpixRequestDto(this.f, this.g));
        t0Var.D(Boolean.TRUE);
    }
}
