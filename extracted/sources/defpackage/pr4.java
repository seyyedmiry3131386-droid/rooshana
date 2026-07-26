package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.MediaSessionService;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends Binder implements bg3 {
    public final WeakReference n;
    public final Handler o;
    public final Set p;

    public pr4(MediaSessionService mediaSessionService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.n = new WeakReference(mediaSessionService);
        this.o = new Handler(mediaSessionService.getApplicationContext().getMainLooper());
        this.p = DesugarCollections.synchronizedSet(new HashSet());
    }

    public static bg3 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof bg3)) {
            return (bg3) iInterfaceQueryLocalInterface;
        }
        ag3 ag3Var = new ag3();
        ag3Var.n = iBinder;
        return ag3Var;
    }

    @Override // defpackage.bg3
    public final void V(qf3 qf3Var, Bundle bundle) {
        if (qf3Var == null || bundle == null) {
            z67.f(qf3Var);
            return;
        }
        try {
            v11 v11VarA = v11.a(bundle);
            MediaSessionService mediaSessionService = (MediaSessionService) this.n.get();
            if (mediaSessionService == null) {
                z67.f(qf3Var);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = v11VarA.d;
            }
            jr4 jr4Var = new jr4(v11VarA.c, callingPid, callingUid);
            boolean zB = mr4.a(mediaSessionService.getApplicationContext()).b(jr4Var);
            this.p.add(qf3Var);
            try {
                this.o.post(new tp4(this, qf3Var, jr4Var, v11VarA, zB, 1));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            wn5.l0("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            z67.f(qf3Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        V(so4.L(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
