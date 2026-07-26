package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.media3.session.a;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ko4(hr4 hr4Var, wp7 wp7Var, int i, jr4 jr4Var, gr4 gr4Var) {
        this.a = 1;
        this.c = hr4Var;
        this.d = wp7Var;
        this.b = i;
        this.e = jr4Var;
        this.f = gr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                a aVar = (a) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.d;
                List list = (List) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int i = this.b;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        n94 n94Var = (n94) arrayList.get(i2);
                        if (n94Var != null) {
                            try {
                                bitmap = (Bitmap) ja1.t(n94Var);
                            } catch (CancellationException | ExecutionException e) {
                                synchronized (wn5.b) {
                                    wn5.a("Failed to get bitmap", e);
                                    break;
                                }
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        nc2 nc2Var = aVar.i;
                        MediaDescriptionCompat mediaDescriptionCompatG = r44.g((jp4) list.get(i2), bitmap);
                        int i3 = i + i2;
                        androidx.media3.session.legacy.a aVar2 = (androidx.media3.session.legacy.a) nc2Var.b;
                        if ((aVar2.a.getFlags() & 4) == 0) {
                            throw new UnsupportedOperationException("This session doesn't support queue management operations");
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", yh0.p(mediaDescriptionCompatG, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i3);
                        aVar2.a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                hr4 hr4Var = (hr4) this.c;
                wp7 wp7Var = (wp7) this.d;
                int i4 = this.b;
                jr4 jr4Var = (jr4) this.e;
                gr4 gr4Var = (gr4) this.f;
                vp7 vp7Var = hr4Var.f;
                if (hr4Var.g.j()) {
                    return;
                }
                if (!((nq4) hr4Var.k.a).a.isActive()) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(wp7Var == null ? Integer.valueOf(i4) : wp7Var.b);
                    sb.append(", pid=");
                    sb.append(jr4Var.a.b);
                    wn5.k0("MediaSessionLegacyStub", sb.toString());
                    return;
                }
                hq4 hq4VarL = hr4Var.L(jr4Var);
                if (wp7Var != null) {
                    if (!vp7Var.g0(hq4VarL, wp7Var)) {
                        return;
                    }
                } else if (!vp7Var.f0(hq4VarL, i4)) {
                    return;
                }
                try {
                    gr4Var.b(hq4VarL);
                    return;
                } catch (RemoteException e2) {
                    wn5.l0("MediaSessionLegacyStub", "Exception in " + hq4VarL, e2);
                    return;
                }
            default:
                ws4 ws4Var = (ws4) this.c;
                Pair pair = (Pair) this.d;
                ((hd1) ws4Var.b.i).U(((Integer) pair.first).intValue(), (ks4) pair.second, (da4) this.e, (op4) this.f, this.b);
                return;
        }
    }

    public /* synthetic */ ko4(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
