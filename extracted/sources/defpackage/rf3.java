package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.media3.session.legacy.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class rf3 implements sf3 {
    public IBinder n;

    @Override // defpackage.sf3
    public final void N(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            playbackStateCompat.writeToParcel(parcelObtain, 0);
            if (!this.n.transact(3, parcelObtain, null, 1)) {
                int i = in4.o;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.sf3
    public final void P(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.n.transact(12, parcelObtain, null, 1)) {
                int i2 = in4.o;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }

    @Override // defpackage.sf3
    public final void h(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.n.transact(9, parcelObtain, null, 1)) {
                int i2 = in4.o;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
