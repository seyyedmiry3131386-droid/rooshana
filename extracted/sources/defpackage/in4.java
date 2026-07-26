package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.ParcelableVolumeInfo;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class in4 extends Binder implements sf3 {
    public static final /* synthetic */ int o = 0;
    public final WeakReference n;

    public in4(no4 no4Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.n = new WeakReference(no4Var);
    }

    @Override // defpackage.sf3
    public final void N(PlaybackStateCompat playbackStateCompat) {
        no4 no4Var = (no4) this.n.get();
        if (no4Var != null) {
            no4Var.i(2, playbackStateCompat, null);
        }
    }

    @Override // defpackage.sf3
    public final void P(int i) {
        no4 no4Var = (no4) this.n.get();
        if (no4Var != null) {
            no4Var.i(12, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.sf3
    public final void h(int i) {
        no4 no4Var = (no4) this.n.get();
        if (no4Var != null) {
            no4Var.i(9, Integer.valueOf(i), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String string = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                no4 no4Var = (no4) this.n.get();
                if (no4Var != null) {
                    no4Var.i(1, string, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                throw new AssertionError();
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                N(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                h(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                no4 no4Var2 = (no4) this.n.get();
                if (no4Var2 != null) {
                    no4Var2.i(11, Boolean.valueOf(z), null);
                    return true;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                P(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                no4 no4Var3 = (no4) this.n.get();
                if (no4Var3 != null) {
                    no4Var3.i(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
