package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nearby.zzgh;
import com.google.android.gms.internal.nearby.zzgr;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* JADX INFO: loaded from: classes.dex */
public final class nl9 extends z27 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nl9(Object obj, Object obj2, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.z27
    public final void j(Object obj) {
        switch (this.c) {
            case 0:
                ((r11) obj).onConnectionResult(((zzgh) this.d).a, new w11((Status) this.e));
                break;
            case 1:
                ((a46) obj).onPayloadReceived(((zzgr) this.d).a, (z36) this.e);
                break;
            default:
                PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) this.e;
                PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate();
                payloadTransferUpdate2.a = payloadTransferUpdate.a;
                payloadTransferUpdate2.b = payloadTransferUpdate.b;
                payloadTransferUpdate2.c = payloadTransferUpdate.c;
                payloadTransferUpdate2.d = payloadTransferUpdate.d;
                payloadTransferUpdate2.b = 2;
                ((a46) obj).onPayloadTransferUpdate((String) this.d, payloadTransferUpdate2);
                break;
        }
    }
}
