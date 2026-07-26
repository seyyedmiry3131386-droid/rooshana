package defpackage;

import ir.mservices.market.pika.common.model.NearbyRepository;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pl5 implements dt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NearbyRepository b;

    public /* synthetic */ pl5(NearbyRepository nearbyRepository, int i) {
        this.a = i;
        this.b = nearbyRepository;
    }

    @Override // defpackage.dt5
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                NearbyRepository.startAdvertising$lambda$2(this.b, exc);
                break;
            case 1:
                NearbyRepository.startDiscovering$lambda$2(this.b, exc);
                break;
            default:
                NearbyRepository.connectToEndPoint$lambda$2(this.b, exc);
                break;
        }
    }
}
