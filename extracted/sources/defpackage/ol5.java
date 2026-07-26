package defpackage;

import ir.mservices.market.pika.common.model.NearbyRepository;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ol5 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NearbyRepository b;

    public /* synthetic */ ol5(NearbyRepository nearbyRepository, int i) {
        this.a = i;
        this.b = nearbyRepository;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NearbyRepository.startAdvertising$lambda$0(this.b, (Void) obj);
            case 1:
                return NearbyRepository.startDiscovering$lambda$0(this.b, (Void) obj);
            default:
                return NearbyRepository.connectToEndPoint$lambda$0(this.b, (Void) obj);
        }
    }
}
