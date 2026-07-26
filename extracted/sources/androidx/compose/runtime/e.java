package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl4;
import defpackage.hy2;
import defpackage.t08;
import defpackage.th0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        t08 t08Var;
        if (classLoader == null) {
            classLoader = e.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            t08Var = th0.p;
        } else if (i == 1) {
            t08Var = th0.t;
        } else {
            if (i != 2) {
                throw new IllegalStateException(bl4.q(i, "Unsupported MutableState policy ", " was restored"));
            }
            t08Var = hy2.r;
        }
        return new ParcelableSnapshotMutableState(value, t08Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
