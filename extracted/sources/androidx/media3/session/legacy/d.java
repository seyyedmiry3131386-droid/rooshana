package androidx.media3.session.legacy;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.jr4;
import defpackage.nq4;
import defpackage.rf3;
import defpackage.sf3;
import defpackage.uf3;
import defpackage.yf3;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Binder implements yf3 {
    public static final /* synthetic */ int o = 0;
    public final WeakReference n;

    public d(nq4 nq4Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.n = new WeakReference(nq4Var);
    }

    public static yf3 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof yf3)) {
            return (yf3) iInterfaceQueryLocalInterface;
        }
        uf3 uf3Var = new uf3();
        uf3Var.n = iBinder;
        return uf3Var;
    }

    @Override // defpackage.yf3
    public final int J() {
        nq4 nq4Var = (nq4) this.n.get();
        if (nq4Var != null) {
            return nq4Var.k;
        }
        return -1;
    }

    @Override // defpackage.yf3
    public final boolean M() {
        return false;
    }

    @Override // defpackage.yf3
    public final void O(sf3 sf3Var) {
        nq4 nq4Var = (nq4) this.n.get();
        if (nq4Var == null || sf3Var == null) {
            return;
        }
        nq4Var.f.unregister(sf3Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (nq4Var.d) {
        }
    }

    @Override // defpackage.yf3
    public final void X(sf3 sf3Var) {
        nq4 nq4Var = (nq4) this.n.get();
        if (nq4Var == null || sf3Var == null) {
            return;
        }
        nq4Var.f.register(sf3Var, new jr4("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (nq4Var.d) {
        }
    }

    @Override // defpackage.yf3
    public final PlaybackStateCompat e() {
        nq4 nq4Var = (nq4) this.n.get();
        if (nq4Var == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = nq4Var.g;
        MediaMetadataCompat mediaMetadataCompat = nq4Var.i;
        if (playbackStateCompat != null) {
            float f = playbackStateCompat.d;
            long j = playbackStateCompat.h;
            int i = playbackStateCompat.a;
            long j2 = playbackStateCompat.b;
            long jA = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = ((long) (f * (jElapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null && mediaMetadataCompat.a.containsKey("android.media.metadata.DURATION")) {
                    jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
                }
                long j4 = (jA < 0 || j3 <= jA) ? j3 < 0 ? 0L : j3 : jA;
                ArrayList arrayList = new ArrayList();
                long j5 = playbackStateCompat.c;
                long j6 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.g;
                AbstractCollection abstractCollection = playbackStateCompat.i;
                if (abstractCollection != null) {
                    arrayList.addAll(abstractCollection);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j4, j5, playbackStateCompat.d, j6, i2, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.j, playbackStateCompat.k);
            }
        }
        return playbackStateCompat;
    }

    @Override // defpackage.yf3
    public final int f() {
        nq4 nq4Var = (nq4) this.n.get();
        if (nq4Var != null) {
            return nq4Var.j;
        }
        return -1;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        WeakReference weakReference = this.n;
        sf3 sf3Var = null;
        bundle = null;
        Bundle bundle2 = null;
        sf3 sf3Var2 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof sf3)) {
                        rf3 rf3Var = new rf3();
                        rf3Var.n = strongBinder;
                        sf3Var = rf3Var;
                    } else {
                        sf3Var = (sf3) iInterfaceQueryLocalInterface;
                    }
                }
                X(sf3Var);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof sf3)) {
                        rf3 rf3Var2 = new rf3();
                        rf3Var2.n = strongBinder2;
                        sf3Var2 = rf3Var2;
                    } else {
                        sf3Var2 = (sf3) iInterfaceQueryLocalInterface2;
                    }
                }
                O(sf3Var2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    RatingCompat.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat playbackStateCompatE = e();
                parcel2.getClass();
                parcel2.writeNoException();
                if (playbackStateCompatE == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackStateCompatE.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iF = f();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                throw new AssertionError();
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                M();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iJ = J();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readFloat();
                throw new AssertionError();
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                nq4 nq4Var = (nq4) weakReference.get();
                if (nq4Var != null && (bundle = nq4Var.e) != null) {
                    bundle2 = new Bundle(bundle);
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundle2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle2.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    RatingCompat.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
