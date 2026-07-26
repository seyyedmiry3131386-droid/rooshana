package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.internal.nearby.zzgr;
import com.google.android.gms.internal.nearby.zzgt;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import io.sentry.android.core.t0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vm9 extends ei9 implements fm9, np9 {
    public final Context o;
    public final x41 p;
    public final wv q;
    public final fq9 r;

    public vm9(Context context, x41 x41Var, fq9 fq9Var) {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener", 3);
        this.q = new wv(0);
        rq4.n(context);
        this.o = context;
        this.p = x41Var;
        this.r = fq9Var;
    }

    @Override // defpackage.fm9
    public final synchronized void a() {
        try {
            for (Map.Entry entry : (rv) this.q.entrySet()) {
                this.p.c(new nl9(((um9) entry.getKey()).a, (PayloadTransferUpdate) entry.getValue(), 2));
            }
            this.q.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ei9
    public final boolean n0(int i, Parcel parcel) {
        if (i == 2) {
            zzgr zzgrVar = (zzgr) lm9.a(parcel, zzgr.CREATOR);
            lm9.b(parcel);
            p0(zzgrVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzgt zzgtVar = (zzgt) lm9.a(parcel, zzgt.CREATOR);
        lm9.b(parcel);
        synchronized (this) {
            try {
                PayloadTransferUpdate payloadTransferUpdate = zzgtVar.b;
                if (payloadTransferUpdate.b == 3) {
                    this.q.put(new um9(payloadTransferUpdate.a, zzgtVar.a), payloadTransferUpdate);
                } else {
                    this.q.remove(new um9(payloadTransferUpdate.a, zzgtVar.a));
                    fq9 fq9Var = this.r;
                    if (fq9Var != null) {
                        fq9Var.b(zzgtVar.b.a);
                    }
                }
                this.p.c(new hl9(zzgtVar, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final synchronized void p0(zzgr zzgrVar) {
        z36 z36VarN = z67.n(this.o, zzgrVar.b);
        int i = 1;
        if (z36VarN == null) {
            t0.m("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(zzgrVar.b.a)));
            return;
        }
        wv wvVar = this.q;
        String str = zzgrVar.a;
        long j = zzgrVar.b.a;
        um9 um9Var = new um9(j, str);
        PayloadTransferUpdate payloadTransferUpdate = new PayloadTransferUpdate();
        payloadTransferUpdate.a = j;
        wvVar.put(um9Var, payloadTransferUpdate);
        this.p.c(new nl9(zzgrVar, z36VarN, i));
    }
}
