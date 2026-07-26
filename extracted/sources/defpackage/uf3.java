package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.d;

/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements yf3 {
    public IBinder n;

    @Override // defpackage.yf3
    public final int J() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.n.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            int i2 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yf3
    public final boolean M() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.n.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yf3
    public final void O(sf3 sf3Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((in4) sf3Var);
            if (!this.n.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yf3
    public final void X(sf3 sf3Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((in4) sf3Var);
            if (!this.n.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }

    @Override // defpackage.yf3
    public final PlaybackStateCompat e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.n.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            PlaybackStateCompat playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return playbackStateCompatCreateFromParcel;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yf3
    public final int f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.n.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i = d.o;
            }
            parcelObtain2.readException();
            int i2 = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return i2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
