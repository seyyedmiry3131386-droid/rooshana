package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.nearby.zzfz;
import com.google.android.gms.internal.nearby.zzgb;
import com.google.android.gms.internal.nearby.zzgj;
import com.google.android.gms.internal.nearby.zzgl;
import com.google.android.gms.internal.nearby.zzgn;
import com.google.android.gms.internal.nearby.zzgp;
import com.google.android.gms.internal.nearby.zzgt;

/* JADX INFO: loaded from: classes.dex */
public final class hl9 extends z27 {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractSafeParcelable d;

    public /* synthetic */ hl9(AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.c = i;
        this.d = abstractSafeParcelable;
    }

    @Override // defpackage.z27
    public final void j(Object obj) {
        switch (this.c) {
            case 0:
                zzgb zzgbVar = (zzgb) this.d;
                ((r11) obj).onConnectionInitiated(zzgbVar.a, new q11(zzgbVar.b, zzgbVar.d, zzgbVar.f));
                break;
            case 1:
                ((r11) obj).onDisconnected(((zzgj) this.d).a);
                break;
            case 2:
                zzfz zzfzVar = (zzfz) this.d;
                String str = zzfzVar.a;
                int i = zzfzVar.b;
                int i2 = zzfzVar.c;
                ((r11) obj).onBandwidthChanged(str, new g50());
                break;
            case 3:
                zzgl zzglVar = (zzgl) this.d;
                zzglVar.getClass();
                zzglVar.getClass();
                zzglVar.getClass();
                break;
            case 4:
                zzgn zzgnVar = (zzgn) this.d;
                c22 c22Var = (c22) obj;
                BluetoothDevice bluetoothDevice = zzgnVar.d;
                String str2 = zzgnVar.a;
                if (bluetoothDevice != null && (str2 == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str2))) {
                    "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
                    c22Var.onEndpointFound("__UNRECOGNIZED_BLUETOOTH_DEVICE__", new vo1("__UNRECOGNIZED_BLUETOOTH_DEVICE__"));
                } else {
                    c22Var.onEndpointFound(str2, new vo1(zzgnVar.c));
                }
                break;
            case 5:
                ((c22) obj).onEndpointLost(((zzgp) this.d).a);
                break;
            default:
                zzgt zzgtVar = (zzgt) this.d;
                ((a46) obj).onPayloadTransferUpdate(zzgtVar.a, zzgtVar.b);
                break;
        }
    }
}
