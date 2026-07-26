package ir.mservices.market.pika.connect;

import defpackage.bt2;
import defpackage.js3;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.viewModel.c;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaSelectDeviceViewModel extends c {
    public final NearbyRepository t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaSelectDeviceViewModel(NearbyRepository nearbyRepository) {
        super(true);
        js3.p(nearbyRepository, "nearbyRepository");
        this.t = nearbyRepository;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new PikaSelectDeviceViewModel$doRequest$1(this, null), 3);
    }
}
